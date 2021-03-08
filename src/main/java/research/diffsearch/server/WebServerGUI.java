package research.diffsearch.server;

import com.google.gson.Gson;
import research.diffsearch.pipeline.base.DiffsearchResult;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;

public class WebServerGUI extends DiffSearchWebServer {

    public WebServerGUI(Socket socket, Socket socketFaiss, FileOutputStream log) {
        super(socket, socketFaiss, log);
    }

    @Override
    protected void writeOutput(PrintWriter out, DiffsearchResult result, long durationMatching,
                               FileChannel channel) throws IOException {
        super.writeOutput(out, result, durationMatching, channel);
        var JSONOutput = new Gson().toJson(result.getResults());
        PrintWriter writer = new PrintWriter("./src/main/resources/GUI/Output/output.json", StandardCharsets.UTF_8);
        writer.println(JSONOutput);
        writer.close();
    }
}
