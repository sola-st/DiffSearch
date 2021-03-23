package research.diffsearch.pipeline.feature;

import org.antlr.v4.runtime.tree.ParseTree;
import research.diffsearch.tree.AbstractTree;
import research.diffsearch.tree.TreeFactory;
import research.diffsearch.util.ProgrammingLanguage;

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
                    section.getSubsection(baseExtractor.getName() + " [old]",
                            0, baseExtractor.getFeatureVectorSectionLength()),
                    isQuery);

            baseExtractor.extractFeaturesRecursive(parseTree.getChild(2),
                    section.getSubsection(baseExtractor.getName() + "[new]",
                            baseExtractor.getFeatureVectorSectionLength(),
                            baseExtractor.getFeatureVectorSectionLength()),
                    isQuery);
        } else {
            baseExtractor.extractFeaturesRecursive(parseTree, section, isQuery);
        }
    }

    @Override
    public int getFeatureVectorSectionLength() {
        return baseExtractor.getFeatureVectorSectionLength() * 2;
    }

    @Override
    public ProgrammingLanguage getProgrammingLanguage() {
        return baseExtractor.getProgrammingLanguage();
    }

    @Override
    public String getName() {
        return baseExtractor.getName();
    }
}
