package research.diffsearch;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.opencsv.CSVWriter;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class App {
    public static void main(String[] args) throws IOException {
        //Starting time
        long startTime_indexing = System.currentTimeMillis();

        //Creating all the three of changes
        List<String> changes_list = Indexing_Methods.changes_list_from_file();

        //Time
        long endTime_indexing = System.currentTimeMillis();
        long duration_indexing = (endTime_indexing - startTime_indexing);

        /*
         * ALL CHANGES TREE AND FEATURES COMPUTATION
         * */

        try {
            //Creation of a buffered writer
            BufferedWriter b_writer = new BufferedWriter(new FileWriter("./src/main/resources/changes_feature_vectors.csv"));

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
                StringBuilder s_builter = new StringBuilder();

                for (int element : change.features) {
                    s_builter.append(element);
                    s_builter.append(",");
                }
                s_builter.append("\n");

                b_writer.write(s_builter.toString());

                //   System.out.println(change.get_change_string() + " score: " + Matching_Methods.cosineSimilarity(tree_query.features, change.features, length) + ' ');

            }
            b_writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        /*
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
            BufferedWriter b_writer = new BufferedWriter(new FileWriter("./src/main/resources/query_feature_vectors.csv"));

            // Writing the feature vector in a csv file
            StringBuilder s_builter = new StringBuilder();

            for (int element : tree_query.features) {
                s_builter.append(element);
                s_builter.append(",");
            }
            s_builter.append("\n");

            b_writer.write(s_builter.toString());

            b_writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        /*
         * PYTHON STAGE
         * */

        //Time
        long endTime_matching = System.currentTimeMillis();
        long duration_matching = (endTime_matching - endTime_indexing);
        System.out.println("\nEND: Indexing duration: " + duration_indexing / 1000 + " seconds," + " Matching duration: " + duration_matching / 1000 + " seconds.");

    }
}