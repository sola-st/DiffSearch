package research.diffsearch.tree;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.Tree;

import java.util.List;

/**
 * @author Luca Di Grazia
 */
public class TreeUtils {
//    /**
//     * Extraction of all the nodes of the query AST to perform a deep comparison with changes AST.
//     *
//     * @param t : AST of a change or query
//     * @param ruleNames: rule names of the AST
//     * @param list_parent_child: list of the couple parent-child found
//     * @param features: binary feature vector ("it is the return value of the function")
//     */
//    static void pairs_parent_childAST_python(final Tree t, final List<String> ruleNames, final List<Integer> list_parent_child, int [] features) {
//
//        for (int i = 0; i < t.getChildCount(); i++) {
//            list_parent_child.add((Trees.getNodeText(t, ruleNames) + ' ' + Trees.getNodeText(t.getChild(i), ruleNames)).hashCode());
//            features[Math.abs(Integer.MAX_VALUE / 2097152 + (Trees.getNodeText(t, ruleNames) + ' ' + Trees.getNodeText(t.getChild(i), ruleNames)).hashCode() / 2097152)] = 1;
//        }
//
//        for (int i = 0; i < t.getChildCount(); i++) {
//            pairs_parent_childAST_python(t.getChild(i), ruleNames, list_parent_child, features);
//        }
//
//    }
//
//    /**
//     * Extraction of the sum between an hash of the node and the hash of its children.
//     *
//     * @param t : AST of a change or query
//     * @param ruleNames: rule names of the AST
//     * @param list_hash_sum: list of the hash of nodes
//     * @param features: binary feature vector ("it is the return value of the function")
//     */
//    static void tree_hash_sumAST_python(final Tree t, final List<String> ruleNames, final List<Integer> list_hash_sum, int [] features) {
//        int sum = 0;
//        int i;
//
//        sum += Trees.getNodeText(t, ruleNames).hashCode();
//
//        for (i = 0; i < t.getChildCount(); i++) {
//            sum += Trees.getNodeText(t.getChild(i), ruleNames).hashCode();
//        }
//
//        if (i > 0) {
//            list_hash_sum.add(sum);
//            features[Math.abs(sum / 2097152)] = 1;
//        }
//
//        for (i = 0; i < t.getChildCount(); i++) {
//            tree_hash_sumAST_python(t.getChild(i), ruleNames, list_hash_sum, features);
//        }
//
//    }
//
//
//    /**
//     * Extraction of all the nodes of the query AST to perform a deep comparison with changes AST.
//     *
//     * @param t : AST of a change or query
//     * @param ruleNames: rule names of the AST
//     * @param list_parent_child: list of the couple parent-child found
//     * @param features: binary feature vector ("it is the return value of the function")
//     */
//    public static void pairs_parent_childAST_javascript(final Tree t, final List<String> ruleNames, final List<Integer> list_parent_child, int[] features) {
//
//        for (int i = 0; i < t.getChildCount(); i++) {
//            list_parent_child.add((Trees.getNodeText(t, ruleNames) + ' ' + Trees.getNodeText(t.getChild(i), ruleNames)).hashCode());
//            features[Math.abs(Integer.MAX_VALUE / 2097152 + (Trees.getNodeText(t, ruleNames) + ' ' + Trees.getNodeText(t.getChild(i), ruleNames)).hashCode() / 2097152)] = 1;
//        }
//
//        for (int i = 0; i < t.getChildCount(); i++) {
//            if(Trees.getNodeText(t.getChild(i), ruleNames).contains("literal"))
//                continue;
//
//            pairs_parent_childAST_javascript(t.getChild(i), ruleNames, list_parent_child, features);
//        }
//
//    }
//
//
//
//    /**
//     * Extraction of the sum between an hash of the node and the hash of its children.
//     *
//     * @param t : AST of a change or query
//     * @param ruleNames: rule names of the AST
//     * @param list_hash_sum: list of the hash of nodes
//     * @param features: binary feature vector ("it is the return value of the function")
//     */
//    public static void tree_hash_sumAST_javascript(final Tree t, final List<String> ruleNames, final List<Integer> list_hash_sum, int[] features) {
//        int sum = 0;
//        int i;
//
//        sum += Trees.getNodeText(t, ruleNames).hashCode();
//
//        for (i = 0; i < t.getChildCount(); i++) {
//            sum += Trees.getNodeText(t.getChild(i), ruleNames).hashCode();
//        }
//
//        if (i > 0) {
//            list_hash_sum.add(sum);
//            features[Math.abs(sum / 2097152)] = 1;
//        }
//
//        for (i = 0; i < t.getChildCount(); i++) {
//            if(Trees.getNodeText(t.getChild(i), ruleNames).contains("literal"))
//                continue;
//
//            tree_hash_sumAST_javascript(t.getChild(i), ruleNames, list_hash_sum, features);
//        }
//
//    }

    public static String getCompleteNodeText(Tree tree) {
        if (tree instanceof ParseTree) {
            return ((ParseTree) tree).getText();
        }
        if (tree instanceof SerializableTreeNode) {
            return ((SerializableTreeNode) tree).getCompleteNodeText();
        }
        throw new IllegalStateException();
    }

    //Node count method
    public static int nodeCount(final Tree queryTree, final List<String> queryRuleNames, int n) {
        n++;

        try {

            for (int i = 0; i < queryTree.getChildCount(); i++) {
                n = nodeCount(queryTree.getChild(i), queryRuleNames, n);
            }

        } catch (Exception e) {
            e.printStackTrace();
            return n;
        }

        return n;
    }

}
