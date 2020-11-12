package research.diffsearch.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import research.diffsearch.Config;
import research.diffsearch.DiffSearch_WebServer;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class WebMode extends App {

    private static final Logger logger = LoggerFactory.getLogger(WebMode.class);

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
                DiffSearch_WebServer client = new DiffSearch_WebServer(socket, socketFaiss, serverLog);
                client.start();
            } catch (IOException e) {
                logger.error(e.getLocalizedMessage());
                e.printStackTrace();
            }

        }
    }

}
