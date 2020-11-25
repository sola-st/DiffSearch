package research.diffsearch.pipeline.feature;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.Tree;
import org.antlr.v4.runtime.tree.Trees;
import research.diffsearch.util.ProgrammingLanguage;
import research.diffsearch.util.TreeObjectUtils;

import java.util.Arrays;
import java.util.List;

public class ParentChildFeatureExtractor extends AbstractFeatureExtractor {
    public ParentChildFeatureExtractor(ProgrammingLanguage language, int featureVectorLength) {
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
        for (int i = 0; i < t.getChildCount(); i++) {
            // list_parent_child.add((Trees.getNodeText(t, ruleNames) + ' ' + Trees.getNodeText(t.getChild(i), ruleNames)).hashCode());
            completeFeatureVector[
                    Math.abs(startPosition + (Trees.getNodeText(t, ruleNames) + ' ' +
                                              Trees.getNodeText(t.getChild(i), ruleNames)).hashCode() / 2097152)] = 1;
        }

        for (int i = 0; i < t.getChildCount(); i++) {
            extractFeaturesRecursive(t.getChild(i), completeFeatureVector, startPosition, ruleNames);
        }
    }
}
