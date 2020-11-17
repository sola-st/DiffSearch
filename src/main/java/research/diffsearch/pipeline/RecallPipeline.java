package research.diffsearch.pipeline;

import matching.Matching;
import org.antlr.v4.runtime.tree.ParseTree;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import research.diffsearch.Config;
import research.diffsearch.ProgrammingLanguage;
import research.diffsearch.TreeObjectUtils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Stream;

public class RecallPipeline {

    private static final Logger logger = LoggerFactory.getLogger(RecallPipeline.class);

    public static double measureRecall(long actualResults, Object query) {
        if (Config.MEASURE_RECALL) {
            try {
                logger.warn("Recall measurement is active. This will have a heavy impact on performance!");
                double expected = getTotalNumberOfExpectedResults(query, Config.PROGRAMMING_LANGUAGE);
                logger.debug("Expected {} results.", expected);
                double result = actualResults / expected;
                logger.info("Recall: {}", result);
                return result;
            } catch (IOException e) {
                logger.error(e.getLocalizedMessage());
                e.printStackTrace();
            }
        } else {
            logger.debug("Skipping recall measurement");
        }
        return 0.0;
    }

    static long getTotalNumberOfExpectedResults(Object query, ProgrammingLanguage language) throws IOException {
        String filePath = "./src/main/resources/Features_Vectors/changes_strings_" +
                          language.toString().toLowerCase() + ".txt";
        Stream<String> allLines = new BufferedReader(new FileReader(filePath)).lines();
        ParseTree queryParseTree = TreeObjectUtils.getParseTree(query, language);
        // use array to allow lambda
        final long[] resultAndProcessed = {0, 0};

        allLines.forEach(candidate -> {
            Object candidateChangeTree = TreeObjectUtils.getChangeTree(candidate, language);
            ParseTree changeParseTree = TreeObjectUtils.getParseTree(candidateChangeTree, language);

            Matching matching = new Matching(queryParseTree, TreeObjectUtils.getParser(query, language));

            if (matching.isMatch(changeParseTree, TreeObjectUtils.getParser(candidateChangeTree, language))) {
                resultAndProcessed[0]++;
            }
            resultAndProcessed[1]++;

            if (resultAndProcessed[1] % 100_000 == 0) {
                logger.debug("Processed {} changes with {} results", resultAndProcessed[1], resultAndProcessed[0]);
            }
        });
        return resultAndProcessed[0];
    }
}
