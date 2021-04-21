package research.diffsearch.pipeline.feature.extractor;

import org.antlr.v4.runtime.tree.Tree;
import org.antlr.v4.runtime.tree.Trees;
import research.diffsearch.Config;
import research.diffsearch.pipeline.feature.FeatureVector;
import research.diffsearch.util.ProgrammingLanguage;
import research.diffsearch.util.Util;

/**
 * This feature extractor extracts a feature for each node in the parse tree.
 */
public class NodeExtractor extends AbstractRecursiveFeatureExtractor {
    public NodeExtractor(ProgrammingLanguage language, int featureVectorLength) {
        super(language, featureVectorLength);
    }

    @Override
    public void extractFeaturesRecursive(Tree t, FeatureVector.Section section, boolean isQuery) {
        var nodeText = Trees.getNodeText(t, getProgrammingLanguage().getRuleNames());

        if (shouldExtractFeature(nodeText, isQuery)) {
            section.addFeature(nodeText);
        }

        for (int i = 0; i < t.getChildCount(); i++) {
            extractFeaturesRecursive(t.getChild(i), section, isQuery);
        }
    }

    private static boolean shouldExtractFeature(String nodeText, boolean isQuery) {
        return (!isQuery
                || Config.EXTRACT_QUERY_KEYWORDS
                || !Util.isQueryKeyword(nodeText));
    }
}
