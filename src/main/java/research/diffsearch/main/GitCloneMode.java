package research.diffsearch.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import research.diffsearch.Config;
import research.diffsearch.pipeline.base.Pipeline;
import research.diffsearch.pipeline.extraction.GitHubCloner;
import research.diffsearch.util.FilePathUtils;

import java.io.File;
import java.util.function.Function;

public class GitCloneMode extends App {
    private static final Logger logger = LoggerFactory.getLogger(GitCloneMode.class);

    @Override
    public void run() {
        new File(Config.repositoryPath).mkdir();

        Pipeline.from((Function<String, String>) s -> {
                    logger.info("Cloning {}", s);
                    return s;
                }).connect(new GitHubCloner(Config.repositoryPath))
                .execute(FilePathUtils.getAllLines(Config.listOfRepositoriesPath),
                        FilePathUtils.getNumberOfLines(Config.listOfRepositoriesPath));
    }
}
