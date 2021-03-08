package research.diffsearch.pipeline.feature;

import org.antlr.v4.runtime.tree.Tree;
import research.diffsearch.tree.AbstractTree;
import research.diffsearch.tree.TreeFactory;
import research.diffsearch.util.ProgrammingLanguage;

import java.util.Arrays;
import java.util.List;

public abstract class AbstractRecursiveFeatureExtractor implements FeatureExtractor {

    private final ProgrammingLanguage programmingLanguage;
    private final int featureVectorLength;

    public AbstractRecursiveFeatureExtractor(ProgrammingLanguage language, int featureVectorLength) {
        programmingLanguage = language;
        this.featureVectorLength = featureVectorLength;
    }

    public static int getFeatureVectorIndex(int startIndex, int hashValue, long vectorLength) {
        return (int) (startIndex + Math.abs(hashValue % vectorLength));
    }

    public abstract void extractFeaturesRecursive(Tree t, FeatureVector.Section section,
                                                  List<String> ruleNames,
                                                  boolean isQuery);

    @Override
    public void extractFeatures(String codeChange, FeatureVector.Section section, boolean isQuery) {
        AbstractTree queryTree = TreeFactory.getChangeTree(codeChange, getProgrammingLanguage());
        String[] ruleNames = queryTree.getParser().getRuleNames();

        extractFeaturesRecursive(queryTree.getParseTree(), section,
                Arrays.asList(ruleNames), isQuery);
    }

    @Override
    public int getFeatureVectorSectionLength() {
        return featureVectorLength;
    }

    @Override
    public ProgrammingLanguage getProgrammingLanguage() {
        return programmingLanguage;
    }

    protected static boolean isBlacklisted(String nodeText) {
        return List.of("multipleStatements", "blockStatement", "querySnippet", "statement").contains(nodeText);
    }
}
