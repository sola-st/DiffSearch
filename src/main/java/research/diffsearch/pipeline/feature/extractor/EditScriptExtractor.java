package research.diffsearch.pipeline.feature.extractor;

import research.diffsearch.Config;
import research.diffsearch.pipeline.feature.FeatureVector.Section;
import research.diffsearch.pipeline.feature.changedistilling.EditScriptCreator;
import research.diffsearch.pipeline.feature.changedistilling.EditScriptOperation;
import research.diffsearch.tree.AbstractTree;
import research.diffsearch.tree.ParseTreeNode;
import research.diffsearch.util.ProgrammingLanguage;

import java.util.EnumMap;
import java.util.List;

import static research.diffsearch.pipeline.feature.changedistilling.EditScriptOperation.Type.*;
import static research.diffsearch.util.Util.isQueryPlaceholder;

/**
 * @author Paul Bredl
 */
public class EditScriptExtractor implements FeatureExtractor {

    private final ProgrammingLanguage programmingLanguage;
    private final int featureVectorLength;
    static final EnumMap<EditScriptOperation.Type, Integer> countMap = new EnumMap<>(EditScriptOperation.Type.class);

    public EditScriptExtractor(ProgrammingLanguage programmingLanguage, int featureVectorLength) {
        this.programmingLanguage = programmingLanguage;
        this.featureVectorLength = featureVectorLength;
    }

    @Override
    public int getFeatureVectorSectionLength() {
        return featureVectorLength;
    }

    @Override
    public void extractFeatures(AbstractTree codeChangeTree,
                                Section section, boolean isQuery) {

        var editScript = new EditScriptCreator(codeChangeTree, programmingLanguage)
                .calculateEditScript();
        extractFeatures(editScript, section, isQuery);
    }

    private void extractFeatures(List<EditScriptOperation> editScriptOperationList, Section section, boolean isQuery) {
        // first third of the vector
        for (EditScriptOperation editScriptOperation : editScriptOperationList) {
            // exclude root because they are always equal
            if (editScriptOperation.getOldNode() == null || !editScriptOperation.getOldNode().isRoot()) {
                processEditScriptStep(section, editScriptOperation, isQuery);

            }
        }
    }

    private void processEditScriptStep(Section section, EditScriptOperation editScriptOperation, boolean isQuery) {
        int position = section.getStartPosition();
        int sectionLength = featureVectorLength / 5;

        if (editScriptOperation.getType() == EQUAL) {
            Section equalSection = section.getSubsection("EQUAL", position, sectionLength);
            // each node that is equal is a feature
            addFeature(equalSection, editScriptOperation.getOldNode(), isQuery);
            return;
        }

        position += sectionLength;

        if (editScriptOperation.getType() == UPDATE) {
            // use actual updated nodes as features
            Section updateSection = section.getSubsection("UPDATE", position, sectionLength);
            addTwoNodesFeature(updateSection, editScriptOperation.getOldNode(),
                    editScriptOperation.getNewNode(), isQuery);
            return;
        }

        position += sectionLength;

        if (editScriptOperation.getType() == INSERT) {
            Section insertSection = section.getSubsection("INSERT", position, sectionLength);
            addFeature(insertSection, editScriptOperation.getNewNode(), isQuery);
            return;
        }

        position += sectionLength;

        if (editScriptOperation.getType() == DELETE) {
            Section deleteSection = section.getSubsection("DELETE", position, sectionLength);
            addFeature(deleteSection, editScriptOperation.getOldNode(), isQuery);
            return;
        }

        position += sectionLength;

        if (editScriptOperation.getType() == MOVE || editScriptOperation.getType() == ALIGN) {
            Section moveSection = section.getSubsection("MOVE", position, sectionLength);
            addTwoNodesFeature(moveSection, editScriptOperation.getOldNode(),
                    editScriptOperation.getNewNode(), isQuery);
        }
    }

    private void addTwoNodesFeature(Section section, ParseTreeNode oldNode,
                                    ParseTreeNode newNode, boolean isQuery) {
        var feature = (oldNode == null ? "" : oldNode.getNodeLabel())
                      + " "
                      + (newNode == null ? "" : newNode.getNodeLabel());

        if (!isQuery || Config.EXTRACT_QUERY_KEYWORDS || !isQueryPlaceholder(feature)) {
            section.addFeature(feature);
        }
    }

    private void addFeature(Section section, ParseTreeNode node, boolean isQuery) {
        var f = node.getNodeLabel();

        if (!isQuery || Config.EXTRACT_QUERY_KEYWORDS || !isQueryPlaceholder(f)) {
            section.addFeature(f);
        }
    }

    @Override
    public ProgrammingLanguage getProgrammingLanguage() {
        return programmingLanguage;
    }
}
