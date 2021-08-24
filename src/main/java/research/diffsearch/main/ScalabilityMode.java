package research.diffsearch.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import research.diffsearch.Config;
import research.diffsearch.pipeline.OnlinePipeline;
import research.diffsearch.pipeline.RecallPipeline;
import research.diffsearch.server.PythonRunner;
import research.diffsearch.util.FilePathUtils;
import research.diffsearch.util.Util;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import static research.diffsearch.pipeline.feature.FeatureExtractionPipeline.getDefaultFeatureExtractionPipeline;

public class ScalabilityMode extends App {
    private static final Logger logger = LoggerFactory.getLogger(NormalMode.class);

    private final Scanner scanner = new Scanner(System.in);

    @Override
    public void run() {
        StringBuilder sb = null;
        PrintWriter writer = null;
        int[] changes = {10000, 50000, 100000, 250000, 400000, 500000, 600000, 700000, 850000, 1000000};
        int[] partitions = {2, 8, 14, 32, 50, 63, 75, 87, 105, -1};
        //int delay = 5;
        int pos = -1;

        try {
            OutputStream os = new FileOutputStream("./src/main/resources/Scalability/Java/Java_results_scalability.csv");
            writer = new PrintWriter(new OutputStreamWriter(os, StandardCharsets.UTF_8), true);
            sb = new StringBuilder();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        for (int i : changes) {
            pos++;

            try {
                var pythonRunner = new PythonRunner(
                        "./src/main/resources/Python/FAISS_indexing_scalability.py",
                        FilePathUtils.getFeatureCSVPath(Config.PROGRAMMING_LANGUAGE),
                        FilePathUtils.getIndexFilePath(Config.PROGRAMMING_LANGUAGE),
                        Integer.toString(getDefaultFeatureExtractionPipeline(false).getTotalFeatureVectorLength()),
                        Integer.toString(Config.nlist),
                        Integer.toString(i),
                        Integer.toString(partitions[pos]),
                        Boolean.toString(Config.TFIDF));

                pythonRunner.runAndWaitUntilEnd();

                startPythonServer();

                Socket socketFaiss = getNewFaissSocket();
                String nextLine;


                // Open the file
                FileInputStream fstream = new FileInputStream("./src/main/resources/Scalability/Java/scalability_queries_java.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

                String nextQuery;

                //Read File Line By Line
                while ((nextQuery = br.readLine()) != null) {
                    long time_sum = 0;
                    for(int j=1;j<=10;j++) {
                        long startTimeMatching = System.currentTimeMillis();
                        new OnlinePipeline(socketFaiss, Config.PROGRAMMING_LANGUAGE)
                                // add recall pipeline if necessary
                                .connectIf(Config.MEASURE_RECALL, new RecallPipeline(Config.PROGRAMMING_LANGUAGE, nextQuery))
                                .peek(result -> logger.info("Found {} results", result.getResults().size()))
                                .peek(Util::printOutputList)
                                .execute(nextQuery);
                        time_sum += (System.currentTimeMillis() - startTimeMatching);

                    }
                    logger.info("Final matching time: " + time_sum / 10000.0);
                    assert sb != null;
                    sb.append(time_sum / 10000.0 + ",");
                }
                sb.append("\n");
                socketFaiss.close();
                //close();
                stopPythonServer();

            } catch (IOException | InterruptedException exception) {
                logger.error(exception.getMessage(), exception);
            }
        }
        writer.write(sb.toString());
        writer.close();

    }
}
