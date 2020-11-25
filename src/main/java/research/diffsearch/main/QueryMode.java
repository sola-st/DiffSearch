package research.diffsearch.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import research.diffsearch.Config;
import research.diffsearch.pipeline.OnlinePipeline;
import research.diffsearch.pipeline.RecallPipeline;
import research.diffsearch.util.Util;

import java.net.Socket;

public class QueryMode extends App {

    private static final Logger logger = LoggerFactory.getLogger(QueryMode.class);

    @Override
    public void run() {
        startPythonServer();
        logger.info("DiffSearch in Query mode");

        Socket socketFaiss = getFaissSocket();
        if (socketFaiss == null) {
            return;
        }

        long currentTime = System.currentTimeMillis();
        new OnlinePipeline(socketFaiss, Config.PROGRAMMING_LANGUAGE)
                .connectIf(Config.MEASURE_RECALL, new RecallPipeline(Config.PROGRAMMING_LANGUAGE))
                .peek(result -> Util.printOutputList(result, System.currentTimeMillis() - currentTime))
                .processSync(Config.query);
    }
}
