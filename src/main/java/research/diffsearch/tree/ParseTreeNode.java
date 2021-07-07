package research.diffsearch.tree;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.Trees;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringJoiner;
import java.util.function.Consumer;
import java.util.stream.Collectors;

/**
 * This class represents an extended version of a parse tree with additional meta
 * information.
 *
 * @author Paul Bredl
 */
public class ParseTreeNode {

    private final String nodeLabel;
    private int position;
    private int depth;
    private int id;
    private boolean matched = false;

    private final List<ParseTreeNode> children = new ArrayList<>();
    private ParseTreeNode parent;

    public ParseTreeNode(String nodeLabel, int position, int depth, int id, ParseTreeNode parent) {
        this.nodeLabel = nodeLabel;
        this.position = position;
        this.depth = depth;
        this.id = id;
        this.parent = parent;
    }

    public ParseTreeNode(String nodeLabel, int position, int depth, int id) {
        this(nodeLabel, position, depth, id, null);
    }

    public ParseTreeNode(String nodeLabel, int id) {
        this(nodeLabel, 0, 0, id, null);
    }

    /**
     * @return the content of the node, i.e. the variable names and terminals.
     */
    public String getNodeLabel() {
        return nodeLabel;
    }

    /**
     * @return the position of this node in the list of children of its parent node, i.e.
     * returns 0 if its the first child, 1 if its the seconds child, ... of its parent.
     */
    public int getPosition() {
        return position;
    }

    /**
     * @return the depth of the node. This is 0 for the root node.
     */
    public int getDepth() {
        return depth;
    }

    /**
     * @return the identifier of the node.
     */
    public int getId() {
        return id;
    }

    /**
     * This is used for the edit script generation and serves no other purpose.
     *
     * @return true, if the node is matched with another node in another tree.
     */
    public boolean isMatched() {
        return matched;
    }

    /**
     * @return all children of this node.
     */
    public List<ParseTreeNode> getChildren() {
        return children;
    }

    /**
     * @return the parent of this node. This is null for the root node.
     * @see #isRoot()
     */
    public ParseTreeNode getParent() {
        return parent;
    }

    /**
     * @return true, if this node is the root node of the parent.
     */
    public boolean isRoot() {
        return parent == null;
    }

    public int getNumberOfChildren() {
        return children.size();
    }

    /**
     * @return true, if and only if this node has no children.
     */
    public boolean isLeaf() {
        return children.isEmpty();
    }

    /**
     * @return all leave nodes that are descendants of this node.
     */
    public List<ParseTreeNode> getLeaves() {
        if (isLeaf()) {
            return Collections.emptyList();
        }
        var result = new ArrayList<ParseTreeNode>();
        for (var child : children) {
            if (child.isLeaf()) {
                result.add(child);
            } else {
                result.addAll(child.getLeaves());
            }
        }
        return result;
    }

    /**
     * @see #isMatched()
     */
    public void setMatched(boolean matched) {
        this.matched = matched;
    }

    public void setId(int id) {
        this.id = id;
    }
    /**
     * Adds a child to this node at the end of the list of children. This will set the
     * position and parent field of the given node. This will not set the depth.
     *
     * @param child the node to add as child. Do not use any ancestor of this node here as this
     *              will create infinite loops while exploring the graph.
     */
    public void addChild(ParseTreeNode child) {
        child.parent = this;
        child.position = getNumberOfChildren();

        this.children.add(child);
    }

    public String toTreeString() {
        var result = new StringBuilder()
                .append("    ".repeat(depth))
                .append(position)
                .append(": ")
                .append(nodeLabel);

        children.forEach(child -> result.append("\n").append(child.toTreeString()));

        return result.toString();
    }

    /**
     * Iterates through the tree post order.
     *
     * @param consumer gets called on each node.
     */
    public void forEachPostOrder(Consumer<ParseTreeNode> consumer) {
        for (var child : getChildren()) {
            child.forEachPostOrder(consumer);
        }
        consumer.accept(this);
    }

    public void forEachPreOrder(Consumer<ParseTreeNode> consumer) {
        consumer.accept(this);
        for (var child : getChildren()) {
            child.forEachPreOrder(consumer);
        }
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", ParseTreeNode.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("nodeLabel='" + nodeLabel + "'")
                .add("depth=" + depth)
                .add("position=" + position)
                .add("matched=" + matched)
                .add("children=" + children
                        .stream()
                        .map(ParseTreeNode::getNodeLabel)
                        .collect(Collectors.joining()))
                .add("parent=" + (parent == null ? null : parent.getNodeLabel()))
                .toString();
    }

    // note: no deep comparison
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ParseTreeNode that = (ParseTreeNode) o;

        return new EqualsBuilder()
                .append(position, that.position)
                .append(depth, that.depth)
                .append(id, that.id)
                .append(nodeLabel, that.nodeLabel)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(nodeLabel)
                .append(position)
                .append(depth)
                .append(id)
                .toHashCode();
    }

    public static Pair<ParseTreeNode, ParseTreeNode> fromTree(ParseTree parseTree, List<String> ruleNames) {
        if (parseTree.getChildCount() == 3) {
            var result = new ImmutablePair<>(fromTree(parseTree.getChild(0), ruleNames, 0),
                    fromTree(parseTree.getChild(2), ruleNames,  0));

            // set ids
            final int[] id = {0};
            result.getLeft().forEachPostOrder(node -> {
                node.id = id[0];
                id[0]++;
            });
            result.getRight().forEachPostOrder(node -> {
                node.id = id[0];
                id[0]++;
            });
            return result;
        }
        throw new IllegalArgumentException();
    }

    public static ParseTreeNode fromTree(ParseTree parseTree, List<String> ruleNames, int depth) {
        var content = Trees.getNodeText(parseTree, ruleNames);

        var root = new ParseTreeNode(content, 0, depth, 0);

        for (var i = 0; i < parseTree.getChildCount(); i++) {
            root.addChild(fromTree(parseTree.getChild(i),  ruleNames, depth + 1));
        }

        return root;
    }


}
