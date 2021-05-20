package research.diffsearch.pipeline;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Luca Di Grazia
 */
public class OfflinePipeline {

    private static final Logger logger = LoggerFactory.getLogger(OfflinePipeline.class);
//
//    public static List<String> diffsearchOffline(Object queryTree, Socket socket, ProgrammingLanguage language) {
//        try {
//            logger.debug("Starting offline pipeline [{}]", language.name());
//            List<String> outputList = new ArrayList<>();
//            if (!OnlinePipeline.sendMessageToPythonServer(socket)) {
//                return outputList;
//            }
//
//            /* FINAL MATCHING STAGE:  Deep tree comparison as final matching. */
//            Iterable<String> allLines = FilePathUtils.getAllLines(FilePathUtils.CANDIDATE_CHANGES);
//            ParseTree parseTree = TreeFactory.getParseTree(queryTree, language);
//            BufferedReader infoReader = new BufferedReader(
//                    new FileReader("./src/main/resources/Features_Vectors/candidate_changes_info.txt"));
//
//            for (String candidate : allLines) {
//                String candidateUrl = infoReader.readLine();
//
//                Object changeTree = TreeFactory.getChangeTree(candidate, language);
//                ParseTree changeParseTree = TreeFactory.getParseTree(changeTree, language);
//                Matching matching = new Matching(parseTree, TreeFactory.getParser(queryTree, language));
//
//                if (matching.isMatch(changeParseTree, TreeFactory.getParser(changeTree, language))) {
//                    List<String> list = Arrays.asList(candidate.replace(" ", "").split("-->"));
//
//                    if (!list.get(1).equals(list.get(0))) {
//                        outputList.add(candidate + " [url] " + candidateUrl);
//                    }
//                }
//            }
//
//            return outputList;
//        } catch (IOException e) {
//            logger.error(e.getMessage(), e);
//        }
//        return Collections.emptyList();
//    }
}
