package research.diffsearch.pipeline.feature;

import research.diffsearch.Config;
import research.diffsearch.pipeline.feature.changedistilling.EditScriptCreator;
import research.diffsearch.pipeline.feature.changedistilling.EditScriptOperation;
import research.diffsearch.tree.ParseTreeNode;
import research.diffsearch.util.ProgrammingLanguage;

import java.util.EnumMap;
import java.util.List;

import static research.diffsearch.pipeline.feature.AbstractRecursiveFeatureExtractor.getFeatureVectorIndex;
import static research.diffsearch.pipeline.feature.changedistilling.EditScriptOperation.Type.*;
import static research.diffsearch.util.QueryUtil.isQueryKeyword;

public class EditScriptExtractor implements FeatureExtractor {

    private final ProgrammingLanguage programmingLanguage;
    private final int featureVectorLength;
    private final boolean isQuery;
    static final EnumMap<EditScriptOperation.Type, Integer> countMap = new EnumMap<>(EditScriptOperation.Type.class);

    public EditScriptExtractor(ProgrammingLanguage programmingLanguage, int featureVectorLength, boolean isQuery) {
        this.programmingLanguage = programmingLanguage;
        this.featureVectorLength = featureVectorLength;
        this.isQuery = isQuery;
    }

    @Override
    public int getFeatureVectorLength() {
        return featureVectorLength;
    }

    @Override
    public FeatureVector extractFeatures(String codeChange,
                                         FeatureVector completeFeatureVector,
                                         int startPosition) {

        var editScript = new EditScriptCreator(codeChange, programmingLanguage)
                .calculateEditScript();
        extractFeatures(editScript, completeFeatureVector, startPosition);

        return completeFeatureVector;
    }

    private void extractFeatures(List<EditScriptOperation> editScriptOperationList,
                                 FeatureVector vector,
                                 int startPosition) {
        // first third of the vector
        for (EditScriptOperation editScriptOperation : editScriptOperationList) {
            // exclude root because they are always equal
            if (editScriptOperation.getOldNode() == null || !editScriptOperation.getOldNode().isRoot()) {
                processEditScriptStep(vector, editScriptOperation, startPosition);

            }
        }
    }

    @SuppressWarnings("OverlyLongMethod")
    private void processEditScriptStep(FeatureVector vector, EditScriptOperation editScriptOperation,
                                       int startPosition) {
        int position = startPosition;
        if (editScriptOperation.getType() == EQUAL) {
            addEqualFeature(vector, editScriptOperation, position);
            return;
        }

        position += featureVectorLength / 3;

        if (editScriptOperation.getType() == UPDATE) {
            addUpdateParentsFeature(vector, editScriptOperation, position);
        }

        position += featureVectorLength / 12;

        if (editScriptOperation.getType() == UPDATE) {
            addUpdateFeature(vector, editScriptOperation, position);
            return;
        }

        position += featureVectorLength / 12;

        if (editScriptOperation.getType() == INSERT) {
            addInsertParentFeature(vector, editScriptOperation, position);
        }

        position += featureVectorLength / 12;

        if (editScriptOperation.getType() == INSERT) {
            addInsertFeature(vector, editScriptOperation, position);
            return;
        }

        position += featureVectorLength / 12;

        if (editScriptOperation.getType() == DELETE) {
            addDeleteParentsFeature(vector, editScriptOperation, position);
        }

        position += featureVectorLength / 12;

        if (editScriptOperation.getType() == DELETE) {
            addDeleteFeature(vector, editScriptOperation, position);
            return;
        }

        position += featureVectorLength / 12;

        if (editScriptOperation.getType() == MOVE || editScriptOperation.getType() == ALIGN) {
            addMoveParentsFeature(vector, editScriptOperation, position);
        }

        position += featureVectorLength / 12;

        if (editScriptOperation.getType() == MOVE || editScriptOperation.getType() == ALIGN) {
            addMoveFeature(vector, editScriptOperation, position);
        }
    }

