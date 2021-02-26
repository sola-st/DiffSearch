package research.diffsearch.pipeline.feature;

import org.antlr.v4.runtime.tree.Tree;
import org.antlr.v4.runtime.tree.Trees;
import research.diffsearch.Config;
import research.diffsearch.util.ProgrammingLanguage;
import research.diffsearch.util.QueryUtil;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NodeExtractor extends AbstractRecursiveFeatureExtractor {
    public NodeExtractor(ProgrammingLanguage language, int featureVectorLength, boolean isQuery) {
        super(language, featureVectorLength, isQuery);
    }


    static final Set<String> allFeatures = new HashSet<>();
    @Override
    public void extractFeaturesRecursive(Tree t, FeatureVector completeFeatureVector,
                                         int startPosition, List<String> ruleNames, int depth) {
        var nodeText = Trees.getNodeText(t, ruleNames);
        if (!isQuery() || Config.EXTRACT_QUERY_KEYWORDS || !QueryUtil.isQueryKeyword(nodeText)) {
            int index = getFeatureVectorIndex(startPosition, nodeText.hashCode(),
                    getFeatureVectorLength());

            completeFeatureVector.addFeature("Node", nodeText, index);
            allFeatures.add(nodeText);
        }

        for (int i = 0; i < t.getChildCount(); i++) {
            extractFeaturesRecursive(t.getChild(i), completeFeatureVector, startPosition, ruleNames, depth + 1);
        }
    }
}
