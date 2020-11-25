package research.diffsearch.pipeline;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import research.diffsearch.*;
import research.diffsearch.main.App;
import research.diffsearch.util.FilePathUtils;
import research.diffsearch.util.ProgrammingLanguage;

import java.io.*;
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
                // TODO maybe replace with indexing candidate changes new
                PipelineOld.indexing_candidate_changes(i);

                /* ************************************************
                 * SEARCH PYTHON STAGE (FAISS)
                 **************************************************/

                // Skip FAISS stage if the dataset is small
                App.startPythonServer(delay++);
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
            logger.error(e.getLocalizedMessage());
            e.printStackTrace();
        }
    }

    protected static void processScalabilityStep(ProgrammingLanguage programmingLanguage,
                                                 BufferedWriter buffWriterFeatures,
                                                 Socket socket, Object treeQuery) throws IOException {
        BufferedReader stdIn = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        out.print("PYTHON" + "\r\n");
        out.flush();

        double timePython = Double.parseDouble(stdIn.readLine().substring(0, 5));

        String in = stdIn.readLine();
        if (in.equals("JAVA")) {
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
