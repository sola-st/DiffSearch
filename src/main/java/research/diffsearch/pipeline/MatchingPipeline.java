package research.diffsearch.pipeline;

import matching.Matching;
import org.antlr.v4.runtime.tree.ParseTree;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import research.diffsearch.pipeline.base.IndexedConsumer;
import research.diffsearch.pipeline.base.Pipeline;
import research.diffsearch.util.CodeChangeWeb;
import research.diffsearch.util.ProgrammingLanguage;
import research.diffsearch.util.ProgrammingLanguageDependent;
import research.diffsearch.util.ProgressWatcher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static research.diffsearch.tree.TreeObjectUtils.*;

/**
 * Pipeline to check if some candidate code change actually matches a query.
 */
public class MatchingPipeline
        implements Pipeline<List<CodeChangeWeb>, List<CodeChangeWeb>>, ProgrammingLanguageDependent {

    private static final Logger logger = LoggerFactory.getLogger(MatchingPipeline.class);

    private final int matchingLimit;
    private final ProgrammingLanguage language;
    private int matchingCounter = 0;

    public MatchingPipeline(ProgrammingLanguage language) {
        this(language, Integer.MAX_VALUE);
    }

    /**
     * Creates new matching pipeline.
     *
     * @param language      programming language for the matching.
     * @param matchingLimit maximum amount of results. If this is reached, this pipeline will block all inputs.
     */
    public MatchingPipeline(ProgrammingLanguage language, int matchingLimit) {
        this.matchingLimit = matchingLimit;
        this.language = language;
    }

    @Override
    public ProgrammingLanguage getProgrammingLanguage() {
        return language;
    }

    @Override
    public void process(List<CodeChangeWeb> input, int index, IndexedConsumer<List<CodeChangeWeb>> outputConsumer) {
        List<CodeChangeWeb> outputList = new ArrayList<>();
        logger.debug("Matching started");
        try {
            outputList = Pipeline
                    .getFilter(this::checkCandidate)
                    .parallelUntilHere(16)
                    .connect(new ProgressWatcher<>(input.size(), "Matching"))
                    .collect(input);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }

        outputConsumer.accept(outputList, index);
    }

    private boolean checkCandidate(CodeChangeWeb candidateChange) {
        try {
            String query = candidateChange.query;
            Object queryTree = getChangeTree(query, language);
            ParseTree parseTreeQuery = getParseTree(queryTree, language);
            String candidate = candidateChange.toString();

            Object changeTree = getChangeTree(candidate, language);
            ParseTree changeParseTree = getParseTree(changeTree, language);

            Matching matching = new Matching(parseTreeQuery, getParser(queryTree, language));

            if (matchingCounter < matchingLimit &&
                matching.isMatch(changeParseTree, getParser(changeTree, language))) {

                if (isNotEqualCodeChange(candidate)) {
                    matchingCounter++;
                    return true;
                }
            }
        } catch (Exception e) {
            logger.error("Error in " + candidateChange.toString(), e);
        }
        return false;
    }

    public static boolean isNotEqualCodeChange(String candidate) {
        List<String> list = Arrays.asList(candidate.replace(" ", "").split("-->"));
        return !list.get(1).equals(list.get(0));
    }
}
