package research.diffsearch.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import research.diffsearch.Config;
import research.diffsearch.pipeline.feature.FeatureExtractionPipeline;
import research.diffsearch.tree.TreeFactory;
import research.diffsearch.util.Util;

public class AnalysisMode extends App {
    private static final Logger logger = LoggerFactory.getLogger(AnalysisMode.class);

    @Override
    public void run() {
        String query = Config.query;
        logger.info("Analysing " + query);
        var tree = TreeFactory.getAbstractTree(query, Config.PROGRAMMING_LANGUAGE);

        if (tree.getParser().getNumberOfSyntaxErrors() > 0 ) {
            logger.warn("Code change has syntax errors.");
        }

        Util.printParseTree(tree);
        Util.printFeatureVectorAnalysis(FeatureExtractionPipeline.getDefaultFeatureExtractionPipeline(true)
                .extractFeatures(tree.getParseTree()));
    }
}
