package research.diffsearch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import research.diffsearch.pipeline.MatchingPipeline;
import research.diffsearch.pipeline.OnlinePipeline;
import research.diffsearch.util.CodeChangeWeb;
import research.diffsearch.util.FilePathUtils;
import research.diffsearch.util.QueryUtil;
import research.diffsearch.util.Util;

import java.io.*;
import java.net.Socket;
import java.net.URLDecoder;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static research.diffsearch.pipeline.OnlinePipeline.runDiffsearchOnline;

public class DiffSearchWebServer extends Thread {

    private static final Logger logger = LoggerFactory.getLogger(DiffSearchWebServer.class);

    protected Socket socket;
    protected Socket socketFaiss;
    protected FileOutputStream serverLog;

    public DiffSearchWebServer(Socket socketAccepted, Socket socketFaissAccepted, FileOutputStream log) {
        socket = socketAccepted;
        socketFaiss = socketFaissAccepted;
        serverLog = log;
    }

    public void run() {
        try {
            if (!socket.getInetAddress().isLoopbackAddress()) {
                socket.close();
                logger.warn("Connection closed because the client is not a localhost");
                return;
            }
            logger.trace("Connection accepted with thread " + Thread.currentThread().getId());

            handleRequest();

        } catch (Exception e) {
            logger.error(e.getLocalizedMessage());
            e.printStackTrace();
            try {
                socket.close();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
    }

    protected void handleRequest() throws IOException {
        PrintWriter out = new PrintWriter(socket.getOutputStream());
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        // looks for post data
        int postDataI = getPostDataIndex(in);
        StringBuilder postData = getPostDataStringBuilder(in, postDataI);

        List<CodeChangeWeb> outputList = new ArrayList<>();

        long durationMatching = 0;
        boolean flagFirstConnection = false;

        String query = "";

        if (postDataI > 0) {
            flagFirstConnection = true;
            query = getQuery(postData);

            long startTimeMatching = System.currentTimeMillis();
            outputList = performSearch(query);
            Util.printOutputList(outputList, startTimeMatching);
        }

        writeHeader(out);
        splitQuery(out, query);

        FileChannel channel = serverLog.getChannel();
        FileLock lock = channel.lock();
        if (!outputList.isEmpty()) {
            writeOutput(out, outputList, durationMatching, query, channel);
        } else if (flagFirstConnection) {
            writeNoMatchingCodeFound(out, durationMatching, query, channel);
        }
        lock.release();
        out.close();
        socket.close();
        logger.trace("Connection closed with thread " + Thread.currentThread().getId());
    }

    protected static void writeOutput(PrintWriter out,
                                      List<CodeChangeWeb> outputList,
                                      long durationMatching,
                                      String result,
                                      FileChannel channel) throws IOException {
        channel.write(ByteBuffer.wrap((new SimpleDateFormat("dd/MM/yyyy HH:mm:ss")
                                               .format(new java.util.Date()) + "\n").getBytes()));
        channel.write(ByteBuffer.wrap(("QUERY: " + result.replaceAll("\r", "") + "\n").getBytes()));

        writeOutputList(out, outputList, durationMatching, channel);
        channel.write(ByteBuffer.wrap(("=================================================================" +
                                       "=========================="
                                       + "========================" +
                                       "====================================================================\n\n").getBytes()));
    }

    protected static void writeOutputList(PrintWriter out,
                                          List<CodeChangeWeb> outputList,
                                          long durationMatching,
                                          FileChannel channel) {
        boolean flag = true;
        for (CodeChangeWeb change : outputList) {
            try {
                String[] parts = {change.codeChangeOld, change.codeChangeNew, change.hunkLines, change.url};

                // TODO look into
                if (parts.length == 1) {
                    out.println("<center><H3><span style='color: #000000'>" +
                                "The query is not correct, please try again.</span></H3></center>");

                    //channel = server_log.getChannel();
                    //lock = channel.lock();
                    channel.write(ByteBuffer.wrap("The query is not correct, please try again.\n".getBytes()));
                    //lock.release();
                } else {
                    if (flag) {
                        out.println("<H3><span style='color: #000000'>   <span style='color: #0071e3'>" +
                                    outputList.size() + "</span>" +
                                    " Code changes found in <span style='color: #0071e3'>" +
                                    durationMatching / 1000.0 + " seconds </span> using a dataset of " +
                                    "<span style='color: #0071e3'>832 142 code changes</span>:</span></H3>");
                        flag = false;
                    }
                    out.println("<H4>"
                                + "<span style='background-color: #b54845'><span style='color: #FFFFFF'> - " + parts[0]
                                + "</span></span><span style='color: #000000'>  <big><big><big><big><big><span>&#10132;" +
                                "</span></big></big></big></big></big>  </span> "
                                + "<span style='background-color:#2cab13'><span style='color: #FFFFFF'>+ " + parts[1] +
                                "</span></span></span></H4>"
                                + "<pre>  </pre><pre>   </pre>");
                    channel.write(ByteBuffer.wrap((change + "\n").getBytes()));
                }
            } catch (Exception e) {
                logger.error(e.getLocalizedMessage());
                e.printStackTrace();
            }
        }
    }

    protected static StringBuilder getPostDataStringBuilder(BufferedReader in, int postDataI) throws IOException {
        StringBuilder postData = new StringBuilder();
        for (int i = 0; i < postDataI; i++) {
            int intParser = in.read();
            postData.append((char) intParser);
        }
        return postData;
    }

    protected static int getPostDataIndex(BufferedReader in) throws IOException {
        String line;
        int postDataI = -1;
        while ((line = in.readLine()) != null && (!line.isEmpty())) {
            if (line.contains("Content-Length:")) {
                postDataI = Integer.parseInt(line
                        .substring(
                                line.indexOf("Content-Length:") + 16
                        ));
            }
        }
        return postDataI;
    }

    protected void writeNoMatchingCodeFound(PrintWriter out, long durationMatching, String result, FileChannel chan)
            throws IOException {
        out.println("<center><H3><span style='color: #000000'>" +
                    "No Matching Code changes found in <span style='color: #0071e3'>" +
                    durationMatching / 1000.0 +
                    " seconds</span>.</span></H3></center>");

        chan.write(ByteBuffer.wrap(
                (new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new java.util.Date()) + "\n").getBytes()));
        chan.write(ByteBuffer.wrap(("QUERY: " + result.replaceAll("\r", "") + "\n").getBytes()));

        chan.write(ByteBuffer.wrap(
                ("No Matching Code changes found in <span style='color: #0071e3'>" +
                 durationMatching / 1000.0 + " seconds </span>\n").getBytes()));

        chan.write(ByteBuffer.wrap(("=========================================================" +
                                    "==================================" +
                                    "================================" +
                                    "============================================================\n\n").getBytes()));
    }

    protected static String getQuery(StringBuilder postData) {
        return QueryUtil.formatQuery(URLDecoder.decode(postData.toString()
                .replaceAll("Text1=", "")
                .replaceAll("&Text2=", "-->"), StandardCharsets.UTF_8));
    }

    protected List<CodeChangeWeb> performSearch(String query) {
        try {
            return new MatchingPipeline(Config.PROGRAMMING_LANGUAGE)
                    .processSync(
                            FilePathUtils.getCodeChanges(
                                    FilePathUtils.CANDIDATE_CHANGES, FilePathUtils.CANDIDATE_CHANGES_INFO, query));
        } catch (Exception e) {
            logger.error(e.getLocalizedMessage());
            e.printStackTrace();
        }
        return Collections.emptyList();
    }

    protected void splitQuery(PrintWriter out, String query) {
        String firstPart = "", secondPart = "";
        if (query.length() > 1) {
            String[] parts = query.split("-->");

            firstPart = parts[0];
            secondPart = parts[1];
        }
        out.println("<center><pre>\n" +
                    "<textarea name=\"Text1\" cols=\"40\" rows=\"5\" placeholder=\"Insert the old code...\"" +
                    "id=\"query_old\" >" + firstPart + "</textarea>" +
                    "<span style='color: #000000'>" +
                    "<big><big><big><big><big><big><big><big><big><big>" +
                    "<span>&#10132;</span>" +
                    "</big></big></big></big></big></big></big></big></big></big>" +
                    "</span>" +
                    "<textarea name=\"Text2\" cols=\"40\" rows=\"5\" placeholder=\"Insert the new code...\"" +
                    "    id=\"query_new\" >"
                    + secondPart + "</textarea>" +
                    "</pre>" +
                    "<input style=\"background-color:#0071e3; border-color:#0071e3; color:#FFFFFF\" type=\"submit\"" +
                    "value=\"Search\"></form></center>");

    }

    protected void writeHeader(PrintWriter out) {
        out.println("HTTP/1.0 200 OK");
        out.println("Content-Type: text/html; charset=utf-8");
        out.println("Server: MINISERVER");
        // this blank line signals the end of the headers
        out.println("");
        // Send the HTML page
        out.println("<body style=\"background-color:#E8E8E8;\">");
        out.println("<center><H1><span style='color: #000000'><span style='color: #0071e3'>Diff</span>Search</span></H1></center>");
        out.println("<center><H2><span style='color: #000000'>Insert your query for matching <span style='color: #0071e3'>" +
                    Config.PROGRAMMING_LANGUAGE.toString() + "</span> code changes</span></H2></center>");
        //  out.println("<H2>Post->"+postData+ "</H2>");
        out.println("<form name=\"input\" action=\"imback\" method=\"post\">");
    }

}
