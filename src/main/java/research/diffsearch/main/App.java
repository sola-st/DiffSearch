package research.diffsearch.main;

import matching.Matching;
import org.antlr.v4.runtime.tree.ParseTree;
import org.apache.commons.cli.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import research.diffsearch.Config;
import research.diffsearch.server.PythonRunner;
import research.diffsearch.tree.Java_Tree;
import research.diffsearch.util.CliUtil;
import research.diffsearch.util.ProgrammingLanguage;

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
                new PythonRunner("./src/main/resources/Python/FAISS_Nearest_Neighbor_Search.py",
                        "./src/main/resources/Features_Vectors/faiss_java.index",
                        Integer.toString(Config.k),
                        Config.host,
                        Integer.toString(Config.port))
                .waitUntil(input -> input.toLowerCase().contains("server started"));
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

    private static void parseArgs(String[] args) {
        CommandLineParser parser = new DefaultParser();
        try {
            Options options = CliUtil.buildCLIOptions();
            CommandLine commandLine = parser.parse(options, args);

            if (commandLine.hasOption("help")) {
                new HelpFormatter().printHelp("dfs", options);
            }

            Config.ONLY_JAVA = commandLine.hasOption("oj");
            Config.NORMAL = commandLine.hasOption("n");
            Config.SCALABILITY = commandLine.hasOption("s");
            Config.EFFECTIVENESS = commandLine.hasOption("e");
            Config.WEB_GUI = commandLine.hasOption("g");
            Config.WEB = commandLine.hasOption("w");
            Config.LOG_FILE = commandLine.hasOption("l");
            Config.QUERY_MODE = commandLine.hasOption("q");
            Config.MEASURE_RECALL = commandLine.hasOption("r");
            Config.CORPUS_FEATURE_EXTRACTION = commandLine.hasOption("fe");
            Config.SILENT = commandLine.hasOption("silent");
            Config.BATCH = commandLine.hasOption("b");

            if (commandLine.hasOption("p")) {
                Config.port_web = Integer.parseInt(commandLine.getOptionValue("p"));
            }
            if (commandLine.hasOption("q")) {
                Config.query = commandLine.getOptionValue("q");
            }
            if (commandLine.hasOption("py_port")) {
                Config.port = Integer.parseInt(commandLine.getOptionValue("py_port"));
            }
            if (commandLine.hasOption("lang")) {
                Config.PROGRAMMING_LANGUAGE = ProgrammingLanguage.valueOf(
                        commandLine.getOptionValue("lang").toUpperCase());
            }
            if (commandLine.hasOption("k")) {
                Config.k = Integer.parseInt(commandLine.getOptionValue("k"));
            }
            if (commandLine.hasOption("b")) {
                var params = commandLine.getOptionValues("b");
                if (params != null && params.length > 0) {
                    Config.batchFilePath = params[0];
                    if (params.length > 1) {
                        Config.batchOutput = params[1];
                    }
                }
            }
        } catch (ParseException | NumberFormatException exception) {
            logger.error(exception.getMessage());
        }
    }

    public static void main(String[] args) {
        logger.debug(System.getProperty("java.vendor"));
        parseArgs(args);
        logger.info("DiffSearch for {}", Config.PROGRAMMING_LANGUAGE.toString());

        App app = null;
        if (Config.WEB_GUI) {
            app = new WebGUIMode();
        } else if (Config.WEB) {
            app = new WebMode();
        } else if (Config.NORMAL) {
            app = new NormalMode();
        } else if (Config.SCALABILITY) {
            app = new ScalabilityMode();
        } else if (Config.EFFECTIVENESS) {
            app = new EffectivenessMode();
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
        Java_Tree queryJavaTree = new Java_Tree(query);

        ParseTree queryTree = queryJavaTree.get_parsetree();

        Java_Tree changeJavaTree = new Java_Tree(candidate);
        ParseTree changeTree = changeJavaTree.get_parsetree();

        Matching matching = new Matching(queryTree, queryJavaTree.get_parser());

        return matching.isMatch(changeTree, changeJavaTree.get_parser());
    }
}
