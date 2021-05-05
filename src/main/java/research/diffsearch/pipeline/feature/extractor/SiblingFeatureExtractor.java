package research.diffsearch.pipeline.feature.extractor;

import org.antlr.v4.runtime.tree.Tree;
import org.antlr.v4.runtime.tree.Trees;
import research.diffsearch.Config;
import research.diffsearch.pipeline.feature.FeatureVector;
import research.diffsearch.util.ProgrammingLanguage;

import static research.diffsearch.util.Util.isQueryPlaceholder;

/**
 * This feature extractor extracts pairs of sibling from the parse tree.
 *
 * @author Paul Bredl
 */
public class SiblingFeatureExtractor extends AbstractRecursiveFeatureExtractor {

    public SiblingFeatureExtractor(ProgrammingLanguage language, int featureVectorLength) {
        super(language, featureVectorLength);
    }

    @Override
    public void extractFeaturesRecursive(Tree t, FeatureVector.Section section, boolean isQuery) {
        var ruleNames = getProgrammingLanguage().getRuleNames();
        for (int i = 0; i < t.getChildCount() - 1; i++) {
            for (int j = i + 1; j < t.getChildCount(); j++) {
                var child = t.getChild(i);
                var child2 = t.getChild(j);
                var childNodeText = Trees.getNodeText(child, ruleNames);
                var child2NodeText = Trees.getNodeText(child2, ruleNames);

                if (shouldExtractFeature(childNodeText, child2NodeText, isQuery)) {
                    section.addFeature(childNodeText + ' ' + child2NodeText);
                }
            }
        }

        for (int i = 0; i < t.getChildCount(); i++) {
            extractFeaturesRecursive(t.getChild(i), section, isQuery);
        }
    }

    private static boolean shouldExtractFeature(String nodeText1, String nodeText2, boolean isQuery) {
        return (!isQuery
                || Config.EXTRACT_QUERY_KEYWORDS
                || (!isQueryPlaceholder(nodeText1)
                    && !isQueryPlaceholder(nodeText2)));
    }
}
