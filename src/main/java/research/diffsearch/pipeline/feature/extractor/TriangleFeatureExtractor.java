package research.diffsearch.pipeline.feature.extractor;

import org.antlr.v4.runtime.tree.Tree;
import org.antlr.v4.runtime.tree.Trees;
import research.diffsearch.Config;
import research.diffsearch.pipeline.feature.FeatureVector;
import research.diffsearch.util.ProgrammingLanguage;
import research.diffsearch.util.Util;

/**
 * This feature extractor extracts parse tree triangles from code changes.
 *
 * @author Paul Bredl
 * @author Luca Di Grazia
 */
public class TriangleFeatureExtractor extends AbstractRecursiveFeatureExtractor {

    public TriangleFeatureExtractor(ProgrammingLanguage language, int featureVectorLength) {
        super(language, featureVectorLength);
    }

    @Override
    public void extractFeaturesRecursive(Tree t, FeatureVector.Section section, boolean isQuery) {
        var ruleNames = getProgrammingLanguage().getRuleNames();
        StringBuilder sum = new StringBuilder();
        sum.append(Trees.getNodeText(t, ruleNames));

        int i;
        for (i = 0; i < t.getChildCount(); i++) {
            String childNodeText = Trees.getNodeText(t.getChild(i), ruleNames);
            if (!isQuery || Config.EXTRACT_QUERY_KEYWORDS || !Util.isQueryPlaceholder(childNodeText)) {
                sum.append(childNodeText).append(" ");
            } else {
                sum = new StringBuilder();
                break;
            }
        }

        if (!sum.toString().isBlank() && i > 0 /*&& !sum.toString().contains("querySnippet") */) {
            section.addFeature(sum.toString());
        }

        for (i = 0; i < t.getChildCount(); i++) {
            String childNodeText = Trees.getNodeText(t.getChild(i), ruleNames);
            if (childNodeText.contains("literal")) {
                continue;
            }

            extractFeaturesRecursive(t.getChild(i), section, isQuery);
        }
    }
}
