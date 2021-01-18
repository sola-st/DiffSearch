package research.diffsearch.util;

import org.apache.commons.cli.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import research.diffsearch.Config;

public class CommandLineUtil {

    private static final Logger logger = LoggerFactory.getLogger(CommandLineUtil.class);

    public static Options buildCLIOptions() {
        return new Options()
                .addOption("oj", "only-java", false, "does not start the python server")
                .addOption("n", "normal", false, "launch DiffSearch in normal mode")
                .addOption("g", "web-gui", false, "launch in web GUI mode")
                .addOption("w", "web", false, "launch DiffSearch with web interface")
                .addOption("l", "log", false, "save log to file")
                .addOption("p", "port", true, "set the port for the web interface")
                .addOption("r", "recall", false, "measure recall of queries (slow!)")
                .addOption("py_port", true, "set the port for the python server")
                .addOption("lang", "language", true, "the programming language (python, javascript or java")
                .addOption("q", "query", true, "process a query")
                .addOption("k", true, "set value for k")
                .addOption("fe", "extract features from the corpus")
                .addOption("help", "show help")
                .addOption(Option.builder("b")
                        .longOpt("batch")
                        .numberOfArgs(2)
                        .optionalArg(true)
                        .build())
                .addOption(Option.builder("s")
                        .longOpt("silent")
                        .optionalArg(true)
                        .desc("omit large console outputs")
                        .build()
                );
    }

    public static void parseArgs(String command) {
        parseArgs(org.apache.commons.exec.CommandLine.parse(command).getArguments());
    }

    public static void parseArgs(String[] args) {
        CommandLineParser parser = new DefaultParser();
        try {
            Options options = buildCLIOptions();
            CommandLine commandLine = parser.parse(options, args);

            if (commandLine.hasOption("help")) {
                new HelpFormatter().printHelp("dfs", options);
            }

            Config.ONLY_JAVA = commandLine.hasOption("oj");
            Config.NORMAL = commandLine.hasOption("n");
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
}
