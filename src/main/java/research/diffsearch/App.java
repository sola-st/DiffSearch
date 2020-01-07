package research.diffsearch;

import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        /***************************************************************************************************************
         * EXTRACT CHANGES FROM A GIT REPOSITORY
         * */


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

        //Insert a query, now for simplicity it is not asked as input. In the final version there will be a loop that asks for new queries.
       //String query_input = "if( EXPR OP<0> LT): -> if( EXPR OP<1> LT):";

        while (true) {
            Python3_Tree tree_query = null;
            try {
                System.out.print("Enter a query (or BREAK to end the program): ");
                Scanner scanner = new Scanner(System.in);
                String query_input = scanner.nextLine();

                if (query_input.equals("BREAK"))
                    break;

                tree_query = Pipeline.query_feature_extraction(query_input);
            } catch (Exception e) {
                e.printStackTrace();
            }

            if(tree_query == null) {
                System.out.print("The query is not correct, please try again.\n");
                continue;
            }
            /***************************************************************************************************************
             * PYTHON STAGE
             */
            long startTime_python = System.currentTimeMillis();

            try {

                Pipeline.search_candidate_changes();
            } catch (Exception e) {
                e.printStackTrace();
            }
            
            long time_python = (System.currentTimeMillis() - startTime_python);


            /***************************************************************************************************************
             * FINAL MATCHING STAGE
             * */

            long startTime_matching = System.currentTimeMillis();
            
            long number_matching = -1;
            try {
                System.out.println("Changes found with the deep tree comparison:\n");
                number_matching = Pipeline.final_comparison(tree_query);
            } catch (Exception e) {
                e.printStackTrace();
            }

            if(number_matching == 0)
                System.out.println("No changes found that match the query with deep comparison. \n");

            System.out.println("\nChanges found with the cosine distance:\n");
            number_matching = Pipeline.final_matching(tree_query);

            long duration_matching = (System.currentTimeMillis() - startTime_matching);


            /***************************************************************************************************************
             * STATISTICS
             **/
            System.out.println("\nFINAL STATISTICS:\nNumber of changes analyzed: " + changes_number + "\nNumber of matching changes: " + number_matching
                    + "\nFeature Extraction duration: " + feature_extraction / 1000 + " seconds\nPython Search duration: " + time_python / 1000 + " seconds,"
                    + "\nFinal Matching duration: " + duration_matching / 1000 + " seconds.\n");
        }

        System.out.println("\n================================\nProgram ended successfully.");
    }
}