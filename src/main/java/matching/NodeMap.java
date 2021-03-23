package matching;

import org.antlr.v4.runtime.tree.ParseTree;

import java.util.*;

/**
 * Keeps track of the mapping between nodes in the query tree and nodes in the change tree.
 * Each instance of this class represents one (partial) mapping constructed during the matching.
 * The mapping assumes that there are wildcards between all nodes, i.e., for the final matching,
 * one still needs to check whether the query and the change match with the actually given wildcards.
 *
 *
 */
public class NodeMap {

    private HashMap<ParseTree, ParseTree> nodeMap = new HashMap<>();
    private Set<ParseTree> usedValueNodes = new HashSet<>();
    private HashMap<String, String> namedPlaceholders = new HashMap<>();
    final public ParseTree queryLeftRoot;
    final public ParseTree queryRightRoot;
    final public ParseTree treeLeftRoot;
    final public ParseTree treeRightRoot;

    private NodeUtil nodeUtil;

    public NodeMap(ParseTree queryLeftRoot, ParseTree queryRightRoot,
                   ParseTree treeLeftRoot, ParseTree treeRightRoot, NodeUtil nodeUtil) {
        this.queryLeftRoot = queryLeftRoot;
        this.queryRightRoot = queryRightRoot;
        this.treeLeftRoot = treeLeftRoot;
        this.treeRightRoot = treeRightRoot;
        nodeMap.put(queryLeftRoot, queryRightRoot);
        nodeMap.put(treeLeftRoot, treeRightRoot);
        usedValueNodes.add(treeRightRoot);
        this.nodeUtil = nodeUtil;
    }

    /**
     * Checks if k could be mapped to v, and if so, returns a
     * copy of the current node map with this additional mapping.
     *
     * @param k Node from the query.
     * @param v Node from the tree to match against the query.
     */
    public NodeMap checkAndUpdate(ParseTree k, ParseTree v) {
        if (nodeMap.containsKey(k) || usedValueNodes.contains(v)) {
            return null;
        }

        NodeUtil.Kind kind = nodeUtil.getKind(k);
        assert (kind != NodeUtil.Kind.WILDCARD); // wildcards shouldn't be among the nodes to match
        if (kind == NodeUtil.Kind.NORMAL) {
            if (nodeUtil.isMatchingNormalNode(k, v)) {
                return updatedCopy(k, v);
            }
        } else if (kind == NodeUtil.Kind.UNNAMED_PLACEHOLDER) {
            if (nodeUtil.isMatchingPlaceholder(k, v)) {
                return updatedCopy(k, v);
            }
        } else if (kind == NodeUtil.Kind.NAMED_PLACEHOLDER) {
            String placeholder = nodeUtil.namedPlaceholderToString(k);
            String boundSubtree = namedPlaceholders.get(placeholder);
            String currentSubtree = nodeUtil.querySubtreeToString(v);
            if (boundSubtree == null) {
                // first time we see this placeholder, bind to the subtree
                if(nodeUtil.isMatchingPlaceholder(k, v)){
                    namedPlaceholders.put(placeholder, currentSubtree);
                    return updatedCopy(k, v);
                } else{
                    return null;
                }
            } else {
                // we've seen this placeholder before; make sure it is consistently bound
                if (boundSubtree.contains(currentSubtree)) { // TODO ?
                    return updatedCopy(k, v);
                } else {
                    return null;
                }
            }
        } else if (kind == NodeUtil.Kind.EMPTY) {
            if (nodeUtil.isMatchingEmpty(k, v)) {
                return updatedCopy(k, v);
            }
        }
        return null;
    }

    private NodeMap updatedCopy(ParseTree k, ParseTree v) {
        NodeMap other = new NodeMap(queryLeftRoot, queryRightRoot, treeLeftRoot, treeRightRoot, nodeUtil);
        other.nodeMap.put(k, v);
        other.nodeMap.putAll(nodeMap);
        other.usedValueNodes.add(v);
        other.usedValueNodes.addAll(usedValueNodes);
        other.namedPlaceholders.putAll(namedPlaceholders);
        return other;
    }

    public ParseTree nextUnmatchedNode(List<ParseTree> nodesToMatch) {
        for (ParseTree n : nodesToMatch) {
            String test = n.getText();
            if (!nodeMap.containsKey(n))
                return n;
        }
        return null;
    }

    public int indexOfLastMatchedChild(ParseTree treeParent) {
        int maxIdx = 0;
        for (int i = 0; i < treeParent.getChildCount(); i++) {
            if (usedValueNodes.contains(treeParent.getChild(i))) {
                maxIdx = Math.max(maxIdx, i);
            }
        }
        return maxIdx;
    }

    public ParseTree get(ParseTree k) {
        return nodeMap.get(k);
    }

    @Override
    public String toString() {
        String s = "NodeMap with mapping:\n";
        for (Map.Entry<ParseTree, ParseTree> entry : nodeMap.entrySet()) {
            s += "      " + nodeUtil.querySubtreeToString(entry.getKey()) + "\n";
            s += "     to\n";
            s += "      " + nodeUtil.changeSubtreeToString(entry.getValue()) + "\n";
            s += "---\n";
        }
        return s;
    }

}