package research.diffsearch;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class App {
    public static void main(String[] args) {
        long change_number = 0;
        long real_changes = 0;
        long gitdiff_extraction = 0;
        long feature_extraction = 0;
        long time_python = 0;
        double reading_index = 0;

        if(Config.INDEXING) {
            /***************************************************************************************************************
             * EXTRACT CHANGES FROM A GIT REPOSITORY
             * */

            //not linked yet


            /***************************************************************************************************************
             * CHANGES EXTRACTED FROM A GIT DIFF OUTPUT
             * */

            long startTime_gitdiff = System.currentTimeMillis();

            try {
                switch(Config.PROGRAMMING_LANGUAGE) {
                    case "PYTHON3": change_number = Change_extraction.analyze_diff_file();break;
                 //   case "JAVA": change_number = Change_extraction.analyze_diff_file();break;
                    default: change_number = Change_extraction.read_HTML_dataset2();
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

            gitdiff_extraction = (System.currentTimeMillis() - startTime_gitdiff);

            System.out.println("EXTRACTION FROM FILE DONE WITH " + change_number + " CHANGES.\n");


            /***************************************************************************************************************
             * CHANGES TREE AND FEATURES COMPUTATION
             * */

            long startTime_indexing = System.currentTimeMillis();

            try {
                real_changes = Pipeline.feature_extraction(change_number);
            } catch (Exception e) {
                e.printStackTrace();
            }

            feature_extraction = (System.currentTimeMillis() - startTime_indexing);

            System.out.println("FEATURE EXTRACTION DONE WITH " + real_changes + " CHANGES.\n");

            /***************************************************************************************************************
             * SEARCH PYTHON STAGE (FAISS)
             */
            long startTime_python = System.currentTimeMillis();
/*
            try {
                Pipeline.indexing_candidate_changes();

            } catch (Exception e) {
                e.printStackTrace();
            }*/

            Thread t1 = new Thread(() -> {
                Pipeline.indexing_searching_python();
            });
            t1.start();

            time_python = (System.currentTimeMillis() - startTime_python);
        }

        /***************************************************************************************************************
         * QUERY TREE AND FEATURES COMPUTATION
         * */

        //Temporary code, in the future I will implement a graphic interface

        if(Config.SEARCHING) {
            while (true) {
                //Python3_Tree tree_query = null;
                Java_Tree tree_query = null;
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

                    query_input = String.join(System.lineSeparator(), old_code) + "->" + String.join(System.lineSeparator(), new_code);

                    tree_query = Pipeline.query_feature_extraction(query_input);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                if (tree_query == null) {
                    System.out.print("The query is not correct, please try again.\n");
                    continue;
                }


                File fnew=new File("./src/main/resources/Python/lock.txt");
                try {
                    FileWriter f2 = new FileWriter(fnew, false);
                    f2.write("PYTHON");
                    f2.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                String lock = "PYTHON";
                int hh = 0;
                while (!lock.contains("JAVA")){
                    BufferedReader brTest = null;
                    try {
                        brTest = new BufferedReader(new FileReader("./src/main/resources/Python/lock.txt"));
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                    try {
                        lock = brTest.readLine();
                    //    System.out.println(lock + "\n");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    try {
                        brTest.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }

                //Read Searching time
                BufferedReader brTest = null;
                String searching_time = null;
                try {
                    brTest = new BufferedReader(new FileReader("./src/main/resources/Features_Vectors/searching_time.txt"));
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                try {
                    searching_time = brTest.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                double time_python2 = Double.parseDouble(searching_time.substring(0, 5));
                /***************************************************************************************************************
                 * SEARCH PYTHON STAGE (FAISS)
                 */
                long startTime_python2 = System.currentTimeMillis();
/*
                //Skip FAISS stage if the dataset is small
                if(change_number > 10){
                    try {
                        reading_index =  Pipeline.search_candidate_changes();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
*/
           //     long time_python2 = (System.currentTimeMillis() - startTime_python2);


                /***************************************************************************************************************
                 * FINAL MATCHING STAGE:  Cosine distance as filter + Deep tree comparison as final matching.
                 * */

                long startTime_matching = System.currentTimeMillis();

                //cosine distance comparison
             //   System.out.println("\nChanges found with the cosine distance:\n");

                //     long number_matching_cosine = Pipeline.final_matching(tree_query);

                long number_matching = -1;
                try {
                    System.out.println("\n============================\n\nChanges found with the deep tree comparison:\n");
                    //Deep recursive tree comparison
                    number_matching = Pipeline.final_comparison(tree_query, change_number);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                if (number_matching == 0)
                    System.out.println("No changes found that match the query with deep comparison. \n");

                long duration_matching = (System.currentTimeMillis() - startTime_matching);


                /***************************************************************************************************************
                 * STATISTICS
                 **/
                System.out.println("\nFINAL STATISTICS:"
                        + "\nNumber of changes analyzed: " + real_changes
                        //    + "\nNumber of matching changes with cosine filter: " + number_matching_cosine
                        + "\nNumber of final matching changes: " + number_matching
                        + "\nExtraction from Git diff: " +  gitdiff_extraction / 1000.0 + " seconds"
                        + "\nFeature Extraction duration: " + feature_extraction / 1000.0 + " seconds"
                        + "\nIndexing Python Search duration: " + time_python / 1000.0 + " seconds"
                        + "\nPython Search duration: " + time_python2 + " seconds"// + ", read index: " + reading_index + " seconds"
                        + "\nFinal Matching duration: " + duration_matching / 1000.0 + " seconds.\n");
            }
        }


    }
}