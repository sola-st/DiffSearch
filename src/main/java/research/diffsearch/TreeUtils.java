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


        return;
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


        return;
    }
}
