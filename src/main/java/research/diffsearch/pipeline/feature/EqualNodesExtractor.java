package research.diffsearch.pipeline.feature;

import research.diffsearch.tree.AbstractTree;
import research.diffsearch.tree.ParseTreeNode;
import research.diffsearch.tree.TreeFactory;
import research.diffsearch.util.ProgrammingLanguage;
import research.diffsearch.util.Util;

import java.util.Arrays;

public class EqualNodesExtractor implements FeatureExtractor {

    private final int sectionLength;
    private final ProgrammingLanguage lang;

    public EqualNodesExtractor(ProgrammingLanguage programmingLanguage, int featureVectorSectionLength) {
        this.lang = programmingLanguage;
        this.sectionLength = featureVectorSectionLength;
    }

    @Override
    public int getFeatureVectorSectionLength() {
        return sectionLength;
    }

    @Override
    public void extractFeatures(String codeChange, FeatureVector.Section section, boolean isQuery) {
        AbstractTree queryTree = TreeFactory.getChangeTree(codeChange, getProgrammingLanguage());
        String[] ruleNames = queryTree.getParser().getRuleNames();
        var rootNodes = ParseTreeNode.fromTree(queryTree.getParseTree(),
                Arrays.asList(ruleNames));

        var length = getFeatureVectorSectionLength();
        var oldPartSection = section.getSubsection(getName() + " [old]",
                0, length / 8);
        var oldPartParentSection = section.getSubsection(getName() + " [old, parents]",
                length / 8, length / 8);
        var newPartSection = section.getSubsection(getName() + " [new]",
                2 * length / 8, length / 8);
        var newPartParentSection = section.getSubsection(getName() + " [new, parents]",
                3 * length / 8, length / 8);
        var overarchingSection = section.getSubsection(getName() + " [overarching]",
                2 * length / 4, length / 4);
        var overarchingParentSection = section.getSubsection(getName() + " [overarching, parents]",
                3 * length / 4, length / 4);

        findEqualFeatures(rootNodes.getLeft(), rootNodes.getLeft(), oldPartSection, oldPartParentSection);
        findEqualFeatures(rootNodes.getRight(), rootNodes.getRight(), newPartSection, newPartParentSection);
        findEqualFeatures(rootNodes.getRight(), rootNodes.getLeft(), overarchingSection, overarchingParentSection);
    }

    private void findEqualFeatures(ParseTreeNode root1, ParseTreeNode root2,
                                   FeatureVector.Section mainSection, FeatureVector.Section parentSection) {
        for (var firstLeaf : root1.getLeaves()) {
            for (var secondLeaf: root2.getLeaves()) {

                if (firstLeaf != secondLeaf) {

                    compareLeavesAndExtract(mainSection, parentSection, firstLeaf, secondLeaf);
                }
            }
        }
    }

    private void compareLeavesAndExtract(FeatureVector.Section mainSection,
                                         FeatureVector.Section parentSection,
                                         ParseTreeNode firstLeaf,
                                         ParseTreeNode secondLeaf) {
        var firstLabel = firstLeaf.getNodeLabel().trim();
        var secondLabel = secondLeaf.getNodeLabel().trim();
        if (isNoQueryKeywordOrIsNamedKeyword(firstLabel)
            && (isNoQueryKeywordOrIsNamedKeyword(secondLabel))) {

            if (firstLabel.equals(secondLabel)) {
                if (!Util.isQueryKeyword(firstLabel)) {
                    mainSection.addFeature(firstLabel);
                }

                var firstParentLabel = firstLeaf.getParent().getNodeLabel();
                var secondParentLabel = secondLeaf.getParent().getNodeLabel();
                parentSection.addFeature(firstParentLabel + ' ' + secondParentLabel);
            }
        }
    }

    private static boolean isNoQueryKeywordOrIsNamedKeyword(String firstLabel) {
        return !Util.isQueryKeyword(firstLabel) || (firstLabel.contains("<") && !firstLabel.equals("<...>"));
    }

    @Override
    public ProgrammingLanguage getProgrammingLanguage() {
        return lang;
    }

}
