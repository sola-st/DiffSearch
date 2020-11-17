package research.diffsearch.pipeline;

import matching.Matching;
import org.antlr.v4.runtime.tree.ParseTree;
import research.diffsearch.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OnlinePipeline {
    /**
     * Method that implements a deep recursive comparison between query tree and change trees to find
     * matching changes.
     *
     * @param tree_query : query Tree
     * @return number of matching changes found
     */
    public static List<CodeChangeWeb> diffsearchOnline(Java_Tree tree_query, String query_string, Socket socket) {
        try {
            List<CodeChangeWeb> outputList = new ArrayList<>();

            if (Pipeline.writeAndCheckLanguage(socket)) return outputList;

            /* **************************************************************************************************************
             * FINAL MATCHING STAGE:  Deep tree comparison as final matching.
             * */

            List<String> allLines = Pipeline.getAllLines("./src/main/resources/Features_Vectors/candidate_changes.txt");

            int matching_counter = 0;

            Java_Tree queryJavaTree = new Java_Tree(query_string);
            ParseTree queryTree = queryJavaTree.get_parsetree();

            BufferedReader infoReader = Pipeline.getInfoReader();

            for (String candidate : allLines) {
                String candidateUrl = infoReader.readLine();

                Java_Tree changeJavaTree = new Java_Tree(candidate);
                ParseTree changeTree = changeJavaTree.get_parsetree();

                Matching matching = new Matching(queryTree, tree_query.get_parser());

                if (matching.isMatch(changeTree, changeJavaTree.get_parser())) {
                    List<String> list = Arrays.asList(candidate.replace(" ", "").split("-->"));

                    if (!list.get(1).equals(list.get(0))) {
                        List<String> url_line = Arrays.asList(Pipeline.computeCandidateUrl(candidateUrl).split("-->"));
                        CodeChangeWeb temp = new CodeChangeWeb(url_line.get(0), url_line.get(1), list.get(0), list.get(1));
                        outputList.add(temp);
                        matching_counter++;

                        if (matching_counter == 10)
                            return outputList;
                    }
                }

            }

            return outputList;
        } catch (IOException e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }

    /**
     * Method that implements a deep recursive comparison between query tree and change trees to find
     * matching changes.
     *
     * @param treeQuery : query Tree
     * @return number of matching changes found
     */
    public static List<String> diffsearchOnlineNoGUI(Object treeQuery, Socket socket,
                                                     ProgrammingLanguage language) {
        try {
            if (Pipeline.writeAndCheckLanguage(socket)) return Collections.emptyList();

            /* *******************************
             * FINAL MATCHING STAGE:  Deep tree comparison as final matching.
             * */
            ParseTree parseTreeQuery = TreeObjectUtils.getParseTree(treeQuery, language);

            List<String> outputList = processCandidates(treeQuery, parseTreeQuery, language);

            RecallPipeline.measureRecall(outputList.size(), treeQuery);

            return outputList;
        } catch (IOException e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }

    public static List<String> processCandidates(Object queryTree,
                                         ParseTree parseTreeQuery, ProgrammingLanguage language) throws IOException {
        List<String> outputList = new ArrayList<>();
        List<String> allLines = Pipeline.getAllLines("./src/main/resources/Features_Vectors/candidate_changes.txt");
        BufferedReader infoReader = Pipeline.getInfoReader();
        for (String candidate : allLines) {
            String candidateUrl = infoReader.readLine();

            Object changeTree = TreeObjectUtils.getChangeTree(candidate, language);
            ParseTree changeParseTree = TreeObjectUtils.getParseTree(changeTree, language);

            Matching matching = new Matching(parseTreeQuery, TreeObjectUtils.getParser(queryTree, language));

            if (matching.isMatch(changeParseTree, TreeObjectUtils.getParser(changeTree, language))) {
                List<String> list = Arrays.asList(candidate.replace(" ", "").split("-->"));

                if (!list.get(1).equals(list.get(0))) {
                    outputList.add(candidate);
                }
            }
        }
        return outputList;
    }
}
