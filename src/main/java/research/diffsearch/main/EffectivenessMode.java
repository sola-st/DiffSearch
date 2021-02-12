package research.diffsearch.main;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import research.diffsearch.Config;
import research.diffsearch.PipelineOld;
import research.diffsearch.pipeline.OnlinePipeline;
import research.diffsearch.util.CodeChangeWeb;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class EffectivenessMode extends App {

    private static final Logger logger = LoggerFactory.getLogger(EffectivenessMode.class);

    @Override
    public void run() {
        long changeNumber = 0;
        long realChanges = 0;
        /* **************************************************************************************************************
         * CHANGES EXTRACTED FROM A GIT DIFF OUTPUT
         * */
//        logger.info("DOWNLOAD OF CHANGES FROM DEEP CORPUS.\n");
//        //changeNumber = Change_extraction.read_HTML_dataset3();
//
//        logger.info("EXTRACTION FROM REPOSITORIES STARTED.\n");
//
//        ///changeNumber = Change_extraction.analyze_diff_file();
//
//        logger.info("EXTRACTION FROM FILE DONE WITH " + changeNumber + " CHANGES.\n");
//
//        /* CHANGES TREE AND FEATURES COMPUTATION */
//        try {
//            logger.info("FEATURE EXTRACTION STARTED.\n");
//            //       realChanges = Pipeline.feature_extraction(changeNumber);
//        } catch (Exception e) {
//            logger.error(e.getMessage(), e);
//            e.printStackTrace();
//        }
//        logger.info("FEATURE EXTRACTION DONE WITH " + realChanges + " CHANGES.\n");

        /* INDEXING PYTHON STAGE (FAISS) */
        try {
            int[] array = {50207, 1000000, 1000000, 1000000, 568580}; // entries 667395/49267

            List<CodeChangeWeb> json_final = new ArrayList<>();
            for (int sub = 0; sub < 1; sub++) {
                logger.debug("INDEXING STARTED.\n");
                FeatureExtractionMode.runPythonIndexing(array[sub]);

                /* ********************************
                 * SEARCH PYTHON STAGE (FAISS)
                 * ********************************/
                logger.info("CLOSING PORT.\n");
                PipelineOld.port_close(Config.port);

                startPythonServer();
                Socket socket = getFaissSocket();

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
                BufferedWriter buffWriterResults;
                int i;
                buffWriterResults = new BufferedWriter(
                        new FileWriter("./src/main/resources/Effectiveness/EFFECTIVENESS" + sub + ".log"));

                for (int j = 1; j < 13; j++) {
                    int counter = 0;
                    Object treeQuery;
                    List<String> allLines;

                    allLines = Files.readAllLines(
                            Paths.get("./src/main/resources/Effectiveness/" + j + "/queries.txt"));

                    buffWriterResults.write("PATTERN: " + j + "\n\n");
                    for (String queryInput : allLines) {
                        /* FINAL MATCHING STAGE:  Deep tree comparison as final matching.*/
                        /*long startTime_matching = System.currentTimeMillis();
                        long number_matching = -1;*/
                        try {
                            List<CodeChangeWeb> output = new OnlinePipeline(socket, Config.PROGRAMMING_LANGUAGE)
                                    .collect(queryInput)
                                    .orElseThrow();

                            for (CodeChangeWeb temp : output) {
                                buffWriterResults.write(temp.toString() + "\n\n");
                            }
                            counter += output.size();
                            json_final.addAll(output);

                        }
                        catch (Exception e){
                            logger.debug("Invalid query");
                            continue;
                        }

                        logger.debug(counter + " FOUND with query: " + queryInput);
                    }
                    matrix_results[j - 1][2] = counter;
                    matrix_results[j - 1][3] = counter / matrix_results[j - 1][1] * 100;

                    logger.debug("Pattern " + j + ": " + counter + " found.");
                }
                buffWriterResults.close();
                // Creation of a buffered writer
                BufferedWriter bufferedWriter;
                bufferedWriter = new BufferedWriter(
                        new FileWriter("./src/main/resources/Effectiveness/effectiveness_results" + sub + ".csv"));

                // Writing the feature vector in a csv file
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Pattern, mineSStubs, DiffSearch, Percentage(%) \n");

                Gson gson_list = new GsonBuilder().setPrettyPrinting().create();
                // convert your list to json
                String jsonChangesList = gson_list.toJson(json_final);
                // print your generated json

                try {
                    FileWriter myWriter = new FileWriter("./src/main/resources/Effectiveness/list_results.json");
                    myWriter.write(jsonChangesList);
                    myWriter.close();
                    //System.out.println("Successfully wrote to the file.");
                } catch (IOException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }

                for (int j = 0; j < 12; j++) {
                    for (i = 0; i < 4; i++) {
                        stringBuilder.append(matrix_results[j][i]);
                        stringBuilder.append(",");
                    }
                    stringBuilder.append("\n");
                }
                bufferedWriter.write(stringBuilder.toString());
                bufferedWriter.close();

                /* STATISTICS */
                logger.info("FINAL STATISTICS:");
                logger.info("END OF THE PROGRAM SUCCESSFULLY REACHED.");
            }
        } catch (IOException | InterruptedException exception) {
            logger.error(exception.getMessage(), exception);
        }
    }
}
