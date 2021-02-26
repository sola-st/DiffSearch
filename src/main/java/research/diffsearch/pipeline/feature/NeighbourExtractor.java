package research.diffsearch.pipeline.feature;

import org.antlr.v4.runtime.tree.Tree;
import org.antlr.v4.runtime.tree.Trees;
import research.diffsearch.Config;
import research.diffsearch.util.ProgrammingLanguage;
import research.diffsearch.util.QueryUtil;

import java.util.List;

public class NeighbourExtractor extends AbstractRecursiveFeatureExtractor {

    public NeighbourExtractor(ProgrammingLanguage language, int featureVectorLength, boolean isQuery) {
        super(language, featureVectorLength, isQuery);
    }

    @Override
    public void extractFeaturesRecursive(Tree t, FeatureVector completeFeatureVector,
                                         int startPosition, List<String> ruleNames, int depth) {
        for (int i = 0; i < t.getChildCount() - 1; i++) {
            for (int j = i + 1; j < t.getChildCount(); j++) {
                var child = t.getChild(i);
                var child2 = t.getChild(j);
                var childNodeText = Trees.getNodeText(child, ruleNames);
                var child2NodeText = Trees.getNodeText(child2, ruleNames);

                if (!isQuery()
                    || Config.EXTRACT_QUERY_KEYWORDS
                    || !QueryUtil.isQueryKeyword(childNodeText)
                    || !QueryUtil.isQueryKeyword(child2NodeText)) {

                    var feature = Trees.getNodeText(child, ruleNames) + ' ' +
                                  Trees.getNodeText(child2, ruleNames);

                    int index = getFeatureVectorIndex(startPosition, feature.hashCode(),
                            getFeatureVectorLength());

                    completeFeatureVector.addFeature("Neighbour", feature, index);
                }
            }
        }

        for (int i = 0; i < t.getChildCount(); i++) {
            extractFeaturesRecursive(t.getChild(i), completeFeatureVector, startPosition, ruleNames, depth + 1);
        }
    }
}
