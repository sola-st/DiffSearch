package research.diffsearch.pipeline.feature;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.Tree;
import org.antlr.v4.runtime.tree.Trees;
import research.diffsearch.tree.TreeObjectUtils;
import research.diffsearch.util.ProgrammingLanguage;

import java.util.Arrays;
import java.util.List;

/**
 * Feature extractor for parent child features.
 */
public class ParentChildFeatureExtractor extends AbstractFeatureExtractor {
    public ParentChildFeatureExtractor(ProgrammingLanguage language, int featureVectorLength) {
        super(language, featureVectorLength);
    }

    @Override
    public int[] extractFeatures(String codeChange, int[] completeFeatureVector, int startPosition) {
        Object queryTree = TreeObjectUtils.getChangeTree(codeChange, getProgrammingLanguage());
        String[] ruleNames = TreeObjectUtils.getParser(queryTree, getProgrammingLanguage()).getRuleNames();
        ParseTree parseTree = TreeObjectUtils.getParseTree(queryTree, getProgrammingLanguage());

        extractFeaturesRecursive(parseTree, completeFeatureVector, startPosition, Arrays.asList(ruleNames), 0);
        return completeFeatureVector;
    }

    public void extractFeaturesRecursive(Tree t, int[] completeFeatureVector,
                                         int startPosition, List<String> ruleNames, int depth) {
        for (int i = 0; i < t.getChildCount(); i++) {
            int index = getFeatureVectorIndex(startPosition,
                    ((Trees.getNodeText(t, ruleNames) + ' ' +
                      Trees.getNodeText(t.getChild(i), ruleNames)).hashCode()),
                    getFeatureVectorLength());

            completeFeatureVector[index]++;
        }

        for (int i = 0; i < t.getChildCount(); i++) {
            extractFeaturesRecursive(t.getChild(i), completeFeatureVector, startPosition, ruleNames, depth + 1);
        }
    }
}
