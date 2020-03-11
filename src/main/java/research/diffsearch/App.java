package research.diffsearch;

import java.io.*;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class App {
    public static void main(String[] args) {
        long change_number = 0;
        long real_changes = 0;
        double time_python2 = 0;

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
                    tree_query = Pipeline.query_feature_extraction(query_input);
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
                    number_matching = Pipeline.final_comparison(tree_query, change_number, buff_writer_results);
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
