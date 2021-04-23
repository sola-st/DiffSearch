package research.diffsearch.pipeline.feature.extractor;

import org.antlr.v4.runtime.tree.Tree;
import org.antlr.v4.runtime.tree.Trees;
import research.diffsearch.Config;
import research.diffsearch.pipeline.feature.FeatureVector;
import research.diffsearch.util.ProgrammingLanguage;

import static research.diffsearch.util.Util.isQueryKeyword;

/**
 * Feature extractor for parent child features.
 */
public class ParentChildFeatureExtractor extends AbstractRecursiveFeatureExtractor {

    public ParentChildFeatureExtractor(ProgrammingLanguage language, int featureVectorLength) {
        super(language, featureVectorLength);
    }

    @Override
    public void extractFeaturesRecursive(Tree t, FeatureVector.Section section, boolean isQuery) {
        var ruleNames = getProgrammingLanguage().getRuleNames();
        String parentChildText = Trees.getNodeText(t, ruleNames);

        if (!parentChildText.equals("querySnippet")) {
            for (int i = 0; i < t.getChildCount(); i++) {
                var child = t.getChild(i);
                var childNodeText = Trees.getNodeText(child, ruleNames);
                if (shouldExtractFeature(parentChildText, childNodeText, isQuery)) {
                    var feature = parentChildText + ' ' + childNodeText;

                    section.addFeature(feature);
                }
            }
        }

        for (int i = 0; i < t.getChildCount(); i++) {
            extractFeaturesRecursive(t.getChild(i), section, isQuery);
        }
    }

    private static boolean shouldExtractFeature(String parentChildText, String childNodeText, boolean isQuery) {
        return (!isQuery
                || Config.EXTRACT_QUERY_KEYWORDS
                || !isQueryKeyword(childNodeText)
               )
               && isNotBlacklisted(parentChildText)
               && isNotBlacklisted(childNodeText);
    }
}
