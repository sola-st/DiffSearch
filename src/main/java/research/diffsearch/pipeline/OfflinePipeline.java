package research.diffsearch.pipeline;

import matching.Matching;
import org.antlr.v4.runtime.tree.ParseTree;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import research.diffsearch.tree.TreeObjectUtils;
import research.diffsearch.util.FilePathUtils;
import research.diffsearch.util.ProgrammingLanguage;
import research.diffsearch.util.Util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OfflinePipeline {

    private static final Logger logger = LoggerFactory.getLogger(OfflinePipeline.class);

    public static List<String> diffsearchOffline(Object queryTree, Socket socket, ProgrammingLanguage language) {
        try {
            logger.debug("Starting offline pipeline [{}]", language.name());
            List<String> outputList = new ArrayList<>();
            if (!OnlinePipeline.sendMessageToPythonServer(socket)) {
                return outputList;
            }

            /* FINAL MATCHING STAGE:  Deep tree comparison as final matching. */
            Iterable<String> allLines = FilePathUtils.getAllLines(FilePathUtils.CANDIDATE_CHANGES);
            ParseTree parseTree = TreeObjectUtils.getParseTree(queryTree, language);
            BufferedReader infoReader = new BufferedReader(
                    new FileReader("./src/main/resources/Features_Vectors/candidate_changes_info.txt"));

            for (String candidate : allLines) {
                String candidateUrl = infoReader.readLine();

                Object changeTree = TreeObjectUtils.getChangeTree(candidate, language);
                ParseTree changeParseTree = TreeObjectUtils.getParseTree(changeTree, language);
                Matching matching = new Matching(parseTree, TreeObjectUtils.getParser(queryTree, language));

                if (matching.isMatch(changeParseTree, TreeObjectUtils.getParser(changeTree, language))) {
                    List<String> list = Arrays.asList(candidate.replace(" ", "").split("-->"));

                    if (!list.get(1).equals(list.get(0))) {
                        outputList.add(candidate + " [url] " + candidateUrl);
                    }
                }
            }

            return outputList;
        } catch (IOException e) {
            logger.error(e.getMessage(), e);
        }
        return Collections.emptyList();
    }
}
