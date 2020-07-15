package research.diffsearch;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
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
    static void pairs_parent_childAST_python(final Tree t, final List<String> ruleNames, final List<Integer> list_parent_child, int [] features) {

        for (int i = 0; i < t.getChildCount(); i++) {
            list_parent_child.add((Trees.getNodeText(t, ruleNames) + ' ' + Trees.getNodeText(t.getChild(i), ruleNames)).hashCode());
            features[Math.abs(Integer.MAX_VALUE / 2097152 + (Trees.getNodeText(t, ruleNames) + ' ' + Trees.getNodeText(t.getChild(i), ruleNames)).hashCode() / 2097152)] = 1;
        }

        for (int i = 0; i < t.getChildCount(); i++) {
            pairs_parent_childAST_python(t.getChild(i), ruleNames, list_parent_child, features);
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
    static void tree_hash_sumAST_python(final Tree t, final List<String> ruleNames, final List<Integer> list_hash_sum, int [] features) {
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
            tree_hash_sumAST_python(t.getChild(i), ruleNames, list_hash_sum, features);
        }

    }

    /**
     * Extraction of all the nodes of the query AST to perform a deep comparison with changes AST.
     *
     * @param t : AST of a change or query
     * @param ruleNames: rule names of the AST
     * @param list_parent_child: list of the couple parent-child found
     * @param features: binary feature vector ("it is the return value of the function")
     */
    static void pairs_parent_childAST_java(final Tree t, final List<String> ruleNames, final List<Integer> list_parent_child, int [] features) {

        for (int i = 0; i < t.getChildCount(); i++) {
            list_parent_child.add((Trees.getNodeText(t, ruleNames) + ' ' + Trees.getNodeText(t.getChild(i), ruleNames)).hashCode());
            features[Math.abs(Integer.MAX_VALUE / 2097152 + (Trees.getNodeText(t, ruleNames) + ' ' + Trees.getNodeText(t.getChild(i), ruleNames)).hashCode() / 2097152)] = 1;
        }

        for (int i = 0; i < t.getChildCount(); i++) {
            if(Trees.getNodeText(t.getChild(i), ruleNames).contains("literal"))
                continue;

            pairs_parent_childAST_java(t.getChild(i), ruleNames, list_parent_child, features);
        }

    }

    /**
     * Extraction of all the nodes of the query AST to perform a deep comparison with changes AST.
     *
     * @param t : AST of a change or query
     * @param ruleNames: rule names of the AST
     * @param list_parent_child: list of the couple parent-child found
     * @param features: binary feature vector ("it is the return value of the function")
     */
    static void pairs_parent_childAST_javascript(final Tree t, final List<String> ruleNames, final List<Integer> list_parent_child, int [] features) {

        for (int i = 0; i < t.getChildCount(); i++) {
            list_parent_child.add((Trees.getNodeText(t, ruleNames) + ' ' + Trees.getNodeText(t.getChild(i), ruleNames)).hashCode());
            features[Math.abs(Integer.MAX_VALUE / 2097152 + (Trees.getNodeText(t, ruleNames) + ' ' + Trees.getNodeText(t.getChild(i), ruleNames)).hashCode() / 2097152)] = 1;
        }

        for (int i = 0; i < t.getChildCount(); i++) {
            if(Trees.getNodeText(t.getChild(i), ruleNames).contains("literal"))
                continue;

            pairs_parent_childAST_javascript(t.getChild(i), ruleNames, list_parent_child, features);
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
    static void tree_hash_sumAST_java(final Tree t, final List<String> ruleNames, final List<Integer> list_hash_sum, int [] features) {
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
            if(Trees.getNodeText(t.getChild(i), ruleNames).contains("literal"))
                continue;

            tree_hash_sumAST_java(t.getChild(i), ruleNames, list_hash_sum, features);
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
    static void tree_hash_sumAST_javascript(final Tree t, final List<String> ruleNames, final List<Integer> list_hash_sum, int [] features) {
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
            if(Trees.getNodeText(t.getChild(i), ruleNames).contains("literal"))
                continue;

            tree_hash_sumAST_javascript(t.getChild(i), ruleNames, list_hash_sum, features);
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
    static boolean deep_tree_comparison_python(final Tree query_tree, final List<String> query_ruleNames, final Tree change_tree, final List<String> change_ruleNames, PrintWriter writer) {
        int i;

        try {

            if (!Trees.getNodeText(change_tree, change_ruleNames).equals(Trees.getNodeText(query_tree, query_ruleNames))) {
                if(Config.LOG_FILE)
                    writer.println("FALSE0---" + Trees.getNodeText(change_tree, change_ruleNames) + "  Q: " + Trees.getNodeText(query_tree, query_ruleNames));
                return false;
            }

            if(query_tree.getChildCount() != change_tree.getChildCount())
                return false;

            String s1;
            String s2;

            for (i = 0; i < query_tree.getChildCount(); i++) {

                if (query_tree.getChild(i).getChildCount() > 0 ) {
                    if(Config.LOG_FILE)
                        writer.println(i + "---" + Trees.getNodeText( change_tree, change_ruleNames) + "  Q: " + Trees.getNodeText(query_tree, query_ruleNames));

                    s1 = Trees.getNodeText(change_tree.getChild(i), change_ruleNames);
                    s2 = Trees.getNodeText(query_tree.getChild(i), query_ruleNames);
                    if (!Trees.getNodeText(query_tree.getChild(i), query_ruleNames).contains("EXPR") || !Trees.getNodeText(change_tree.getChild(i), change_ruleNames).equals("expr")) {
                        if (!(s1.equals(s2))) {
                            if(Config.LOG_FILE)
                                writer.println("FALSE1---" + Trees.getNodeText(change_tree, change_ruleNames) + "  Q: " + Trees.getNodeText(query_tree, query_ruleNames));
                            return false;
                        }
                    }else
                        return true;
                }
            }

        } catch (Exception e) {
            // e.printStackTrace();
            if(Config.LOG_FILE)
                writer.println("EXCEPTION1---" + Trees.getNodeText(change_tree, change_ruleNames) + "  Q: " + Trees.getNodeText(query_tree, query_ruleNames));
            return false;
        }

        try{
            for (i = 0; i < query_tree.getChildCount(); i++) {
                if (!Trees.getNodeText(query_tree.getChild(i), query_ruleNames).contains("EXPR") || !Trees.getNodeText(change_tree.getChild(i), change_ruleNames).equals("expr")) {
                    if (query_tree.getChild(i).getChildCount() > 0) {
                        if(Config.LOG_FILE)
                            writer.println("next---" + Trees.getNodeText(change_tree.getChild(i), change_ruleNames) + "  Q: " + Trees.getNodeText(query_tree.getChild(i), query_ruleNames));
                        if (!deep_tree_comparison_python(query_tree.getChild(i), query_ruleNames, change_tree.getChild(i), change_ruleNames, writer)) {
                            if(Config.LOG_FILE)
                                writer.println("FALSE2---" + Trees.getNodeText(change_tree, change_ruleNames) + "  Q: " + Trees.getNodeText(query_tree, query_ruleNames));
                            return false;
                        }
                    }
                }else{
                    if(Config.LOG_FILE)
                        writer.println("EXPR---" + Trees.getNodeText(change_tree, change_ruleNames) + "  Q: " + Trees.getNodeText(query_tree.getChild(i), query_ruleNames));
                    break;
                }
            }

        } catch (Exception e) {
            // e.printStackTrace();
            if(Config.LOG_FILE)
                writer.println("EXCEPTION2---" + Trees.getNodeText(change_tree, change_ruleNames) + "  Q: " + Trees.getNodeText(query_tree, query_ruleNames));
            return false;
        }

        return true;
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
    static boolean deep_tree_comparison_java(final Tree query_tree, final List<String> query_ruleNames, final Tree change_tree, final List<String> change_ruleNames, PrintWriter writer) {
        int i;

        try {

            if (!Trees.getNodeText(change_tree, change_ruleNames).equals(Trees.getNodeText(query_tree, query_ruleNames))) {
             //   if(Config.LOG_FILE)
               //     writer.println("FALSE0---" + Trees.getNodeText(change_tree, change_ruleNames) + "  Q: " + Trees.getNodeText(query_tree, query_ruleNames));
                return false;
            }

            if(query_tree.getChildCount() != change_tree.getChildCount())
                return false;



            String s1;
            String s2;

            for (i = 0; i < query_tree.getChildCount(); i++) {

                if (query_tree.getChild(i).getChildCount() > 0 ) {
                      //  if(Config.LOG_FILE)
                         //   writer.println(i + "---" + Trees.getNodeText( change_tree, change_ruleNames) + "  Q: " + Trees.getNodeText(query_tree, query_ruleNames));

                        //Managing the keyword <...>
                        if(Trees.getNodeText(query_tree.getChild(i), query_ruleNames).contains("<...>")
                                && Trees.getNodeText(change_tree, change_ruleNames).equals("expressionList") )
                            return true;

                        s1 = Trees.getNodeText(change_tree.getChild(i), change_ruleNames);
                        s2 = Trees.getNodeText(query_tree.getChild(i), query_ruleNames);
                        if (!Trees.getNodeText(query_tree.getChild(i), query_ruleNames).contains("EXPR") || !Trees.getNodeText(change_tree.getChild(i), change_ruleNames).equals("expr")) {
                            if (!(s1.equals(s2))) {
                              //  if(Config.LOG_FILE)
                              //      writer.println("FALSE1---" + Trees.getNodeText(change_tree, change_ruleNames) + "  Q: " + Trees.getNodeText(query_tree, query_ruleNames));
                                return false;
                            }
                        }else
                            return true;
                }else{
                    //Managing the keyword _ using XOR
                    if((Trees.getNodeText(query_tree.getChild(i), query_ruleNames).equals("_")
                            ^ Trees.getNodeText(change_tree.getChild(i), change_ruleNames).equals("_")) )
                        return false;
                }
            }

        } catch (Exception e) {
            // e.printStackTrace();
          //  if(Config.LOG_FILE)
             //   writer.println("EXCEPTION1---" + Trees.getNodeText(change_tree, change_ruleNames) + "  Q: " + Trees.getNodeText(query_tree, query_ruleNames));
            return false;
        }

        try{
            for (i = 0; i < query_tree.getChildCount(); i++) {
                if (!Trees.getNodeText(query_tree.getChild(i), query_ruleNames).contains("EXPR")
                        || !Trees.getNodeText(change_tree.getChild(i), change_ruleNames).equals("expr")
                        || !Trees.getNodeText(query_tree.getChild(i), query_ruleNames).contains("literal")) {
                    if (query_tree.getChild(i).getChildCount() > 0) {
                      //  if(Config.LOG_FILE)
                       //     writer.println("next---" + Trees.getNodeText(change_tree.getChild(i), change_ruleNames) + "  Q: " + Trees.getNodeText(query_tree.getChild(i), query_ruleNames));
                        if (!deep_tree_comparison_java(query_tree.getChild(i), query_ruleNames, change_tree.getChild(i), change_ruleNames, writer)) {
                       //     if(Config.LOG_FILE)
                        //        writer.println("FALSE2---" + Trees.getNodeText(change_tree, change_ruleNames) + "  Q: " + Trees.getNodeText(query_tree, query_ruleNames));
                            return false;
                        }
                    }
                }else{
                   // if(Config.LOG_FILE)
                    //    writer.println("EXPR---" + Trees.getNodeText(change_tree, change_ruleNames) + "  Q: " + Trees.getNodeText(query_tree.getChild(i), query_ruleNames));
                    break;
                }
            }

        } catch (Exception e) {
           // e.printStackTrace();
           // if(Config.LOG_FILE)
             //   writer.println("EXCEPTION2---" + Trees.getNodeText(change_tree, change_ruleNames) + "  Q: " + Trees.getNodeText(query_tree, query_ruleNames));
            return false;
        }

        return true;
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
    static boolean deep_tree_comparison_javascript(final Tree query_tree, final List<String> query_ruleNames, final Tree change_tree, final List<String> change_ruleNames, PrintWriter writer) {
        int i;

        try {

            if (!Trees.getNodeText(change_tree, change_ruleNames).equals(Trees.getNodeText(query_tree, query_ruleNames))) {
                   if(Config.LOG_FILE)
                     writer.println("FALSE0---" + Trees.getNodeText(change_tree, change_ruleNames) + "  Q: " + Trees.getNodeText(query_tree, query_ruleNames));
                return false;
            }

            if(query_tree.getChildCount() != change_tree.getChildCount())
                return false;



            String s1;
            String s2;

            for (i = 0; i < query_tree.getChildCount(); i++) {

                if (query_tree.getChild(i).getChildCount() > 0 ) {
                      if(Config.LOG_FILE)
                       writer.println(i + "---" + Trees.getNodeText( change_tree, change_ruleNames) + "  Q: " + Trees.getNodeText(query_tree, query_ruleNames));

                    //Managing the keyword <...>
                    if(Trees.getNodeText(query_tree.getChild(i), query_ruleNames).contains("<...>")
                            && Trees.getNodeText(change_tree, change_ruleNames).equals("expressionList") )
                        return true;

                    s1 = Trees.getNodeText(change_tree.getChild(i), change_ruleNames);
                    s2 = Trees.getNodeText(query_tree.getChild(i), query_ruleNames);
                    if (!Trees.getNodeText(query_tree.getChild(i), query_ruleNames).contains("EXPR") || !Trees.getNodeText(change_tree.getChild(i), change_ruleNames).equals("expr")) {
                        if (!(s1.equals(s2))) {
                              if(Config.LOG_FILE)
                                  writer.println("FALSE1---" + Trees.getNodeText(change_tree, change_ruleNames) + "  Q: " + Trees.getNodeText(query_tree, query_ruleNames));
                            return false;
                        }
                    }else
                        return true;
                }else{
                    //Managing the keyword _ using XOR
                    if((Trees.getNodeText(query_tree.getChild(i), query_ruleNames).equals("_")
                            ^ Trees.getNodeText(change_tree.getChild(i), change_ruleNames).equals("_")) )
                        return false;
                }
            }

        } catch (Exception e) {
            // e.printStackTrace();
              if(Config.LOG_FILE)
               writer.println("EXCEPTION1---" + Trees.getNodeText(change_tree, change_ruleNames) + "  Q: " + Trees.getNodeText(query_tree, query_ruleNames));
            return false;
        }

        try{
            for (i = 0; i < query_tree.getChildCount(); i++) {
                if (!Trees.getNodeText(query_tree.getChild(i), query_ruleNames).contains("EXPR")
                        || !Trees.getNodeText(change_tree.getChild(i), change_ruleNames).equals("expr")
                        || !Trees.getNodeText(query_tree.getChild(i), query_ruleNames).contains("literal")) {
                    if (query_tree.getChild(i).getChildCount() > 0) {
                          if(Config.LOG_FILE)
                             writer.println("next---" + Trees.getNodeText(change_tree.getChild(i), change_ruleNames) + "  Q: " + Trees.getNodeText(query_tree.getChild(i), query_ruleNames));
                        if (!deep_tree_comparison_javascript(query_tree.getChild(i), query_ruleNames, change_tree.getChild(i), change_ruleNames, writer)) {
                                 if(Config.LOG_FILE)
                                    writer.println("FALSE2---" + Trees.getNodeText(change_tree, change_ruleNames) + "  Q: " + Trees.getNodeText(query_tree, query_ruleNames));
                            return false;
                        }
                    }
                }else{
                     if(Config.LOG_FILE)
                        writer.println("EXPR---" + Trees.getNodeText(change_tree, change_ruleNames) + "  Q: " + Trees.getNodeText(query_tree.getChild(i), query_ruleNames));
                    break;
                }
            }

        } catch (Exception e) {
            // e.printStackTrace();
             if(Config.LOG_FILE)
               writer.println("EXCEPTION2---" + Trees.getNodeText(change_tree, change_ruleNames) + "  Q: " + Trees.getNodeText(query_tree, query_ruleNames));
            return false;
        }

        return true;
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
    static boolean deep_tree_comparison_javascript2(final Tree query_tree, final List<String> query_ruleNames, final Tree change_tree, final List<String> change_ruleNames, PrintWriter writer) {
        int i;

        try {

            if (!Trees.getNodeText(change_tree, change_ruleNames).equals(Trees.getNodeText(query_tree, query_ruleNames))) {
                if(Config.LOG_FILE)
                    writer.println("FALSE0---" + Trees.getNodeText(change_tree, change_ruleNames) + "  Q: " + Trees.getNodeText(query_tree, query_ruleNames));
                return false;
            }

            if(query_tree.getChildCount() != change_tree.getChildCount())
                return false;



            String s1;
            String s2;

            for (i = 0; i < query_tree.getChildCount(); i++) {

                if (query_tree.getChild(i).getChildCount() > 0 ) {
                    if(Config.LOG_FILE)
                        writer.println(i + "---" + Trees.getNodeText( change_tree, change_ruleNames) + "  Q: " + Trees.getNodeText(query_tree, query_ruleNames));

                    //Managing the keyword <...>
                    if(Trees.getNodeText(query_tree.getChild(i), query_ruleNames).contains("<...>")
                            && Trees.getNodeText(change_tree, change_ruleNames).equals("expressionList") )
                        return true;

                    s1 = Trees.getNodeText(change_tree.getChild(i), change_ruleNames);
                    s2 = Trees.getNodeText(query_tree.getChild(i), query_ruleNames);
                    if (!Trees.getNodeText(query_tree.getChild(i), query_ruleNames).contains("EXPR")
                            || !Trees.getNodeText(change_tree.getChild(i), change_ruleNames).equals("expr")
                            || !Trees.getNodeText(change_tree.getChild(i), change_ruleNames).equals("eos")) {
                        if (!(s1.equals(s2))) {
                            if(Config.LOG_FILE)
                                writer.println("FALSE1---" + Trees.getNodeText(change_tree, change_ruleNames) + "  Q: " + Trees.getNodeText(query_tree, query_ruleNames));
                            return false;
                        }
                    }else
                        return true;
                }else{
                    //Managing the keyword _ using XOR
                    if((Trees.getNodeText(query_tree.getChild(i), query_ruleNames).equals("_")
                            ^ Trees.getNodeText(change_tree.getChild(i), change_ruleNames).equals("_")) )
                        return false;
                }
            }

        } catch (Exception e) {
            // e.printStackTrace();
            if(Config.LOG_FILE)
                writer.println("EXCEPTION1---" + Trees.getNodeText(change_tree, change_ruleNames) + "  Q: " + Trees.getNodeText(query_tree, query_ruleNames));
            return false;
        }

        try{
            for (i = 0; i < query_tree.getChildCount(); i++) {
                if (!Trees.getNodeText(query_tree.getChild(i), query_ruleNames).contains("EXPR")
                        || !Trees.getNodeText(change_tree.getChild(i), change_ruleNames).equals("expr")
                        || !Trees.getNodeText(change_tree.getChild(i), change_ruleNames).equals("eos")) {
                    if (query_tree.getChild(i).getChildCount() > 0) {
                        if(Config.LOG_FILE)
                            writer.println("next---" + Trees.getNodeText(change_tree.getChild(i), change_ruleNames) + "  Q: " + Trees.getNodeText(query_tree.getChild(i), query_ruleNames));
                        if (!deep_tree_comparison_javascript2(query_tree.getChild(i), query_ruleNames, change_tree.getChild(i), change_ruleNames, writer)) {
                            if(Config.LOG_FILE)
                                writer.println("FALSE2---" + Trees.getNodeText(change_tree, change_ruleNames) + "  Q: " + Trees.getNodeText(query_tree, query_ruleNames));
                            return false;
                        }
                    }
                }else{
                    if(Config.LOG_FILE)
                        writer.println("EXPR---" + Trees.getNodeText(change_tree, change_ruleNames) + "  Q: " + Trees.getNodeText(query_tree.getChild(i), query_ruleNames));
                    break;
                }
            }

        } catch (Exception e) {
            // e.printStackTrace();
            if(Config.LOG_FILE)
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
     * @param tree : AST of the query
     * @param ruleNames: rule names of the query AST
     * @param list_leaves: list of all the AST query nodes
     */
    static void query_leaves_extraction2(final Tree tree, final List<String> ruleNames, List<String> list_leaves) {

        for (int i = 0; i < tree.getChildCount(); i++) {
            query_leaves_extraction2(tree.getChild(i), ruleNames, list_leaves);
        }

        for (int i = 0; i < tree.getChildCount(); i++) {
            if (tree.getChild(i).getChildCount() == 0) {
                list_leaves.add(Trees.getNodeText(tree, ruleNames));
                //break;
            }
        }

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

    public static Tree query_javascript_extraction(final Tree query_tree, List<String> query_ruleNames) {
        Tree old = null;

        try {

            if(Trees.getNodeText(query_tree, query_ruleNames).equals("singleExpression")){
                return query_tree;
            }else{
            //    if(query_tree.getChildCount() > 0)
                    old = query_javascript_extraction(query_tree.getChild(0), query_ruleNames);
            }

        } catch (Exception e) {
            e.printStackTrace();
            return old;
        }

        return old;
    }

    public static Tree query_new_extraction(final Tree query_tree, int n) {
        Tree neww = null;

        try {

            if(query_tree.getChildCount() > 1){
                if(n>0)
                    return query_tree;
                else{
                    n++;
                    if(query_tree.getChildCount() > 0)
                        neww = query_new_extraction(query_tree.getChild(0),n);
                }
            }else{
                if(query_tree.getChildCount() > 0)
                    neww = query_new_extraction(query_tree.getChild(0), n);
            }

        } catch (Exception e) {
            e.printStackTrace();
            return neww;
        }

        return neww;
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
    static boolean deep_tree_comparison_partial(final Tree query_tree, final List<String> query_ruleNames, final Tree change_tree, final List<String> change_ruleNames, PrintWriter writer, boolean check) {

        try {
            if(!check) {
                String s1 = Trees.getNodeText(change_tree, change_ruleNames);
                String s2 = Trees.getNodeText(query_tree, query_ruleNames);

                if(change_tree.getChildCount() > 0 && query_tree.getChildCount() > 0)
                if (Trees.getNodeText(change_tree, change_ruleNames).equals(Trees.getNodeText(query_tree, query_ruleNames))) {
                    if(change_tree.getChildCount() > 0) {
                        return deep_tree_comparison_partial(query_tree, query_ruleNames, change_tree, change_ruleNames, writer, true);
                    }else{
                        System.out.println("No children old\n");
                        return false;}
                } else {
                    for(int i= 0 ; i < change_tree.getChildCount(); i++) {
                        if(deep_tree_comparison_partial(query_tree, query_ruleNames, change_tree.getChild(i), change_ruleNames, writer, false))
                            return true;
                    }
                }
            }else{

                if(deep_tree_comparison_javascript2(query_tree, query_ruleNames, change_tree, change_ruleNames, writer)){


                    return true;
                }else{
                    writer.println("######################################################################################################################################");
                    for(int i= 0 ; i < change_tree.getChildCount(); i++)
                        if(deep_tree_comparison_partial(query_tree, query_ruleNames, change_tree.getChild(i), change_ruleNames, writer, false))
                            return true;
                }
            }
        }catch (Exception e) {
            e.printStackTrace();

        }

        return false;
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
    static boolean deep_tree_comparison_partial(final Tree query_tree, final List<String> query_ruleNames, final Tree change_tree, final List<String> change_ruleNames, PrintWriter writer, boolean check, Tree partial ) {

        try {
            if(!check) {
                String s1 = Trees.getNodeText(change_tree, change_ruleNames);
                String s2 = Trees.getNodeText(query_tree, query_ruleNames);

                if(change_tree.getChildCount() > 0 && query_tree.getChildCount() > 0)
                    if (Trees.getNodeText(change_tree, change_ruleNames).equals(Trees.getNodeText(query_tree, query_ruleNames))) {
                        if(change_tree.getChildCount() > 0) {
                            return deep_tree_comparison_partial(query_tree, query_ruleNames, change_tree, change_ruleNames, writer, true, partial);
                        }else{
                            System.out.println("No children old\n");
                            return false;}
                    } else {
                        for(int i= 0 ; i < change_tree.getChildCount(); i++) {
                            if(deep_tree_comparison_partial(query_tree, query_ruleNames, change_tree.getChild(i), change_ruleNames, writer, false,partial))
                                return true;
                        }
                    }
            }else{

                if(deep_tree_comparison_javascript2(query_tree, query_ruleNames, change_tree, change_ruleNames, writer)){
                    partial = change_tree;


                    return true;
                }else{
                    writer.println("######################################################################################################################################");
                    for(int i= 0 ; i < change_tree.getChildCount(); i++)
                        if(deep_tree_comparison_partial(query_tree, query_ruleNames, change_tree.getChild(i), change_ruleNames, writer, false, partial))
                            return true;
                }
            }
        }catch (Exception e) {
            e.printStackTrace();

        }

        return false;
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
    static Tree deep_tree_comparison_partial2(final Tree query_tree, final List<String> query_ruleNames, final Tree change_tree, final List<String> change_ruleNames, PrintWriter writer, boolean check ) {

        try {
            if(!check) {
                String s1 = Trees.getNodeText(change_tree, change_ruleNames);
                String s2 = Trees.getNodeText(query_tree, query_ruleNames);

                if(change_tree.getChildCount() > 0 && query_tree.getChildCount() > 0)
                    if (Trees.getNodeText(change_tree, change_ruleNames).equals(Trees.getNodeText(query_tree, query_ruleNames))) {
                        if(change_tree.getChildCount() > 0) {
                            return deep_tree_comparison_partial2(query_tree, query_ruleNames, change_tree, change_ruleNames, writer, true);
                        }else{
                            System.out.println("No children old\n");
                            return null;}
                    } else {
                        for(int i= 0 ; i < change_tree.getChildCount(); i++) {
                            Tree partial = deep_tree_comparison_partial2(query_tree, query_ruleNames, change_tree.getChild(i), change_ruleNames, writer, false);
                            if(partial != null)
                                return partial;
                        }
                    }
            }else{
                Tree partial = null;
                if(deep_tree_comparison_javascript2(query_tree, query_ruleNames, change_tree, change_ruleNames, writer)){
                     partial = change_tree;

                    return partial;
                }else{
                    writer.println("######################################################################################################################################");
                    for(int i= 0 ; i < change_tree.getChildCount(); i++)
                       partial = deep_tree_comparison_partial2(query_tree, query_ruleNames, change_tree.getChild(i), change_ruleNames, writer, false);
                    if(partial != null)
                        return partial;
                }
            }
        }catch (Exception e) {
            e.printStackTrace();

        }

        return null;
    }



}
