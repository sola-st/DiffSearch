package research.diffsearch.main;

import research.diffsearch.pipeline.MatchingPipeline;
import research.diffsearch.pipeline.base.Pipeline;

import java.io.IOException;

import static research.diffsearch.util.FilePathUtils.*;
import static research.diffsearch.util.ProgrammingLanguage.JAVA;

/**
 * @author Paul Bredl
 * @author Luca Di Grazia
 */
public class Deduplication {

    public static void main(String[] args) throws IOException {
        var codeChanges = getCodeChanges(JAVA);
        Pipeline
                .getFilter(MatchingPipeline::isNotEqualCodeChange)
                .connect(getStringFileWriterPipeline(getChangesFilePath(JAVA) + ".deduplicated"))
                .execute(codeChanges);
    }
}
