package research.diffsearch.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import research.diffsearch.Config;
import research.diffsearch.Java_Tree;
import research.diffsearch.Pipeline;
import research.diffsearch.ProgrammingLanguage;
import research.diffsearch.pipeline.OfflinePipeline;

import java.io.*;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static research.diffsearch.pipeline.OfflinePipeline.*;

public class EffectivenessMode extends App {

    private static final Logger logger = LoggerFactory.getLogger(EffectivenessMode.class);

    @Override
    public void run() {
        long change_number = 0;
        long real_changes = 0;
        // double time_python2 = 0;
        /* **************************************************************************************************************
         * CHANGES EXTRACTED FROM A GIT DIFF OUTPUT
         * */

        logger.info("DOWNLOAD OF CHANGES FROM DEEP CORPUS.\n");
        //change_number = Change_extraction.read_HTML_dataset3();

        logger.info("EXTRACTION FROM REPOSITORIES STARTED.\n");

        ///change_number = Change_extraction.analyze_diff_file();

        logger.info("EXTRACTION FROM FILE DONE WITH " + change_number + " CHANGES.\n");

        /* CHANGES TREE AND FEATURES COMPUTATION */
        try {
            logger.info("FEATURE EXTRACTION STARTED.\n");
            //       real_changes = Pipeline.feature_extraction(change_number);
        } catch (Exception e) {
            logger.error(e.getLocalizedMessage());
            e.printStackTrace();
        }

        logger.info("FEATURE EXTRACTION DONE WITH " + real_changes + " CHANGES.\n");

        /* INDEXING PYTHON STAGE (FAISS) */
        int[] array = {1000000, 1000000, 1000000, 1000000, 568580};

        for (int sub = 0; sub < 1; sub++) {

            try {
                logger.debug("INDEXING STARTED.\n");
                // Pipeline.indexing_candidate_changes((int) real_changes);
                //Pipeline.indexing_candidate_changes(4568580);//4568580
                Pipeline.indexing_candidate_changes_effectiveness(array[sub], 0);//4568580
                logger.debug("INDEXING DONE.\n");
            } catch (Exception e) {
                logger.error(e.getLocalizedMessage());
                e.printStackTrace();
            }

            /* ********************************
             * SEARCH PYTHON STAGE (FAISS)
             * ********************************/
            try {
                logger.info("CLOSING PORT.\n");
                Pipeline.port_close(Config.port);
            } catch (Exception e) {
                logger.error(e.getLocalizedMessage());
                e.printStackTrace();
            }

            try {
                logger.info("INDEX LOADING.\n");
                new Thread(Pipeline::search_candidate_changes).start();
            } catch (Exception e) {
                logger.error(e.getLocalizedMessage());
                e.printStackTrace();
            }

            try {
                logger.trace("SLEEPING\n");
                TimeUnit.SECONDS.sleep(200);
                logger.trace("WAKE UP\n");
            } catch (InterruptedException e) {
                logger.error(e.getLocalizedMessage());
                e.printStackTrace();
            }

            Socket socket;
            try {
                socket = new Socket(Config.host, Config.port);
            } catch (IOException e1) {
                logger.error("\nCONNECTION WITH SERVER FAILED.\n");
                e1.printStackTrace();
                return;
            }

            int[][] matrix_results = new int[][]{
                    {1, 187, 0, 0},
                    {2, 275, 0, 0},
                    {3, 175, 0, 0},
                    {4, 215, 0, 0},
                    {5, 1486, 0, 0},
                    {6, 758, 0, 0},
                    {7, 179, 0, 0},
                    {8, 127, 0, 0},
                    {9, 170, 0, 0},
                    {10, 120, 0, 0},
                    {11, 68, 0, 0},
                    {12, 48, 0, 0}
            };


            BufferedWriter buff_writer_results = null;
            int i;

            try {
                buff_writer_results = new BufferedWriter(
                        new FileWriter("./src/main/resources/Effectiveness/EFFECTIVENESS" + sub + ".log"));
            } catch (IOException e) {
                logger.error(e.getLocalizedMessage());
                e.printStackTrace();
            }

            for (int j = 1; j < 13; j++) {
                int counter = 0;
                Java_Tree tree_query = null;
                List<String> allLines;

                try {
                    allLines = Files.readAllLines(
                            Paths.get("./src/main/resources/Effectiveness/" + j + "/queries.txt"));
                } catch (IOException e) {
                    logger.error(e.getLocalizedMessage());
                    e.printStackTrace();
                    return;
                }

                try {
                    assert buff_writer_results != null;
                    buff_writer_results.write("PATTERN: " + j + "\n\n");
                } catch (IOException e) {
                    logger.error(e.getLocalizedMessage());
                    e.printStackTrace();
                }

                for (String query_input : allLines) {

                    try {
                        tree_query = Pipeline.query_feature_extraction_java(query_input);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    if (tree_query == null) {
                        logger.error("The query is not correct, please try again.\n" + query_input);
                        continue;
                    }

                    try {
                        BufferedReader stdIn = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                        out.print("PYTHON" + "\r\n");
                        out.flush();
                        // logger.debug("WAITING MESSAGE..");

                        // time_python2 = Double.parseDouble(stdIn.readLine().substring(0, 5));

                        String in = stdIn.readLine();
                        // logger.debug("MESSAGE RECEIVED");

                        if (!in.equals("JAVA"))
                            continue;

                    } catch (IOException e) {
                        logger.error(e.getLocalizedMessage());
                        e.printStackTrace();
                    }

                    /* FINAL MATCHING STAGE:  Deep tree comparison as final matching.*/

                    /*long startTime_matching = System.currentTimeMillis();

                    long number_matching = -1;*/
                    try {

                        List<String> output = diffsearchOffline(tree_query, socket, ProgrammingLanguage.JAVA);

                        for (String temp : output) {
                            try {
                                buff_writer_results.write(temp + "\n\n");
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }

                        counter += output.size();


                    } catch (Exception e) {
                        logger.error(e.getLocalizedMessage());
                        e.printStackTrace();
                    }
                    logger.debug(counter + " DONE with query: " + query_input);


                }

                matrix_results[j - 1][2] = counter;
                matrix_results[j - 1][3] = counter / matrix_results[j - 1][1] * 100;

                logger.debug("Pattern " + j + ": " + counter + " found.");


            }
            try {
                buff_writer_results.close();
            } catch (IOException e) {
                logger.error(e.getLocalizedMessage());
                e.printStackTrace();
            }
            // Creation of a buffered writer
            BufferedWriter bufferedWriter;
            try {
                bufferedWriter = new BufferedWriter(
                        new FileWriter("./src/main/resources/Effectiveness/effectiveness_results" + sub + ".csv"));

                // Writing the feature vector in a csv file
                StringBuilder stringBuilder = new StringBuilder();


                stringBuilder.append("Pattern, mineSStubs, DiffSearch, Percentage(%) \n");

                for (int j = 0; j < 12; j++) {
                    for (i = 0; i < 4; i++) {
                        stringBuilder.append(matrix_results[j][i]);
                        stringBuilder.append(",");
                    }
                    stringBuilder.append("\n");
                }
                bufferedWriter.write(stringBuilder.toString());
                bufferedWriter.close();
            } catch (IOException e) {
                logger.error(e.getLocalizedMessage());
                e.printStackTrace();
            }

            /* STATISTICS */
            logger.info("\nFINAL STATISTICS:");

            logger.info("\n\n\nEND OF THE PROGRAM SUCCESSFULLY REACHED.");
        }
    }
}
