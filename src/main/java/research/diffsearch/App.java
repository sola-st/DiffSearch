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
        long startTime = System.currentTimeMillis();

        String query_input = "if( ID<> OP<0> LT<>): -> if(ID<> OP<0> LT<>):";
        //String query_input = "if(x>0): -> if(x<0):";

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
        List<Python3_Tree> tree_list = Indexing_Methods.changes_tree(query_input);
        //System.out.println("\nTree Creation done.\n");

        //Declaring change varibles
        ArrayList<int[]> list_changes_features = new ArrayList<>();
        ArrayList<int[]> list_changes_lsh = new ArrayList<>();

        //Initializing LSH parameters
        int sizeOfVectors = list_hash_sum.size();
        int numberOfBuckets = 10;
        int stages = 6;
        LSHMinHash lsh = new LSHMinHash(stages, numberOfBuckets, sizeOfVectors);

        //Computing lsh on query features
        int[] query_lsh = lsh.hashSignature(Ints.toArray(list_hash_sum));
        list_changes_lsh.add(query_lsh);

        int i = 0;
        for (Python3_Tree change : tree_list) {
            //Computing hash sum of changes
            List<Integer> list_change_hash_sum = new ArrayList<Integer>();
            List<String> ruleNamesList2 = Arrays.asList(change.get_parser().getRuleNames());
            TreeUtils.tree_hash_sumAST(change.get_parsetree(), ruleNamesList2, list_change_hash_sum, change.features);

            //Computing list change parent child
            List<Integer> list_change_parent_child = new ArrayList<Integer>();
            TreeUtils.pairs_parent_childAST(change.get_parsetree(), ruleNamesList2, list_change_parent_child, change.features);
            NGram ngram = new NGram(2);

            //All features in one vector
            list_change_hash_sum.addAll(list_change_parent_child);
            list_changes_features.add(Ints.toArray(list_change_hash_sum));
            list_changes_lsh.add(lsh.hashSignature(Ints.toArray(list_change_hash_sum)));

            //Computation of the distance between the filtered changes
            // if(!Matching_Methods.elementWiseCompare(query_lsh,lsh.hashSignature(Ints.toArray(list_change_hash_sum)) ))
            //{
            System.out.println(change.get_change_string() + " score: "
                    //  + Matching_Methods.jaccard_similarity(list_parent_child, list_change_parent_child) + ' '
                    //      + Matching_Methods.round2(1 - ngram.distance(tree_query.get_tree_string(), change.get_tree_string())) + ' '
                    + Matching_Methods.jaccardSimilarity(Ints.toArray(list_hash_sum), Ints.toArray(list_change_hash_sum)) + ' '
                    + Matching_Methods.cosineSimilarity(tree_query.features, change.features) + ' '
                    //      + Matching_Methods.jaccardSimilarity(lsh.hashSignature(Ints.toArray(list_hash_sum)), lsh.hashSignature(Ints.toArray(list_change_hash_sum))) + ' '
                    //     + Matching_Methods.similarity(Ints.toArray(list_hash_sum), Ints.toArray(list_change_hash_sum)) + ' '
                  //  + Matching_Methods.jaccard_similarity(list_hash_sum, list_change_hash_sum)
            );
            //  }
        }

        //Ending time
        long endTime = System.currentTimeMillis();
        long duration = (endTime - startTime);
        System.out.println("\nEND in " + duration/1000 + " seconds.");
    }
}