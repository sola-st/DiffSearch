package research.diffsearch;

import matching.Matching;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.Tree;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.concurrent.TimeUnit;

import static research.diffsearch.Pipeline.diffsearch_offline;
import static research.diffsearch.Pipeline.diffsearch_online;


public class App {
    public static void main(String[] args) {
        long change_number = 0;
        long real_changes = 0;
        double time_python2 = 0;



        /* **************************************************************************************************************
         * WEB INTERFACE MODE
         * */


        if(Config.WEB) {

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
                TimeUnit.SECONDS.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("FAISS SEARCHING STAGE DONE.\n");

            Socket socket_faiss = null;
            try {
                socket_faiss = new Socket(Config.host,Config.port);
            } catch (IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();

                System.out.println("\nCONNECTION WITH SERVER FAISS FAILED.\n");
                return;
            }

            ServerSocket server = null;
            Socket socket = null;
            try {
                server = new ServerSocket(Config.port_web);
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("DiffSearch Server active on port "+ Config.port_web);

            FileOutputStream server_log = null;

            try {
                server_log = new FileOutputStream(Config.server_log_file, true);

            } catch (IOException e) {
                e.printStackTrace();
            }

            while (true) {
                try {
                    assert server != null;
                    System.out.println("Waiting request on port " + Config.port_web);
                    socket = server.accept();
                    DiffSearch_WebServer client = new DiffSearch_WebServer(socket, socket_faiss, server_log);
                    client.start();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }

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
                System.out.println("FEATURE EXTRACTION STARTED.\n");//6612193 1432571 -> 51233 52364   PY: 6351999 with 5602836 //JAVA: 1700000
                real_changes = Pipeline.feature_extraction(change_number);
            } catch (Exception e) { //Java new 13171207 with 4568580
                e.printStackTrace();
            }

            System.out.println("FEATURE EXTRACTION DONE WITH " + real_changes + " CHANGES.\n");

            /* **************************************************************************************************************
             * INDEXING PYTHON STAGE (FAISS)*/

            try {
                System.out.println("INDEXING STARTED.\n");//908094  js: 508094  JAVA: 832139
                Pipeline.indexing_candidate_changes((int) real_changes);//(int) real_changes);
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


            int i = 1;

            while (true) {
                //Java_Tree tree_query = null;
                Python3_Tree tree_query = null;
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
                          //  if(Config.CLEANUP)
                           //     Pipeline.files_cleanup();
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
                   // tree_query = Pipeline.query_feature_extraction(query_input);
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
                   //  Pipeline.small_test(tree_query, query_old, query_new, buff_writer_results, query_input);
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
         * ***********************************************************************************************************/
        if(Config.SCALABILITY) {

            //Pipeline.scalability_java();
            //Pipeline.scalability_javaScript();
            Pipeline.scalability_python();
        }

        /* **************************************************************************************************************
         * EFFECTIVENESS
         * ************************************************************************************************************/

        if(Config.EFFECTIVENESS) {
            /* **************************************************************************************************************
             * CHANGES EXTRACTED FROM A GIT DIFF OUTPUT
             * */

            System.out.println("DOWNLOAD OF CHANGES FROM DEEP CORPUS.\n");
            //change_number = Change_extraction.read_HTML_dataset3();

            System.out.println("EXTRACTION FROM REPOSITORIES STARTED.\n");

            ///change_number = Change_extraction.analyze_diff_file();

            System.out.println("EXTRACTION FROM FILE DONE WITH " + change_number + " CHANGES.\n");

            /* **************************************************************************************************************
             * CHANGES TREE AND FEATURES COMPUTATION
             **/
            try {
                System.out.println("FEATURE EXTRACTION STARTED.\n");
                //       real_changes = Pipeline.feature_extraction(change_number);
            } catch (Exception e) {
                e.printStackTrace();
            }

            System.out.println("FEATURE EXTRACTION DONE WITH " + real_changes + " CHANGES.\n");

            /* **************************************************************************************************************
             * INDEXING PYTHON STAGE (FAISS)*/
            int[] array = {1000000, 1000000, 1000000, 1000000, 568580};

            for (int sub = 0; sub < 5; sub++) {

                try {
                    System.out.println("INDEXING STARTED.\n");
                    // Pipeline.indexing_candidate_changes((int) real_changes);
                    //Pipeline.indexing_candidate_changes(4568580);//4568580
                    Pipeline.indexing_candidate_changes_effectiveness(array[sub], 1000000*sub);//4568580
                    System.out.println("INDEXING DONE.\n");
                } catch (Exception e) {
                    e.printStackTrace();
                }

                /* **************************************************************************************************************
                 * SEARCH PYTHON STAGE (FAISS)
                 ****************************************************************************************************************/
                try {
                    System.out.println("CLOSING PORT.\n");
                    Pipeline.port_close(Config.port);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                try {
                    System.out.println("INDEX LOADING.\n");
                    new Thread(Pipeline::search_candidate_changes).start();
                } catch (Exception e) {
                    e.printStackTrace();
                }

                try {
                    System.out.println("SLEEPING\n");
                    TimeUnit.SECONDS.sleep(200);
                    System.out.println("WAKE UP\n");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


                Socket socket = null;
                try {
                    socket = new Socket(Config.host, Config.port);
                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();

                    System.out.println("\nCONNECTION WITH SERVER FAILED.\n");
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
                int i = 1;

                try {
                    buff_writer_results = new BufferedWriter(new FileWriter("./src/main/resources/Effectiveness/EFFECTIVENESS"+sub+".log"));
                } catch (IOException e) {
                    e.printStackTrace();
                }

                for (int j = 8; j < 13; j++) {
                    int counter = 0;
                    Java_Tree tree_query = null;
                    List<String> allLines = null;

                    try {
                        allLines = Files.readAllLines(Paths.get("./src/main/resources/Effectiveness/" + j + "/queries.txt"));
                    } catch (IOException e) {
                        e.printStackTrace();
                        return;
                    }

                    try {
                        assert buff_writer_results != null;
                        buff_writer_results.write("PATTERN: " + j + "\n\n");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    for (String query_input : allLines) {

                        try {
                            tree_query = Pipeline.query_feature_extraction(query_input);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                        if (tree_query == null) {
                            System.out.print("The query is not correct, please try again.\n" + query_input);
                            return;
                        }

                        try {
                            BufferedReader stdIn = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                            out.print("PYTHON" + "\r\n");
                            out.flush();
                            //System.out.println("WAITING MESSAGE..");

                            time_python2 = Double.parseDouble(stdIn.readLine().substring(0, 5));

                            String in = stdIn.readLine();
                            //System.out.println("MESSAGE RECEIVED");

                            if (!in.equals("JAVA"))
                                continue;

                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                        /* **************************************************************************************************************
                         * FINAL MATCHING STAGE:  Deep tree comparison as final matching.
                         * */

                        long startTime_matching = System.currentTimeMillis();

                        long number_matching = -1;
                        try {

                            List<String> output = diffsearch_offline(tree_query, socket);

                            for (String temp : output) {
                                try {
                                    buff_writer_results.write(temp + "\n\n");
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                            }

                            counter += output.size();


                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        System.out.println(counter + " DONE with query: " + query_input);


                    }

                    matrix_results[j - 1][2] = counter;
                    matrix_results[j - 1][3] = counter / matrix_results[j - 1][1] * 100;

                    System.out.println("Pattern " + j + ": " + counter + " found.");


                }
                try {
                    buff_writer_results.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                //Creation of a buffered writer
                BufferedWriter buff_writer = null;
                try {
                    buff_writer = new BufferedWriter(new FileWriter("./src/main/resources/Effectiveness/effectiveness_results"+sub+".csv"));

                    // Writing the feature vector in a csv file
                    StringBuilder str_builder = new StringBuilder();


                    str_builder.append("Pattern, mineSStubs, DiffSearch, Percentage(%) \n");

                    for (int j = 0; j < 12; j++) {
                        for (i = 0; i < 4; i++) {
                            str_builder.append(matrix_results[j][i]);
                            str_builder.append(",");
                        }
                        str_builder.append("\n");
                    }
                    buff_writer.write(str_builder.toString());
                    buff_writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                /* **************************************************************************************************************
                 * STATISTICS
                 **/
                System.out.println("\nFINAL STATISTICS:");

                System.out.println("\n\n\nEND OF THE PROGRAM SUCCESSFULLY REACHED.");
            }
        }
    }

    public static boolean run_junit(String query, String candidate) {
        Java_Tree queryJavaTree = new Java_Tree(query);

        ParseTree queryTree = queryJavaTree.get_parsetree();

        Java_Tree changeJavaTree = new Java_Tree(candidate);
        ParseTree changeTree = changeJavaTree.get_parsetree();

        Matching matching = new Matching(queryTree, queryJavaTree.get_parser());

        return matching.isMatch(changeTree, changeJavaTree.get_parser());
    }
}
