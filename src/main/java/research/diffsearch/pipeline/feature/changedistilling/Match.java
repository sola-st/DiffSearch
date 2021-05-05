package research.diffsearch.pipeline.feature.changedistilling;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import research.diffsearch.tree.ParseTreeNode;

import java.util.StringJoiner;

/**
 * @author Paul Bredl
 */
public class Match {

    private final ParseTreeNode oldNode, newNode;
    private final double similarity;

    public Match(ParseTreeNode oldNode, ParseTreeNode newNode, double similarity) {
        this.oldNode = oldNode;
        this.newNode = newNode;
        this.similarity = similarity;
    }

    public ParseTreeNode getOldNode() {
        return oldNode;
    }

    public ParseTreeNode getNewNode() {
        return newNode;
    }

    public double getSimilarity() {
        return similarity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Match match = (Match) o;

        return new EqualsBuilder().append(oldNode, match.oldNode).append(newNode, match.newNode).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(oldNode)
                .append(newNode)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", "(", ")")
                .add(oldNode.getNodeLabel())
                .add(newNode.getNodeLabel())
                .add(Double.toString(similarity))
                .toString();
    }
}
