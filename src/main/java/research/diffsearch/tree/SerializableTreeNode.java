package research.diffsearch.tree;

import com.google.gson.annotations.SerializedName;
import org.antlr.v4.runtime.misc.Utils;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.Tree;
import org.antlr.v4.runtime.tree.Trees;
import research.diffsearch.Config;
import research.diffsearch.util.ProgrammingLanguage;
import research.diffsearch.util.ProgrammingLanguageDependent;

import java.io.Serializable;
import java.util.*;
import java.util.stream.Collectors;

public class SerializableTreeNode implements Serializable, Tree, ProgrammingLanguageDependent {
    @SerializedName("l")
    private String nodeLabel;
    @SerializedName("r")
    private final Integer ruleIndex;
    private transient ProgrammingLanguage language;
    @SerializedName("c")
    private List<SerializableTreeNode> children = new ArrayList<>();
    private transient SerializableTreeNode parent;

    public SerializableTreeNode(String nodeLabel, ProgrammingLanguage language) {
        this.nodeLabel = nodeLabel;
        this.ruleIndex = null;
        this.language = language;
    }

    public SerializableTreeNode(Integer ruleIndex, ProgrammingLanguage language) {
        this.nodeLabel = null;
        this.ruleIndex = ruleIndex;
        this.language = language;
    }

    /**
     * @return the content of the node, i.e. the variable names and terminals.
     */
    public String getNodeLabel() {
        if (nodeLabel == null) {
            if (ruleIndex != null) {
                return getProgrammingLanguage().getRuleNames().get(this.ruleIndex);
            }
            return null;
        }
        return nodeLabel;
    }

    /**
     * @return all children of this node.
     */
    public List<SerializableTreeNode> getChildren() {
        if (children == null) {
            return Collections.emptyList();
        }
        return children;
    }

    public SerializableTreeNode setNodeLabel(String nodeLabel) {
        this.nodeLabel = nodeLabel;
        return this;
    }

    @Override
    public SerializableTreeNode getChild(int i) {
        return getChildren().get(i);
    }

    public SerializableTreeNode setChildren(List<SerializableTreeNode> children) {
        this.children = children;
        return this;
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
                .append(getNodeLabel());

        children.forEach(child -> result.append("\n").append(child.toTreeString()));

        return result.toString();
    }

    public void setConsistentParentChildRelations() {
        for (var child : getChildren()) {
            child.parent = this;
            child.setConsistentParentChildRelations();
        }
    }

    public void clear() {
        this.children = null;
        this.parent = null;
    }

    @Override
    public ProgrammingLanguage getProgrammingLanguage() {
        if (language != null) {
            return language;
        }
        return Config.PROGRAMMING_LANGUAGE;
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

    public String getCompleteNodeText(List<String> ruleNames) {
        if (this.getChildCount() == 0) {
            return Objects.requireNonNullElse(nodeLabel, "");
        } else {
            StringBuilder builder = new StringBuilder();

            for(int i = 0; i < this.getChildCount(); ++i) {
                builder.append(this.getChild(i).getCompleteNodeText(ruleNames).trim()).append(" ");
            }

            return builder.toString();
        }
    }


    @Override
    public Object getPayload() {
        return getNodeLabel();
    }

    @Override
    public String toStringTree() {
        String label = Utils.escapeWhitespace(getNodeLabel(), false);
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

    public static SerializableTreeNode fromTree(ParseTree parseTree, ProgrammingLanguage language) {
        var ruleNames = language.getRuleNames();
        var content = Trees.getNodeText(parseTree, ruleNames);
        var index = ruleNames.indexOf(content);

        SerializableTreeNode root;
        if (index >= 0) {
            root = new SerializableTreeNode(index, language);
        } else {
            root = new SerializableTreeNode(content, language);
        }


        for (var i = 0; i < parseTree.getChildCount(); i++) {
            root.addChild(fromTree(parseTree.getChild(i), language));
        }

        return root;
    }

}
