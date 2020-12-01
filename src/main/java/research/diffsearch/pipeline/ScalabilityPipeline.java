package research.diffsearch.pipeline;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import research.diffsearch.Config;
import research.diffsearch.PipelineOld;
import research.diffsearch.main.App;
import research.diffsearch.util.FilePathUtils;
import research.diffsearch.util.ProgrammingLanguage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class ScalabilityPipeline {

    private static final Logger logger = LoggerFactory.getLogger(ScalabilityPipeline.class);

    public static void runScalabilityPipeline(ProgrammingLanguage programmingLanguage) {
        try {
            int[] changes = {10000, 50000, 100000, 250000, 400000, 500000, 600000, 700000, 850000, 1000000};
            int delay = 5;

            BufferedWriter buffWriterFeatures =
                    getBufferedWriterForFeatures(FilePathUtils.getScalabilityCSVFilePath(programmingLanguage));

            logger.info("Start scalability pipeline");
            for (int i : changes) {
                logger.info("\n" + i + "");
                PipelineOld.indexing_candidate_changes(i);

                /* ************************************************
                 * SEARCH PYTHON STAGE (FAISS)
                 **************************************************/

                // Skip FAISS stage if the dataset is small
                PipelineOld.port_close(Config.port);
                App.startPythonServer();
                Socket socket = new Socket(Config.host, Config.port);
                Iterable<String> allLines = FilePathUtils.getAllLines(FilePathUtils.getScalabilityInputPath(programmingLanguage));

                buffWriterFeatures.write(i + ",");

                for (String queryInput : allLines) {
                    Object treeQuery = FeatureExtractionPipelineOld.queryFeatureExtraction(queryInput, programmingLanguage);
                    if (treeQuery == null) {
                        logger.error("The query is not correct, please try again.\n" + queryInput);
                        return;
                    }

                    processScalabilityStep(programmingLanguage, buffWriterFeatures, socket, treeQuery);
                }
                buffWriterFeatures.write("\n");

                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                out.print("END" + "\r\n");
                out.flush();
                socket.close();
            }
            buffWriterFeatures.close();
        } catch (IOException e) {
            logger.error(e.getMessage(), e);
        }
    }

    protected static void processScalabilityStep(ProgrammingLanguage programmingLanguage,
                                                 BufferedWriter buffWriterFeatures,
                                                 Socket socket, Object treeQuery) throws IOException {
        long time = System.currentTimeMillis();
        if (OnlinePipeline.sendMessageToPythonServer(socket)) {
            double timePython = (System.currentTimeMillis() - time) / 1000.0;
            /* *
             * FINAL MATCHING STAGE:  Deep tree comparison as final matching.
             * */
            long startTimeMatching = System.currentTimeMillis();
            OfflinePipeline.diffsearchOffline(treeQuery, socket, programmingLanguage);

            long durationMatching = (System.currentTimeMillis() - startTimeMatching);
            logger.info("final matching time: " + durationMatching / 1000.0);

            buffWriterFeatures.write(timePython + "," + durationMatching / 1000.0 + ",");
        }
    }

    private static BufferedWriter getBufferedWriterForFeatures(String s)
            throws IOException {
        return new BufferedWriter(new FileWriter(s));
    }

}
