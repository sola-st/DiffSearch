package research.diffsearch.util;

import org.apache.commons.cli.Options;

public class CliUtil {
    public static Options buildCLIOptions() {
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
                .addOption("q", "query", true, "process a query")
                .addOption("k", true, "set value for k")
                .addOption("fe", "extract features from the corpus")
                .addOption("help", "show help")
                .addOption("silent", "don't output results in console");
    }
}
