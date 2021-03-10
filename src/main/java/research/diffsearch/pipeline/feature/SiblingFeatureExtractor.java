package research.diffsearch.pipeline.feature;

import org.antlr.v4.runtime.tree.Tree;
import org.antlr.v4.runtime.tree.Trees;
import research.diffsearch.Config;
import research.diffsearch.util.ProgrammingLanguage;

import java.util.List;

import static research.diffsearch.util.Util.isQueryKeyword;

public class SiblingFeatureExtractor extends AbstractRecursiveFeatureExtractor {

    public SiblingFeatureExtractor(ProgrammingLanguage language, int featureVectorLength) {
        super(language, featureVectorLength);
    }

    @Override
    public void extractFeaturesRecursive(Tree t, FeatureVector.Section section,
                                         List<String> ruleNames, boolean isQuery) {
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
            extractFeaturesRecursive(t.getChild(i), section, ruleNames, isQuery);
        }
    }

    private static boolean shouldExtractFeature(String nodeText1, String nodeText2, boolean isQuery) {
        return (!isQuery
                || Config.EXTRACT_QUERY_KEYWORDS
                || (!isQueryKeyword(nodeText1)
                    && !isQueryKeyword(nodeText2)))
               /*&& !isBlacklisted(nodeText1)
               && !isBlacklisted(nodeText2)*/;
    }
}
