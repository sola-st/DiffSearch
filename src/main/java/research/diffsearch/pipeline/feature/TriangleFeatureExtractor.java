package research.diffsearch.pipeline.feature;

import org.antlr.v4.runtime.tree.Tree;
import org.antlr.v4.runtime.tree.Trees;
import research.diffsearch.Config;
import research.diffsearch.util.ProgrammingLanguage;
import research.diffsearch.util.QueryUtil;

import java.util.List;

public class TriangleFeatureExtractor extends AbstractRecursiveFeatureExtractor {
    public TriangleFeatureExtractor(ProgrammingLanguage language, int featureVectorLength, boolean isQuery) {
        super(language, featureVectorLength, isQuery);
    }

    @Override
    public void extractFeaturesRecursive(Tree t, FeatureVector completeFeatureVector,
                                         int startPosition, List<String> ruleNames, int depth) {
        StringBuilder sum = new StringBuilder();
        sum.append(Trees.getNodeText(t, ruleNames));

        int i;
        for (i = 0; i < t.getChildCount(); i++) {
            String childNodeText = Trees.getNodeText(t.getChild(i), ruleNames);
            if (!isQuery() || Config.EXTRACT_QUERY_KEYWORDS || !QueryUtil.isQueryKeyword(childNodeText)) {
                sum.append(childNodeText).append(" ");
            } else {
                // set sum empty if query keyword was detected.
//                sum = new StringBuilder();
//                break;
            }
        }

        if (!sum.toString().isBlank() && i > 0) {
            int index = getFeatureVectorIndex(startPosition, sum.toString().trim().hashCode(),
                    getFeatureVectorLength());
            completeFeatureVector.addFeature("Triangle", sum.toString(), index);
        }

        for (i = 0; i < t.getChildCount(); i++) {
            String childNodeText = Trees.getNodeText(t.getChild(i), ruleNames);
            if (childNodeText.contains("literal")) {
                continue;
            }

            extractFeaturesRecursive(t.getChild(i), completeFeatureVector, startPosition, ruleNames, depth + 1);
        }
    }
}
