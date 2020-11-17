package research.diffsearch.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import research.diffsearch.Config;
import research.diffsearch.DiffSearchWebServer;
import research.diffsearch.Pipeline;
import research.diffsearch.WebServerGUI;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;

public class QueryMode extends App {

    private static final Logger logger = LoggerFactory.getLogger(QueryMode.class);
    @Override
    public void run() {
        startPythonServer();

        Socket socketFaiss = getFaissSocket();
        if (socketFaiss == null) {
            return;
        }

        logger.info("Processing {}", Config.query);
        long currentTime = System.currentTimeMillis();
        List<String> result = Pipeline.run_test_noGUI(Config.query, socketFaiss);
        DiffSearchWebServer.printOutputList(result, System.currentTimeMillis() - currentTime);
    }
}
