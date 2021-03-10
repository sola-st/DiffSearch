package research.diffsearch.pipeline.feature.count;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.Tree;
import org.antlr.v4.runtime.tree.Trees;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import research.diffsearch.Config;
import research.diffsearch.pipeline.RecallPipeline;
import research.diffsearch.pipeline.base.CodeChangeWeb;
import research.diffsearch.pipeline.base.Pipeline;
import research.diffsearch.tree.AbstractTree;
import research.diffsearch.util.ProgrammingLanguage;
import research.diffsearch.util.ProgrammingLanguageDependent;
import research.diffsearch.util.ProgressWatcher;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import static research.diffsearch.tree.TreeFactory.getChangeTree;
import static research.diffsearch.util.FilePathUtils.getCodeChanges;
import static research.diffsearch.util.FilePathUtils.readCSVToMap;

public class RuleMaxOccurrenceCounter implements ProgrammingLanguageDependent {

    private final ProgrammingLanguage language;
    private final Map<String, Integer> ruleNameCountMap = new HashMap<>();

    private static final String RULE_COUNT_PATH = "./src/main/resources/ruleCountOldPart.csv";

    private static final Logger logger = LoggerFactory.getLogger(RuleMaxOccurrenceCounter.class);

    public RuleMaxOccurrenceCounter(ProgrammingLanguage language) {
        this.language = language;

        readRuleCountsFromFile();

        if (ruleNameCountMap.isEmpty()) {
            buildRuleCountMaps();
            writeCountMapsToFile();
        }

        logger.debug("total: " + ruleNameCountMap.values().stream()
                .mapToInt(i -> Math.min(i, Config.ruleCountMaxCount)).sum());
    }

    private void writeCountMapsToFile() {
        try {
            RecallPipeline.writeValuesToFile(null, RULE_COUNT_PATH, ruleNameCountMap, ",");
        } catch (IOException e) {
            logger.error(e.getMessage(), e);
        }
    }

    public int getRuleCount(String ruleName) {
        return ruleNameCountMap.getOrDefault(ruleName, 0);
    }

    public int getRuleCountLimited(String ruleName, int limit) {
        return Math.min(getRuleCount(ruleName), limit);
    }

    private void readRuleCountsFromFile() {
        readCSVToMap(RULE_COUNT_PATH, ",", ruleNameCountMap, Integer::parseInt);
    }

    private void buildRuleCountMaps() {
        Pipeline.from((Function<CodeChangeWeb, CodeChangeWeb>) codeChange -> {
            AbstractTree tree = getChangeTree(codeChange.getFullChangeString(), language);
            ParseTree parseTree = tree.getParseTree();

            if (parseTree.getChildCount() >= 3) {
                var oldPartMap = getRuleCountMapForTree(parseTree.getChild(0),
                        Arrays.asList(tree.getRuleNames()), new HashMap<>());
                var newPartMap = getRuleCountMapForTree(parseTree.getChild(2),
                        Arrays.asList(tree.getRuleNames()), new HashMap<>());
                mergeMapsForMaximum(ruleNameCountMap, oldPartMap);
                mergeMapsForMaximum(ruleNameCountMap, newPartMap);
            }
            return codeChange;
        }).connect(new ProgressWatcher<>(
                "Counting features"))
        .execute(getCodeChanges(getProgrammingLanguage()));
    }

    private static void mergeMapsForMaximum(Map<String, Integer> mainMap, Map<String, Integer> mergeMap) {
        for (var rule : mergeMap.keySet()) {
            var oldValue = mainMap.getOrDefault(rule, 0);
            mainMap.put(rule, Math.max(oldValue, mergeMap.get(rule)));
        }
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
    public ProgrammingLanguage getProgrammingLanguage() {
        return language;
    }

    public static void main(String[] args) {
        new RuleMaxOccurrenceCounter(ProgrammingLanguage.JAVA);
    }

    public int getTotalMaxCount(int limitPerRule) {
        return ruleNameCountMap.values().stream()
                .mapToInt(count -> Math.min(count, limitPerRule))
                .sum();
    }
}
