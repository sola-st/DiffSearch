package research.diffsearch.pipeline;

import research.diffsearch.pipeline.feature.FeatureExtractionPipeline;
import research.diffsearch.tree.TreeObjectUtils;
import research.diffsearch.util.FilePathUtils;
import research.diffsearch.util.ProgrammingLanguage;
import research.diffsearch.util.QueryUtil;

import java.io.IOException;

public class FeatureExtractionPipelineOld {

    public static Object queryFeatureExtraction(String queryInput, ProgrammingLanguage programmingLanguage) {
        try {
            Object queryTree = TreeObjectUtils.getChangeTree(queryInput, programmingLanguage);
            if (QueryUtil.checkIfQueryIsValid(queryInput, programmingLanguage)) {
                new FeatureExtractionPipeline()
                        .connect(FilePathUtils.getVectorFileWriterPipeline(FilePathUtils.QUERY_FEATURE_VECTORS_CSV))
                        .execute(queryInput);
                return queryTree;
            }
            return null;
        } catch (IOException exception) {
            return null;
        }
    }

}
