package research.diffsearch;

import com.google.gson.Gson;
import research.diffsearch.util.CodeChangeWeb;
import research.diffsearch.util.QueryUtil;

import java.io.*;
import java.net.Socket;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import static research.diffsearch.pipeline.OnlinePipeline.runDiffsearchOnline;

public class WebServerGUI extends Thread {
    protected Socket socket;
    protected Socket socket_faiss;
    protected FileOutputStream server_log;

    public WebServerGUI(Socket socket_accepted, Socket socket_faiss_accepted,FileOutputStream log) {
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
            while ((line = in.readLine()) != null && (!line.isEmpty())) {
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

            List<CodeChangeWeb> output_list = new ArrayList<CodeChangeWeb>();

            long duration_matching = 0;
            boolean flag_first_connection = false;
            String JSON_output = "";

            String result = "";

            if(postDataI > 0){
                flag_first_connection = true;
                result = java.net.URLDecoder.decode(postData.toString().replaceAll("Text1=","").replaceAll("&Text2=","-->"), StandardCharsets.UTF_8);

                System.out.println("Search started.");
                long startTime_matching = System.currentTimeMillis();


                try {

                    output_list = runDiffsearchOnline(QueryUtil.formatQuery(result), socket_faiss);
                    JSON_output = new Gson().toJson(output_list);
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

            FileChannel chan;
            FileLock lock;

            // The lock is not useful for now.
            chan = server_log.getChannel();
            lock = chan.lock();

            // Writing the JSON file on the port 8843
            out.println(JSON_output);

            //Backup of the JSON file
            PrintWriter writer = new PrintWriter("./src/main/resources/GUI/Output/output.json", StandardCharsets.UTF_8);
            writer.println(JSON_output);
            writer.close();

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
