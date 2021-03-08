package research.diffsearch.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import research.diffsearch.Config;
import research.diffsearch.server.WebServerGUI;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class WebGUIMode extends App {

    private static final Logger logger = LoggerFactory.getLogger(WebGUIMode.class);

    @Override
    public void run() {
        Socket socket;
        Socket socketFaiss;
        ServerSocket server;
        FileOutputStream serverLog;
        try {
            startPythonServer();

            socketFaiss = getFaissSocket();
            server = getDiffSearchServerSocket();
            serverLog = getServerLog();

        } catch (IOException exception) {
            logger.error(exception.getMessage(), exception);
            return;
        }
        while (true) {
            try {
                logger.info("Waiting request on port " + Config.port_web);
                socket = server.accept();
                WebServerGUI client = new WebServerGUI(socket, socketFaiss, serverLog);
                client.start();
            } catch (IOException e) {
                logger.error(e.getMessage(), e);
            }
        }
    }
}
