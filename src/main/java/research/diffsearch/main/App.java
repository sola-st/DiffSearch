package research.diffsearch.main;

import matching.Matching;
import org.antlr.v4.runtime.tree.ParseTree;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import research.diffsearch.Config;
import research.diffsearch.server.PythonRunner;
import research.diffsearch.tree.JavaTree;
import research.diffsearch.util.CommandLineUtil;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Main class and starting point of DiffSearch.
 */
public abstract class App implements Runnable {

    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void startPythonServer() {
        if (!Config.ONLY_JAVA) {
            try {
                var runner = new PythonRunner("./src/main/resources/Python/FAISS_Nearest_Neighbor_Search.py",
                        "./src/main/resources/Features_Vectors/faiss_java3.index",
                        Integer.toString(Config.k),
                        Config.host,
                        Integer.toString(Config.port));

                runner.runAndWaitUntil(input -> input.toLowerCase().contains("server started"));

            } catch (IOException | InterruptedException exception) {
                logger.error(exception.getMessage(), exception);
            }
        } else {
            logger.warn("DiffSearch started in ONLY_JAVA mode. Python server must be started separately.");
        }
    }

    protected static ServerSocket getServerSocket() throws IOException {
        ServerSocket server;
        server = new ServerSocket(Config.port_web);
        logger.info("DiffSearch Server active on port " + Config.port_web);
        return server;
    }

    protected static FileOutputStream getServerLog() throws FileNotFoundException {
        return new FileOutputStream(Config.server_log_file, true);
    }

    protected static Socket getFaissSocket() throws IOException {
        return new Socket(Config.host, Config.port);
    }

    public static void main(String[] args) {
        logger.debug(System.getProperty("java.vendor"));
        CommandLineUtil.parseArgs(args);
        logger.info("DiffSearch for {}", Config.PROGRAMMING_LANGUAGE.toString());

        App app = null;
        if (Config.WEB_GUI) {
            app = new WebGUIMode();
        } else if (Config.WEB) {
            app = new WebMode();
        } else if (Config.NORMAL) {
            app = new NormalMode();
        } else if (Config.QUERY_MODE) {
            app = new QueryMode();
        } else if (Config.CORPUS_FEATURE_EXTRACTION) {
            app = new FeatureExtractionMode();
        } else if (Config.BATCH) {
            app = new BatchMode();
        }

        if (app != null) {
            app.run();
        }
    }

    public static boolean runJunit(String query, String candidate) {
        JavaTree queryJavaTree = new JavaTree(query);

        ParseTree queryTree = queryJavaTree.getParseTree();

        JavaTree changeJavaTree = new JavaTree(candidate);
        ParseTree changeTree = changeJavaTree.getParseTree();

        Matching matching = new Matching(queryTree, queryJavaTree.getParser());

        return matching.isMatch(changeTree, changeJavaTree.getParser());
    }
}
