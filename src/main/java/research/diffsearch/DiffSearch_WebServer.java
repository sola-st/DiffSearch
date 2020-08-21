package research.diffsearch;

import java.io.*;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import static research.diffsearch.Pipeline.run_test;

public class DiffSearch_WebServer extends Thread {
    protected Socket socket;
    protected Socket socket_faiss;
    protected FileOutputStream server_log;

    public DiffSearch_WebServer(Socket socket_accepted, Socket socket_faiss_accepted,FileOutputStream log) {
        socket = socket_accepted;
        socket_faiss = socket_faiss_accepted;
        server_log = log;

    }

    public void run() {
        try {
            if (!socket.getInetAddress().isLoopbackAddress()){
                try {
                    socket.close();
                    System.out.println("Connection closed because the client is not a localhost");
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
                return;
            }

            System.out.println("Connection accepted with thread " + Thread.currentThread().getId());

            InputStream is = socket.getInputStream();
            PrintWriter out = new PrintWriter(socket.getOutputStream());
            BufferedReader in = new BufferedReader(new InputStreamReader(is));
            String line;
            line = in.readLine();
            String auxLine = line;
            line = "";
            // looks for post data
            int postDataI = -1;
            while ((line = in.readLine()) != null && (line.length() != 0)) {
                if (line.contains("Content-Length:")) {
                    postDataI = Integer.parseInt(line
                            .substring(
                                    line.indexOf("Content-Length:") + 16,
                                    line.length()));
                }
            }
            StringBuilder postData = new StringBuilder();
            for (int i = 0; i < postDataI; i++) {
                int intParser = in.read();
                postData.append((char) intParser);
            }

            List<String> output_list = new ArrayList<String>();

            long duration_matching = 0;
            boolean flag_first_connection = false;

            String result = "";

            if(postDataI > 0){
                flag_first_connection = true;
                result = java.net.URLDecoder.decode(postData.toString().replaceAll("Text1=","").replaceAll("&Text2=","-->"), StandardCharsets.UTF_8);

                System.out.println("Search started.");
                long startTime_matching = System.currentTimeMillis();

                try {

                    output_list = run_test(result.replaceAll("\r","").replaceAll("\n",""), socket_faiss);
                }catch (Exception e) {
                    e.printStackTrace();
                }

                duration_matching = (System.currentTimeMillis() - startTime_matching);

                System.out.println("Search ended.");
            }

            out.println("HTTP/1.0 200 OK");
            out.println("Content-Type: text/html; charset=utf-8");
            out.println("Server: MINISERVER");
            // this blank line signals the end of the headers
            out.println("");
            // Send the HTML page
            out.println("<body style=\"background-color:#E8E8E8;\">");
            out.println("<center><H1><span style='color: #000000'><span style='color: #0071e3'>Diff</span>Search</span></H1></center>");
            out.println("<center><H2><span style='color: #000000'>Insert your query for matching <span style='color: #0071e3'>Java</span> code changes</span></H2></center>");
            //  out.println("<H2>Post->"+postData+ "</H2>");
            out.println("<form name=\"input\" action=\"imback\" method=\"post\">");

            if(result.length() > 1) {
                String[] parts = result.split("-->");

                out.println("<center><pre><textarea name=\"Text1\" cols=\"40\" rows=\"5\" placeholder=\"Insert the old code...\" id=\"query_old\" >"+ parts[0]+"</textarea>" +
                        "<span style='color: #000000'><big><big><big><big><big><big><big><big><big><big><span>&#10132;</span></big></big></big></big></big></big></big></big></big></big></span>" +
                        "<textarea name=\"Text2\" cols=\"40\" rows=\"5\" placeholder=\"Insert the new code...\" id=\"query_new\" >"+parts[1]+"</textarea></pre>" +
                        "<input style=\"background-color:#0071e3; border-color:#0071e3; color:#FFFFFF\" type=\"submit\" value=\"Search\"></form></center>");
            }
            else
                out.println("<center><pre><textarea name=\"Text1\" cols=\"40\" rows=\"5\" placeholder=\"Insert the old code...\" id=\"query_old\" ></textarea>" +
                        "<span style='color: #000000'><big><big><big><big><big><big><big><big><big><big><span>&#10132;</span></big></big></big></big></big></big></big></big></big></big></span>"+
                        "<textarea name=\"Text2\" cols=\"40\" rows=\"5\" placeholder=\"Insert the new code...\" id=\"query_new\" ></textarea></pre>" +
                        "<input style=\"background-color:#0071e3; border-color:#0071e3; color:#FFFFFF\" type=\"submit\" value=\"Search\"></form></center>");

            FileChannel chan;
            FileLock lock;

            chan = server_log.getChannel();
            lock = chan.lock();
            if(output_list.size() > 0){
                chan.write(ByteBuffer.wrap((new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new java.util.Date())+"\n").getBytes()));
                chan.write(ByteBuffer.wrap(("QUERY: " + result.replaceAll("\r","")+"\n").getBytes()));

                boolean flag = true;
                for(String change:output_list) {
                    try {
                        String[] parts = change.split("-->");

                        if(parts.length == 1){
                            out.println("<center><H3><span style='color: #000000'>The query is not correct, please try again.</span></H3></center>");

                            //chan = server_log.getChannel();
                            //lock = chan.lock();
                            chan.write(ByteBuffer.wrap("The query is not correct, please try again.\n".getBytes()));
                            //lock.release();
                        }
                        else{
                            if(flag){
                                out.println("<H3><span style='color: #000000'>   (<span style='color: #0071e3'>Max 10</span>) Code changes found in <span style='color: #0071e3'>" + duration_matching / 1000.0 + " seconds </span> using a dataset of <span style='color: #0071e3'>832 139 code changes</span>:</span></H3>");
                                flag = false;
                            }
                            out.println("<H4>"
                                    + "<span style='background-color: #b54845'><span style='color: #FFFFFF'> - " + parts[0]
                                    + "</span></span><span style='color: #000000'>  <big><big><big><big><big><span>&#10132;</span></big></big></big></big></big>  </span> "
                                    +"<span style='background-color:#2cab13'><span style='color: #FFFFFF'>+ " + parts[1] + "</span></span></span></H4>"
                                    + "<span style='color: #000000'><a href=" + parts[2] + " style=\"color: #000000\"> Link "+ parts[3] +"</a></span></span>"
                                    + "<pre>  </pre><pre>   </pre>");
                            chan.write(ByteBuffer.wrap((change +"\n").getBytes()));
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                chan.write(ByteBuffer.wrap(("==========================================================================================="
                        +"============================================================================================\n\n").getBytes()));

            }else{
                if(flag_first_connection) {
                    out.println("<center><H3><span style='color: #000000'>No Matching Code changes found in <span style='color: #0071e3'>" + duration_matching / 1000.0 + " seconds</span>.</span></H3></center>");

                    chan.write(ByteBuffer.wrap((new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new java.util.Date())+"\n").getBytes()));
                    chan.write(ByteBuffer.wrap(("QUERY: " + result.replaceAll("\r","")+"\n").getBytes()));

                    chan.write(ByteBuffer.wrap(("No Matching Code changes found in <span style='color: #0071e3'>" + duration_matching / 1000.0 + " seconds </span>\n").getBytes()));

                    chan.write(ByteBuffer.wrap(("==========================================================================================="
                            +"============================================================================================\n\n").getBytes()));
                }
            }
            lock.release();

            out.close();
            socket.close();
            System.out.println("Connection closed with thread " + Thread.currentThread().getId());

        } catch (Exception e) {
            e.printStackTrace();
            try {
                socket.close();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
    }

}
