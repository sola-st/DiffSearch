package research.diffsearch.pipeline.feature.count;

import org.antlr.v4.runtime.tree.Tree;
import org.antlr.v4.runtime.tree.Trees;
import research.diffsearch.Config;
import research.diffsearch.pipeline.feature.FeatureVector;
import research.diffsearch.pipeline.feature.extractor.AbstractRecursiveFeatureExtractor;
import research.diffsearch.util.ProgrammingLanguage;

import java.util.HashMap;

import static research.diffsearch.pipeline.feature.count.RuleMaxOccurrenceCounter.getRuleCountMapForTree;

public class RuleCountExtractor extends AbstractRecursiveFeatureExtractor {

    private final RuleMaxOccurrenceCounter ruleMaxOccurrenceCounter;

    public RuleCountExtractor(ProgrammingLanguage language, RuleMaxOccurrenceCounter ruleMaxOccurrenceCounter) {
        super(language, ruleMaxOccurrenceCounter.getTotalMaxCount(Config.ruleCountMaxCount));
        this.ruleMaxOccurrenceCounter = ruleMaxOccurrenceCounter;
    }

    @Override
    public void extractFeaturesRecursive(Tree t, FeatureVector.Section section,
                                         boolean isQuery) {

        var ruleNames = getProgrammingLanguage().getRuleNames();
        var nodeText = Trees.getNodeText(t, ruleNames);
        var countMap = getRuleCountMapForTree(t, ruleNames, new HashMap<>());

        var index = 0;
        for (var rule : ruleNames) {
            var ruleMaxCount = ruleMaxOccurrenceCounter.getRuleCountLimited(rule, Config.ruleCountMaxCount);

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
