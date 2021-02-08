package research.diffsearch.pipeline.feature;

import research.diffsearch.Config;
import research.diffsearch.pipeline.feature.changedistilling.EditScriptCreator;
import research.diffsearch.pipeline.feature.changedistilling.EditScriptOperation;
import research.diffsearch.tree.ParseTreeNode;
import research.diffsearch.util.ProgrammingLanguage;

import java.util.EnumMap;
import java.util.List;

import static research.diffsearch.pipeline.feature.AbstractRecursiveFeatureExtractor.getFeatureVectorIndex;
import static research.diffsearch.pipeline.feature.changedistilling.EditScriptOperation.Type.EQUAL;
import static research.diffsearch.util.QueryUtil.isQueryKeyword;

public class EqualExtractor implements FeatureExtractor {

    private final ProgrammingLanguage programmingLanguage;
    private final int featureVectorLength;
    private final boolean isQuery;
    static final EnumMap<EditScriptOperation.Type, Integer> countMap = new EnumMap<>(EditScriptOperation.Type.class);

    public EqualExtractor(ProgrammingLanguage programmingLanguage, int featureVectorLength, boolean isQuery) {
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

    private void processEditScriptStep(FeatureVector vector, EditScriptOperation editScriptOperation,
                                       int startPosition) {
        if (editScriptOperation.getType() == EQUAL) {
            addEqualFeature(vector, editScriptOperation, startPosition);
        }
    }

    private void addEqualFeature(FeatureVector vector,
                                 EditScriptOperation editScriptOperation,
                                 int position) {

        // each node that is equal is a feature
        addFeature(vector, position, editScriptOperation.getOldNode(), 3, "EQUAL");
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
