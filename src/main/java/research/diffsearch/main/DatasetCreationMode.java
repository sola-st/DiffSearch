package research.diffsearch.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import research.diffsearch.Config;
import research.diffsearch.pipeline.base.Pipeline;
import research.diffsearch.pipeline.extraction.ChangeExtractor;
import research.diffsearch.pipeline.extraction.GitDiffExtractor;
import research.diffsearch.util.ProgressWatcher;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import static org.apache.commons.io.FileUtils.deleteQuietly;
import static research.diffsearch.util.FilePathUtils.*;

public class DatasetCreationMode extends App {
    private static final Logger logger = LoggerFactory.getLogger(DatasetCreationMode.class);

    @Override
    public void run() {

        var absPath = Paths.get(Config.repositoryPath).toAbsolutePath().normalize();

        logger.info("Extracting commit logs...");
        new GitDiffExtractor(absPath.toString(), Config.PROGRAMMING_LANGUAGE)
                .parallelUntilHere(Config.threadCount)
                .connect(new ProgressWatcher<>("Extracting commit logs"))
                .executeIgnoreResults(List.of(Objects.requireNonNull(
                        absPath.toFile().listFiles(File::isDirectory))));

        Pipeline.<File, File>from(file -> new ChangeExtractor(new File(Config.repositoryPath), Config.PROGRAMMING_LANGUAGE)
                        .extractCodeChangesToFile(file))
                //.parallelUntilHere(Config.threadCount)
                .connect(new ProgressWatcher<>("Extracting code changes"))
                .executeIgnoreResults(listFilesOfDirectory(Config.repositoryPath, ".patch"));
        logger.info("Finished extraction");

        var outputFile = new File(getChangesJsonFilePath(Config.PROGRAMMING_LANGUAGE));

        deleteQuietly(outputFile);
        deleteQuietly(new File(getTreesFilePath(Config.PROGRAMMING_LANGUAGE)));
        logger.info("Saving code changes...");

        try (var outputWriter = new BufferedWriter(new FileWriter(outputFile, true))) {

            var treeWriter = new BufferedWriter(new FileWriter(getTreesFilePath(Config.PROGRAMMING_LANGUAGE)));

            for (File f : listFilesOfDirectory(Config.repositoryPath, ".cc")) {
                for (String line : getAllLines(f.getAbsolutePath())) {
                    outputWriter.write(line);
                    outputWriter.newLine();
                }
                var treeFile = new File(f.getPath() + "tree");
                for (String line : getAllLines(treeFile.getAbsolutePath())) {
                    treeWriter.write(line);
                    treeWriter.newLine();
                }
                deleteQuietly(treeFile);

            }

            logger.info("Deleting temp files...");

            for (File f : listFilesOfDirectory(Config.repositoryPath, ".cc")) {
                deleteQuietly(f);
                var treeFile = new File(f.getPath() + "tree");
                deleteQuietly(treeFile);

            }
            treeWriter.close();
        } catch (IOException e) {
            logger.error(e.getMessage(), e);
        }


        logger.info("Change extraction finished.");
    }

    public static List<File> listFilesOfDirectory(String directoryName, String fileExtension) {
        return List.of(Optional.ofNullable(
                        Paths.get(directoryName)
                                .toAbsolutePath()
                                .normalize()
                                .toFile()
                                .listFiles((dir, name) -> name.endsWith(fileExtension)))
                .orElse(new File[0]));
    }

}
