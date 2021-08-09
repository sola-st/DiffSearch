package research.diffsearch.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import research.diffsearch.Config;
import research.diffsearch.pipeline.extraction.GitDiffExtractor;
import research.diffsearch.util.ProgressWatcher;

import java.io.File;
import java.nio.file.Paths;
import java.util.List;
import java.util.Objects;

public class GitDiffMode extends App {

    private static final Logger logger = LoggerFactory.getLogger(GitCloneMode.class);
    @Override
    public void run() {
        var absPath = Paths.get(Config.repositoryPath).toAbsolutePath().normalize();

        logger.info("Extracting commit logs...");
        new GitDiffExtractor(absPath.toString())
                .parallelUntilHere(Config.threadCount)
                .connect(new ProgressWatcher<>("Extracting commit logs"))
                .executeIgnoreResults(List.of(Objects.requireNonNull(
                        absPath.toFile().listFiles(File::isDirectory))));
    }
}
