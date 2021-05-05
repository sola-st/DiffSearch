package research.diffsearch.pipeline.feature.changedistilling;

import research.diffsearch.tree.ParseTreeNode;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Paul Bredl
 */
public class MatchList {

    private final Map<Integer, Match> matchMap = new HashMap<>();

    public Collection<Match> getMatches() {
        return matchMap.values();
    }

    public void addMatch(ParseTreeNode oldNode, ParseTreeNode newNode, double similarity) {
        var match = new Match(oldNode, newNode, similarity);

        matchMap.put(oldNode.getId(), match);
    }

    public void addMatch(Match match) {
        matchMap.put(match.getOldNode().getId(), match);
    }

    public Match getMatchFor(ParseTreeNode node) {
        return matchMap.get(node.getId());
    }

    public Match getMatchForNewNode(ParseTreeNode node) {
        return matchMap.values().stream()
                .filter(match -> match.getNewNode() == node)
                .findAny()
                .orElse(null);
    }

    public boolean hasMatchFor(ParseTreeNode node) {
        var hasKey = matchMap.containsKey(node.getId());
        if (!hasKey) {
            return matchMap.values().stream()
                    .map(Match::getNewNode)
                    .map(ParseTreeNode::getId)
                    .anyMatch(id -> node.getId() == id);
        }
        return true;
    }

    public boolean hasMatch(Match match) {
        return hasMatch(match.getOldNode(), match.getNewNode());
    }

    public boolean hasMatch(ParseTreeNode a, ParseTreeNode b) {
        var foundMatch = getMatchFor(a);
        if (foundMatch == null) {
            return false;
        } else {
            return foundMatch.getNewNode() == b;
        }
    }
}
