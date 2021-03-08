package research.diffsearch.tree;

import org.antlr.v4.runtime.tree.Tree;

import java.util.List;

public class TreeUtils {

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
