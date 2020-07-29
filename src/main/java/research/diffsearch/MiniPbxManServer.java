package research.diffsearch;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import static research.diffsearch.Pipeline.run_test;

public class MiniPbxManServer extends Thread {
    private final int PORT = Config.port_web;

    public void run(Socket socket_python) {
        try {
            ServerSocket server = new ServerSocket(PORT);
            System.out.println("MiniServer active "+PORT);
            boolean shudown = true;
            while (shudown) {
                System.out.println("Waiting request on port "+PORT);
                Socket socket = server.accept();

                if (!socket.getInetAddress().isLoopbackAddress()){
                    socket.close();
                    continue;
                }


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
                   // System.out.println(line);
                    if (line.indexOf("Content-Length:") > -1) {
                        postDataI = new Integer(line
                                .substring(
                                        line.indexOf("Content-Length:") + 16,
                                        line.length())).intValue();
                    }
                }
                String postData = "";
                for (int i = 0; i < postDataI; i++) {
                    int intParser = in.read();
                    postData += (char) intParser;
                }

                List<String> output_list = new ArrayList<String>();

                long duration_matching = 0;

                if(postDataI > 0){
                    String result = java.net.URLDecoder.decode(postData.replaceAll("Text1=","").replaceAll("&Text2=","-->"), StandardCharsets.UTF_8);

                    System.out.println("Search started.");
                    long startTime_matching = System.currentTimeMillis();

                    output_list = run_test(result, socket_python);

                    duration_matching = (System.currentTimeMillis() - startTime_matching);

                    System.out.println("Search ended.");
                   // String out = org.apache.commons.lang3.StringEscapeUtils.unescapeJava(in);
                }

                out.println("HTTP/1.0 200 OK");
                out.println("Content-Type: text/html; charset=utf-8");
                out.println("Server: MINISERVER");
                // this blank line signals the end of the headers
                out.println("");
                // Send the HTML page
                out.println("<center><H1>Welcome to DiffSearch</H1></center>");
                out.println("<center><H2>Insert your query for matching Python code</H2></center>");
              //  out.println("<H2>Post->"+postData+ "</H2>");
                out.println("<form name=\"input\" action=\"imback\" method=\"post\">");
                out.println("<center><pre><textarea name=\"Text1\" cols=\"40\" rows=\"5\" placeholder=\"Insert the old code...\" id=\"query_old\" ></textarea>" +
                        "<big><big><big><big><big><big><big><big><big><big><span>&#10132;</span></big></big></big></big></big></big></big></big></big></big>"+
                        "<textarea name=\"Text2\" cols=\"40\" rows=\"5\" placeholder=\"Insert the new code...\" id=\"query_new\" ></textarea></pre>" +
                        "<input type=\"submit\" value=\"Search\"></form></center>");


                if(output_list.size() > 0){
                    //System.out.println("Number of code changes found = " + output_list.size());
                    out.println("<center><H3>(Max 10) Code changes found in " + duration_matching / 1000.0 + " seconds using a 5.5 million dataset:</H3></center>");

                    for(String change:output_list)
                        out.println("<center><H4>" + change + "</H4></center>");
                }else{
                    out.println("<center><H3>No Matching Code changes found</H3></center>");
                }

                //if your get parameter contains shutdown it will shutdown
                if(auxLine.indexOf("?shutdown")>-1){
                    shudown = false;
                }
                out.close();
                socket.close();
            }
            server.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
