package research.diffsearch.pipeline.feature.changedistilling;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import research.diffsearch.tree.ExtendedParseTree;

public class Match {

    private final ExtendedParseTree oldNode, newNode;

    public Match(ExtendedParseTree oldNode, ExtendedParseTree newNode) {
        this.oldNode = oldNode;
        this.newNode = newNode;
    }

    public ExtendedParseTree getOldNode() {
        return oldNode;
    }

    public ExtendedParseTree getNewNode() {
        return newNode;
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
        return new HashCodeBuilder(17, 37).append(oldNode).append(newNode).toHashCode();
    }


}
