package research.diffsearch.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import research.diffsearch.Config;
import research.diffsearch.pipeline.base.Pipeline;
import research.diffsearch.pipeline.feature.*;
import research.diffsearch.server.PythonRunner;
import research.diffsearch.util.ProgressWatcher;
import research.diffsearch.util.Util;

import java.io.IOException;
import java.util.List;
import java.util.function.Function;

import static com.google.common.collect.Lists.newArrayList;
import static research.diffsearch.pipeline.feature.FeatureExtractionPipeline.getDefaultFeatureExtractionPipeline;
import static research.diffsearch.util.FilePathUtils.*;

/**
 * Extracts feature vectors from the code changes and indexes them.
 * <p>
 * Usage: diffsearch -fe
 */
public class FeatureExtractionMode extends App {

    private static final Logger logger = LoggerFactory.getLogger(FeatureExtractionMode.class);

    @Override
    public void run() {
        logger.info("Starting feature extraction on corpus.");

        try {
            var featureExtractionPipeline = getDefaultFeatureExtractionPipeline(false);
            extractFeaturesToFile(featureExtractionPipeline);
            runPythonIndexing(featureExtractionPipeline);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
    }

    protected static void runPythonIndexing(FeatureExtractionPipeline featureExtractionPipeline)
            throws IOException, InterruptedException {
        if (!Config.ONLY_JAVA) {

            // args for feature extraction:
            // - vector file path
            // - output file path
            // - total feature vector length
            // - nlist (number of clusters)
            var pythonRunner = new PythonRunner(
                    "./src/main/resources/Python/FAISS_indexing_python.py",
                    "Features_Vectors/changes_feature_vectors_java.csv",
                    Config.INDEX_FILE,
                    Integer.toString(featureExtractionPipeline.getTotalFeatureVectorLength()),
                    Integer.toString(Config.nlist));

            pythonRunner.runAndWaitUntilEnd();

        } else {
            logger.warn("Running in ONLY_JAVA mode. Python indexing must be started separately.");
        }
    }

    protected static void extractFeaturesToFile(FeatureExtractionPipeline featureExtractionPipeline)
            throws IOException {

        logger.debug("Feature vector length: {}", featureExtractionPipeline.getTotalFeatureVectorLength());

        List<String> changesLines = newArrayList(getAllLines(getChangesFilePath(Config.PROGRAMMING_LANGUAGE)));
        FeatureFrequencyCounter featureFrequencyCounter = new FeatureFrequencyCounter();

        var vectors = Pipeline
                .from(Util::formatCodeChange)
                .connect(featureExtractionPipeline)
                .parallelUntilHere(Config.threadCount)
                .connect(featureFrequencyCounter)
                // show progress in console:
                .connect(new ProgressWatcher<>("Feature extraction"))
                .execute(changesLines);

        // write vectors to file:
        Pipeline.from((Function<FeatureVector, FeatureVector>) featureVector -> featureVector)
                .connectIf(!Config.USE_COUNT_VECTORS_CORPUS, new RemoveCollisionPipeline())
                .connectIf(false, new TfIdfTransformer(featureFrequencyCounter, changesLines.size()))
                .connect(getVectorFileWriterPipeline(getFeatureCSVPath(Config.PROGRAMMING_LANGUAGE)))
                .execute(vectors);
    }
}
