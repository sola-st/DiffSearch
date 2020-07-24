package research.diffsearch;

import org.antlr.v4.runtime.tree.Tree;
import java.io.*;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class App {
    public static void main(String[] args) {
        long change_number = 0;
        long real_changes = 0;
        double time_python2 = 0;

        /* **************************************************************************************************************
         * NORMAL MODE
         * */


        if(Config.NORMAL) {
            /* **************************************************************************************************************
             * CHANGES EXTRACTED FROM A GIT DIFF OUTPUT
             * */

            System.out.println("EXTRACTION FROM REPOSITORIES STARTED.\n");

            change_number = Change_extraction.analyze_diff_file_new_propagation();


            System.out.println("EXTRACTION FROM FILE DONE WITH " + change_number + " CHANGES.\n");

            /* **************************************************************************************************************
             * CHANGES TREE AND FEATURES COMPUTATION
             **/
            try {
                System.out.println("FEATURE EXTRACTION STARTED.\n");//6612193 1432571 -> 51233 52364   PY: 6351999 with 5602836
                real_changes = Pipeline.feature_extraction(change_number);
            } catch (Exception e) {
                e.printStackTrace();
            }

            System.out.println("FEATURE EXTRACTION DONE WITH " + real_changes + " CHANGES.\n");

            /* **************************************************************************************************************
             * INDEXING PYTHON STAGE (FAISS)*/

            try {
                System.out.println("INDEXING STARTED.\n");//908094  js: 508094
                //Pipeline.indexing_candidate_changes( 50000);
            } catch (Exception e) {
                e.printStackTrace();
            }

            System.out.println("INDEXING FINISHED.\n");

            /* **************************************************************************************************************
             * SEARCH PYTHON STAGE (FAISS)
             ****************************************************************************************************************/

            System.out.println("FAISS SEARCHING STAGE STARTED.\n");
            try {
                new Thread( Pipeline::search_candidate_changes).start();
            } catch (Exception e) {
                e.printStackTrace();
            }

            try {
                TimeUnit.SECONDS.sleep(15);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("FAISS SEARCHING STAGE DONE.\n");

            Socket socket = null;
            try {
                socket = new Socket(Config.host,Config.port);
            } catch (IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();

                System.out.println("\nCONNECTION WITH SERVER FAILED.\n");
                return;
            }


            BufferedWriter buff_writer_results = null;
            int i = 1;

            while (true) {
                Java_Tree tree_query = null;
                //Python3_Tree tree_query = null;
                //Javascript_Tree tree_query = null;
                String query_input = null;
                try {
                    System.out.print("Enter ONLY the old code (blank line for the next step or END to end the program):\n");
                    Scanner input = new Scanner(System.in);
                    List<String> old_code = new ArrayList<String>();
                    String lineNew;
                    while (input.hasNextLine()) {
                        lineNew = input.nextLine();
                        if (lineNew.equals("END")) {
                            System.out.println("\n================================\nProgram finished successfully.");
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
                            if(Config.CLEANUP)
                                Pipeline.files_cleanup();
                            System.out.println("\n================================\nProgram finished successfully.");
                            return;
                        }
                        if (lineNew2.isEmpty()) {
                            break;
                        }
                        new_code.add(lineNew2);
                    }
                    query_input = String.join(System.lineSeparator(), old_code) + "-->" + String.join(System.lineSeparator(), new_code);

                    query_input = "ID binOP<0> LT; --> ID binOP<1> LT;";
                    tree_query = Pipeline.query_feature_extraction(query_input);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (tree_query == null) {
                    System.out.print("The query is not correct, please try again.\n");
                    continue;
                }

          //  for(String query_input: allLines){
/*
                try{
                    tree_query = Pipeline.query_feature_extraction(query_input);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                if (tree_query == null) {
                    System.out.print("The query is not correct, please try again.\n");
                    continue;
                }*/

                Tree query_old = null;
                Tree query_new = null;


                //query_old = TreeUtils.query_javascript_extraction(tree_query.get_parsetree().getChild(0), Arrays.asList(tree_query.get_parser().getRuleNames()));
                //query_new = TreeUtils.query_javascript_extraction(tree_query.get_parsetree().getChild(2),Arrays.asList(tree_query.get_parser().getRuleNames()));
                //query_old = TreeUtils.query_python_extraction(tree_query.get_parsetree().getChild(0), Arrays.asList(tree_query.get_parser().getRuleNames()));
                //query_new = TreeUtils.query_python_extraction(tree_query.get_parsetree().getChild(2),Arrays.asList(tree_query.get_parser().getRuleNames()));

                query_old = TreeUtils.query_java_extraction(tree_query.get_parsetree().getChild(0), Arrays.asList(tree_query.get_parser().getRuleNames()));
                query_new = TreeUtils.query_java_extraction(tree_query.get_parsetree().getChild(2),Arrays.asList(tree_query.get_parser().getRuleNames()));


                //String ssss = query_old.toStringTree();
                //String ssad = query_new.toStringTree();

                try {
                    BufferedReader stdIn = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                    PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                    out.print("PYTHON" + "\r\n");
                    out.flush();
                    System.out.println("WAITING MESSAGE..");

                    time_python2 = Double.parseDouble(stdIn.readLine().substring(0, 5));

                    String in = stdIn.readLine();
                    System.out.println("MESSAGE RECEIVED");

                    if(!in.equals("JAVA"))
                        continue;

                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

                /* **************************************************************************************************************
                 * FINAL MATCHING STAGE:  Deep tree comparison as final matching.
                 * */

                long startTime_matching = System.currentTimeMillis();

                long number_matching = -1;
                try {
                    System.out.println("\n============================\n\nChanges found with the deep tree comparison:\n");
                    //Deep recursive tree comparison
                   //  number_matching = Pipeline.final_comparison(tree_query, change_number,query_old, query_new, buff_writer_results, query_input);
                     Pipeline.small_test(tree_query, query_old, query_new, buff_writer_results, query_input);
    //                buff_writer_results.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }

                if (number_matching == 0)
                    System.out.println("No changes found that match the query with deep comparison. \n");

                long duration_matching = (System.currentTimeMillis() - startTime_matching);


                /* **************************************************************************************************************
                 * STATISTICS
                 **/
                System.out.println("\nFINAL STATISTICS:"
                        + "\nNumber of changes analysed: " + real_changes
                        + "\nNumber of final matched changes: " + number_matching
                        + "\nFAISS Search duration: " + time_python2 + " seconds"// + ", read index: " + reading_index + " seconds"
                        + "\nFinal Matching duration: " + duration_matching / 1000.0 + " seconds.\n");
            }

            //System.out.println("\n\n\nEND OF THE PROGRAM SUCCESSFULLY REACHED.");
        }



        /* **************************************************************************************************************
         * SCALABILITY
         * */
        if(Config.SCALABILITY) {
            /* **************************************************************************************************************
             * CHANGES EXTRACTED FROM A GIT DIFF OUTPUT
             * */

            System.out.println("EXTRACTION FROM REPOSITORIES STARTED.\n");
            try {
                switch(Config.PROGRAMMING_LANGUAGE) {
                    case "PYTHON3": change_number = Change_extraction.analyze_diff_file();break;
                    case "JAVA_SCALABILITY": change_number = Change_extraction.analyze_diff_file_scalability();break;
                    default: change_number = Change_extraction.read_HTML_dataset3();
                   change_number = Change_extraction.analyze_diff_file();
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

            System.out.println("EXTRACTION FROM FILE DONE WITH " + change_number + " CHANGES.\n");

            /* **************************************************************************************************************
             * CHANGES TREE AND FEATURES COMPUTATION
             **/

            System.out.println("FEATURE EXTRACTION STARTED.\n");

            try {
                real_changes = Pipeline.feature_extraction(change_number);
            } catch (Exception e) {
                e.printStackTrace();
            }

            System.out.println("FEATURE EXTRACTION DONE WITH " + real_changes + " CHANGES.\n");

            Pipeline.scalability();
        }


        /* **************************************************************************************************************
         * EFFECTIVENESS
         * */

        if(Config.EFFECTIVENESS) {
            /* **************************************************************************************************************
             * CHANGES EXTRACTED FROM A GIT DIFF OUTPUT
             * */

            System.out.println("DOWNLOAD OF CHANGES FROM DEEP CORPUS.\n");
            change_number = Change_extraction.read_HTML_dataset3();

            System.out.println("EXTRACTION FROM REPOSITORIES STARTED.\n");

            change_number = Change_extraction.analyze_diff_file();


            System.out.println("EXTRACTION FROM FILE DONE WITH " + change_number + " CHANGES.\n");

            /* **************************************************************************************************************
             * CHANGES TREE AND FEATURES COMPUTATION
             **/
            try {
                System.out.println("FEATURE EXTRACTION STARTED.\n");
                real_changes = Pipeline.feature_extraction(change_number);
            } catch (Exception e) {
                e.printStackTrace();
            }

            System.out.println("FEATURE EXTRACTION DONE WITH " + real_changes + " CHANGES.\n");

            /* **************************************************************************************************************
             * INDEXING PYTHON STAGE (FAISS)*/

            try {
                System.out.println("INDEXING STARTED.\n");
                Pipeline.indexing_candidate_changes((int) real_changes);
            } catch (Exception e) {
                e.printStackTrace();
            }

            /* **************************************************************************************************************
             * SEARCH PYTHON STAGE (FAISS)
             ****************************************************************************************************************/

            try {
                new Thread( Pipeline::search_candidate_changes).start();
            } catch (Exception e) {
                e.printStackTrace();
            }

            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Socket socket = null;
            try {
                socket = new Socket(Config.host,Config.port);
            } catch (IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();

                System.out.println("\nCONNECTION WITH SERVER FAILED.\n");
                return;
            }

            Java_Tree tree_query = null;
            List<String> allLines = null;
            BufferedWriter buff_writer_results = null;
            int i = 1;

            try {
                allLines = Files.readAllLines(Paths.get("./src/main/resources/GitHub/effectiveness_input.txt"));
            } catch (IOException e) {
                e.printStackTrace();
            }

            for(String query_input: allLines){

                try {
                    buff_writer_results = new BufferedWriter(new FileWriter("./src/main/resources/Features_Vectors/EFFECTIVENESS_query" + i++ +".txt"));
                } catch (IOException e) {
                    e.printStackTrace();
                }

                try {
                    buff_writer_results.write("QUERY: " + query_input + "\n\n");
                } catch (IOException e) {
                    e.printStackTrace();
                }

                try{
                    //tree_query = Pipeline.query_feature_extraction(query_input);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                if (tree_query == null) {
                    System.out.print("The query is not correct, please try again.\n");
                    continue;
                }

                try {
                    BufferedReader stdIn = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                    PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                    out.print("PYTHON" + "\r\n");
                    out.flush();
                    System.out.println("WAITING MESSAGE..");

                    time_python2 = Double.parseDouble(stdIn.readLine().substring(0, 5));

                    String in = stdIn.readLine();
                    System.out.println("MESSAGE RECEIVED");

                    if(!in.equals("JAVA"))
                        continue;

                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

                /* **************************************************************************************************************
                 * FINAL MATCHING STAGE:  Deep tree comparison as final matching.
                 * */

                long startTime_matching = System.currentTimeMillis();

                long number_matching = -1;
                try {
                    //System.out.println("\n============================\n\nChanges found with the deep tree comparison:\n");
                    //Deep recursive tree comparison
              //      number_matching = Pipeline.final_comparison(tree_query, change_number, buff_writer_results);
                    buff_writer_results.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }

                if (number_matching == 0)
                    System.out.println("No changes found that match the query with deep comparison. \n");

                long duration_matching = (System.currentTimeMillis() - startTime_matching);


                /* **************************************************************************************************************
                 * STATISTICS
                 **/
                System.out.println("\nFINAL STATISTICS:"
                        + "\nNumber of changes analysed: " + real_changes
                        + "\nNumber of final matched changes: " + number_matching
                        + "\nPython Search duration: " + time_python2 + " seconds"// + ", read index: " + reading_index + " seconds"
                        + "\nFinal Matching duration: " + duration_matching / 1000.0 + " seconds.\n");
            }

            System.out.println("\n\n\nEND OF THE PROGRAM SUCCESSFULLY REACHED.");
        }

    }

}
