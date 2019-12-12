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
        long changes_number = 0;

        try {
            //Extraction of the changes in a string format. One element of changes_list is a change.
            List<String> changes_list = Indexing_Methods.changes_list_from_file();
            changes_number = changes_list.size();
            //Creation of a buffered writer for the features and the change in a string form (for print)
            BufferedWriter buff_writer_features = new BufferedWriter(new FileWriter("./src/main/resources/Features_Vectors/changes_feature_vectors.csv"));
            // Writing the string change in a file (ONLY FOR TESTING)
            FileWriter writer = new FileWriter("./src/main/resources/Features_Vectors/changes_strings.txt");
            BufferedWriter bw = new BufferedWriter(writer);


            for (String change_string : changes_list) {

                Python3_Tree change =new Python3_Tree(change_string);
                //Computing hash sum of changes
                List<Integer> list_change_hash_sum = new ArrayList<Integer>();
                List<String> ruleNamesList2 = Arrays.asList(change.get_parser().getRuleNames());
                TreeUtils.tree_hash_sumAST(change.get_parsetree(), ruleNamesList2, list_change_hash_sum, change.features);

                //Computing list change parent child
                List<Integer> list_change_parent_child = new ArrayList<Integer>();
                TreeUtils.pairs_parent_childAST(change.get_parsetree(), ruleNamesList2, list_change_parent_child, change.features);

                // Writing the feature vector in a csv file
                StringBuilder str_builder = new StringBuilder();

                for (int element : change.features) {
                    str_builder.append(element);
                    str_builder.append(",");
                }
                str_builder.append("\n");

                buff_writer_features.write(str_builder.toString());

                // Writing the string change in a file (ONLY FOR TESTING)
                bw.write(change.get_change_string() + "\n");
            }
            buff_writer_features.close();
            bw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        //Time
        long endTime_indexing = System.currentTimeMillis();
        long feature_extraction = (endTime_indexing - startTime_indexing);


        /***************************************************************************************************************
         * QUERY TREE AND FEATURES COMPUTATION
         * */

        //Insert a query, now for semplicity it is not asked as input
        String query_input = "if( ID OP<0> LT): -> if( ID OP<0> LT):";

        //Creating the tree for the query string
        Python3_Tree tree_query = new Python3_Tree(query_input);

        //Declaring query variables
        List<Integer> list_parent_child = new ArrayList<Integer>();
        List<Integer> list_hash_sum = new ArrayList<Integer>();
        Python3BaseListener listener = new Python3BaseListener();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listener, tree_query.get_parsetree());
        List<String> ruleNamesList = Arrays.asList(tree_query.get_parser().getRuleNames());

        //Computing hash sum and pairs parent child
        TreeUtils.tree_hash_sumAST(tree_query.get_parsetree(), ruleNamesList, list_hash_sum, tree_query.features);
        TreeUtils.pairs_parent_childAST(tree_query.get_parsetree(), ruleNamesList, list_parent_child, tree_query.features);
        list_hash_sum.addAll(list_parent_child);

        try {
            //Creation of a buffered writer
            BufferedWriter buff_writer = new BufferedWriter(new FileWriter("./src/main/resources/Features_Vectors/query_feature_vectors.csv"));

            // Writing the feature vector in a csv file
            StringBuilder str_builder = new StringBuilder();

            for (int element : tree_query.features) {
                str_builder.append(element);
                str_builder.append(",");
            }
            str_builder.append("\n");

            buff_writer.write(str_builder.toString());
            buff_writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("QUERY TREE AND FEATURES COMPUTATION DONE");

        /***************************************************************************************************************
         * PYTHON STAGE
         */
        long startTime_python = System.currentTimeMillis();

        Process p1;
        try {
            p1 = Runtime.getRuntime().exec("whereis anaconda");
            BufferedReader br = new BufferedReader(new InputStreamReader(p1.getInputStream()));

            //   while ((s1 = br.readLine()) != null)
            //     System.out.println(s1);
            p1.waitFor();
            //   System.out.println ("exit: " + p1.exitValue());
            p1.destroy();
        } catch (Exception e) { e.printStackTrace();}

        Process python_Nearest_Neighbor_Search;
        try {
            //!!!!! TODO: I have to make the path not absolute !!!!!
            python_Nearest_Neighbor_Search = Runtime.getRuntime().exec(" /home/luca/anaconda3/bin/python3.7 ./src/main/resources/Python/Nearest_Neighbor_Search.py");
            BufferedReader br = new BufferedReader(new InputStreamReader(python_Nearest_Neighbor_Search.getInputStream()));

            python_Nearest_Neighbor_Search.waitFor();
            python_Nearest_Neighbor_Search.destroy();
        } catch (Exception e) { e.printStackTrace();}


        long endTime_python = System.currentTimeMillis();
        long time_python = (endTime_python - startTime_python);

        System.out.println("PYTHON STAGE DONE\n");

        /***************************************************************************************************************
         * FINAL MATCHING STAGE
         * */
        long startTime_matching = System.currentTimeMillis();

        List<String> allLines = null;
        try {
            allLines = Files.readAllLines(Paths.get("./src/main/resources/Features_Vectors/candidate_changes.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        int length = tree_query.features.length;
        double threshold = 0.8;
        long number_matching = 0;

        for(String candidate : allLines){
            Python3_Tree change = new Python3_Tree(candidate);
            //Computing hash sum of changes
            List<Integer> list_change_hash_sum = new ArrayList<Integer>();
            List<String> ruleNamesList2 = Arrays.asList(change.get_parser().getRuleNames());
            TreeUtils.tree_hash_sumAST(change.get_parsetree(), ruleNamesList2, list_change_hash_sum, change.features);

            //Computing list change parent child
            List<Integer> list_change_parent_child = new ArrayList<Integer>();
            TreeUtils.pairs_parent_childAST(change.get_parsetree(), ruleNamesList2, list_change_parent_child, change.features);

            double score =  Matching_Methods.cosineSimilarity(tree_query.features, change.features, length);

            if(score > threshold) {
                number_matching++;
                System.out.println(candidate + " score: " + score);
            }
        }

        //Statistics
        long endTime_matching = System.currentTimeMillis();
        long duration_matching = (endTime_matching - startTime_matching);
        System.out.println("\n FINAL STATISTICS:\nNumber of changes analyzed: " + changes_number +"\nNumber of matching changes: " + number_matching
                +"\nFeature Extraction duration: " + feature_extraction / 1000 + " seconds\nPython Search duration: " + time_python / 1000 + " seconds,"
                + "\nFinal Matching duration: " + duration_matching / 1000 + " seconds.");
    }
}