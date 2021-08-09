package research.diffsearch.pipeline.extraction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.zeroturnaround.exec.ProcessExecutor;
import org.zeroturnaround.exec.stream.slf4j.Slf4jErrorOutputStream;
import research.diffsearch.pipeline.base.Pipeline;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.concurrent.ExecutionException;

public class GitDiffExtractor implements Pipeline<File, File> {
    private static final Logger logger = LoggerFactory.getLogger(GitDiffExtractor.class);

    private final String pathPatches;

    public GitDiffExtractor(String pathPatches) {
        this.pathPatches = Paths.get(pathPatches).toAbsolutePath().normalize().toString();
    }

    @Override
    public File process(File input, int index) {
        try {
            logger.info("Extracting batch of {}", input);
            new ProcessExecutor()
                    .directory(input)
                    .command("git", "config", "diff.renameLimit", "99999")
                    .redirectOutput(new Slf4jErrorOutputStream(logger))
                    .start().getFuture().get();
            new ProcessExecutor()
                    .directory(input)
                    .command("git", "log", "-p", "-m", "--minimal", "--", "*.java")
                    .redirectOutput(new BufferedOutputStream(
                            new FileOutputStream(new File(pathPatches + "/" + input.getName() + ".patch"))))
                    .start().getFuture().get();
            logger.info("Extracting batch of {} finished.", input);
        } catch (IOException | InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
        return new File(pathPatches + input.getName() + ".patch");
    }
}
