package research.diffsearch.main;

import matching.Matching;
import org.antlr.v4.runtime.tree.ParseTree;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import research.diffsearch.Config;
import research.diffsearch.server.PythonRunner;
import research.diffsearch.tree.JavaTree;
import research.diffsearch.util.CommandLineUtil;

import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Main class and starting point of DiffSearch.
 * DiffSearch can be run in different modes, such as feature extraction or batch mode. The sublasses of this
 * class each represent a mode.
 */
public abstract class App implements Runnable, Closeable {

    private static final Logger logger = LoggerFactory.getLogger(App.class);

    protected PythonRunner pythonRunner;

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

            // after execution
            app.stopPythonServer();
            app.close();
        } else {
            logger.error("No DiffSearch mode selected.");
        }
    }

    /**
     * Starts python server for nearest neighbor search.
     */
    public void startPythonServer() {
        if (!Config.ONLY_JAVA) {
            try {
                /*
                 * Args for the python nearest neighbor search:
                 * - path to the index file
                 * - k (number of candidate changes)
                 * - host name of the server
                 * - port of the server
                 * - nprobe: number of clusters to consider
                 * - range_search: true or false
                 * - k_max: maximal number of candidate changes
                 */
                pythonRunner = new PythonRunner(Config.NEAREST_NEIGHBOR_SEARCH_PY,
                        Config.INDEX_FILE,
                        Integer.toString(Config.k),
                        Config.host,
                        Integer.toString(Config.port),
                        Integer.toString(Config.nprobe),
                        Boolean.toString(Config.RANGE_SEARCH),
                        Integer.toString(Config.rangeSearchMaxAdditionalFeatures));

                pythonRunner.runAndWaitUntil(input -> input.toLowerCase().contains("server started"));

            } catch (IOException | InterruptedException exception) {
                logger.error(exception.getMessage(), exception);
            }
        } else {
            logger.warn("DiffSearch started in ONLY_JAVA mode. Python server must be started separately.");
        }
    }

    public void stopPythonServer() {
        if (!Config.ONLY_JAVA && pythonRunner != null) {
            pythonRunner.shutDownProcess();
        }
    }

    private static ServerSocket diffSearchServerSocket = null;

    protected static ServerSocket getDiffSearchServerSocket() throws IOException {
        if (diffSearchServerSocket == null) {
            diffSearchServerSocket = new ServerSocket(Config.port_web);
        }
        logger.info("DiffSearch Server active on port " + Config.port_web);
        return diffSearchServerSocket;
    }

    private static FileOutputStream serverLog = null;

    protected static FileOutputStream getServerLog() throws FileNotFoundException {
        if (serverLog == null) {
            serverLog = new FileOutputStream(Config.server_log_file, true);
        }
        return serverLog;
    }

    private static Socket faissSocket = null;

    protected static Socket getFaissSocket() throws IOException {
        if (faissSocket == null) {
            faissSocket = new Socket(Config.host, Config.port);
        }
        return faissSocket;
    }

    public void close(){
        try {
            if (faissSocket != null) {
                faissSocket.close();
            }
            if (serverLog != null) {
                serverLog.close();
            }
            if (diffSearchServerSocket != null) {
                diffSearchServerSocket.close();
            }
        } catch (IOException e) {
            logger.error(e.getMessage(), e);
        }
    }

    /**
     * Method to run JUnit tests. Returns true, if the candidate matches the query.
     */
    public static boolean runJunit(String query, String candidate) {
        JavaTree queryJavaTree = new JavaTree(query);

        ParseTree queryTree = queryJavaTree.getParseTree();
        System.out.println(queryJavaTree.getTreeString());

        JavaTree changeJavaTree = new JavaTree(candidate);
        System.out.println(changeJavaTree.getTreeString());
        ParseTree changeTree = changeJavaTree.getParseTree();

        Matching matching = new Matching(queryTree, queryJavaTree.getParser());

        return matching.isMatch(changeTree, changeJavaTree.getParser());
    }
}
