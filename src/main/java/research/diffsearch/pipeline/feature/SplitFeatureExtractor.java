package research.diffsearch.pipeline.feature;

import org.antlr.v4.runtime.tree.ParseTree;
import research.diffsearch.tree.AbstractTree;
import research.diffsearch.tree.TreeFactory;
import research.diffsearch.util.ProgrammingLanguage;

import java.util.Arrays;

public class SplitFeatureExtractor implements FeatureExtractor {

    private final AbstractRecursiveFeatureExtractor baseExtractor;

    public SplitFeatureExtractor(AbstractRecursiveFeatureExtractor baseExtractor) {
        this.baseExtractor = baseExtractor;
    }

    @Override
    public void extractFeatures(String codeChange,
                                         FeatureVector.Section section,
                                         boolean isQuery) {

        AbstractTree queryTree = TreeFactory.getChangeTree(codeChange, getProgrammingLanguage());
        String[] ruleNames = queryTree.getParser().getRuleNames();
        ParseTree parseTree = queryTree.getParseTree();

        if (parseTree.getChildCount() == 3) {
            baseExtractor.extractFeaturesRecursive(parseTree.getChild(0),
                    section, Arrays.asList(ruleNames), isQuery);

            baseExtractor.extractFeaturesRecursive(parseTree.getChild(2),
                    section,
                    Arrays.asList(ruleNames), isQuery);
        } else {
            baseExtractor.extractFeaturesRecursive(parseTree, section, Arrays.asList(ruleNames), isQuery);
        }
    }

    @Override
    public int getFeatureVectorLength() {
        return baseExtractor.getFeatureVectorLength() * 2;
    }

    @Override
    public ProgrammingLanguage getProgrammingLanguage() {
        return baseExtractor.getProgrammingLanguage();
    }
}
