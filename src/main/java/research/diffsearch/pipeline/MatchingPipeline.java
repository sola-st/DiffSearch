package research.diffsearch.pipeline;

import matching.Matching;
import org.antlr.v4.runtime.tree.ParseTree;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import research.diffsearch.PipelineOld;
import research.diffsearch.pipeline.base.Pipeline;
import research.diffsearch.util.CodeChangeWeb;
import research.diffsearch.util.ProgrammingLanguage;
import research.diffsearch.util.ProgrammingLanguageDependent;
import research.diffsearch.util.TreeObjectUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class MatchingPipeline
        implements Pipeline<Iterable<CodeChangeWeb>, List<CodeChangeWeb>>, ProgrammingLanguageDependent {

    private static final Logger logger = LoggerFactory.getLogger(MatchingPipeline.class);

    private final int matchingLimit;
    private final ProgrammingLanguage language;

    public MatchingPipeline(ProgrammingLanguage language) {
        this(language, Integer.MAX_VALUE);
    }

    public MatchingPipeline(ProgrammingLanguage language, int matchingLimit) {
        this.matchingLimit = matchingLimit;
        this.language = language;
    }

    @Override
    public ProgrammingLanguage getProgrammingLanguage() {
        return null;
    }

    @Override
    public void process(Iterable<CodeChangeWeb> input, int index, BiConsumer<List<CodeChangeWeb>, Integer> outputConsumer) {
        int matchingCounter = 0;

        List<CodeChangeWeb> outputList = new ArrayList<>();

        for (var candidateChange : input) {
            String query = candidateChange.query;
            Object queryTree = TreeObjectUtils.getChangeTree(query, language);
            ParseTree parseTreeQuery = TreeObjectUtils.getParseTree(queryTree, language);
            String candidate = candidateChange.toString();

            Object changeTree = TreeObjectUtils.getChangeTree(candidate, language);
            ParseTree changeParseTree = TreeObjectUtils.getParseTree(changeTree, language);

            Matching matching = new Matching(parseTreeQuery, TreeObjectUtils.getParser(queryTree, language));

            if (matching.isMatch(changeParseTree, TreeObjectUtils.getParser(changeTree, language))) {
                List<String> list = Arrays.asList(candidate.split("-->"));

                if (PipelineOld.isNotEqualCodeChange(candidate)) {
                    CodeChangeWeb codeChangeWeb = new CodeChangeWeb(candidateChange.url, candidateChange.hunkLines,
                            candidateChange.codeChangeOld, candidateChange.codeChangeNew, query);
                    outputList.add(codeChangeWeb);

                    matchingCounter++;

                    if (matchingCounter == matchingLimit) {
                        break;
                    }
                }
            }
        }
        outputConsumer.accept(outputList, index);
    }
}
