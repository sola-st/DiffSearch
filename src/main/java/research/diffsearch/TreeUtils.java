package research.diffsearch;

import java.util.List;
import org.antlr.v4.runtime.tree.Tree;
import org.antlr.v4.runtime.tree.Trees;

public class TreeUtils {

    //Parent child feature computation
    static void pairs_parent_childAST(final Tree t, final List<String> ruleNames, final List<Integer> list_parent_child, int [] features) {

        for (int i = 0; i < t.getChildCount(); i++) {
            list_parent_child.add((Trees.getNodeText(t, ruleNames) + ' ' + Trees.getNodeText(t.getChild(i), ruleNames)).hashCode());
            features[Math.abs(Integer.MAX_VALUE / 2097152 + (Trees.getNodeText(t, ruleNames) + ' ' + Trees.getNodeText(t.getChild(i), ruleNames)).hashCode() / 2097152)] = 1;
        }

        for (int i = 0; i < t.getChildCount(); i++) {
            pairs_parent_childAST(t.getChild(i), ruleNames, list_parent_child, features);
        }

    }

    //Hash sum feature computation
    static void tree_hash_sumAST(final Tree t, final List<String> ruleNames, final List<Integer> list_hash_sum, int [] features) {
        int sum = 0;
        int i;

        sum += Trees.getNodeText(t, ruleNames).hashCode();

        for (i = 0; i < t.getChildCount(); i++) {
            sum += Trees.getNodeText(t.getChild(i), ruleNames).hashCode();
        }

        if (i > 0) {
            list_hash_sum.add(sum);
            features[Math.abs(sum / 2097152)] = 1;
        }

        for (i = 0; i < t.getChildCount(); i++) {
            tree_hash_sumAST(t.getChild(i), ruleNames, list_hash_sum, features);
        }

    }

    //Hash sum feature computation
    static boolean deep_tree_comparison(final Tree query_tree, final List<String> query_ruleNames, final Tree change_tree, final List<String> change_ruleNames) {
        int i;

        try {

            if (!Trees.getNodeText(change_tree, change_ruleNames).equals(Trees.getNodeText(query_tree, query_ruleNames)))
                return false;

            for (i = 0; i < change_tree.getChildCount(); i++) {
                if (change_tree.getChild(i).getChildCount() > 0)
                    if (!Trees.getNodeText(change_tree.getChild(i), change_ruleNames).equals(Trees.getNodeText(query_tree.getChild(i), query_ruleNames)))
                        return false;
            }

            for (i = 0; i < change_tree.getChildCount(); i++) {
                if (!Trees.getNodeText(query_tree.getChild(i), query_ruleNames).equals("EXPR") && !Trees.getNodeText(change_tree, change_ruleNames).equals("expr"))
                    if (query_tree.getChild(i).getChildCount() > 0)
                            if (!deep_tree_comparison(query_tree.getChild(i), query_ruleNames, change_tree.getChild(i), change_ruleNames))
                                return false;
            }

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

    /**
     * Extraction of all the nodes of the query AST to perform a deep comparison with changes AST.
     *
     * @param query_tree : AST of the query
     * @param ruleNames: rule names of the query AST
     * @param list_query_nodes: list of all the AST query nodes
     */
    static void query_extraction_nodes(final Tree query_tree, final List<String> ruleNames, List<String> list_query_nodes) {

        for (int i = 0; i < query_tree.getChildCount(); i++) {
            list_query_nodes.add(Trees.getNodeText(query_tree.getChild(i), ruleNames));
        }

        for (int i = 0; i < query_tree.getChildCount(); i++) {
            query_extraction_nodes(query_tree.getChild(i), ruleNames, list_query_nodes);
        }

    }

    /**
     * Extraction of all the nodes of the query AST to perform a deep comparison with changes AST.
     *
     * @param tree : AST of the query
     * @param ruleNames: rule names of the query AST
     * @param list_leaves: list of all the AST query nodes
     */
    static void query_leaves_extraction(final Tree tree, final List<String> ruleNames, List<String> list_leaves) {

        for (int i = 0; i < tree.getChildCount(); i++) {
            query_leaves_extraction(tree.getChild(i), ruleNames, list_leaves);
        }

        if(tree.getChildCount() == 0)
            list_leaves.add(Trees.getNodeText(tree, ruleNames));

    }

    /**
     * Extraction of all the nodes of the query AST to perform a deep comparison with changes AST.
     *
     * @param query_tree : AST of the query
     * @param query_ruleNames: rule names of the query AST
     * @param list_leaves: list of all the AST query nodes
     */
    static void tree_leaves_extraction(final Tree query_tree, final List<String> query_ruleNames, final Tree change_tree, final List<String> change_ruleNames, List<String> list_leaves) {

        for (int i = 0; i < change_tree.getChildCount(); i++) {
            if ((!Trees.getNodeText(query_tree.getChild(i), query_ruleNames).equals("EXPR")       ||
                    !Trees.getNodeText(query_tree.getChild(i), query_ruleNames).equals("EXPR<0>") ||
                    !Trees.getNodeText(query_tree.getChild(i), query_ruleNames).equals("EXPR<1>") ||
                    !Trees.getNodeText(query_tree.getChild(i), query_ruleNames).equals("EXPR<2>"))&&
                    !Trees.getNodeText(change_tree, change_ruleNames).equals("expr"))
                tree_leaves_extraction(query_tree.getChild(i), query_ruleNames, change_tree.getChild(i), change_ruleNames, list_leaves);
        }

        if(change_tree.getChildCount() == 0)
            list_leaves.add(Trees.getNodeText(change_tree, change_ruleNames));

    }

    //Hash sum feature computation
    static int node_count(final Tree query_tree, final List<String> query_ruleNames, int n) {
        n++;

        try {

            for (int i = 0; i < query_tree.getChildCount(); i++) {
                        n = node_count(query_tree.getChild(i), query_ruleNames, n);
            }

        } catch (Exception e) {
            e.printStackTrace();
            return n;
        }

        return n;
    }

}
