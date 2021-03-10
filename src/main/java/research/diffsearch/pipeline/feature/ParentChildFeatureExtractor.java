package research.diffsearch.pipeline.feature;

import org.antlr.v4.runtime.tree.Tree;
import org.antlr.v4.runtime.tree.Trees;
import research.diffsearch.Config;
import research.diffsearch.util.ProgrammingLanguage;

import java.util.List;

import static research.diffsearch.util.Util.isQueryKeyword;

/**
 * Feature extractor for parent child features.
 */
public class ParentChildFeatureExtractor extends AbstractRecursiveFeatureExtractor {

    public ParentChildFeatureExtractor(ProgrammingLanguage language, int featureVectorLength) {
        super(language, featureVectorLength);
    }

    @Override
    public void extractFeaturesRecursive(Tree t, FeatureVector.Section section,
                                         List<String> ruleNames, boolean isQuery) {
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
            extractFeaturesRecursive(t.getChild(i), section, ruleNames, isQuery);
        }
    }

    private static boolean shouldExtractFeature(String parentChildText, String childNodeText, boolean isQuery) {
        return (!isQuery
                || Config.EXTRACT_QUERY_KEYWORDS
                || !isQueryKeyword(childNodeText)
               )
               && !isBlacklisted(parentChildText)
               && !isBlacklisted(childNodeText);
    }
}
