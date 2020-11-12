package research.diffsearch.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import research.diffsearch.Config;
import research.diffsearch.WebServerGUI;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class WebGUIMode extends App {

    private static final Logger logger = LoggerFactory.getLogger(WebGUIMode.class);

    @Override
    public void run() {
        startPythonServer();

        Socket socketFaiss = getFaissSocket();
        Socket socket;
        ServerSocket server = getServerSocket();
        if (server == null || socketFaiss == null) {
            return;
        }

        FileOutputStream serverLog = getServerLog();

        while (true) {
            try {
                logger.info("Waiting request on port " + Config.port_web);
                socket = server.accept();
                WebServerGUI client = new WebServerGUI(socket, socketFaiss, serverLog);
                client.start();
            } catch (IOException e) {
                logger.error(e.getLocalizedMessage());
                e.printStackTrace();
            }

        }
    }
}
