package research.diffsearch.pipeline.feature.changedistilling;

import research.diffsearch.tree.ParseTreeNode;

public class EditScriptOperation {

    private final Type type;
    private final ParseTreeNode oldNode;
    private final ParseTreeNode newNode;

    public EditScriptOperation(Type type, ParseTreeNode oldNode, ParseTreeNode newNode) {
        this.type = type;
        this.oldNode = oldNode;
        this.newNode = newNode;
    }

    public Type getType() {
        return type;
    }

    public ParseTreeNode getOldNode() {
        return oldNode;
    }

    public ParseTreeNode getNewNode() {
        return newNode;
    }

    public ParseTreeNode getOldParent() {
        if (oldNode != null) {
            return oldNode.getParent();
        } else {
            return null;
        }
    }

    public ParseTreeNode getNewParent() {
        if (newNode != null) {
            return newNode.getParent();
        } else {
            return null;
        }
    }

    @Override
    public String toString() {
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_PURPLE = "\u001B[35m";
        final String ANSI_CYAN = "\u001B[36m";
        final String ANSI_BLUE = "\u001B[34m";
        final String ANSI_YELLOW = "\u001b[33m";

        StringBuilder result = new StringBuilder();
        switch (type) {
            case MOVE: case ALIGN:
                result.append(ANSI_CYAN);
                break;
            case INSERT:
                result.append(ANSI_GREEN);
                break;
            case DELETE:
                result.append(ANSI_RED);
                break;
            case UPDATE:
                result.append(ANSI_PURPLE);
                break;
            case POTENTIAL_UPDATE:
                result.append(ANSI_YELLOW);
                break;
            default:
                result.append("\u001b[38;5;244m");

        }
        result.append(type.toString(), 0, 3)
                .append(" ")
                .append(getNodeLabel(getOldNode()))
                .append(" @")
                .append(getNodeLabel(getOldParent()))
                .append(" --> ")
                .append(getNodeLabel(getNewNode()))
                .append(" @")
                .append(getNodeLabel(getNewParent()))
                .append(ANSI_RESET);

        return result.toString();
    }

    private static String getNodeLabel(ParseTreeNode node) {
        if (node != null) {
            return node.getNodeLabel();
        } else {
            return "null";
        }
    }

    public enum Type {
        EQUAL,
        UPDATE,
        POTENTIAL_UPDATE,
        MOVE,
        ALIGN,
        INSERT,
        DELETE
    }
}
