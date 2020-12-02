package research.diffsearch.pipeline.feature;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.Tree;
import org.antlr.v4.runtime.tree.Trees;
import research.diffsearch.tree.TreeObjectUtils;
import research.diffsearch.util.ProgrammingLanguage;

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
        StringBuilder sum = new StringBuilder();
        sum.append(Trees.getNodeText(t, ruleNames));

        int i;
        for (i = 0; i < t.getChildCount(); i++) {
            sum.append(Trees.getNodeText(t.getChild(i), ruleNames));
        }

        if (i > 0) {
            int index = getFeatureVectorIndex(startPosition, sum.toString().hashCode(),
                    getFeatureVectorLength());
            completeFeatureVector[index]++;
        }

        for (i = 0; i < t.getChildCount(); i++) {
            if (Trees.getNodeText(t.getChild(i), ruleNames).contains("literal")) {
                continue;
            }

            extractFeaturesRecursive(t.getChild(i), completeFeatureVector, startPosition, ruleNames);
        }
    }
}
