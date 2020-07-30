package matching;

import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

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
 *
 * @author Michael Pradel
 */
public class Matching {

    private ParseTree query;
    private Parser queryParser;

    public Matching(ParseTree query, Parser queryParser) {
        this.query = query;
        this.queryParser = queryParser;
    }

    public boolean isMatch(ParseTree change, Parser changeParser) {
        NodeUtil nodeUtil = new NodeUtil(queryParser, changeParser);

        // initialize work list with node pairs that match the query's old+new subtrees
        LinkedList<NodeMap> workList = new LinkedList<>();
        ParseTree queryOld = nodeUtil.extractOldSubtree(query);
        ParseTree queryNew = nodeUtil.extractNewSubtree(query);
        ParseTree changeOld = nodeUtil.extractOldSubtree(change);
        ParseTree changeNew = nodeUtil.extractNewSubtree(change);
        for (Pair<ParseTree, ParseTree> nodePair : subtreeCandidates(queryOld, queryNew, changeOld, changeNew, nodeUtil)) {
            NodeMap m = new NodeMap(queryOld, nodePair.getLeft(), queryNew, nodePair.getRight(), nodeUtil);
            workList.add(m);
        }

        List<ParseTree> nodesToMatch = computeNodes(queryOld);
        nodesToMatch.addAll(computeNodes(queryNew));

        if (quickPruning(queryOld, queryNew, changeOld, changeNew, nodesToMatch, nodeUtil)) {
            return false;
        }

        // explore possible mapping until matching mapping found
        while (!workList.isEmpty()) {
            NodeMap m = workList.removeLast();

            ParseTree unmatchedQueryNode = m.nextUnmatchedNode(nodesToMatch);
            if (unmatchedQueryNode == null) {
                if (validateMatchingCandidate(m, nodeUtil)) {
                    return true;
                } else {
                    continue;
                }
            }

            ParseTree queryParent = unmatchedQueryNode.getParent();
            ParseTree treeParent = m.get(queryParent);
            assert (treeParent != null);

            int startIdx = m.indexOfLastMatchedChild(treeParent);
            for (int i = startIdx; i < treeParent.getChildCount(); i++) {
                ParseTree treeCandidateNode = treeParent.getChild(i);
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

    private boolean quickPruning(ParseTree queryOld, ParseTree queryNew,
                                 ParseTree changeOld, ParseTree changeNew,
                                 List<ParseTree> nodesToMatch,
                                 NodeUtil nodeUtil) {
        return quickPruningByLeaves(changeOld, changeNew, nodesToMatch, nodeUtil);
    }

    private boolean quickPruningByLeaves(ParseTree changeOld, ParseTree changeNew,
                                         List<ParseTree> nodesToMatch,
                                         NodeUtil nodeUtil) {
        // compute leaf nodes of change
        List<ParseTree> changeNodes = computeNodes(changeOld);
        changeNodes.addAll(computeNodes(changeNew));
        Set<String> leaves = new HashSet<>();
        for (ParseTree n : changeNodes) {
            if (n.getChildCount() == 0) {
                leaves.add(n.getText());
            }
        }

        // if any of the leaves to match don't appear in the change, certainly no match
        for (ParseTree n : nodesToMatch) {
            if (n.getChildCount() == 0 && nodeUtil.getKind(n) == NodeUtil.Kind.NORMAL) {
                if (!leaves.contains(n.getText())) {
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

    private boolean validateMatchingCandidateSingleTree(NodeMap m, ParseTree query, ParseTree change, NodeUtil nodeUtil) {
        if (query.getChildCount() == 0) {
            return true; // nothing to validate, e.g., for "LT" terminal node in query
        }

        int queryIdx = 0;
        ParseTree queryChild = query.getChild(queryIdx);
        for (int changeIdx = 0; changeIdx < change.getChildCount(); changeIdx++) {
            ParseTree changeChild = change.getChild(changeIdx);

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

    private List<ParseTree> computeNodes(ParseTree t) {
        List<ParseTree> result = new ArrayList<>();
        result.add(t);
        for (int i = 0; i < t.getChildCount(); i++) {
            ParseTree c = t.getChild(i);
            if (c.getText().equals("<...>"))
                continue;
            result.addAll(computeNodes(c));
        }
        return result;
    }

    private List<ImmutablePair<ParseTree, ParseTree>> subtreeCandidates(ParseTree queryOld, ParseTree queryNew,
                                                                        ParseTree treeOld, ParseTree treeNew,
                                                                        NodeUtil nodeUtil) {
        List<ImmutablePair<ParseTree, ParseTree>> result = new ArrayList<>();
        for (ParseTree nOld : computeNodes(treeOld)) {
            for (ParseTree nNew : computeNodes(treeNew)) {
                if ((nodeUtil.isMatchingNormalNode(queryOld, nOld) | nodeUtil.isMatchingEmpty(queryOld, nOld)) &&
                        (nodeUtil.isMatchingNormalNode(queryNew, nNew) | nodeUtil.isMatchingEmpty(queryNew, nNew)))
                    result.add(new ImmutablePair<>(nOld, nNew));
            }
        }
        return result;
    }

}