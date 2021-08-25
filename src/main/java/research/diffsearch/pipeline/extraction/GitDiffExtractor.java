package research.diffsearch.pipeline.extraction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.zeroturnaround.exec.ProcessExecutor;
import org.zeroturnaround.exec.stream.slf4j.Slf4jErrorOutputStream;
import research.diffsearch.pipeline.base.Pipeline;
import research.diffsearch.util.ProgrammingLanguage;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.concurrent.ExecutionException;

public class GitDiffExtractor implements Pipeline<File, File> {
    private static final Logger logger = LoggerFactory.getLogger(GitDiffExtractor.class);

    private final String pathPatches;

    private final ProgrammingLanguage language;

    public GitDiffExtractor(String pathPatches, ProgrammingLanguage language) {
        this.pathPatches = Paths.get(pathPatches).toAbsolutePath().normalize().toString();
        this.language = language;
    }

    @Override
    public File process(File input, int index) {
        try(var out = new BufferedOutputStream(
                new FileOutputStream(new File(pathPatches + "/" + input.getName() + ".patch")))) {
            logger.info("Extracting batch of {}", input);

     //       new ProcessExecutor()
       //             .directory(input)
         //           .command("git", "config", "diff.renameLimit", "99999")
           //         .redirectOutput(new Slf4jErrorOutputStream(logger))
             //       .start().getFuture().get();
    //        new ProcessExecutor()
      //              .directory(input)
        //            .command("git", "log", "-p","--", "*." + language.getSuffix())
          //          .redirectOutput(out)
            //        .start().getFuture().get();
            logger.info("Extracting batch of {} finished.", input);
        } catch (IOException e){// | InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
        return new File(pathPatches + input.getName() + ".patch");
    }
}
