package research.diffsearch.pipeline;

import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import research.diffsearch.Config;
import research.diffsearch.Mode;
import research.diffsearch.pipeline.base.DiffsearchResult;
import research.diffsearch.pipeline.base.Pipeline;
import research.diffsearch.pipeline.feature.FeatureExtractionPipeline;
import research.diffsearch.pipeline.feature.FeatureVector;
import research.diffsearch.pipeline.feature.RemoveCollisionPipeline;
import research.diffsearch.pipeline.feature.count.DocumentFrequencyCounter;
import research.diffsearch.pipeline.feature.count.TfIdfTransformer;
import research.diffsearch.tree.AbstractTree;
import research.diffsearch.tree.SerializableTreeNode;
import research.diffsearch.tree.TreeFactory;
import research.diffsearch.util.ProgrammingLanguage;
import research.diffsearch.util.ProgrammingLanguageDependent;
import research.diffsearch.util.Util;

import java.io.*;
import java.net.Socket;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

import static research.diffsearch.util.FilePathUtils.*;
//import static research.diffsearch.util.QueryUtil.checkIfQueryIsValid;

/**
 * Online phase of DiffSearch that performs the search.
 *
 * @author Paul Bredl
 */
public class OnlinePipeline implements
        Pipeline<String, DiffsearchResult>, ProgrammingLanguageDependent {

    private static final Logger logger = LoggerFactory.getLogger(OnlinePipeline.class);

    private final Socket pythonSocket;
    private final ProgrammingLanguage language;

    public OnlinePipeline(Socket pythonSocket, ProgrammingLanguage language) {
        this.pythonSocket = pythonSocket;
        this.language = language;
    }

    public DiffsearchResult runDiffSearch(String input) {
        try {
            logger.info("Processing query " + input);
            long startTime = System.currentTimeMillis();
            DocumentFrequencyCounter frequencyCounter = null;

            if (Config.TFIDF) {
                frequencyCounter = new DocumentFrequencyCounter();
                frequencyCounter.loadFromFile();
            }
            // write feature vector to file
            DocumentFrequencyCounter finalFrequencyCounter = frequencyCounter;
            var featureVector = Pipeline.from(Util::formatCodeChange)
                    .connect(q -> TreeFactory.getAbstractTree(q, getProgrammingLanguage()))
                    .connect(t -> SerializableTreeNode.fromTree(t.getParseTree(), getProgrammingLanguage()))
                    .connect(FeatureExtractionPipeline.getDefaultFeatureExtractionPipeline(true))
                    // transform to binary vector if configured
                    .connectIf(!Config.USE_COUNT_VECTORS && !Config.TFIDF, new RemoveCollisionPipeline())
                    .connectIf(Config.TFIDF, (input1, index) -> {
                        new TfIdfTransformer(finalFrequencyCounter, (int) Config.code_changes_num).process(input1.getVector(), index);
                        return input1;
                    })
                    .connectIf(!Config.TFIDF && Config.QUERY_MULTIPLICATION, OnlinePipeline::multiplyVector)
                    .connect(getVectorFileWriterPipeline(QUERY_FEATURE_VECTORS_CSV))
                    .execute(input);

            if (featureVector.isPresent() && Mode.ANALYSIS_MODE) {
                Util.printFeatureVectorAnalysis(featureVector.get());
                AbstractTree tree = TreeFactory.getAbstractTree(input, getProgrammingLanguage());
                System.out.println(tree.getTreeString());
            }

            // matching in this pipeline
            if (sendMessageToPythonServer(pythonSocket)) {
                var numberOfCandidates = getNumberOfLines(CANDIDATE_CHANGES);

                var candidates = getCodeChanges(CANDIDATE_CHANGES,
                        Config.LOW_RAM ? null : CANDIDATE_CHANGES_TREES, numberOfCandidates);
                DiffsearchResult dfsResult = new DiffsearchResult(input, candidates)
                        .setCandidateChangeCount(candidates.size());

                var codeChanges = new MatchingPipeline(getProgrammingLanguage())
                        .withTimeout(5, TimeUnit.MINUTES,null)
                        .parallelUntilHere(1)
                        .execute(dfsResult)
                        .map(DiffsearchResult::getResults)
                        .orElse(Collections.emptyList());

                if(Mode.EFFECTIVENESS) {

                    //BufferedWriter writer = new BufferedWriter(new FileWriter("./src/main/resources/Features_Vectors/result_changes.txt"));
                    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
                            new FileOutputStream("./src/main/resources/Effectiveness/11/Results/"+ input.replace(" ","") +".json"), "UTF-8"
                    ));
                    Gson gson = new Gson();

                   // Collection<CodeChange> list = gson.fromJson("./src/main/resources/Features_Vectors/result_changes.json", new TypeToken<Collection<CodeChange>>() {}.getType());
                    //Stream<CodeChange> combinedStream = Stream.concat(
                      //      list.stream(),
                        //    codeChanges.stream());

                    //list += codeChanges;

                    //String json2 = gson.toJson(combinedStream);

                    String json = gson.toJson(codeChanges);
                    writer.write(json);
                    writer.close();
                }

                logger.info("Found {} results.", codeChanges.size());

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

    @Override
    public DiffsearchResult process(String input, int index) {
        return runDiffSearch(input);
    }

    @Override
    public ProgrammingLanguage getProgrammingLanguage() {
        return language;
    }

    private static FeatureVector multiplyVector(FeatureVector vector, int index) {
        for (int i = 0; i < vector.getVector().length; i++) {
            vector.getVector()[i] *= vector.getVector().length / 2.0 + 1;
        }
        return vector;
    }
}