    private void addMoveParentsFeature(FeatureVector vector, EditScriptOperation editScriptOperation,
                                       int position) {
        // use the parent of moved nodes as features
        addTwoNodesFeature(vector, position, editScriptOperation.getOldNode()
                                    .getParent(), editScriptOperation.getNewNode()
                                            .getParent(), "MOVE_PARENTS");
    }

    private void addMoveFeature(FeatureVector vector, EditScriptOperation editScriptOperation,
                                       int position) {
        // use the parent of moved nodes as features
        addTwoNodesFeature(vector, position, editScriptOperation.getOldNode(), editScriptOperation.getNewNode(), "MOVE");
    }

    private void addTwoNodesFeature(FeatureVector vector, int position, ParseTreeNode oldNode,
                                    ParseTreeNode newNode, String category) {

        var feature = (oldNode == null ? "" : oldNode.getNodeLabel())
                            + " "
                            + (newNode == null ? "" : newNode.getNodeLabel());

        var index = getFeatureVectorIndex(position,
                feature.hashCode(),
                getFeatureVectorLength() / 12);


        if (!isQuery || Config.EXTRACT_QUERY_KEYWORDS || !isQueryKeyword(feature)) {
            vector.addFeature(category, feature, index);
        }
    }

    private void addDeleteFeature(FeatureVector vector, EditScriptOperation editScriptOperation,
                                         int position) {
        // use the parent of deleted nodes as features
        addFeature(vector, position, editScriptOperation.getOldNode(),
                12, "DELETE");
    }

    private void addDeleteParentsFeature(FeatureVector vector, EditScriptOperation editScriptOperation,
                                         int position) {
        // use the parent of deleted nodes as features
        addFeature(vector, position, editScriptOperation.getOldNode().getParent(),
                12, "DELETE_PARENT");
    }


    private void addUpdateParentsFeature(FeatureVector vector, EditScriptOperation editScriptOperation,
                                         int position) {
        // use the parent of updated nodes as features
        addTwoNodesFeature(vector, position, editScriptOperation.getOldNode()
                                    .getParent(), editScriptOperation.getNewNode()
                                            .getParent(), "UPDATE_PARENTS");
    }

    private void addUpdateFeature(FeatureVector vector, EditScriptOperation editScriptOperation,
                                  int position) {
        // use actual updated nodes as features
        addTwoNodesFeature(vector, position, editScriptOperation.getOldNode(), editScriptOperation.getNewNode(), "UPDATE");
    }

    private void addEqualFeature(FeatureVector vector,
                                 EditScriptOperation editScriptOperation,
                                 int position) {

        // each node that is equal is a feature
        addFeature(vector, position, editScriptOperation.getOldNode(), 3, "EQUAL");
    }

    private void addInsertParentFeature(FeatureVector vector,
                                        EditScriptOperation editScriptOperation,
                                        int position) {

        // use the parent of updated nodes as features
        addFeature(vector, position, editScriptOperation.getNewNode().getParent(),
                12, "INSERT_PARENT");
    }

    private void addInsertFeature(FeatureVector vector,
                                  EditScriptOperation editScriptOperation,
                                  int position) {

        // use actual updated nodes as features
        addFeature(vector, position, editScriptOperation.getNewNode(), 12, "INSERT");
    }

    private void addFeature(FeatureVector vector, int position, ParseTreeNode node, int i, String category) {
        var f = node.getNodeLabel();

        var index = getFeatureVectorIndex(position,
                f.hashCode(),
                getFeatureVectorLength() / i);

        if (!isQuery || Config.EXTRACT_QUERY_KEYWORDS || !isQueryKeyword(f)) {
            vector.addFeature(category, f, index);
        }
    }

    @Override
    public ProgrammingLanguage getProgrammingLanguage() {
        return programmingLanguage;
    }
}
