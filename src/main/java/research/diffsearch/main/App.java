package research.diffsearch.main;

import matching.Matching;
import org.antlr.v4.runtime.tree.ParseTree;
import org.apache.commons.cli.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import research.diffsearch.Config;
import research.diffsearch.Java_Tree;
import research.diffsearch.Pipeline;

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

    protected void startPythonServer() {
        if (!Config.ONLY_JAVA) {
            logger.info("FAISS SEARCHING STAGE STARTED.\n");
            try {
                new Thread(Pipeline::search_candidate_changes).start();
            } catch (Exception e) {
                logger.error(e.getLocalizedMessage());
                e.printStackTrace();
            }

            try {
                // TODO change this
                TimeUnit.SECONDS.sleep(30);
            } catch (InterruptedException e) {
                logger.error(e.getLocalizedMessage());
                e.printStackTrace();
            }

            logger.info("FAISS SEARCHING STAGE DONE.\n");
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
                .addOption("g", "web-gui", false, "")
                .addOption("w", "web", false, "launch DiffSearch with web interface")
                .addOption("l", "log", false, "save log to file")
                .addOption("p", "port", true, "set the port for the web interface")
                .addOption("py_port", true, "set the port for the python server")
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
            if (commandLine.hasOption("p")) {
                Config.port_web = Integer.parseInt(commandLine.getOptionValue("p"));
            }
            if (commandLine.hasOption("py_port")) {
                Config.port = Integer.parseInt(commandLine.getOptionValue("py_port"));
            }

        } catch (ParseException | NumberFormatException exception) {
            logger.error(exception.getLocalizedMessage());
            exception.printStackTrace();
        }
    }

    public static void main(String[] args) {
        logger.debug(System.getProperty("java.vendor"));

        parseArgs(args);

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
