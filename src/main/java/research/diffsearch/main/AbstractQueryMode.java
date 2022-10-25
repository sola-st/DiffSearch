package research.diffsearch.main;

import matching.NodeMap;
import matching.NodeUtil;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.Tree;
import org.antlr.v4.runtime.tree.Trees;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;
import research.diffsearch.tree.JavaTree;
import research.diffsearch.tree.TreeUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class AbstractQueryMode extends App {
    private static Parser queryParser;

    public static List<String> check_old(Tree change, Parser parser) {
        List<String> output = new LinkedList<>();
        queryParser = parser;
        NodeUtil nodeUtil = new NodeUtil(parser, parser);

        // initialize work list with node pairs that match the query's old+new subtrees
        LinkedList<NodeMap> workList = new LinkedList<>();
        Tree queryOld = nodeUtil.extractOldSubtree(change);
        Tree queryNew = nodeUtil.extractNewSubtree(change);
        Tree changeOld = nodeUtil.extractOldSubtree(change);
        Tree changeNew = nodeUtil.extractNewSubtree(change);
        for (Pair<Tree, Tree> nodePair : subtreeCandidates(queryOld, queryNew, changeOld, changeNew, nodeUtil)) {
            NodeMap m = new NodeMap(queryOld, nodePair.getLeft(), queryNew, nodePair.getRight(), nodeUtil);
            workList.add(m);
        }

        List<Tree> nodesToMatch = computeNodes(queryOld);
        //nodesToMatch.addAll(computeNodes(queryNew));

        // explore possible mapping until matching mapping found
        while (!workList.isEmpty()) {
            NodeMap m = workList.removeLast();

            Tree unmatchedQueryNode = m.nextUnmatchedNode(nodesToMatch);

            if (unmatchedQueryNode == null) {
                return output;
            }

            Tree queryParent = unmatchedQueryNode.getParent();
            Tree treeParent = m.get(queryParent);
            assert (treeParent != null);

            output.add(isPossibilePlaceholder(unmatchedQueryNode, parser));
            int startIdx = m.indexOfLastMatchedChild(treeParent);
            for (int i = startIdx; i < treeParent.getChildCount(); i++) {
                Tree treeCandidateNode = treeParent.getChild(i);
                NodeMap updatedMap = m.checkAndUpdate(unmatchedQueryNode, treeCandidateNode);

                if (updatedMap != null) {
                    if (updatedMap.nextUnmatchedNode(nodesToMatch) == null) {
                        // found match, under assumption that wildcards exist between all nodes
                        return output;

                    } else {
                        workList.add(updatedMap);

                    }
                }
            }
        }
        return output;
    }

    public static List<String> check_new(Tree change, Parser parser) {
        List<String> output = new LinkedList<>();
        queryParser = parser;
        NodeUtil nodeUtil = new NodeUtil(parser, parser);

        // initialize work list with node pairs that match the query's old+new subtrees
        LinkedList<NodeMap> workList = new LinkedList<>();
        Tree queryOld = nodeUtil.extractOldSubtree(change);
        Tree queryNew = nodeUtil.extractNewSubtree(change);
        Tree changeOld = nodeUtil.extractOldSubtree(change);
        Tree changeNew = nodeUtil.extractNewSubtree(change);
        for (Pair<Tree, Tree> nodePair : subtreeCandidates(queryOld, queryNew, changeOld, changeNew, nodeUtil)) {
            NodeMap m = new NodeMap(queryOld, nodePair.getLeft(), queryNew, nodePair.getRight(), nodeUtil);
            workList.add(m);
        }

        List<Tree> nodesToMatch = computeNodes(queryNew);
        //nodesToMatch.addAll(computeNodes(queryNew));

        // explore possible mapping until matching mapping found
        while (!workList.isEmpty()) {
            NodeMap m = workList.removeLast();

            Tree unmatchedQueryNode = m.nextUnmatchedNode(nodesToMatch);

            if (unmatchedQueryNode == null) {
                return output;
            }

            Tree queryParent = unmatchedQueryNode.getParent();
            Tree treeParent = m.get(queryParent);
            assert (treeParent != null);

            output.add(isPossibilePlaceholder(unmatchedQueryNode, parser));
            int startIdx = m.indexOfLastMatchedChild(treeParent);
            for (int i = startIdx; i < treeParent.getChildCount(); i++) {
                Tree treeCandidateNode = treeParent.getChild(i);
                NodeMap updatedMap = m.checkAndUpdate(unmatchedQueryNode, treeCandidateNode);

                if (updatedMap != null) {
                    if (updatedMap.nextUnmatchedNode(nodesToMatch) == null) {
                        // found match, under assumption that wildcards exist between all nodes
                        return output;

                    } else {
                        workList.add(updatedMap);

                    }
                }
            }
        }
        return output;
    }

    public static String isPossibilePlaceholder(Tree v, Parser changeParser) {
        String vText = Trees.getNodeText(v, changeParser);
        String vParentText = Trees.getNodeText(v.getParent(), changeParser);

        if (v.getChildCount() != 0) {
            return "";
        }

        if (vParentText.contains("iteral") || vParentText.equals("atom")) {
            return "LT";
        } else if (vParentText.equals("identifier")) {
            return "ID";
        } else if (vParentText.equals("binary_operators")
                || vParentText.equals("binOperator")
                || vParentText.equals("bin_op")) {
            return "BIN_OP";
        } else if (vParentText.equals("assign_operators")
                || vParentText.equals("assignmentOperator")
                || vParentText.equals("expr_stmt")) {
            return "OP";
        } else if (vParentText.equals("unary_prefix_operators")
                || vParentText.equals("unary_postfix_operators")) {
            return "unOP";
        } /*else if (vParentText.equals("expression")//v.getChildCount() == 0;
                || vParentText.equals("methodCall")
                || vParentText.equals("singleExpression")) {
            return "EXPR";
        }*/ else {
            if (v.getChildCount() == 0) {
                return vText;
            } else {
                return "";
            }
        }
    }

    private static List<Tree> computeNodes(Tree t) {
        List<Tree> result = new ArrayList<>();
        result.add(t);
        for (int i = 0; i < t.getChildCount(); i++) {
            Tree c = t.getChild(i);
            if (TreeUtils.getCompleteNodeText(c, Arrays.asList(queryParser.getRuleNames())).equals("<...>"))
                continue;
            result.addAll(computeNodes(c));
        }
        return result;
    }

    private static List<ImmutablePair<Tree, Tree>> subtreeCandidates(Tree queryOld, Tree queryNew,
                                                                     Tree treeOld, Tree treeNew,
                                                                     NodeUtil nodeUtil) {
        List<ImmutablePair<Tree, Tree>> result = new ArrayList<>();
        for (Tree nOld : computeNodes(treeOld)) {
            if (nodeUtil.isMatchingNormalNode(queryOld, nOld) | nodeUtil.isMatchingEmpty(queryOld, nOld)) {
                for (Tree nNew : computeNodes(treeNew)) {
                    if (nodeUtil.isMatchingNormalNode(queryNew, nNew) | nodeUtil.isMatchingEmpty(queryNew, nNew))
                        result.add(new ImmutablePair<>(nOld, nNew));
                }
            }
        }
        return result;
    }

    public static String runJunit(String input) {
        JavaTree InputTree = new JavaTree(input);
        ParseTree Tree = InputTree.getParseTree();

        List<String> output_old = check_old(Tree, InputTree.getParser());
        List<String> output_new = check_new(Tree, InputTree.getParser());

        // remove elemnt from list
        while (output_old.remove("")) {
        }
        while (output_new.remove("")) {
        }
        // print a list

        // Convert list in string
        return String.join(" ", output_old) + " --> " + String.join(" ", output_new);

    }

    public void run() {

        //String input_original = "return new MySqlStatementParser(sql); --> return new MySqlStatementParser(sql, keepComments);";

        String input_original = "return a; --> return 5;";

        System.out.println("Input: " + input_original);
        JavaTree InputTree = new JavaTree(input_original);

        ParseTree Tree = InputTree.getParseTree();
        System.out.println(Tree.toStringTree(InputTree.getParser()));
        List<String> output_old = check_old(Tree, InputTree.getParser());
        List<String> output_new = check_new(Tree, InputTree.getParser());

        // remove elemnt from list
        while (output_old.remove("")) {
        }
        while (output_new.remove("")) {
        }
        // print a list
        //System.out.println(output);

        // Convert list in string
        System.out.println("Output: " + String.join(" ", output_old) + " --> " + String.join(" ", output_new));

    }
}
