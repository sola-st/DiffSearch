package research.diffsearch.pipeline.feature;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.Tree;
import org.antlr.v4.runtime.tree.Trees;
import research.diffsearch.util.ProgrammingLanguage;
import research.diffsearch.util.TreeObjectUtils;

import java.util.Arrays;
import java.util.List;

public class TriangleFeatureExtractor extends AbstractFeatureExtractor {
    public TriangleFeatureExtractor(ProgrammingLanguage language, int featureVectorLength) {
        super(language, featureVectorLength);
    }

    @Override
    public int[] extractFeatures(String codeChange, int[] completeFeatureVector, int startPosition) {
        Object queryTree = TreeObjectUtils.getChangeTree(codeChange, getProgrammingLanguage());
        String[] ruleNames = TreeObjectUtils.getParser(queryTree, getProgrammingLanguage()).getRuleNames();
        ParseTree parseTree = TreeObjectUtils.getParseTree(queryTree, getProgrammingLanguage());

        extractFeaturesRecursive(parseTree, completeFeatureVector, startPosition, Arrays.asList(ruleNames));
        return completeFeatureVector;
    }

    public void extractFeaturesRecursive(Tree t, int[] completeFeatureVector,
                                         int startPosition, List<String> ruleNames) {
        int sum = 0;
        sum += Trees.getNodeText(t, ruleNames).hashCode();

        int i;
        for (i = 0; i < t.getChildCount(); i++) {
            sum += Trees.getNodeText(t.getChild(i), ruleNames).hashCode();
        }

        // TODO change hash function

        if (i > t.getChildCount()) {
            completeFeatureVector[Math.abs(sum / 2097152)] = 1;
        }

        for (i = 0; i < t.getChildCount(); i++) {
            if (Trees.getNodeText(t.getChild(i), ruleNames).contains("literal")) {
                continue;
            }

            extractFeaturesRecursive(t.getChild(i), completeFeatureVector, startPosition, ruleNames);
        }
    }
}
