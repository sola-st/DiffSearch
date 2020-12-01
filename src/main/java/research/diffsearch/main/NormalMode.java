package research.diffsearch.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import research.diffsearch.Config;
import research.diffsearch.PipelineOld;
import research.diffsearch.tree.Python3_Tree;
import research.diffsearch.util.QueryUtil;

import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SuppressWarnings("ALL")
public class NormalMode extends App {

    private static final Logger logger = LoggerFactory.getLogger(NormalMode.class);

    @Override
    public void run() {
        long changeNumber = 0;
        long realChanges = 0;

        /* CHANGES EXTRACTED FROM A GIT DIFF OUTPUT*/

        logger.info("EXTRACTION FROM REPOSITORIES STARTED.\n");

        // change_number = Change_extraction.analyze_diff_file_new_propagation();

        logger.info("EXTRACTION FROM FILE DONE WITH " + changeNumber + " CHANGES.\n");

        /* CHANGES TREE AND FEATURES COMPUTATION */
        try {
            logger.info("FEATURE EXTRACTION STARTED.\n");
            realChanges = PipelineOld.feature_extraction(500000);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }

        logger.info("FEATURE EXTRACTION DONE WITH " + realChanges + " CHANGES.\n");

        /* **************************************************************************************************************
         * INDEXING PYTHON STAGE (FAISS)*/

        try {
            logger.info("INDEXING STARTED.\n");
            PipelineOld.indexing_candidate_changes((int) realChanges);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }

        logger.info("INDEXING FINISHED.\n");

        startPythonServer();

        Socket socket_python = null;
        try {
            socket_python = new Socket(Config.host, Config.port);
        } catch (IOException e1) {
            e1.printStackTrace();

            logger.error("\nCONNECTION WITH SERVER FAILED.\n");
            return;
        }


        int i = 1;

            while (true) {
                //Java_Tree tree_query = null;
                Python3_Tree tree_query = null;
                //Javascript_Tree tree_query = null;
                String queryInput = null;
                try {
                    System.out.print("Enter ONLY the old code (blank line for the next step or END to end the program):\n");
                    Scanner input = new Scanner(System.in);
                    List<String> old_code = new ArrayList<String>();
                    String lineNew;
                    while (input.hasNextLine()) {
                        lineNew = input.nextLine();
                        if (lineNew.equals("END")) {
                            logger.info("\n================================\nProgram finished successfully.");
                            return;
                        }
                        if (lineNew.isEmpty()) {
                            break;
                        }
                        old_code.add(lineNew);
                    }
                    System.out.print("Enter ONLY the new code (blank line for next step or END to end the program):\n");
                    Scanner input2 = new Scanner(System.in);
                    List<String> new_code = new ArrayList<String>();
                    String lineNew2;
                    while (input2.hasNextLine()) {
                        lineNew2 = input2.nextLine();
                        if (lineNew2.equals("END")) {
                            //removing useless files
                            //  if(Config.CLEANUP)
                            //     Pipeline.files_cleanup();
                            logger.info("\n================================\nProgram finished successfully.");
                            return;
                        }
                        if (lineNew2.isEmpty()) {
                            break;
                        }
                        new_code.add(lineNew2);
                    }
                    queryInput = String.join(System.lineSeparator(), old_code) + "-->" + String.join(System.lineSeparator(), new_code);

                    //queryInput = "ID binOP<0> LT; --> ID binOP<1> LT;";
                    // tree_query = Pipeline.query_feature_extraction(queryInput);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                if (QueryUtil.checkIfQueryIsValid(queryInput)) {
                    logger.error("The query is not correct, please try again.\n");
                    return;
                }

                logger.info("QUERY CORRECT, START SEARCHING CODE CHANGES\n");
                //List<String> output = diffsearch_online(tree_query, queryInput, socket_python);

                //logger.info(output.size() + " CODE CHANGES FOUND.\n");

                //return;
            }

    }
}
