package research.diffsearch.pipeline;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import research.diffsearch.Config;
import research.diffsearch.pipeline.base.Pipeline;
import research.diffsearch.util.*;

import java.io.IOException;
import java.util.List;
import java.util.function.BiConsumer;

import static research.diffsearch.util.FilePathUtils.*;

public class RecallPipeline implements
        Pipeline<List<CodeChangeWeb>, List<CodeChangeWeb>>, ProgrammingLanguageDependent {

    private static final Logger logger = LoggerFactory.getLogger(RecallPipeline.class);

    private final ProgrammingLanguage language;

    public RecallPipeline(ProgrammingLanguage language) {
        this.language = language;
    }

    /*// TODO remove
    public static double measureRecall(long actualResults, String query) {
        if (Config.MEASURE_RECALL) {
            logger.warn("Recall measurement is active. This will have a heavy impact on performance!");
            double expected = getTotalNumberOfExpectedResults(query, Config.PROGRAMMING_LANGUAGE);
            logger.debug("Expected {} results.", expected);
            double result = actualResults / expected;
            if (expected == 0) {
                result = actualResults * 1.0;
            }
            logger.info("Recall: {}", result);
            return result;
        } else {
            logger.debug("Skipping recall measurement");
        }
        return 0.0;
    }*/

    static int getTotalNumberOfExpectedResults(String query, ProgrammingLanguage language) throws IOException {
        return new MatchingPipeline(language)
                .parallel()
                .synchronize()
                .connect(getListFileWriterPipeline("./src/main/resources/Recall/recallResult" +
                                                   query.hashCode() + ".txt"))
                .processSync(getCodeChanges(
                        getChangesFilePath(language),
                        getChangesInfoFilePath(language), query))
                .size();
        /*try (BufferedWriter recallOutputWriter =
                     FilePathUtils.getWriter("./src/main/resources/Recall/recallResult" +
                                             query.toString() + ".txt")) {
            String filePath = FilePathUtils.getChangesFilePath(language);

            Iterable<String> allLines = FilePathUtils.getAllLines(filePath);
            ParseTree queryParseTree = TreeObjectUtils.getParseTree(query, language);
            // use array to allow lambda
            final long[] resultAndProcessed = {0, 0}; // first: result, second: progress

            for (String candidate : allLines) {
                Object candidateChangeTree = TreeObjectUtils.getChangeTree(candidate, language);
                ParseTree changeParseTree = TreeObjectUtils.getParseTree(candidateChangeTree, language);

                Matching matching = new Matching(queryParseTree, TreeObjectUtils.getParser(query, language));

                if (matching.isMatch(changeParseTree, TreeObjectUtils.getParser(candidateChangeTree, language))) {
                    if (PipelineOld.isNotEqualCodeChange(candidate)) {
                        recallOutputWriter.write(candidate + "\n");
                        resultAndProcessed[0]++;
                    }
                }
                resultAndProcessed[1]++;

                if (resultAndProcessed[1] % 100_000 == 0) {
                    logger.debug("Processed {} changes with {} results", resultAndProcessed[1], resultAndProcessed[0]);
                }
            }
            return resultAndProcessed[0];
        } catch (IOException e) {
            logger.error(e.getLocalizedMessage());
            e.printStackTrace();
        }
        return 0;*/
    }

    @Override
    public void process(List<CodeChangeWeb> input, int index, BiConsumer<List<CodeChangeWeb>, Integer> resultConsumer) {
        try {
            logger.warn("Recall measurement is active. This will have a heavy impact on performance!");
            String query = input.isEmpty() ? null : input.get(0).query;
            double expected = 1; // recall will result in 0%
            if (query != null) {
                expected = getTotalNumberOfExpectedResults(query, getProgrammingLanguage());
            }
            int actualResults = input.size();
            logger.debug("Expected {} results.", expected);

            double result = actualResults / expected;
            if (expected == 0) {
                result = actualResults > 0.0 ? actualResults * 1.0 : 1.0;
            }

            logger.info("Recall: {}", result);
            resultConsumer.accept(input, index);
        } catch (IOException e) {
            logger.error(e.getLocalizedMessage());
            e.printStackTrace();
        }
    }

    @Override
    public ProgrammingLanguage getProgrammingLanguage() {
        return language;
    }
}
