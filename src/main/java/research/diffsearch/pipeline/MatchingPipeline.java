package research.diffsearch.pipeline;

import matching.Matching;
import org.antlr.v4.runtime.tree.ParseTree;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import research.diffsearch.pipeline.base.CodeChangeWeb;
import research.diffsearch.pipeline.base.DiffsearchResult;
import research.diffsearch.pipeline.base.IndexedConsumer;
import research.diffsearch.pipeline.base.Pipeline;
import research.diffsearch.util.ProgrammingLanguage;
import research.diffsearch.util.ProgrammingLanguageDependent;
import research.diffsearch.util.ProgressWatcher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import static research.diffsearch.tree.TreeObjectUtils.*;

/**
 * Pipeline to check if some candidate code change actually matches a query.
 */
public class MatchingPipeline
        implements Pipeline<DiffsearchResult, DiffsearchResult>, ProgrammingLanguageDependent {

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
    public void process(DiffsearchResult input, int index, IndexedConsumer<DiffsearchResult> outputConsumer) {
        List<CodeChangeWeb> outputList = new ArrayList<>();
        try {
            outputList = Pipeline
                    .getFilter((Predicate<CodeChangeWeb>) codeChange -> checkCandidate(codeChange, input.getQuery()))
                    .parallelUntilHere(16)
                    .connect(new ProgressWatcher<>(input.getCandidateChangeCount().orElse(0), "Matching"))
                    .collect(input.getResults());
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }

        outputConsumer.accept(input.setResults(outputList), index);
    }

    private boolean checkCandidate(CodeChangeWeb candidateChange, String query) {
        try {
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
        if (list.size() >= 2) {
            return !list.get(1).equals(list.get(0));
        } else {
            return false;
        }
    }
}
