package research.diffsearch.pipeline.feature.changedistilling;

import research.diffsearch.tree.ParseTreeNode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class ParseTreeMatcher {

    private double stringSimilarityThreshold = 0.6;
    private double commonNodesThreshold = 0.25;
    private double commonNodesNoStringSimilarityThreshold = 0.7;
    private double commonNodesSmallSubtreeThreshold = 0.1;

    private MatchList matches = new MatchList();
    private final ParseTreeNode oldCodeRoot;
    private final ParseTreeNode newCodeRoot;

    public ParseTreeMatcher(ParseTreeNode oldCodeRoot, ParseTreeNode newCodeRoot) {
        this.oldCodeRoot = oldCodeRoot;
        this.newCodeRoot = newCodeRoot;
    }

    public MatchList calculateMatches() {
        matches = new MatchList();

        leavesMatching();

        innerNodeMatching();

        // root should always be matched
        if (!matches.hasMatch(oldCodeRoot, newCodeRoot)) {
            addMatch(new Match(oldCodeRoot, newCodeRoot, 1.0));
        }

        return matches;
    }

    private void leavesMatching() {
        var tempMatches = new ArrayList<Match>();

        // leaf matching
        for (var oldLeave : oldCodeRoot.getLeaves()) {
            for (var newLeave : newCodeRoot.getLeaves()) {
                var match = matchLeaves(oldLeave, newLeave);

                if (match.getSimilarity() >= stringSimilarityThreshold) {
                    tempMatches.add(match);
                }
            }
        }

        // find best matches

        // sort by similarity descending
        tempMatches.stream()
                .sorted(Comparator
                        .comparingDouble(Match::getSimilarity)
                        .reversed()
                        .thenComparingInt(m ->
                                Math.abs(m.getNewNode().getPosition() - m.getOldNode().getPosition())))
                .forEachOrdered(match -> {
                    // add match with best similarity
                    if (!match.getOldNode().isMatched() &&
                        !match.getNewNode().isMatched() &&
                        !matches.hasMatch(match)) {

                        addMatch(match);
                    }
                });
    }

    private void innerNodeMatching() {
        oldCodeRoot.forEachPostOrder(oldTreeNode -> {
            newCodeRoot.forEachPostOrder(newTreeNode -> {

                if (!oldTreeNode.isMatched() && !newTreeNode.isMatched()) {
                    Match innerNodeMatch = new Match(oldTreeNode, newTreeNode,
                            getCommonScore(oldTreeNode, newTreeNode));

                    var stringSimilarity = calculateStringSimilarity(oldTreeNode.getNodeLabel(),
                            newTreeNode.getNodeLabel());

                    if (stringSimilarity >= stringSimilarityThreshold) {
                        if (innerNodeMatch.getSimilarity() >= commonNodesThreshold) {
                            addMatch(innerNodeMatch);
                        } else {
                            // smaller threshold for nodes with small subtrees
                            var leavesCount = Math.min(oldTreeNode.getLeaves().size(),
                                    newTreeNode.getLeaves().size());

                            if (leavesCount <= 4
                                && innerNodeMatch.getSimilarity() >= commonNodesSmallSubtreeThreshold) {
                                addMatch(innerNodeMatch);
                            }
                        }
                    } else {
                        if (innerNodeMatch.getSimilarity() >= commonNodesNoStringSimilarityThreshold) {
                            addMatch(innerNodeMatch);
                        }
                    }
                }
            });
        });
    }

    private void addMatch(Match match) {
        matches.addMatch(match);
        match.getOldNode().setMatched(true);
        match.getNewNode().setMatched(true);
    }

    private static Match matchLeaves(ParseTreeNode oldCodeNode, ParseTreeNode newCodeNode) {
        // leaf similarity
        if (oldCodeNode.isLeaf() && newCodeNode.isLeaf()) {

            var similarity = calculateStringSimilarity(oldCodeNode.getNodeLabel(),
                    newCodeNode.getNodeLabel());

            return new Match(oldCodeNode, newCodeNode, similarity);

        } else {
            throw new IllegalArgumentException();
        }
    }

    private double getCommonScore(ParseTreeNode a, ParseTreeNode b) {
        var leavesA = a.getLeaves();
        var leavesB = b.getLeaves();

        int commonCount = 0;
        for (var leafA : leavesA) {
            for (var leafB : leavesB) {
                if (matches.hasMatch(leafA, leafB)) {
                    commonCount++;
                }
            }
        }

        return 1.0 * commonCount / Math.max(leavesA.size(), leavesB.size());
    }

    private static double calculateStringSimilarity(String a, String b) {
        if (a.equals(b)) {
            return 2.0;
        }

        var biGramsA = calculateBiGrams(a);
        var biGramsB = calculateBiGrams(b);

        var biGramsIntersectionSize = biGramsA.stream()
                .filter(biGramsB::contains)
                .count();
        // union
        biGramsA.addAll(biGramsB);

        return (2.0 * biGramsIntersectionSize) / biGramsA.size();
    }

    private static Set<String> calculateBiGrams(String s) {
        var result = new HashSet<String>();

        for (int i = 0; i < s.length() - 1; i++) {
            result.add("" + s.charAt(i) + s.charAt(i + 1));
        }

        return result;
    }
}
