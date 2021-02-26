package research.diffsearch.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import research.diffsearch.Config;
import research.diffsearch.pipeline.base.Pipeline;
import research.diffsearch.pipeline.feature.RemoveCollisionPipeline;
import research.diffsearch.server.PythonRunner;
import research.diffsearch.util.ProgressWatcher;
import research.diffsearch.util.QueryUtil;

import java.io.IOException;
import java.util.List;

import static research.diffsearch.pipeline.feature.FeatureExtractionPipeline.getDefaultFeatureExtractionPipeline;
import static research.diffsearch.util.FilePathUtils.*;

public class FeatureExtractionMode extends App {

    private static final Logger logger = LoggerFactory.getLogger(FeatureExtractionMode.class);

    @Override
    public void run() {
        logger.info("Starting feature extraction on corpus.");

        try {
            //extractFeaturesToFile();
            runPythonIndexing();
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
    }

    protected static void runPythonIndexing() throws IOException, InterruptedException {
        runPythonIndexing(Integer.MAX_VALUE);
    }

    public static void runPythonIndexing(int maxLines) throws IOException, InterruptedException {
        if (!Config.ONLY_JAVA) {
            var pythonExecutor = new PythonRunner(
                    "./src/main/resources/Python/FAISS_indexing_python.py",
                    "Features_Vectors/changes_feature_vectors_java.csv",
                    "Features_Vectors/faiss_java.index",
                    Integer.toString(getDefaultFeatureExtractionPipeline(false).getTotalFeatureVectorLength()));
            pythonExecutor.waitUntilEnd();
        } else {
            logger.warn("Running in ONLY_JAVA mode. Python indexing must be started separately.");
        }
    }

    public static void runPythonIndexing_scalability(int maxLines, int part) throws IOException, InterruptedException {
        if (!Config.ONLY_JAVA) {
            var pythonExecutor = new PythonRunner(
                    "./src/main/resources/Python/FAISS_indexing.py",
                    "Features_Vectors/changes_feature_vectors_java.csv",
                    "Features_Vectors/faiss_java.index",
                    Integer.toString(getDefaultFeatureExtractionPipeline(false).getTotalFeatureVectorLength()),
                    Integer.toString(maxLines),
                    Integer.toString(part));
            pythonExecutor.waitUntilEnd();
        } else {
            logger.warn("Running in ONLY_JAVA mode. Python indexing must be started separately.");
        }
    }

    protected static void extractFeaturesToFile() throws IOException {
        List<String> changesLines = getAllLines(getChangesFilePath(Config.PROGRAMMING_LANGUAGE));
        Pipeline.from(QueryUtil::formatQuery)
                .connect(getDefaultFeatureExtractionPipeline(false))
                .parallelUntilHere(16)
                .connect(new RemoveCollisionPipeline())
                .connect(getVectorFileWriterPipeline(getFeatureCSVPath(Config.PROGRAMMING_LANGUAGE)))
                .connect(new ProgressWatcher<>(changesLines.size(), "Feature extraction"))
                .execute(changesLines);
    }
}
