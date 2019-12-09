package research.diffsearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.common.primitives.Ints;
import info.debatty.java.lsh.LSHMinHash;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import info.debatty.java.stringsimilarity.NGram;

public class App {
    public static void main(String[] args) {
        //Starting time
        long startTime_indexing = System.currentTimeMillis();

        String query_input = "if( ID<> OP<0> LT<>): -> if(ID<> OP<0> LT<>):";
      //  String query_input = "_ -> ID<>(ID<>)";

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


        //Creating all the three of changes
        List<Python3_Tree> tree_list = Indexing_Methods.changes_tree(Indexing_Methods.analyze_diff_file());

        //Time
        long endTime_indexing = System.currentTimeMillis();
        long duration_indexing = (endTime_indexing - startTime_indexing);

        int length = tree_query.features.length;

        int [][] features_matrix = new int[tree_list.size()][length];

        int i = 0;
        for (Python3_Tree change : tree_list) {
            //Computing hash sum of changes
            List<Integer> list_change_hash_sum = new ArrayList<Integer>();
            List<String> ruleNamesList2 = Arrays.asList(change.get_parser().getRuleNames());
            TreeUtils.tree_hash_sumAST(change.get_parsetree(), ruleNamesList2, list_change_hash_sum, change.features);

            //Computing list change parent child
            List<Integer> list_change_parent_child = new ArrayList<Integer>();
            TreeUtils.pairs_parent_childAST(change.get_parsetree(), ruleNamesList2, list_change_parent_child, change.features);

            features_matrix[i] = change.features;

         //  if(Arrays.equals(Arrays.copyOfRange(tree_query.features, 0, 100), Arrays.copyOfRange(change.features, 0, 100)))
                //Computation of the distance
                System.out.println(change.get_change_string() + " score: "
                                //     + Matching_Methods.jaccardSimilarity(Ints.toArray(list_hash_sum), Ints.toArray(list_change_hash_sum)) + ' '
                                + Matching_Methods.cosineSimilarity(tree_query.features, features_matrix[i], length) + ' '
                        //   + Matching_Methods.cosineSimilarity(query_lsh, change_lsh) + ' '
                );

            i++;
        }

        //Time
        long endTime_matching = System.currentTimeMillis();
        long duration_matching = (endTime_matching - endTime_indexing);
        System.out.println("\nEND: Indexing duration: " + duration_indexing / 1000 + " seconds," + " Matching duration: " + duration_matching / 1000 + " seconds.");
    }
}