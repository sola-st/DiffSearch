package matching;

import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.tree.Tree;
import org.antlr.v4.runtime.tree.Trees;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;
import research.diffsearch.tree.TreeUtils;

import java.util.*;

/**
 * Checks if a query tree matches a change tree.
 * The algorithm supports wildcards, named and unnamed placeholders, and
 * queries that match only parts of a change.
 * It's a top-down comparison of the query tree and the change tree that tries
 * to map each node in the query tree to a node in the change tree.
 * Because of wildcards and named placeholders, the algorithm must explore
 * multiple possible matches. This exploration is implemented as work list-based
 * algorithm that maintains each possible match as a NodeMap.
 * There may be multiple matches, but the algorithm stops as soon as one found.
 */
public class Matching {

    private Tree query;
    private Parser queryParser;

    public Matching(Tree query, Parser queryParser) {
        this.query = query;
        this.queryParser = queryParser;
    }

    public boolean isMatch(Tree change, Parser parser) {
        NodeUtil nodeUtil = new NodeUtil(queryParser, parser);

        // initialize work list with node pairs that match the query's old+new subtrees
        LinkedList<NodeMap> workList = new LinkedList<>();
        Tree queryOld = nodeUtil.extractOldSubtree(query);
        Tree queryNew = nodeUtil.extractNewSubtree(query);
        Tree changeOld = nodeUtil.extractOldSubtree(change);
        Tree changeNew = nodeUtil.extractNewSubtree(change);
        for (Pair<Tree, Tree> nodePair : subtreeCandidates(queryOld, queryNew, changeOld, changeNew, nodeUtil)) {
            NodeMap m = new NodeMap(queryOld, nodePair.getLeft(), queryNew, nodePair.getRight(), nodeUtil);
            workList.add(m);
        }

        List<Tree> nodesToMatch = computeNodes(queryOld);
        nodesToMatch.addAll(computeNodes(queryNew));

        if (quickPruning(queryOld, queryNew, changeOld, changeNew, nodesToMatch, nodeUtil)) {
            return false;
        }

        // explore possible mapping until matching mapping found
        while (!workList.isEmpty()) {
            NodeMap m = workList.removeLast();

            Tree unmatchedQueryNode = m.nextUnmatchedNode(nodesToMatch);

            if (unmatchedQueryNode == null) {
                if (validateMatchingCandidate(m, nodeUtil)) {
                    return true;
                } else {
                    continue;
                }
            }

            Tree queryParent = unmatchedQueryNode.getParent();
            Tree treeParent = m.get(queryParent);
            assert (treeParent != null);

            int startIdx = m.indexOfLastMatchedChild(treeParent);
            for (int i = startIdx; i < treeParent.getChildCount(); i++) {
                Tree treeCandidateNode = treeParent.getChild(i);
                NodeMap updatedMap = m.checkAndUpdate(unmatchedQueryNode, treeCandidateNode);
                if (updatedMap != null) {
                    if (updatedMap.nextUnmatchedNode(nodesToMatch) == null) {
                        // found match, under assumption that wildcards exist between all nodes
                        if (validateMatchingCandidate(updatedMap, nodeUtil)) {
                            return true;
                        }
                    } else {
                        workList.add(updatedMap);
                    }
                }
            }
        }
        return false;
    }

    private boolean quickPruning(Tree queryOld, Tree queryNew,
                                 Tree changeOld, Tree changeNew,
                                 List<Tree> nodesToMatch,
                                 NodeUtil nodeUtil) {
        return quickPruningByLeaves(changeOld, changeNew, nodesToMatch, nodeUtil);
    }

    private boolean quickPruningByLeaves(Tree changeOld, Tree changeNew,
                                         List<Tree> nodesToMatch,
                                         NodeUtil nodeUtil) {
        // compute leaf nodes of change
        List<Tree> changeNodes = computeNodes(changeOld);
        changeNodes.addAll(computeNodes(changeNew));
        Set<String> leaves = new HashSet<>();
        for (Tree n : changeNodes) {
            var nodeText = Trees.getNodeText(n, Arrays.asList(queryParser.getRuleNames()));
            if (n.getChildCount() == 0 &&
                Arrays.stream(queryParser.getRuleNames()).noneMatch(nodeText::equals)) {
                leaves.add(nodeText);
            }
        }

        // if any of the leaves to match don't appear in the change, certainly no match
        for (Tree n : nodesToMatch) {
            var nodeText = Trees.getNodeText(n, Arrays.asList(queryParser.getRuleNames()));
            if (n.getChildCount() == 0
                && nodeUtil.getKind(n) == NodeUtil.Kind.NORMAL
                && Arrays.stream(queryParser.getRuleNames()).noneMatch(nodeText::equals)) {
                
                if (!leaves.contains(Trees.getNodeText(n, Arrays.asList(queryParser.getRuleNames())))) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean validateMatchingCandidate(NodeMap m, NodeUtil nodeUtil) {
        return validateMatchingCandidateSingleTree(m, m.queryLeftRoot, m.queryRightRoot, nodeUtil)
               && validateMatchingCandidateSingleTree(m, m.treeLeftRoot, m.treeRightRoot, nodeUtil);
    }

    private boolean validateMatchingCandidateSingleTree(NodeMap m, Tree query, Tree change, NodeUtil nodeUtil) {
        if (query.getChildCount() == 0) {
            return true; // nothing to validate, e.g., for "LT" terminal node in query
        }

        int queryIdx = 0;
        Tree queryChild = query.getChild(queryIdx);
        for (int changeIdx = 0; changeIdx < change.getChildCount(); changeIdx++) {
            Tree changeChild = change.getChild(changeIdx);

            if (nodeUtil.getKind(queryChild) == NodeUtil.Kind.WILDCARD) {
                // look-ahead to decide whether to use or skip wildcard
                if (queryIdx + 1 < query.getChildCount() && m.get(query.getChild(queryIdx + 1)) == changeChild) {
                    queryChild = query.getChild(++queryIdx);
                } else {
                    // using wildcard to match current changeChild
                    continue;
                }
            }

            if (m.get(queryChild) == changeChild) {
                // node pair matches; recursively validate the subtree
                if (!validateMatchingCandidateSingleTree(m, queryChild, changeChild, nodeUtil)) {
                    return false;
                }
            } else {
                return false;
            }
            if (queryIdx == query.getChildCount() - 1) {
                if (changeIdx != change.getChildCount() - 1) {
                    return false;
                }
                break; // done, all children matched
            }
            queryChild = query.getChild(++queryIdx);
        }
        return true;
    }

    private List<Tree> computeNodes(Tree t) {
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

    private List<ImmutablePair<Tree, Tree>> subtreeCandidates(Tree queryOld, Tree queryNew,
                                                              Tree treeOld, Tree treeNew,
                                                              NodeUtil nodeUtil) {
        List<ImmutablePair<Tree, Tree>> result = new ArrayList<>();
        for (Tree nOld : computeNodes(treeOld)) {
            for (Tree nNew : computeNodes(treeNew)) {
                if ((nodeUtil.isMatchingNormalNode(queryOld, nOld) | nodeUtil.isMatchingEmpty(queryOld, nOld)) &&
                    (nodeUtil.isMatchingNormalNode(queryNew, nNew) | nodeUtil.isMatchingEmpty(queryNew, nNew)))
                    result.add(new ImmutablePair<>(nOld, nNew));
            }
        }
        return result;
    }

}