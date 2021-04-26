package research.diffsearch.pipeline.feature.extractor;

import org.antlr.v4.runtime.tree.Tree;
import org.antlr.v4.runtime.tree.Trees;
import research.diffsearch.Config;
import research.diffsearch.pipeline.feature.FeatureVector.Section;
import research.diffsearch.util.ProgrammingLanguage;

import static research.diffsearch.util.Util.isQueryPlaceholder;

public class DescendentFeatureExtractor extends AbstractRecursiveFeatureExtractor {

    public DescendentFeatureExtractor(ProgrammingLanguage language, int featureVectorLength) {
        super(language, featureVectorLength);
    }

    @Override
    public void extractFeaturesRecursive(Tree t, Section section, boolean isQuery) {
        String parentChildText = Trees.getNodeText(t, getProgrammingLanguage().getRuleNames());

        if (!parentChildText.equals("querySnippet")) {
            for (int i = 0; i < t.getChildCount(); i++) {
                extractFeaturesForParent(t.getChild(i), section, isQuery, parentChildText);
            }
        }

        for (int i = 0; i < t.getChildCount(); i++) {
            extractFeaturesRecursive(t.getChild(i), section, isQuery);
        }
    }

    private void extractFeaturesForParent(Tree t, Section section, boolean isQuery, String parentNode) {
        var childNodeText = Trees.getNodeText(t, getProgrammingLanguage().getRuleNames());
        if (shouldExtractFeature(childNodeText, isQuery)) {

            section.addFeature(parentNode + ' ' + childNodeText);
        }

        for (int i = 0; i < t.getChildCount(); i++) {
            extractFeaturesForParent(t.getChild(i), section, isQuery, parentNode);
        }
    }

    private static boolean shouldExtractFeature(String childNodeText, boolean isQuery) {
        return (!isQuery
                || Config.EXTRACT_QUERY_KEYWORDS
                || !isQueryPlaceholder(childNodeText)
               );
    }
}
