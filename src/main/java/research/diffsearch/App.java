package research.diffsearch;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        /***************************************************************************************************************
         * EXTRACT CHANGES FROM A GIT REPOSITORY
         * */

        //not linked yet


        /***************************************************************************************************************
         * CHANGES EXTRACTED FROM A GIT DIFF OUTPUT
         * */

        long startTime_gitdiff = System.currentTimeMillis();

        List<String> changes_tree_list = null;

        try {
            changes_tree_list = Change_extraction.analyze_diff_file();
        } catch (Exception e) {
            e.printStackTrace();
        }

        long gitdiff_extraction = (System.currentTimeMillis() - startTime_gitdiff);


        /***************************************************************************************************************
         * CHANGES TREE AND FEATURES COMPUTATION
         * */

        long startTime_indexing = System.currentTimeMillis();

        long changes_number = -1;

        try {
            changes_number = Pipeline.feature_extraction(changes_tree_list);
        } catch (Exception e) {
            e.printStackTrace();
        }

        long feature_extraction = (System.currentTimeMillis() - startTime_indexing);


        /***************************************************************************************************************
         * QUERY TREE AND FEATURES COMPUTATION
         * */

        //Temporary code, In the future I will implement a graphic interface

        while (true) {
            Python3_Tree tree_query = null;
            String query_input = null;
            try {
                System.out.print("Enter ONLY the old code (blank line for the next step or END to end the program): ");

                Scanner input = new Scanner(System.in);
                List<String> old_code = new ArrayList<String>();
                String lineNew;

                while (input.hasNextLine()) {
                    lineNew = input.nextLine();

                    if(lineNew.equals("END")) {
                        System.out.println("\n================================\nProgram finished successfully.");
                        return;
                    }
                    if (lineNew.isEmpty()) {
                        break;
                    }

                    old_code.add(lineNew);
                }

                System.out.print("Enter ONLY the new code (blank line for next step or END to end the program): ");

                Scanner input2 = new Scanner(System.in);
                List<String> new_code = new ArrayList<String>();
                String lineNew2;

                while (input2.hasNextLine()) {
                    lineNew2 = input2.nextLine();

                    if(lineNew2.equals("END")) {
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

            if(tree_query == null) {
                System.out.print("The query is not correct, please try again.\n");
                continue;
            }

            /***************************************************************************************************************
             * PYTHON STAGE (FAISS)
             */
            long startTime_python = System.currentTimeMillis();

            try {

                Pipeline.search_candidate_changes();
            } catch (Exception e) {
                e.printStackTrace();
            }

            long time_python = (System.currentTimeMillis() - startTime_python);


            /***************************************************************************************************************
             * FINAL MATCHING STAGE:  now i run deep recursive + cosine distance comparison to compare the results, but
             * then cosine distance will be the filter and deep comparison the final matching
             * */

            long startTime_matching = System.currentTimeMillis();

            System.out.println("\nChanges found with the cosine distance:\n");
            //cosine distance comparison
            long  number_matching;
            number_matching = Pipeline.final_matching(tree_query);

            number_matching = -1;
            try {
                System.out.println("Changes found with the deep tree comparison:\n");
                //Deep recursive tree comparison
                number_matching = Pipeline.final_comparison(tree_query);
            } catch (Exception e) {
                e.printStackTrace();
            }

            if(number_matching == 0)
                System.out.println("No changes found that match the query with deep comparison. \n");

            long duration_matching = (System.currentTimeMillis() - startTime_matching);


            /***************************************************************************************************************
             * STATISTICS
             **/
            System.out.println("\nFINAL STATISTICS:\nNumber of changes analyzed: " + changes_number + "\nNumber of matching changes: " + number_matching
                    + "\nFeature Extraction duration: " + feature_extraction / 1000 + " seconds\nPython Search duration: " + time_python / 1000 + " seconds,"
                    + "\nFinal Matching duration: " + duration_matching / 1000 + " seconds.\n");
        }

    }
}