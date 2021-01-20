package research.diffsearch.tree;

import org.antlr.v4.runtime.tree.ParseTree;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

/**
 * This class represents an extended version of a parse tree with additional meta
 * information.
 */
public class ExtendedParseTree {

    private final String nodeLabel;
    private int position;
    private int depth;
    private final int id;
    private boolean matched = false;

    private final List<ExtendedParseTree> children = new ArrayList<>();
    private ExtendedParseTree parent;

    public ExtendedParseTree(String nodeLabel, int position, int depth, int id, ExtendedParseTree parent) {
        this.nodeLabel = nodeLabel;
        this.position = position;
        this.depth = depth;
        this.id = id;
        this.parent = parent;
    }

    public ExtendedParseTree(String nodeLabel, int position, int depth, int id) {
        this(nodeLabel, position, depth, id, null);
    }

    public ExtendedParseTree(String nodeLabel, int id) {
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
    public List<ExtendedParseTree> getChildren() {
        return children;
    }

    /**
     * @return the parent of this node. This is null for the root node.
     * @see #isRoot()
     */
    public ExtendedParseTree getParent() {
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

    public boolean hasChildren() {
        return !children.isEmpty();
    }

    /**
     * @see #isMatched()
     */
    public void setMatched(boolean matched) {
        this.matched = matched;
    }

    /**
     * Adds a child to this node at the end of the list of children. This will set the
     * position, depth and parent field of the given node.
     *
     * @param child the node to add as child. Do not use any ancestor of this node here as this
     *              will create infinite loops while exploring the graph.
     */
    public void addChild(ExtendedParseTree child) {
        child.parent = this;
        child.position = getNumberOfChildren();
        child.depth = depth + 1;

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

    @Override
    public String toString() {
        return new StringJoiner(", ", ExtendedParseTree.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("nodeLabel='" + nodeLabel + "'")
                .add("depth=" + depth)
                .add("position=" + position)
                .add("matched=" + matched)
                .add("children=" + children
                        .stream()
                        .map(ExtendedParseTree::getNodeLabel)
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

        ExtendedParseTree that = (ExtendedParseTree) o;

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

    public static ExtendedParseTree fromParseTree(ParseTree parseTree) {
        return fromParseTree(parseTree, 0);
    }

    public static ExtendedParseTree fromParseTree(ParseTree parseTree, int idToStart) {
        var root = new ExtendedParseTree(parseTree.getText(), idToStart);
        for (var i = 0; i < parseTree.getChildCount(); i++) {
            root.addChild(fromParseTree(parseTree.getChild(i), idToStart + 1));
        }
        return root;
    }
}
