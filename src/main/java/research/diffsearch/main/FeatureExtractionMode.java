package research.diffsearch.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import research.diffsearch.Config;
import research.diffsearch.PipelineOld;
import research.diffsearch.pipeline.base.Pipeline;
import research.diffsearch.util.QueryUtil;
import research.diffsearch.util.Util;

import java.io.IOException;

import static research.diffsearch.util.FilePathUtils.*;

public class FeatureExtractionMode extends App {

    private static final Logger logger = LoggerFactory.getLogger(FeatureExtractionMode.class);

    @Override
    public void run() {
        logger.info("Starting feature extraction on corpus.");

        try {
            Pipeline.from(QueryUtil::formatQuery)
                    .parallel()
                    .connect(PipelineOld.getDefaultFeatureExtractionPipeline())
                    .connect(Util::featureVectorToString)
                    .synchronize()
                    .peek((query, index) -> {
                        if (index % 10_000 == 0 && index > 0) {
                            logger.debug("Synchronized {} changes", index);
                        }
                    })
                    .connect(getStringFileWriterPipeline(getFeatureCSVPath(Config.PROGRAMMING_LANGUAGE)))
                    .execute(getAllLines(getChangesFilePath(Config.PROGRAMMING_LANGUAGE)));
        } catch (IOException e) {
            logger.error(e.getLocalizedMessage());
            e.printStackTrace();
        }
    }
}
