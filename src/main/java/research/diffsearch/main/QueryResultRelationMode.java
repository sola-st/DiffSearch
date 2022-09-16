package research.diffsearch.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import research.diffsearch.Config;
import research.diffsearch.pipeline.OnlinePipeline;
import research.diffsearch.pipeline.RecallPipeline;
import research.diffsearch.pipeline.base.CodeChange;
import research.diffsearch.util.Util;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Scanner;

public class QueryResultRelationMode extends App {
    private static final Logger logger = LoggerFactory.getLogger(NormalMode.class);

    private final Scanner scanner = new Scanner(System.in);


    @Override
    public void run() {
        StringBuilder sb = null;
        PrintWriter writer = null;
        int[] changes = {10000, 50000, 100000, 250000, 400000, 500000, 600000, 700000, 850000, 1000000};
        //int[] changes = {10000, 50000};
        int[] partitions = {4, 16, 28, 64, 100, -1, -1, -1, -1, -1};
        //int[] partitions = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        //int delay = 5;
        int pos = -1;


        try {

            try {
                OutputStream os = new FileOutputStream("./src/main/resources/QueryResult/" + Config.PROGRAMMING_LANGUAGE + "/" + Config.PROGRAMMING_LANGUAGE + "_Results_Query_Relation.csv");
                writer = new PrintWriter(new OutputStreamWriter(os, StandardCharsets.UTF_8), true);
                sb = new StringBuilder();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            startPythonServer();
            Socket socketFaiss = getNewFaissSocket();

            // Open the file
            FileInputStream fstream = new FileInputStream("./src/main/resources/queriesForRecall_PY.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

            String nextQuery;

            //Read File Line By Line
            while ((nextQuery = br.readLine()) != null) {
                long time_sum = 0;


                int query_size_char = nextQuery.length();
                long startTimeMatching = System.currentTimeMillis();
                new OnlinePipeline(socketFaiss, Config.PROGRAMMING_LANGUAGE)
                        // add recall pipeline if necessary
                        .connectIf(Config.MEASURE_RECALL, new RecallPipeline(Config.PROGRAMMING_LANGUAGE, nextQuery))
                        .peek(result -> logger.info("Found {} results", result.getResults().size()))
                        .peek(Util::printOutputList)
                        .execute(nextQuery);
                time_sum += (System.currentTimeMillis() - startTimeMatching);

                Collection<CodeChange> r = Config.results.getResults();

                // while loop
                int result_size_char = 0;
                for (CodeChange codeChange : r) {
                    result_size_char += 5 + codeChange.codeChangeOld.length() + codeChange.codeChangeNew.length();
                }
                if (r.size() > 0)
                    result_size_char = result_size_char / r.size();


                logger.info("Final matching time: " + time_sum / 1000.0);
                assert sb != null;
                sb.append(query_size_char + "," + result_size_char);
                sb.append("\n");
            }
            sb.append("\n");
            socketFaiss.close();
            //close();
            stopPythonServer();

        } catch (IOException exception) {
            logger.error(exception.getMessage(), exception);
        }

        writer.write(sb.toString());
        writer.close();

    }
}
