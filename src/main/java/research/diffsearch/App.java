package research.diffsearch;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class App {
    public static void main(String[] args) throws IOException {

        /****************************************************************************************************************
         * CHANGES TREE AND FEATURES COMPUTATION
         * */

        long startTime_indexing = System.currentTimeMillis();

        long changes_number = Pipeline.feature_extraction();

        long feature_extraction = (System.currentTimeMillis() - startTime_indexing);


        /***************************************************************************************************************
         * QUERY TREE AND FEATURES COMPUTATION
         * */

        Python3_Tree tree_query = Pipeline.query_feature_extraction();


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

        long number_matching = Pipeline.final_matching(tree_query);

        long duration_matching = (System.currentTimeMillis() - startTime_matching);

        
        /***************************************************************************************************************
         * STATISTICS
         * */
        System.out.println("\n FINAL STATISTICS:\nNumber of changes analyzed: " + changes_number +"\nNumber of matching changes: " + number_matching
                +"\nFeature Extraction duration: " + feature_extraction / 1000 + " seconds\nPython Search duration: " + time_python / 1000 + " seconds,"
                + "\nFinal Matching duration: " + duration_matching / 1000 + " seconds.");
    }
}