package research.diffsearch.main;

import com.google.gson.Gson;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.Tree;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import research.diffsearch.Config;
import research.diffsearch.pipeline.base.CodeChange;
import research.diffsearch.pipeline.base.Pipeline;
import research.diffsearch.pipeline.feature.FeatureExtractionPipeline;
import research.diffsearch.pipeline.feature.FeatureVector;
import research.diffsearch.pipeline.feature.RemoveCollisionPipeline;
import research.diffsearch.pipeline.feature.count.DocumentFrequencyCounter;
import research.diffsearch.pipeline.feature.count.TfIdfTransformer;
import research.diffsearch.pipeline.feature.extractor.FeatureExtractor;
import research.diffsearch.server.PythonRunner;
import research.diffsearch.tree.SerializableTreeNode;
import research.diffsearch.tree.TreeFactory;
import research.diffsearch.util.FilePathUtils;
import research.diffsearch.util.ProgressWatcher;

import java.io.IOException;
import java.util.Arrays;
import java.util.stream.Collectors;

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

            logger.info(featureExtractionPipeline
                    .getFeatureExtractors()
                    .stream()
                    .map(FeatureExtractor::getName)
                    .collect(Collectors.joining(",")));

            extractFeaturesToFile(featureExtractionPipeline);
            runPythonIndexing(featureExtractionPipeline);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
    }

    protected static void runPythonIndexing(FeatureExtractionPipeline<Tree> featureExtractionPipeline)
            throws IOException, InterruptedException {
        if (!Config.ONLY_JAVA) {

            // args for feature extraction:
            // - vector file path
            // - output file path
            // - total feature vector length
            // - nlist (number of clusters)
            // - tfidf (true or false)
            var pythonRunner = new PythonRunner(
                    "./src/main/resources/Python/FAISS_indexing.py",
                    FilePathUtils.getFeatureCSVPath(Config.PROGRAMMING_LANGUAGE),
                    FilePathUtils.getIndexFilePath(Config.PROGRAMMING_LANGUAGE),
                    Integer.toString(featureExtractionPipeline.getTotalFeatureVectorLength()),
                    Integer.toString(Config.nlist),
                    Boolean.toString(Config.TFIDF));

            pythonRunner.runAndWaitUntilEnd();

        } else {
            logger.warn("Running in ONLY_JAVA mode. Python indexing must be started separately.");
        }
    }

    public static void runPythonIndexing_scalability(int maxLines, int part) throws IOException, InterruptedException {
        if (!Config.ONLY_JAVA) {
            var pythonRunner = new PythonRunner(
                    "./src/main/resources/Python/FAISS_indexing.py",
                    "Features_Vectors/changes_feature_vectors_py.csv",
                    "Features_Vectors/faiss_Python.index",
                    Integer.toString(getDefaultFeatureExtractionPipeline(false).getTotalFeatureVectorLength()),
                    Integer.toString(maxLines),
                    Integer.toString(part));
            pythonRunner.runAndWaitUntilEnd();
        } else {
            logger.warn("Running in ONLY_JAVA mode. Python indexing must be started separately.");
        }
    }

    protected static void extractFeaturesToFile(FeatureExtractionPipeline<Tree> featureExtractionPipeline)
            throws IOException {

        logger.debug("Feature vector length: {}", featureExtractionPipeline.getTotalFeatureVectorLength());

        DocumentFrequencyCounter featureFrequencyCounter = new DocumentFrequencyCounter();
        var numberOfLines = getNumberOfLines(getChangesJsonFilePath(Config.PROGRAMMING_LANGUAGE));
        logger.debug("Corpus size: {}", numberOfLines);

        Pipeline.<CodeChange, Tree>from(codeChange->
                        TreeFactory.getTreeFromCodeChange(codeChange, Config.PROGRAMMING_LANGUAGE))
                .connect(featureExtractionPipeline)
                .parallelUntilHere(Config.threadCount)
                // count features for tfidf
                .connectIf(Config.TFIDF, featureFrequencyCounter)
                // show progress in console:
                .connect(new ProgressWatcher<>("Feature extraction"))
                // create binary vectors if needed
                .connectIf(!Config.USE_COUNT_VECTORS && !Config.TFIDF, new RemoveCollisionPipeline())
                .connect(getVectorFileWriterPipeline(getFeatureCSVPath(Config.PROGRAMMING_LANGUAGE)))
                .executeIgnoreResults(getCodeChanges(getChangesJsonFilePath(Config.PROGRAMMING_LANGUAGE),
                        Config.LOW_RAM ? null : getTreesFilePath(Config.PROGRAMMING_LANGUAGE)), numberOfLines);

        System.gc();
        if (Config.TFIDF) {
            Pipeline.from(FeatureExtractionMode::stringArrayToDoubleArray)
                    // calculate tfidf weights
                    .connect(new TfIdfTransformer(featureFrequencyCounter, numberOfLines))
                    .connect(FeatureVector::new)
                    .connect(getVectorFileWriterPipeline(getFeatureCSVPath(Config.PROGRAMMING_LANGUAGE) + ".tfidf"))
                    .connect(new ProgressWatcher<>("TFIDF"))
                    .executeIgnoreResults(
                            readCSVLineByLine(getFeatureCSVPath(Config.PROGRAMMING_LANGUAGE), ","), numberOfLines);
        }
    }

    private static double[] stringArrayToDoubleArray(String[] featureVectorStr) {
        try {
            return Arrays.stream(featureVectorStr)
                    .mapToDouble(Double::parseDouble)
                    .toArray();
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            throw new RuntimeException(e);
        }
    }

    private static ParseTree parseCodeChange(String cc) {
        return TreeFactory.getAbstractTree(cc, Config.PROGRAMMING_LANGUAGE).getParseTree();
    }

    private static Tree deserializeTree(String json) {
        return new Gson().fromJson(json, SerializableTreeNode.class);
    }
}
