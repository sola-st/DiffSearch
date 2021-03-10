package research.diffsearch.main;

import com.google.common.collect.Lists;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import research.diffsearch.Config;
import research.diffsearch.pipeline.base.Pipeline;
import research.diffsearch.pipeline.feature.FeatureExtractionPipeline;
import research.diffsearch.server.PythonRunner;
import research.diffsearch.util.ProgressWatcher;
import research.diffsearch.util.Util;

import java.io.IOException;
import java.util.List;

import static research.diffsearch.pipeline.feature.FeatureExtractionPipeline.getDefaultFeatureExtractionPipeline;
import static research.diffsearch.util.FilePathUtils.*;

/**
 * Extracts feature vectors from the code changes and indexes them.
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

            var pythonRunner = new PythonRunner(
                    "./src/main/resources/Python/FAISS_indexing_python.py",
                    "Features_Vectors/changes_feature_vectors_java.csv",
                    "Features_Vectors/faiss_java.index",
                    Integer.toString(featureExtractionPipeline.getTotalFeatureVectorLength()),
                    Integer.toString(Config.nlist));

            pythonRunner.runAndWaitUntilEnd();

        } else {
            logger.warn("Running in ONLY_JAVA mode. Python indexing must be started separately.");
        }
    }

    protected static void extractFeaturesToFile(FeatureExtractionPipeline featureExtractionPipeline)
            throws IOException {
        List<String> changesLines = Lists.newArrayList(getAllLines(getChangesFilePath(Config.PROGRAMMING_LANGUAGE)));

        logger.debug("Feature vector length: {}", featureExtractionPipeline.getTotalFeatureVectorLength());

        Pipeline.from(Util::formatCodeChange)
                .connect(featureExtractionPipeline)
                .parallelUntilHere(Config.threadCount)
                .connect(getVectorFileWriterPipeline(getFeatureCSVPath(Config.PROGRAMMING_LANGUAGE)))
                .connect(new ProgressWatcher<>("Feature extraction"))
                .collect(changesLines);
    }
}
