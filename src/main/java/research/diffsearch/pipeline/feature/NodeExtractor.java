package research.diffsearch.pipeline.feature;

import org.antlr.v4.runtime.tree.Tree;
import org.antlr.v4.runtime.tree.Trees;
import research.diffsearch.Config;
import research.diffsearch.util.ProgrammingLanguage;
import research.diffsearch.util.Util;

import java.util.List;

public class NodeExtractor extends AbstractRecursiveFeatureExtractor {
    public NodeExtractor(ProgrammingLanguage language, int featureVectorLength) {
        super(language, featureVectorLength);
    }

    @Override
    public void extractFeaturesRecursive(Tree t, FeatureVector.Section section,
                                         List<String> ruleNames, boolean isQuery) {
        var nodeText = Trees.getNodeText(t, ruleNames);

        if (shouldExtractFeature(nodeText, isQuery)) {
            section.addFeature(nodeText);
        }

        for (int i = 0; i < t.getChildCount(); i++) {
            extractFeaturesRecursive(t.getChild(i), section, ruleNames, isQuery);
        }
    }

    private static boolean shouldExtractFeature(String nodeText, boolean isQuery) {
        return (!isQuery
                || Config.EXTRACT_QUERY_KEYWORDS
                || !Util.isQueryKeyword(nodeText));
               /*&& !isBlacklisted(nodeText);*/
    }
}
