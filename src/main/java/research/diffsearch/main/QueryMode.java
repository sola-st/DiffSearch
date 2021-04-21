package research.diffsearch.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import research.diffsearch.Config;
import research.diffsearch.pipeline.OnlinePipeline;
import research.diffsearch.pipeline.RecallPipeline;
import research.diffsearch.util.Util;

import java.io.IOException;
import java.net.Socket;

/**
 * DiffSearch mode that executes a single query.
 *
 * Usage: diffsearch -q <i>query_string</i>
 */
public class QueryMode extends App {

    private static final Logger logger = LoggerFactory.getLogger(QueryMode.class);

    @Override
    public void run() {
        try {
            startPythonServer();
            logger.info("DiffSearch in Query mode");

            Socket socketFaiss = getFaissSocket();

            new OnlinePipeline(socketFaiss, Config.PROGRAMMING_LANGUAGE)
                    // add recall pipeline if necessary
                    .connectIf(Config.MEASURE_RECALL, new RecallPipeline(Config.PROGRAMMING_LANGUAGE, Config.query))
                    .peek(result -> logger.info("Found {} results", result.getResults().size()))
                    .peek(Util::printOutputList)
                    .execute(Config.query);
        } catch (IOException exception) {
            logger.error(exception.getMessage(), exception);
        }
    }
}
