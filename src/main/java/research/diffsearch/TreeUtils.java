package research.diffsearch;

import java.util.List;

import org.antlr.v4.runtime.misc.Utils;
import org.antlr.v4.runtime.tree.Tree;
import org.antlr.v4.runtime.tree.Trees;

public class TreeUtils {

    /**
     * Platform dependent end-of-line marker
     */
    public static final String Eol = System.lineSeparator();
    /**
     * The literal indent char(s) used for pretty-printing
     */
    public static final String Indents = "  ";
    private static int level;

    private TreeUtils() {
    }

    /**
     * Pretty print out a whole tree is used on the node payloads to get the text
     * for the nodes. (Derived from Trees.toStringTree(....))
     */
    public static String toPrettyTree(final Tree t, final List<String> ruleNames) {
        level = 0;
        return process(t, ruleNames).replaceAll("(?m)^\\s+$", "").replaceAll("\\r?\\n\\r?\\n", Eol);
    }

    private static String process(final Tree t, final List<String> ruleNames) {
        if (t.getChildCount() == 0) return Utils.escapeWhitespace(Trees.getNodeText(t, ruleNames), false);
        StringBuilder sb = new StringBuilder();
        sb.append(lead(level));
        level++;
        String s = Utils.escapeWhitespace(Trees.getNodeText(t, ruleNames), false);
        sb.append(s + ' ');
        for (int i = 0; i < t.getChildCount(); i++) {
            sb.append(process(t.getChild(i), ruleNames));
        }
        level--;
        sb.append(lead(level));
        return sb.toString();
    }

    private static String lead(int level) {
        StringBuilder sb = new StringBuilder();
        if (level > 0) {
            sb.append(Eol);
            for (int cnt = 0; cnt < level; cnt++) {
                sb.append(Indents);
            }
        }
        return sb.toString();
    }

    static void pairs_parent_child(final Tree t, final List<String> ruleNames, final List<Integer> list_parent_child, int [] features) {

        for (int i = 0; i < t.getChildCount(); i++) {
            list_parent_child.add((Trees.getNodeText(t, ruleNames) + ' ' + Trees.getNodeText(t.getChild(i), ruleNames)).hashCode());
            features[Math.abs(Integer.MAX_VALUE/1048576 + (Trees.getNodeText(t, ruleNames) + ' ' + Trees.getNodeText(t.getChild(i), ruleNames)).hashCode()/1048576)] += 1;
        }

        for (int i = 0; i < t.getChildCount(); i++) {
            pairs_parent_child(t.getChild(i), ruleNames, list_parent_child, features);
        }


        return;
    }

    static void tree_hash_sum(final Tree t, final List<String> ruleNames, final List<Integer> list_hash_sum, int [] features) {
        int sum = 0;
        int i;

        sum += Trees.getNodeText(t, ruleNames).hashCode();

        for (i = 0; i < t.getChildCount(); i++) {
            sum += Trees.getNodeText(t.getChild(i), ruleNames).hashCode();
        }

        if (i > 0) {
            list_hash_sum.add(sum);
            features[Math.abs(sum/1048576)] += 1;
        }
        for (i = 0; i < t.getChildCount(); i++) {
            tree_hash_sum(t.getChild(i), ruleNames, list_hash_sum, features);
        }


        return;
    }

    static void pairs_parent_childAST(final Tree t, final List<String> ruleNames, final List<Integer> list_parent_child, int [] features) {

        for (int i = 0; i < t.getChildCount(); i++) {
            if(t.getChild(i).getChildCount() > 0 ) {
                list_parent_child.add((Trees.getNodeText(t, ruleNames) + ' ' + Trees.getNodeText(t.getChild(i), ruleNames)).hashCode());
                features[Math.abs(Integer.MAX_VALUE / 2097152 + (Trees.getNodeText(t, ruleNames) + ' ' + Trees.getNodeText(t.getChild(i), ruleNames)).hashCode() / 2097152)] = 1;
            }
        }

        for (int i = 0; i < t.getChildCount(); i++) {
            if(t.getChild(i).getChildCount() > 0 )
                pairs_parent_childAST(t.getChild(i), ruleNames, list_parent_child, features);
        }


        return;
    }

    static void tree_hash_sumAST(final Tree t, final List<String> ruleNames, final List<Integer> list_hash_sum, int [] features) {
        int sum = 0;
        int i;

        sum += Trees.getNodeText(t, ruleNames).hashCode();

        for (i = 0; i < t.getChildCount(); i++) {
            if(t.getChild(i).getChildCount() > 0 )
                sum += Trees.getNodeText(t.getChild(i), ruleNames).hashCode();
        }

        if (i > 0) {
                list_hash_sum.add(sum);
                features[Math.abs(sum / 2097152)] = 1;
        }

        for (i = 0; i < t.getChildCount(); i++) {
            if(t.getChild(i).getChildCount() > 0 )
                tree_hash_sumAST(t.getChild(i), ruleNames, list_hash_sum, features);
        }


        return;
    }
}
