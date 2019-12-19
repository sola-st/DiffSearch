package research.diffsearch;

import java.util.List;

public class App {
    public static void main(String[] args) {

        /***************************************************************************************************************
         * CHANGES EXTRACTED FROM A GIT DIFF OUTPUT
         * */

        long startTime_gitdiff = System.currentTimeMillis();

        List<String> changes_tree_list = Change_extraction.analyze_diff_file();

        long gitdiff_extraction = (System.currentTimeMillis() - startTime_gitdiff);


        /***************************************************************************************************************
         * CHANGES TREE AND FEATURES COMPUTATION
         * */

        long startTime_indexing = System.currentTimeMillis();

        long changes_number = Pipeline.feature_extraction(changes_tree_list);

        long feature_extraction = (System.currentTimeMillis() - startTime_indexing);


        /***************************************************************************************************************
         * QUERY TREE AND FEATURES COMPUTATION
         * */

        //Insert a query, now for simplicity it is not asked as input. In the final version there will be a loop that asks for new queries.
        String query_input = "if( EXPR OP<0> LT): -> if( EXPR OP<1> LT):";

        Python3_Tree tree_query = Pipeline.query_feature_extraction(query_input);


        /***************************************************************************************************************
         * PYTHON STAGE
         */
        long startTime_python = System.currentTimeMillis();

        Pipeline.search_candidate_changes();

        long time_python = (System.currentTimeMillis() - startTime_python);


        /***************************************************************************************************************
         * FINAL MATCHING STAGE
         * */

        long startTime_matching = System.currentTimeMillis();

        long number_matching = Pipeline.deep_tree_comparison(tree_query);

      //  number_matching = Pipeline.final_matching(tree_query);

        long duration_matching = (System.currentTimeMillis() - startTime_matching);


        /***************************************************************************************************************
         * STATISTICS
         **/
        System.out.println("\nFINAL STATISTICS:\nNumber of changes analyzed: " + changes_number +"\nNumber of matching changes: " + number_matching
                +"\nFeature Extraction duration: " + feature_extraction / 1000 + " seconds\nPython Search duration: " + time_python / 1000 + " seconds,"
                + "\nFinal Matching duration: " + duration_matching / 1000 + " seconds.");
    }
}