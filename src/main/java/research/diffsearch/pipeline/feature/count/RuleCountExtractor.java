package research.diffsearch.pipeline.feature.count;

import org.antlr.v4.runtime.tree.Tree;
import org.antlr.v4.runtime.tree.Trees;
import research.diffsearch.pipeline.feature.FeatureVector;
import research.diffsearch.pipeline.feature.extractor.AbstractRecursiveFeatureExtractor;
import research.diffsearch.util.ProgrammingLanguage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Paul Bredl
 */
public class RuleCountExtractor extends AbstractRecursiveFeatureExtractor {

    public RuleCountExtractor(ProgrammingLanguage language, int length) {
        super(language, length);
    }

    public static Map<String, Integer> getRuleCountMapForTree(Tree node,
                                                              List<String> ruleNames,
                                                              Map<String, Integer> countMap) {
        var nodeText = Trees.getNodeText(node,ruleNames);
        if (ruleNames.contains(nodeText)) {
            var count = countMap.getOrDefault(nodeText, 0);
            countMap.put(nodeText, count + 1);
        }

        for (int i = 0; i < node.getChildCount(); i++) {
            countMap = getRuleCountMapForTree(node.getChild(i), ruleNames, countMap);
        }

        return countMap;
    }

    @Override
    public void extractFeaturesRecursive(Tree t, FeatureVector.Section section,
                                         boolean isQuery) {

        var ruleNames = getProgrammingLanguage().getRuleNames();
        var nodeText = Trees.getNodeText(t, ruleNames);
        var countMap = getRuleCountMapForTree(t, ruleNames, new HashMap<>());

        var index = 0;
        for (var rule : ruleNames) {
            var ruleMaxCount = this.getFeatureVectorSectionLength() / ruleNames.size();

            var countForCurrentCodeChange = countMap.getOrDefault(rule, 0);
            if (isNotBlacklisted(rule)) {
                for (int i = 0; i < ruleMaxCount && i < countForCurrentCodeChange; i++) {
                    section.addFeature(rule, section.getStartPosition() + index + i);
                }
            }

            index += ruleMaxCount;
        }
    }
}
