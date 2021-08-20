package research.diffsearch.pipeline;

//import static research.diffsearch.main.App.getFaissSocket;
import static research.diffsearch.pipeline.feature.FeatureExtractionPipeline.getDefaultFeatureExtractionPipeline;
//import static research.diffsearch.main.App.startPythonServer;

import org.slf4j.LoggerFactory;
import research.diffsearch.Config;
import research.diffsearch.PipelineOld;
import research.diffsearch.main.FeatureExtractionMode;
import research.diffsearch.server.PythonRunner;
import research.diffsearch.util.FilePathUtils;
import research.diffsearch.util.ProgrammingLanguage;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Logger;

public class ScalabilityPipeline {

    //private static final Logger logger = (Logger) LoggerFactory.getLogger(ScalabilityPipeline.class);

   public static void runScalabilityPipeline() {
       try {
           int[] changes = {10000, 50000, 100000, 250000, 400000, 500000, 600000, 700000, 850000, 1000000};
           int[] partitions = {2, 8, 14, 32, 50, 63, 75, 87, 105, -1};
           //ListIterator<Integer> it = partitions.listIterator();
           int delay = 5;
           int pos = -1;

           //BufferedWriter buffWriterFeatures =
           //       getBufferedWriterForFeatures(FilePathUtils.getScalabilityCSVFilePath(programmingLanguage));

        //   logger.info("Start scalability pipeline");
           for (int i : changes) {
         //      logger.info("\n" + i + "");
               //PipelineOld.indexing_candidate_changes(i);
               var pythonRunner = new PythonRunner(
                       "./src/main/resources/Python/FAISS_indexing_scalability.py",
                       FilePathUtils.getFeatureCSVPath(Config.PROGRAMMING_LANGUAGE),
                       FilePathUtils.getIndexFilePath(Config.PROGRAMMING_LANGUAGE),
                       Integer.toString(getDefaultFeatureExtractionPipeline(false).getTotalFeatureVectorLength()),
                       Integer.toString(Config.nlist),
                       Integer.toString(i),
                       Integer.toString(2),
                       Boolean.toString(Config.TFIDF));

               pythonRunner.runAndWaitUntilEnd();

             //  try {
                   pos++;

               /* ********************************
                * SEARCH PYTHON STAGE (FAISS)
                * ********************************
                */


               // startPythonServer();
              //  Socket socket = getFaissSocket();
               // Iterable<String> allLines = FilePathUtils.getAllLines(FilePathUtils.getScalabilityInputPath(programmingLanguage));
//
//                buffWriterFeatures.write(i + ",");
//
//                for (String queryInput : allLines) {
//                    Object treeQuery = FeatureExtractionPipelineOld.queryFeatureExtraction(queryInput, programmingLanguage);
//                    if (treeQuery == null) {
//                        logger.error("The query is not correct, please try again.\n" + queryInput);
//                        return;
//                    }
//
//                    processScalabilityStep(programmingLanguage, buffWriterFeatures, socket, queryInput);
//                }
//                buffWriterFeatures.write("\n");
//
//                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
//                out.print("END" + "\r\n");
//               out.flush();
//                socket.close();
//            }
//            buffWriterFeatures.close();
               //    } catch (IOException | InterruptedException e) {
               //  logger.error(e.getMessage(), e);
               //  }
           }} catch (InterruptedException e) {
           e.printStackTrace();
       } catch (IOException e) {
           e.printStackTrace();
       }
   }}

//    protected static void processScalabilityStep(ProgrammingLanguage programmingLanguage,
//                                                 BufferedWriter buffWriterFeatures,
//                                                 Socket socket, String queryInput) throws IOException {
//        long time = System.currentTimeMillis();
//        //if (OnlinePipeline.sendMessageToPythonServer(socket)) {
//        double timePython = (System.currentTimeMillis() - time) / 1000.0;
//        /* *
//         * FINAL MATCHING STAGE:  Deep tree comparison as final matching.
//         * */
//        long startTimeMatching = System.currentTimeMillis();
//       // OfflinePipeline.diffsearchOffline(treeQuery, socket, programmingLanguage);
//        try {
//           List<CodeChangeWeb> output = new OnlinePipeline(socket, Config.PROGRAMMING_LANGUAGE)
//                   .collect(queryInput)
//                    .orElseThrow();
//        }
//        catch (Exception e){
//            logger.debug("Matching error");
//            //return;
//       }
//
//        long durationMatching = (System.currentTimeMillis() - startTimeMatching);
//        logger.info("final matching time: " + durationMatching / 1000.0);
//
//       buffWriterFeatures.write(timePython + "," + durationMatching / 1000.0 + ",");
//}
//    }
//
//    private static BufferedWriter getBufferedWriterForFeatures(String s)
//            throws IOException {
//        return new BufferedWriter(new FileWriter(s));
//    }

