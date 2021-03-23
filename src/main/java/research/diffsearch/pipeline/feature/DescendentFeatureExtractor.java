package research.diffsearch.pipeline.feature;

import org.antlr.v4.runtime.tree.Tree;
import org.antlr.v4.runtime.tree.Trees;
import research.diffsearch.Config;
import research.diffsearch.pipeline.feature.FeatureVector.Section;
import research.diffsearch.util.ProgrammingLanguage;

import java.util.ArrayList;
import java.util.List;

import static research.diffsearch.util.Util.isQueryKeyword;

public class DescendentFeatureExtractor extends AbstractRecursiveFeatureExtractor {

    public DescendentFeatureExtractor(ProgrammingLanguage language, int featureVectorLength) {
        super(language, featureVectorLength);
    }

    @Override
    public void extractFeaturesRecursive(Tree t, Section section, boolean isQuery) {
        extractFeaturesRecursive(t, section, isQuery, new ArrayList<>());
    }

    private void extractFeaturesRecursive(Tree t, Section section, boolean isQuery, List<String> parentNodes) {
        var ruleNames = getProgrammingLanguage().getRuleNames();
        String currentNodeText = Trees.getNodeText(t, ruleNames);

        for (int i = 1; i < parentNodes.size(); i++) {
            var parentNodeText = parentNodes.get(i);
            if (shouldExtractFeature(parentNodeText, isQuery)) {
                var feature = currentNodeText + ' ' + parentNodeText;

                section.addFeature(feature);
            }
        }

        List<String> newParentNodes = parentNodes;
        if (!currentNodeText.equals("querySnippet")) {
            newParentNodes = new ArrayList<>(parentNodes);
            newParentNodes.add(currentNodeText);
        }
        for (int i = 0; i < t.getChildCount(); i++) {
            extractFeaturesRecursive(t.getChild(i), section, isQuery, newParentNodes);
        }
    }

    private static boolean shouldExtractFeature(String childNodeText, boolean isQuery) {
        return (!isQuery
                || Config.EXTRACT_QUERY_KEYWORDS
                || !isQueryKeyword(childNodeText)
               );
    }
}
