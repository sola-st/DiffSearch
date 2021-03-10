package research.diffsearch.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import research.diffsearch.Config;
import research.diffsearch.pipeline.OnlinePipeline;
import research.diffsearch.pipeline.RecallPipeline;
import research.diffsearch.pipeline.base.CodeChangeWeb;
import research.diffsearch.pipeline.base.DiffsearchResult;
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
import java.util.Collection;

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
            logger.error(e.getMessage(), e);
            try {
                socket.close();
            } catch (IOException ioException) {
                logger.error(ioException.getMessage(), ioException);
            }
        }
    }

    protected void handleRequest() throws IOException {
        PrintWriter out = new PrintWriter(socket.getOutputStream());
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        // looks for post data
        int postDataI = getPostDataIndex(in);
        StringBuilder postData = getPostDataStringBuilder(in, postDataI);

        DiffsearchResult result = null;
        Collection<CodeChangeWeb> outputList = new ArrayList<>();

        long durationMatching;
        boolean flagFirstConnection = false;

        String query = "";

        long startTimeMatching = System.currentTimeMillis();
        if (postDataI > 0) {
            flagFirstConnection = true;
            query = getQuery(postData);

            result = performSearch(query);
            Util.printOutputList(result);
        }

        durationMatching = System.currentTimeMillis() - startTimeMatching;
        writeHeader(out);
        splitQuery(out, query);

        FileChannel channel = serverLog.getChannel();
        FileLock lock = channel.lock();
        if (result != null) {
            writeOutput(out, result, durationMatching, channel);
        } else if (flagFirstConnection) {
            writeNoMatchingCodeFound(out, durationMatching, query, channel);
        }
        lock.release();
        out.close();
        socket.close();
        logger.trace("Connection closed with thread " + Thread.currentThread().getId());
    }

    protected void writeOutput(PrintWriter out,
                               DiffsearchResult result,
                               long durationMatching,
                               FileChannel channel) throws IOException {
        channel.write(ByteBuffer.wrap((new SimpleDateFormat("dd/MM/yyyy HH:mm:ss")
                                               .format(new java.util.Date()) + "\n").getBytes()));
        channel.write(ByteBuffer.wrap(("QUERY: " + result.getQuery()
                .replaceAll("\r", "") + "\n").getBytes()));

        writeOutputList(out, result, durationMatching, channel);
        channel.write(ByteBuffer.wrap(("=================================================================" +
                                       "=========================="
                                       + "========================" +
                                       "====================================================================\n\n")
                .getBytes()));
    }

    protected void writeOutputList(PrintWriter out,
                                   DiffsearchResult result,
                                   long durationMatching,
                                   FileChannel channel) {
        var outputList = result.getResults();
        boolean flag = true;
        for (CodeChangeWeb change : outputList) {
            try {
                String[] parts = {change.codeChangeOld, change.codeChangeNew, change.hunkLines, change.url};

                if (result.isInvalidQuery()) {
                    out.println("<center><H3><span style='color: #000000'>" +
                                "The query is not correct, please try again.</span></H3></center>");

                    //channel = server_log.getChannel();
                    //lock = channel.lock();
                    channel.write(ByteBuffer.wrap("The query is not correct, please try again.\n".getBytes()));
                    //lock.release();
                } else if (result.isInternalError()) {
                    out.println("<center><H3><span style='color: #000000'>" +
                                "An internal error occurred while processing the query.</span></H3></center>");

                    //channel = server_log.getChannel();
                    //lock = channel.lock();
                    channel.write(ByteBuffer.wrap("An internal error occurred while processing the query.\n".getBytes()));
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
                logger.error(e.getMessage(), e);
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
        return Util.formatCodeChange(URLDecoder.decode(postData.toString()
                .replaceAll("Text1=", "")
                .replaceAll("&Text2=", "-->"), StandardCharsets.UTF_8));
    }

    protected DiffsearchResult performSearch(String query) {
        try {
            return new OnlinePipeline(socketFaiss, Config.PROGRAMMING_LANGUAGE)
                    .connectIf(Config.MEASURE_RECALL, new RecallPipeline(Config.PROGRAMMING_LANGUAGE, query))
                    .collect(query)
                    .orElse(DiffsearchResult.internalError(query));
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
        return DiffsearchResult.internalError(query);
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
