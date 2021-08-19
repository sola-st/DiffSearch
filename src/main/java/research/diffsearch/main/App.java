package research.diffsearch.main;

import matching.Matching;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.Tree;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import research.diffsearch.Config;
import research.diffsearch.Mode;
import research.diffsearch.pipeline.EffectivenessPipeline;
import research.diffsearch.pipeline.ScalabilityPipeline;
import research.diffsearch.server.PythonRunner;
import research.diffsearch.tree.*;
import research.diffsearch.util.CommandLineUtil;
import research.diffsearch.util.FilePathUtils;
import research.diffsearch.util.ProgrammingLanguage;

import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import static research.diffsearch.pipeline.ScalabilityPipeline.runScalabilityPipeline;

/**
 * Main class and starting point of DiffSearch.
 * DiffSearch can be run in different modes, such as feature extraction or batch mode. The sublasses of this
 * class each represent a mode.
 *
 * @author Paul Bredl
 * @author Luca Di Grazia
 */
public abstract class App implements Runnable, Closeable {

    private static final Logger logger = LoggerFactory.getLogger(App.class);

    protected PythonRunner pythonRunner;

    public static void main(String[] args) {
        logger.debug(System.getProperty("java.vendor"));
        CommandLineUtil.parseArgs(args);
        logger.info("DiffSearch {} for {}", Config.DIFFSEARCH_VERSION, Config.PROGRAMMING_LANGUAGE.toString());
        logger.debug("Using {} threads", Config.threadCount);
        if (Config.LOW_RAM) {
            logger.info("DiffSearch in low ram mode.");
        }

        App app = getApp();

        if (app != null) {
            app.run();

            // after execution
            app.stopPythonServer();
            app.close();
        } else {
            logger.error("No DiffSearch mode selected.");
        }
    }

    private static App getApp() {
        App app = null;
        if (Mode.WEB_GUI) {
            app = new WebGUIMode();
        } else if (Mode.WEB) {
            app = new WebMode();
        } else if (Mode.NORMAL) {
            app = new NormalMode();
        } else if (Mode.QUERY_MODE) {
            app = new QueryMode();
        } else if (Mode.CORPUS_FEATURE_EXTRACTION) {
            app = new FeatureExtractionMode();
        } else if (Mode.BATCH) {
            app = new BatchMode();
        } else if (Mode.ANALYSIS_MODE) {
            app = new AnalysisMode();
        } else if (Mode.PARSE_MODE) {
            app = new ParseMode();
        } else if (Mode.EFFECTIVENESS) {
            app = new EffectivenessPipeline();
        } else if (Mode.SCALABILITY) {
            runScalabilityPipeline();
        } else if (Config.MEASURE_RECALL) {
            app = new App() {
                @Override
                public void run() {
                    var extractionMode = new FeatureExtractionMode();
                    extractionMode.run();
                    extractionMode.close();
                    var batchMode = new BatchMode();
                    batchMode.run();
                    batchMode.stopPythonServer();
                    batchMode.close();
                }
            };
        } else if (Mode.GIT_CLONE) {
            app = new GitCloneMode();
        } else if (Mode.DATASET_CREATION) {
            app = new DatasetCreationMode();
        }
        return app;
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
                 * - tfidf: if tfidf weights are used
                 * - path to code changes
                 * - path to properties of the code changes
                 */
                pythonRunner = new PythonRunner(Config.NEAREST_NEIGHBOR_SEARCH_PY,
                        FilePathUtils.getIndexFilePath(Config.PROGRAMMING_LANGUAGE),
                        Integer.toString(Config.k),
                        Config.host,
                        Integer.toString(Config.port),
                        Integer.toString(Config.nprobe),
                        Boolean.toString(Config.RANGE_SEARCH),
                        Integer.toString(Config.k_max),
                        Boolean.toString(Config.TFIDF),
                        FilePathUtils.getChangesJsonFilePath(Config.PROGRAMMING_LANGUAGE),
                        FilePathUtils.getTreesFilePath(Config.PROGRAMMING_LANGUAGE),
                        Boolean.toString(Config.LOW_RAM));

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

    public void close() {
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

        JavaTree changeJavaTree = new JavaTree(candidate);
        Tree changeTree = SerializableTreeNode.fromTree(changeJavaTree.getParseTree(), ProgrammingLanguage.JAVA);
        System.out.println(TreeUtils.getCompleteNodeText(changeTree, ProgrammingLanguage.JAVA.getRuleNames()));
        System.out.println(changeJavaTree.getParseTree().toStringTree(changeJavaTree.getParser()));
        System.out.println(queryTree.toStringTree(queryJavaTree.getParser()));

        Matching matching = new Matching(queryTree, queryJavaTree.getParser());

        return matching.isMatch(changeTree, changeJavaTree.getParser());
    }

    public static boolean runJunit_Python(String query, String candidate) {
         Python3Tree queryPython3Tree = new Python3Tree(query);

        Tree queryTree = queryPython3Tree.getParseTree();

        Python3Tree changePython3Tree = new Python3Tree(candidate);
        Tree changeTree = changePython3Tree.getParseTree();

        Matching matching = new Matching(queryTree, queryPython3Tree.getParser());

        return matching.isMatch(changeTree,changePython3Tree.getParser());
    }

    public static boolean runJunit_JavaScript(String query, String candidate) {
        JavascriptTree queryJavascriptTree = new JavascriptTree(query);

        Tree queryTree = queryJavascriptTree.getParseTree();

        JavascriptTree changeJavascriptTree = new JavascriptTree(candidate);
        System.out.println(changeJavascriptTree.getParseTree().toStringTree(changeJavascriptTree.getParser()));
        System.out.println(queryJavascriptTree.getParseTree().toStringTree(changeJavascriptTree.getParser()));

        Matching matching = new Matching(queryTree, queryJavascriptTree.getParser());

        return matching.isMatch(changeJavascriptTree.getParseTree(), changeJavascriptTree.getParser());
    }
}
