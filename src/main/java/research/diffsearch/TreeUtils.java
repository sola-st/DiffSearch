package research.diffsearch;

import java.io.PrintWriter;
import java.util.List;
import org.antlr.v4.runtime.tree.Tree;
import org.antlr.v4.runtime.tree.Trees;

public class TreeUtils {

    /**
     * Extraction of all the nodes of the query AST to perform a deep comparison with changes AST.
     *
     * @param t : AST of a change or query
     * @param ruleNames: rule names of the AST
     * @param list_parent_child: list of the couple parent-child found
     * @param features: binary feature vector ("it is the return value of the function")
     */
    static void pairs_parent_childAST(final Tree t, final List<String> ruleNames, final List<Integer> list_parent_child, int [] features) {

        for (int i = 0; i < t.getChildCount(); i++) {
            list_parent_child.add((Trees.getNodeText(t, ruleNames) + ' ' + Trees.getNodeText(t.getChild(i), ruleNames)).hashCode());
            features[Math.abs(Integer.MAX_VALUE / 2097152 + (Trees.getNodeText(t, ruleNames) + ' ' + Trees.getNodeText(t.getChild(i), ruleNames)).hashCode() / 2097152)] = 1;
        }

        for (int i = 0; i < t.getChildCount(); i++) {
            pairs_parent_childAST(t.getChild(i), ruleNames, list_parent_child, features);
        }

    }

    /**
     * Extraction of the sum between an hash of the node and the hash of its children.
     *
     * @param t : AST of a change or query
     * @param ruleNames: rule names of the AST
     * @param list_hash_sum: list of the hash of nodes
     * @param features: binary feature vector ("it is the return value of the function")
     */
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

    /**
     * Extraction of all the nodes of the query AST to perform a deep comparison with changes AST.
     *
     * @param query_tree : AST of the query
     * @param query_ruleNames: rule names of the query AST
     * @param change_tree : AST of the change
     * @param change_ruleNames: rule names of the change AST
     * @return two trees are equal or not
     */
    static boolean deep_tree_comparison(final Tree query_tree, final List<String> query_ruleNames, final Tree change_tree, final List<String> change_ruleNames, PrintWriter writer) {
        int i;

        try {

            if (!Trees.getNodeText(change_tree, change_ruleNames).equals(Trees.getNodeText(query_tree, query_ruleNames))) {
                writer.println("FALSE0---" + Trees.getNodeText(change_tree, change_ruleNames) + "  Q: " + Trees.getNodeText(query_tree, query_ruleNames));
                return false;
            }

            String s1;
            String s2;

            for (i = 0; i < change_tree.getChildCount(); i++) {
                if (change_tree.getChild(i).getChildCount() > 0 && query_tree.getChild(i).getChildCount() > 0 ) {
                        writer.println(i + "---" + change_tree.getChild(i).getChildCount() + query_tree.getChild(i).getChildCount() + Trees.getNodeText( change_tree.getChild(i), change_ruleNames) + "  Q: " + Trees.getNodeText(query_tree.getChild(i), query_ruleNames));
                        s1 = Trees.getNodeText(change_tree.getChild(i), change_ruleNames);
                        s2 = Trees.getNodeText(query_tree.getChild(i), query_ruleNames);
                        if (!(s1.equals(s2))) {
                            writer.println("FALSE1---" + Trees.getNodeText(change_tree, change_ruleNames) + "  Q: " + Trees.getNodeText(query_tree, query_ruleNames));
                            return false;
                    }
                }
            }

        } catch (Exception e) {
            // e.printStackTrace();
            writer.println("EXCEPTION1---" + Trees.getNodeText(change_tree, change_ruleNames) + "  Q: " + Trees.getNodeText(query_tree, query_ruleNames));
            return false;
        }

        try{
            for (i = 0; i < change_tree.getChildCount(); i++) {
                if (!Trees.getNodeText(query_tree.getChild(i), query_ruleNames).contains("EXPR") || !Trees.getNodeText(change_tree.getChild(i), change_ruleNames).equals("expr")) {
                    if (change_tree.getChild(i).getChildCount() > 0) {
                        writer.println("next---" + Trees.getNodeText(change_tree.getChild(i), change_ruleNames) + "  Q: " + Trees.getNodeText(query_tree.getChild(i), query_ruleNames));
                        if (!deep_tree_comparison(query_tree.getChild(i), query_ruleNames, change_tree.getChild(i), change_ruleNames, writer)) {
                            writer.println("FALSE2---" + Trees.getNodeText(change_tree, change_ruleNames) + "  Q: " + Trees.getNodeText(query_tree, query_ruleNames));
                            return false;
                        }
                    }
                }else{
                    writer.println("EXPR---" + Trees.getNodeText(change_tree, change_ruleNames) + "  Q: " + Trees.getNodeText(query_tree.getChild(i), query_ruleNames));
                    break;
                }
            }

        } catch (Exception e) {
           // e.printStackTrace();
            writer.println("EXCEPTION2---" + Trees.getNodeText(change_tree, change_ruleNames) + "  Q: " + Trees.getNodeText(query_tree, query_ruleNames));
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

    //Node count method
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
