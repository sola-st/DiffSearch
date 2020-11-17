package research.diffsearch.main;

import matching.Matching;
import org.antlr.v4.runtime.tree.ParseTree;
import org.apache.commons.cli.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import research.diffsearch.Config;
import research.diffsearch.Java_Tree;
import research.diffsearch.Pipeline;
import research.diffsearch.ProgrammingLanguage;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.TimeUnit;

/**
 * Main class and starting point of DiffSearch.
 */
public abstract class App implements Runnable {

    private static final Logger logger = LoggerFactory.getLogger(App.class);

    protected static void startPythonServer() {
        startPythonServer(30);
    }

    public static void startPythonServer(long timeout) {
        if (!Config.ONLY_JAVA) {
            logger.info("FAISS SEARCHING STAGE STARTED.");
            try {
                new Thread(Pipeline::search_candidate_changes).start();
                TimeUnit.SECONDS.sleep(timeout);
            } catch (InterruptedException e) {
                logger.error(e.getLocalizedMessage());
                e.printStackTrace();
            }

            logger.info("FAISS SEARCHING STAGE DONE.");
        } else {
            logger.warn("DiffSearch started in ONLY_JAVA mode. Python server must be started separately.");
        }
    }

    protected ServerSocket getServerSocket() {
        ServerSocket server;
        try {
            server = new ServerSocket(Config.port_web);
        } catch (IOException e) {
            logger.error(e.getLocalizedMessage());
            e.printStackTrace();
            return null;
        }
        logger.info("DiffSearch Server active on port " + Config.port_web);
        return server;
    }

    protected FileOutputStream getServerLog() {
        try {
            return new FileOutputStream(Config.server_log_file, true);
        } catch (IOException e) {
            logger.error(e.getLocalizedMessage());
            e.printStackTrace();
            return null;
        }
    }

    protected Socket getFaissSocket() {
        try {
            return new Socket(Config.host, Config.port);
        } catch (IOException e1) {
            e1.printStackTrace();
            logger.error("\nCONNECTION WITH SERVER FAISS FAILED.\n");
            return null;
        }
    }

    private static Options buildCLIOptions() {
        return new Options()
                .addOption("oj", "only-java", false, "does not start the python server")
                .addOption("n", "normal", false, "launch DiffSearch in normal mode")
                .addOption("s", "scalability", false, "launch DiffSearch in scalability mode")
                .addOption("e", "effectiveness", false, "launch DiffSearch in effectiveness mode")
                .addOption("g", "web-gui", false, "launch in web GUI mode")
                .addOption("w", "web", false, "launch DiffSearch with web interface")
                .addOption("l", "log", false, "save log to file")
                .addOption("p", "port", true, "set the port for the web interface")
                .addOption("r", "recall", false, "measure recall of queries (slow!)")
                .addOption("py_port", true, "set the port for the python server")
                .addOption("lang", "language", true, "the programming language (python, javascript or java")
                .addOption("q", "query", true, "process a query");
    }

    private static void parseArgs(String[] args) {
        CommandLineParser parser = new DefaultParser();
        try {
            CommandLine commandLine = parser.parse(buildCLIOptions(), args);

            Config.ONLY_JAVA = commandLine.hasOption("oj");
            Config.NORMAL = commandLine.hasOption("n");
            Config.SCALABILITY = commandLine.hasOption("s");
            Config.EFFECTIVENESS = commandLine.hasOption("e");
            Config.WEB_GUI = commandLine.hasOption("g");
            Config.WEB = commandLine.hasOption("w");
            Config.LOG_FILE = commandLine.hasOption("l");
            Config.QUERY_MODE = commandLine.hasOption("q");
            Config.MEASURE_RECALL = commandLine.hasOption("r");
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
        } catch (ParseException | NumberFormatException exception) {
            logger.error(exception.getLocalizedMessage());
            exception.printStackTrace();
        }
    }

    public static void main(String[] args) {
        logger.debug(System.getProperty("java.vendor"));
        parseArgs(args);
        logger.info("DiffSearch for {}", Config.PROGRAMMING_LANGUAGE.name());

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
        }

        if (app != null) {
            app.run();
        }
    }

    public static boolean run_junit(String query, String candidate) {
        Java_Tree queryJavaTree = new Java_Tree(query);

        ParseTree queryTree = queryJavaTree.get_parsetree();

        Java_Tree changeJavaTree = new Java_Tree(candidate);
        ParseTree changeTree = changeJavaTree.get_parsetree();

        Matching matching = new Matching(queryTree, queryJavaTree.get_parser());

        return matching.isMatch(changeTree, changeJavaTree.get_parser());
    }
}
