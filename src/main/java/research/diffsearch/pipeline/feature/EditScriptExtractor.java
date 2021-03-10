package research.diffsearch.pipeline.feature;

import research.diffsearch.Config;
import research.diffsearch.pipeline.feature.FeatureVector.Section;
import research.diffsearch.pipeline.feature.changedistilling.EditScriptCreator;
import research.diffsearch.pipeline.feature.changedistilling.EditScriptOperation;
import research.diffsearch.tree.ParseTreeNode;
import research.diffsearch.util.ProgrammingLanguage;

import java.util.EnumMap;
import java.util.List;

import static research.diffsearch.pipeline.feature.AbstractRecursiveFeatureExtractor.getFeatureVectorIndex;
import static research.diffsearch.pipeline.feature.changedistilling.EditScriptOperation.Type.*;
import static research.diffsearch.util.Util.isQueryKeyword;

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
    public void extractFeatures(String codeChange,
                                         Section section, boolean isQuery) {

        var editScript = new EditScriptCreator(codeChange, programmingLanguage)
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

    @SuppressWarnings({"OverlyLongMethod", "OverlyComplexMethod"})
    private void processEditScriptStep(Section section, EditScriptOperation editScriptOperation, boolean isQuery) {
        int position = section.getStartPosition();
        if (editScriptOperation.getType() == EQUAL) {
            addEqualFeature(section, editScriptOperation, position, isQuery);
            return;
        }

        position += featureVectorLength / 3;

        if (editScriptOperation.getType() == UPDATE) {
            addUpdateParentsFeature(section, editScriptOperation, position, isQuery);
        }

        position += featureVectorLength / 12;

        if (editScriptOperation.getType() == UPDATE) {
            addUpdateFeature(section, editScriptOperation, position, isQuery);
            return;
        }

        position += featureVectorLength / 12;

        if (editScriptOperation.getType() == INSERT) {
            addInsertParentFeature(section, editScriptOperation, position, isQuery);
        }

        position += featureVectorLength / 12;

        if (editScriptOperation.getType() == INSERT) {
            addInsertFeature(section, editScriptOperation, position, isQuery);
            return;
        }

        position += featureVectorLength / 12;

        if (editScriptOperation.getType() == DELETE) {
            addDeleteParentsFeature(section, editScriptOperation, position, isQuery);
        }

        position += featureVectorLength / 12;

        if (editScriptOperation.getType() == DELETE) {
            addDeleteFeature(section, editScriptOperation, position, isQuery);
            return;
        }

        position += featureVectorLength / 12;

        if (editScriptOperation.getType() == MOVE || editScriptOperation.getType() == ALIGN) {
            addMoveParentsFeature(section, editScriptOperation, position, isQuery);
        }

        position += featureVectorLength / 12;

        if (editScriptOperation.getType() == MOVE || editScriptOperation.getType() == ALIGN) {
            addMoveFeature(section, editScriptOperation, position, isQuery);
        }
    }

    private void addMoveParentsFeature(FeatureVector.Section section, EditScriptOperation editScriptOperation,
                                       int position, boolean isQuery) {
        // use the parent of moved nodes as features
        addTwoNodesFeature(section, position, editScriptOperation.getOldNode()
                .getParent(), editScriptOperation.getNewNode()
                .getParent(), "MOVE_PARENTS", isQuery);
    }

    private void addMoveFeature(FeatureVector.Section section, EditScriptOperation editScriptOperation,
                                int position, boolean isQuery) {
        // use the parent of moved nodes as features
        addTwoNodesFeature(section, position, editScriptOperation.getOldNode(),
                editScriptOperation.getNewNode(), "MOVE", isQuery);
    }

    private void addTwoNodesFeature(FeatureVector.Section section, int position, ParseTreeNode oldNode,
                                    ParseTreeNode newNode, String category, boolean isQuery) {
        var feature = (oldNode == null ? "" : oldNode.getNodeLabel())
                      + " "
                      + (newNode == null ? "" : newNode.getNodeLabel());

        var index = getFeatureVectorIndex(position,
                feature.hashCode(),
                getFeatureVectorSectionLength() / 12);


        if (!isQuery || Config.EXTRACT_QUERY_KEYWORDS || !isQueryKeyword(feature)) {
            section.addFeature(feature, index);
        }
    }

    private void addDeleteFeature(FeatureVector.Section section, EditScriptOperation editScriptOperation,
                                  int position, boolean isQuery) {
        // use the parent of deleted nodes as features
        addFeature(section, position, editScriptOperation.getOldNode(),
                12, "DELETE", isQuery);
    }

    private void addDeleteParentsFeature(FeatureVector.Section section, EditScriptOperation editScriptOperation,
                                         int position, boolean isQuery) {
        // use the parent of deleted nodes as features
        addFeature(section, position, editScriptOperation.getOldNode().getParent(),
                12, "DELETE_PARENT", isQuery);
    }


    private void addUpdateParentsFeature(FeatureVector.Section section, EditScriptOperation editScriptOperation,
                                         int position, boolean isQuery) {
        // use the parent of updated nodes as features
        addTwoNodesFeature(section, position, editScriptOperation.getOldNode()
                .getParent(), editScriptOperation.getNewNode()
                .getParent(), "UPDATE_PARENTS", isQuery);
    }

    private void addUpdateFeature(FeatureVector.Section section, EditScriptOperation editScriptOperation,
                                  int position, boolean isQuery) {
        // use actual updated nodes as features
        addTwoNodesFeature(section, position, editScriptOperation.getOldNode(),
                editScriptOperation.getNewNode(), "UPDATE", isQuery);
    }

    private void addEqualFeature(FeatureVector.Section section,
                                 EditScriptOperation editScriptOperation,
                                 int position, boolean isQuery) {

        // each node that is equal is a feature
        addFeature(section, position, editScriptOperation.getOldNode(), 3, "EQUAL", isQuery);
    }

    private void addInsertParentFeature(FeatureVector.Section section,
                                        EditScriptOperation editScriptOperation,
                                        int position, boolean isQuery) {

        // use the parent of updated nodes as features
        addFeature(section, position, editScriptOperation.getNewNode().getParent(),
                12, "INSERT_PARENT", isQuery);
    }

    private void addInsertFeature(FeatureVector.Section section,
                                  EditScriptOperation editScriptOperation,
                                  int position, boolean isQuery) {

        // use actual updated nodes as features
        addFeature(section, position, editScriptOperation.getNewNode(), 12, "INSERT", isQuery);
    }

    private void addFeature(FeatureVector.Section section, int position, ParseTreeNode node, int i,
                            String category, boolean isQuery) {
        var f = node.getNodeLabel();

        var index = getFeatureVectorIndex(position,
                f.hashCode(),
                getFeatureVectorSectionLength() / i);

        if (!isQuery || Config.EXTRACT_QUERY_KEYWORDS || !isQueryKeyword(f)) {
            section.addFeature(f, index);
        }
    }

    @Override
    public ProgrammingLanguage getProgrammingLanguage() {
        return programmingLanguage;
    }
}
