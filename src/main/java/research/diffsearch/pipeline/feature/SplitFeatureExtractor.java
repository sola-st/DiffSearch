package research.diffsearch.pipeline.feature;

import org.antlr.v4.runtime.tree.ParseTree;
import research.diffsearch.tree.TreeObjectUtils;
import research.diffsearch.util.ProgrammingLanguage;

import java.util.Arrays;

import static research.diffsearch.pipeline.feature.SplitFeatureExtractor.SplitMode.BOTH;
import static research.diffsearch.pipeline.feature.SplitFeatureExtractor.SplitMode.ONLY_SECOND;

public class SplitFeatureExtractor implements FeatureExtractor {

    private final AbstractRecursiveFeatureExtractor baseExtractor;
    private final SplitMode splitMode;

    public SplitFeatureExtractor(AbstractRecursiveFeatureExtractor baseExtractor) {
        this(baseExtractor, BOTH);
    }

    public SplitFeatureExtractor(AbstractRecursiveFeatureExtractor baseExtractor, SplitMode splitMode) {
        this.baseExtractor = baseExtractor;
        this.splitMode = splitMode;
    }

    @Override
    public FeatureVector extractFeatures(String codeChange, FeatureVector completeFeatureVector, int startPosition) {
        Object queryTree = TreeObjectUtils.getChangeTree(codeChange, getProgrammingLanguage());
        String[] ruleNames = TreeObjectUtils.getParser(queryTree, getProgrammingLanguage()).getRuleNames();
        ParseTree parseTree = TreeObjectUtils.getParseTree(queryTree, getProgrammingLanguage());

        if (parseTree.getChildCount() == 3) {
            if (splitMode.ordinal() <= BOTH.ordinal()) {
                baseExtractor.extractFeaturesRecursive(parseTree.getChild(0),
                        completeFeatureVector, startPosition, Arrays.asList(ruleNames), 0);
            }
            if (splitMode == BOTH) {
                baseExtractor.extractFeaturesRecursive(parseTree.getChild(2),
                        completeFeatureVector, startPosition + baseExtractor.getFeatureVectorLength(),
                        Arrays.asList(ruleNames), 0);
            }
            if (splitMode == ONLY_SECOND) {
                baseExtractor.extractFeaturesRecursive(parseTree.getChild(2),
                        completeFeatureVector, startPosition,
                        Arrays.asList(ruleNames), 0);
            }
        } else {
            baseExtractor.extractFeaturesRecursive(parseTree, completeFeatureVector,
                    startPosition, Arrays.asList(ruleNames), 0);
        }
        return completeFeatureVector;
    }

    @Override
    public int getFeatureVectorLength() {
        if (this.splitMode == BOTH) {
            return baseExtractor.getFeatureVectorLength() * 2;
        } else {
            return baseExtractor.getFeatureVectorLength();
        }
    }

    @Override
    public ProgrammingLanguage getProgrammingLanguage() {
        return baseExtractor.getProgrammingLanguage();
    }

    public enum SplitMode {
        ONLY_FIRST,
        BOTH,
        ONLY_SECOND
    }
}
