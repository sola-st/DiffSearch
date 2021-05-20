package research.diffsearch.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import research.diffsearch.Config;
import research.diffsearch.server.DiffSearchWebServer;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * DiffSearch web mode. Shows a simple gui to execute queries.
 *
 * @author Paul Bredl
 * @author Luca Di Grazia
 */
public class WebMode extends App {

    private static final Logger logger = LoggerFactory.getLogger(WebMode.class);

    @Override
    public void run() {
        startPythonServer();

        Socket socketFaiss;
        Socket socket;
        ServerSocket server;

        FileOutputStream serverLog;
        try {
            serverLog = getServerLog();
            server = getDiffSearchServerSocket();
            socketFaiss = getFaissSocket();
        } catch (IOException exception) {
            logger.error(exception.getMessage(), exception);
            return;
        }

        while (true) {
            try {
                logger.debug("Waiting request on port " + Config.port_web);
                socket = server.accept();
                DiffSearchWebServer client = new DiffSearchWebServer(socket, socketFaiss, serverLog);
                client.start();
            } catch (IOException e) {
                logger.error(e.getMessage(), e);
            }
        }
    }
}
