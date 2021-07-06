package research.diffsearch.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import research.diffsearch.Config;
import research.diffsearch.pipeline.base.Pipeline;
import research.diffsearch.pipeline.feature.FeatureExtractionPipeline;
import research.diffsearch.pipeline.feature.FeatureVector;
import research.diffsearch.pipeline.feature.RemoveCollisionPipeline;
import research.diffsearch.pipeline.feature.count.DocumentFrequencyCounter;
import research.diffsearch.pipeline.feature.count.TfIdfTransformer;
import research.diffsearch.server.PythonRunner;
import research.diffsearch.util.FilePathUtils;
import research.diffsearch.util.ProgressWatcher;
import research.diffsearch.util.Util;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static com.google.common.collect.Lists.newArrayList;
import static research.diffsearch.pipeline.feature.FeatureExtractionPipeline.getDefaultFeatureExtractionPipeline;
import static research.diffsearch.util.FilePathUtils.*;

/**
 * Extracts feature vectors from the code changes and indexes them.
 * <p>
 * Usage: diffsearch -fe
 *
 * @author Paul Bredl
 * @author Luca Di Grazia
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
            // - tfidf (true or false)
            var pythonRunner = new PythonRunner(
                    "./src/main/resources/Python/FAISS_indexing_python.py",
                    "./src/main/resources/Features_Vectors/changes_feature_vectors_java.csv",
                    FilePathUtils.getIndexFilePath(Config.PROGRAMMING_LANGUAGE),
                    Integer.toString(featureExtractionPipeline.getTotalFeatureVectorLength()),
                    Integer.toString(Config.nlist),
                    Boolean.toString(Config.TFIDF),
                    Config.changes_feature_vectors);

            pythonRunner.runAndWaitUntilEnd();

        } else {
            logger.warn("Running in ONLY_JAVA mode. Python indexing must be started separately.");
        }
    }

    public static void runPythonIndexing_scalability(int maxLines, int part) throws IOException, InterruptedException {
        if (!Config.ONLY_JAVA) {
            var pythonRunner = new PythonRunner(
                    "./src/main/resources/Python/FAISS_indexing.py",
                    "Features_Vectors/changes_feature_vectors_java.csv",
                    "Features_Vectors/faiss_java.index",
                    Integer.toString(getDefaultFeatureExtractionPipeline(false).getTotalFeatureVectorLength()),
                    Integer.toString(maxLines),
                    Integer.toString(part));
            pythonRunner.runAndWaitUntilEnd();
        } else {
            logger.warn("Running in ONLY_JAVA mode. Python indexing must be started separately.");
        }
    }

    protected static void extractFeaturesToFile(FeatureExtractionPipeline featureExtractionPipeline)
            throws IOException {

        logger.debug("Feature vector length: {}", featureExtractionPipeline.getTotalFeatureVectorLength());

        List<String> changesLines = newArrayList(getAllLines(getChangesFilePath(Config.PROGRAMMING_LANGUAGE)));
        DocumentFrequencyCounter featureFrequencyCounter = new DocumentFrequencyCounter();
        var numberOfLines = changesLines.size();
        logger.debug("Corpus size: {}", numberOfLines);

        Pipeline
                .from(Util::formatCodeChange)
                .connect(featureExtractionPipeline)
                .parallelUntilHere(Config.threadCount)
                .connect(featureFrequencyCounter)
                // show progress in console:
                .connect(new ProgressWatcher<>("Feature extraction"))
                .connectIf(!Config.USE_COUNT_VECTORS && !Config.TFIDF, new RemoveCollisionPipeline())
                .connect(getVectorFileWriterPipeline(getFeatureCSVPath(Config.PROGRAMMING_LANGUAGE)))
                .executeIgnoreResults(changesLines);

        if (Config.TFIDF) {
            Pipeline.from(FeatureExtractionMode::stringArrayToDoubleArray)
                    // calculate tfidf weights
                    .connect(new TfIdfTransformer(featureFrequencyCounter, changesLines.size()))
                    .connect(FeatureVector::new)
                    .connect(getVectorFileWriterPipeline(getFeatureCSVPath(Config.PROGRAMMING_LANGUAGE) + ".tfidf"))
                    .connect(new ProgressWatcher<>("TFIDF"))
                    .executeIgnoreResults(
                            readCSVLineByLine(getFeatureCSVPath(Config.PROGRAMMING_LANGUAGE), ","), numberOfLines);
        }
    }

    private static double[] stringArrayToDoubleArray(String[] featureVectorStr) {
        try {
            return Arrays.stream(featureVectorStr).mapToDouble(Double::parseDouble).toArray();
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            throw new RuntimeException(e);
        }
    }
}
