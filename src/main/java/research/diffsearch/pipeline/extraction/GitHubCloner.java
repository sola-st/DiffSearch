package research.diffsearch.pipeline.extraction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.zeroturnaround.exec.ProcessExecutor;
import org.zeroturnaround.exec.stream.slf4j.Slf4jInfoOutputStream;
import research.diffsearch.pipeline.base.Pipeline;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.concurrent.TimeoutException;

public class GitHubCloner implements Pipeline<String, String> {
    private static final Logger logger = LoggerFactory.getLogger(GitHubCloner.class);
    private final String outputPath;

    public GitHubCloner(String outputPath) {
        this.outputPath = outputPath;
    }

    @Override
    public String process(String input, int index) {
        var dir = Paths.get(outputPath).toAbsolutePath().normalize().toFile();
        if (dir.mkdirs()) {
            logger.info("Created directory {}", dir.getAbsolutePath());
        }

        var subfolder = dir + "/" +  input.replace("https://github.com/", "").replace('/', '.');

        try {
            new ProcessExecutor()
                    .directory(dir)
                    .command("git", "clone", input, subfolder)
                    .redirectOutput(new Slf4jInfoOutputStream(logger))
                    .execute();
        } catch (IOException | InterruptedException | TimeoutException e) {
            logger.error(e.getMessage(), e);
        }

        return input;
    }
}
