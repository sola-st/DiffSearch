package research.diffsearch.tree;

import org.antlr.v4.runtime.misc.Utils;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.Tree;
import org.antlr.v4.runtime.tree.Trees;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class SerializableTreeNode implements Serializable, Tree {
    private final String nodeLabel;
    private final String completeNodeText;

    private final List<SerializableTreeNode> children = new ArrayList<>();
    private transient SerializableTreeNode parent;

    public SerializableTreeNode(String nodeLabel, String completeNodeText) {
        this.nodeLabel = nodeLabel;
        this.completeNodeText = completeNodeText;
    }

    /**
     * @return the content of the node, i.e. the variable names and terminals.
     */
    public String getNodeLabel() {
        return nodeLabel;
    }

    /**
     * @return all children of this node.
     */
    public List<SerializableTreeNode> getChildren() {
        return children;
    }

    @Override
    public Tree getChild(int i) {
        return getChildren().get(i);
    }

    /**
     * @return the parent of this node. This is null for the root node.
     * @see #isRoot()
     */
    public SerializableTreeNode getParent() {
        return parent;
    }

    /**
     * @return true, if this node is the root node of the parent.
     */
    public boolean isRoot() {
        return parent == null;
    }

    @Override
    public int getChildCount() {
        return children.size();
    }

    /**
     * @return true, if and only if this node has no children.
     */
    public boolean isLeaf() {
        return children.isEmpty();
    }

    /**
     * Adds a child to this node at the end of the list of children.
     *
     * @param child the node to add as child. Do not use any ancestor of this node here as this
     *              will create infinite loops while exploring the graph.
     */
    public void addChild(SerializableTreeNode child) {
        child.parent = this;

        this.children.add(child);
    }

    public String toTreeString() {
        var result = new StringBuilder()
                .append(nodeLabel);

        children.forEach(child -> result.append("\n").append(child.toTreeString()));

        return result.toString();
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", SerializableTreeNode.class.getSimpleName() + "[", "]")
                .add("nodeLabel='" + nodeLabel + "'")
                .add("children=" + children
                        .stream()
                        .map(SerializableTreeNode::getNodeLabel)
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

        SerializableTreeNode that = (SerializableTreeNode) o;

        return new EqualsBuilder()
                .append(nodeLabel, that.nodeLabel)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(nodeLabel)
                .append(children)
                .toHashCode();
    }

    public String getCompleteNodeText() {
        return completeNodeText;
    }

    @Override
    public Object getPayload() {
        return nodeLabel;
    }

    @Override
    public String toStringTree() {
        String label = Utils.escapeWhitespace(nodeLabel, false);
        if (getChildCount() == 0) {
            return label;
        } else {
            StringBuilder buf = new StringBuilder();
            buf.append("(");
            buf.append(label);
            buf.append(' ');

            for (int i = 0; i < getChildCount(); ++i) {
                if (i > 0) {
                    buf.append(' ');
                }

                buf.append(getChild(i).toStringTree());
            }

            buf.append(")");
            return buf.toString();
        }
    }

    public static SerializableTreeNode fromTree(ParseTree parseTree, List<String> ruleNames) {
        var content = Trees.getNodeText(parseTree, ruleNames);

        var root = new SerializableTreeNode(content, parseTree.getText());

        for (var i = 0; i < parseTree.getChildCount(); i++) {
            root.addChild(fromTree(parseTree.getChild(i), ruleNames));
        }

        return root;
    }

}
