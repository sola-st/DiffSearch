package research.diffsearch.util;

import org.apache.commons.cli.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import research.diffsearch.Config;

import static java.lang.Byte.parseByte;
import static java.lang.Integer.parseInt;

public class CommandLineUtil {

    private static final Logger logger = LoggerFactory.getLogger(CommandLineUtil.class);

    public static Options buildCLIOptions() {
        return new Options()
                .addOption("pyc", "py-command", true, "command to run python")
                .addOption("lang", "language", true, "the programming language (python, javascript or java")
                .addOption("l", "log", false, "save log to file")
                .addOption("n", "normal", false, "launch DiffSearch in normal mode")
                .addOption("g", "web-gui", false, "launch in web GUI mode")
                .addOption("w", "web", false, "launch DiffSearch with web interface")
                .addOption("oj", "only-java", false, "does not start the python server")
                .addOption("p", "port", true, "set the port for the web interface")
                .addOption("q", "query", true, "process a query")
                .addOption("r", "recall", false, "measure recall of queries (slow!)")
                .addOption("s", "silent", false, "omit large console outputs")
                .addOption("py_port", true, "set the port for the python server")
                .addOption("k", true, "set value for k")
                .addOption("fe", "extract features from the corpus")
                .addOption("t", "thread-count", true, "number of threads to use")
                .addOption("vl", "single-feature-vector-length", true, "size a each partition of the feature vectors")
                .addOption("cb", "count-bits", true, "number of count bits per feature. Must be at least 1.")
                .addOption("extractors", true, "which feature extractors to use. Syntax: <name>(:<bits>)?, separated with commas")
                .addOption("help", "show help")
                .addOption("rs", "range-search", true, "if faiss should use range search. Optional: How many additional features a code changes may have in comparison to the query.")
                .addOption("mt", "timeout", true, "matching timeout, after this time matching gets cancelled.")
                .addOption(Option.builder("b")
                        .longOpt("batch")
                        .numberOfArgs(2)
                        .optionalArg(true)
                        .build());
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
                Config.port_web = parseInt(commandLine.getOptionValue("p"));
            }
            if (commandLine.hasOption("q")) {
                Config.query = commandLine.getOptionValue("q");
            }
            if (commandLine.hasOption("py_port")) {
                Config.port = parseInt(commandLine.getOptionValue("py_port"));
            }
            if (commandLine.hasOption("lang")) {
                Config.PROGRAMMING_LANGUAGE = ProgrammingLanguage.valueOf(
                        commandLine.getOptionValue("lang").toUpperCase());
            }
            if (commandLine.hasOption("k")) {
                Config.k = parseInt(commandLine.getOptionValue("k"));
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
            if (commandLine.hasOption("cb")) {
                Config.COUNT_BITS = parseByte(commandLine.getOptionValue("cb"));
            }
            if (commandLine.hasOption("pyc")) {
                Config.PYTHON_CMD = commandLine.getOptionValue("pyc");
            }
            if (commandLine.hasOption("t")) {
                Config.threadCount = parseInt(commandLine.getOptionValue("t"));
            }
            if (commandLine.hasOption("vl")) {
                Config.SINGLE_FEATURE_VECTOR_LENGTH = parseInt(commandLine.getOptionValue("vl"));
            }
            if (commandLine.hasOption("extractors")) {
                Config.featureExtractors = commandLine.getOptionValue("extractors");
            }
            if (commandLine.hasOption("rs")) {
                Config.RANGE_SEARCH = true;
                var maxCount = commandLine.getOptionValue("rs");
                if (!maxCount.isBlank()) {
                    Config.rangeSearchMaxAdditionalFeatures = parseInt(maxCount);
                }
            }
            if (commandLine.hasOption("mt")) {
                Config.matchingTimeoutSeconds = parseInt(commandLine.getOptionValue("mt"));
            }
        } catch (ParseException | NumberFormatException exception) {
            logger.error(exception.getMessage());
        }
    }
}
