package research.diffsearch.pipeline;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import research.diffsearch.Config;
import research.diffsearch.pipeline.base.DiffsearchResult;
import research.diffsearch.pipeline.base.IndexedConsumer;
import research.diffsearch.pipeline.base.Pipeline;
import research.diffsearch.pipeline.feature.FeatureExtractionPipeline;
import research.diffsearch.pipeline.feature.FeatureVector;
import research.diffsearch.pipeline.feature.RemoveCollisionPipeline;
import research.diffsearch.pipeline.feature.changedistilling.EditScriptCreator;
import research.diffsearch.pipeline.feature.changedistilling.ParseTreeMatcher;
import research.diffsearch.tree.ParseTreeNode;
import research.diffsearch.tree.TreeFactory;
import research.diffsearch.util.ProgrammingLanguage;
import research.diffsearch.util.ProgrammingLanguageDependent;
import research.diffsearch.util.QueryUtil;
import research.diffsearch.util.Util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import java.util.function.Predicate;

import static research.diffsearch.util.FilePathUtils.*;

public class OnlinePipeline implements
        Pipeline<String, DiffsearchResult>, ProgrammingLanguageDependent {

    private static final Logger logger = LoggerFactory.getLogger(OnlinePipeline.class);

    private final Socket pythonSocket;
    private final ProgrammingLanguage language;

    public OnlinePipeline(Socket pythonSocket, ProgrammingLanguage language) {
        this.pythonSocket = pythonSocket;
        this.language = language;
    }

    public static boolean sendMessageToPythonServer(Socket socket) {
        try {
            Objects.requireNonNull(socket);
            BufferedReader stdIn = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            out.print("PYTHON" + "\r\n");
            out.flush();

            String in = stdIn.readLine();

            if (!in.equals("JAVA"))
                return false;

        } catch (IOException e) {
            logger.error(e.getMessage(), e);
            return false;
        }
        return true;
    }

    public DiffsearchResult runDiffSearch(String input) {
        try {
            logger.info("Processing query " + input);
            long startTime = System.currentTimeMillis();
            // write feature vector to file
            var featureVector = Pipeline.from(QueryUtil::formatQuery)
                    // validate query
                    .filter((Predicate<String>) QueryUtil::checkIfQueryIsValid)
                    .connect(FeatureExtractionPipeline.getDefaultFeatureExtractionPipeline(true))
                    // transform to binary vector if configured
                    .connectIf(!Config.USE_COUNT_VECTORS_QUERY, new RemoveCollisionPipeline())
                    .connect(OnlinePipeline::multiplyVector)
                    .connect(getVectorFileWriterPipeline(QUERY_FEATURE_VECTORS_CSV))
                    .collect(input);
            // query was invalid:
            if (featureVector.isEmpty()) {
                logger.warn("Invalid query:" + input);
                return DiffsearchResult.invalidQuery(input);
            }

            if (!Config.SILENT) {
                Util.printFeatureVectorAnalysis(featureVector.get());
                var tree = TreeFactory.getChangeTree(input, getProgrammingLanguage());
                var rootNodes = ParseTreeNode.fromTree(tree.getParseTree(),
                        Arrays.asList(tree.getRuleNames()));

                var matcher = new ParseTreeMatcher(
                        rootNodes.getLeft(), rootNodes.getRight()
                );

                var matches = matcher.calculateMatches();

                new EditScriptCreator(matches, rootNodes.getLeft(), rootNodes.getRight())
                        .calculateEditScript()
                        .forEach(System.out::println);
            }

            // matching in this pipeline
            if (sendMessageToPythonServer(pythonSocket)) {
                // TODO try to use fixed value of candidate changes
                var numberOfCandidates = getNumberOfLines(CANDIDATE_CHANGES);

                var candidates = getCodeChanges(CANDIDATE_CHANGES, CANDIDATE_CHANGES_INFO,
                        numberOfCandidates);
                var dfsResult = new DiffsearchResult(input, candidates)
                        .setCandidateChangeCount(candidates.size());

                var codeChanges = new MatchingPipeline(getProgrammingLanguage())
                        .parallelUntilHere(16)
                        .collect(dfsResult)
                        .map(DiffsearchResult::getResults)
                        .orElse(Collections.emptyList());

                return new DiffsearchResult(input, codeChanges)
                        .setCandidateChangeCount(candidates.size())
                        .setPerformance(System.currentTimeMillis() - startTime);
            } else {
                logger.error("Connection with python failed.");
            }

        } catch (IOException e) {
            logger.error(e.getMessage(), e);
        }
        return DiffsearchResult.internalError(input);
    }

    @Override
    public void process(String input, int index, IndexedConsumer<DiffsearchResult> resultConsumer) {
        if (input != null) {
            resultConsumer.accept(runDiffSearch(input), index);
        } else {
            resultConsumer.skip(index);
        }
    }

    @Override
    public ProgrammingLanguage getProgrammingLanguage() {
        return language;
    }

    private static void multiplyVector(FeatureVector input1, int index, IndexedConsumer<FeatureVector> outputConsumer) {
        if (input1 != null) {
            for (int i = 0; i < input1.getVector().length; i++) {
                input1.getVector()[i] *= input1.getVector().length / 2 + 1;
            }
        }
        outputConsumer.accept(input1, index);
    }
}
