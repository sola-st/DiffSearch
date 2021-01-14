package research.diffsearch.pipeline.feature;

import org.antlr.v4.runtime.tree.Tree;
import org.antlr.v4.runtime.tree.Trees;
import research.diffsearch.util.ProgrammingLanguage;

import java.util.List;

/**
 * Feature extractor for parent child features.
 */
public class ParentChildFeatureExtractor extends AbstractRecursiveFeatureExtractor {

    public ParentChildFeatureExtractor(ProgrammingLanguage language, int featureVectorLength, boolean isQuery) {
        super(language, featureVectorLength, isQuery);
    }

    @Override
    public void extractFeaturesRecursive(Tree t, FeatureVector completeFeatureVector,
                                         int startPosition, List<String> ruleNames, int depth) {
        for (int i = 0; i < t.getChildCount(); i++) {
            var child = t.getChild(i);
            var childNodeText = Trees.getNodeText(child, ruleNames);
            if (!isQuery() || !isQueryKeyword(childNodeText)) {
                var feature = Trees.getNodeText(t, ruleNames) + ' ' +
                  Trees.getNodeText(t.getChild(i), ruleNames);

                int index = getFeatureVectorIndex(startPosition, feature.hashCode(),
                        getFeatureVectorLength());

                completeFeatureVector.addFeature("Parent-child", feature, index);
            }
        }

        for (int i = 0; i < t.getChildCount(); i++) {
            extractFeaturesRecursive(t.getChild(i), completeFeatureVector, startPosition, ruleNames, depth + 1);
        }
    }

}
