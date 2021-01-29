package research.diffsearch.server;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.google.gson.Gson;

import research.diffsearch.Config;
import research.diffsearch.util.CodeChangeWeb;
import research.diffsearch.util.ProgrammingLanguage;
import research.diffsearch.util.Util;

import java.io.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
// import java.util.Collections;
import java.util.List;

public class WebServerGUI extends DiffSearchWebServer {
	private static final Logger logger = LoggerFactory.getLogger(WebServerGUI.class);
    public WebServerGUI(Socket socket, Socket socketFaiss, FileOutputStream log) {
        super(socket, socketFaiss, log);
    }
    
    public class ServerData {
    	List<CodeChangeWeb> outputList;
		String duration;
    	String changesnumber;
    
    	public ServerData(List<CodeChangeWeb> list, String time, String number) {
       		outputList = list;
        	duration = time;
        	changesnumber = number;
    	}
    }
    
    @Override
    protected void handleRequest() throws IOException {
		PrintWriter out = new PrintWriter(socket.getOutputStream());
		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		String line = "";
		String auxLine = "";
		String lang = "";
		// looks for post data
		while ((line = in.readLine()) != null && (line.length() != 0)) {
		    // System.out.println(line);
			if (line.contains("GET /api?")) {
				logger.info(line);
				auxLine = line.substring(9, line.indexOf(" HTTP/1.1"));
			}
		}
		StringBuilder postData = new StringBuilder();
		List<CodeChangeWeb> outputList = new ArrayList<>();
		
		long durationMatching;
		boolean flagFirstConnection = false;
		
		String query = "";
		
		lang = auxLine.substring(auxLine.lastIndexOf("=") + 1, auxLine.length());
		// for (int i = 0; i < auxLine.length());
		for (int i = 0; i < auxLine.length() - lang.length() - "&Language=".length(); i++) {
			postData.append((char) auxLine.charAt(i));
		}
		
		if (lang.equals("Java")) {
			Config.PROGRAMMING_LANGUAGE = ProgrammingLanguage.JAVA;
		} else if (lang.equals("Python")) {
			Config.PROGRAMMING_LANGUAGE = ProgrammingLanguage.PYTHON;
		} else if (lang.equals("JavaScript")) {
			Config.PROGRAMMING_LANGUAGE = ProgrammingLanguage.JAVASCRIPT;
		} // else Config is not changed
		
		long startTimeMatching = System.currentTimeMillis();
		logger.info(Config.PROGRAMMING_LANGUAGE.name());
		if (auxLine.length() > 0) {
			flagFirstConnection = true;
			logger.info("Search started.");
			logger.info(postData.toString());
			query = getQuery(postData);

			try {
				outputList = performSearch(query);
				Util.printOutputList(outputList, startTimeMatching);
			} catch (Exception e) {
				e.printStackTrace();
			}
			logger.info("Search ended.");
		}

		writeHeader(out);
		durationMatching = System.currentTimeMillis() - startTimeMatching;
		FileChannel channel;
		FileLock lock;

		// The lock is not useful for now.
		channel = serverLog.getChannel();
		lock = channel.lock();
		if (!outputList.isEmpty()) {
			writeOutput(out, outputList, durationMatching, query, channel);
		} else if (flagFirstConnection) {
			writeNoMatchingCodeFound(out, durationMatching, query, channel);
		}

		lock.release();
		out.flush();
		out.close();
		// System.out.println("Connection closed with thread " + Thread.currentThread().getId());
		logger.trace("Connection closed with thread " + Thread.currentThread().getId());
	}
    
    @Override
	protected void writeOutput(PrintWriter out, List<CodeChangeWeb> outputList, long durationMatching, String result,
			FileChannel channel) throws IOException {
		super.writeOutput(out, outputList, durationMatching, result, channel);
		var JSONOutput = new Gson().toJson(outputList);
        PrintWriter writer = new PrintWriter("./src/main/resources/GUI/Output/output.json", StandardCharsets.UTF_8);
        writer.println(JSONOutput);
        writer.close();
	}
    
    @Override
    protected void writeOutputList(PrintWriter out, List<CodeChangeWeb> outputList, long durationMatching,
			FileChannel channel) {
		boolean incorrect = false;
		for (CodeChangeWeb change : outputList) {
			try {
				String[] parts = { change.codeChangeOld, change.codeChangeNew, change.hunkLines, change.url };

				// TODO look into
				if (parts.length == 1) {
					incorrect = true;
					channel.write(ByteBuffer.wrap("The query is not correct, please try again.\n".getBytes()));
					break;
					//lock.release();
				} else {
					channel.write(ByteBuffer.wrap((change + "\n").getBytes()));
				}
			} catch (Exception e) {
				logger.error(e.getMessage(), e);
			}
		}
		if (incorrect) {
			CodeChangeWeb temp = new CodeChangeWeb("The query is not correct, please try again."," ");
			outputList.set(0, temp);
		}
		String changes = "832 142"; // how does this number come about (see DiffSearchWebServer)
		ServerData serverdata = new ServerData(outputList, Double.toString(durationMatching / 1000.0), changes);
		
		var JSONOutput = new Gson().toJson(serverdata);
		// Writing the JSON file on the port 8843
        out.println(JSONOutput);
	}
    
    @Override
    protected void writeNoMatchingCodeFound(PrintWriter out, long durationMatching, 
    		String result, FileChannel chan) throws IOException {
    	
    	List<CodeChangeWeb> outputList = new ArrayList<CodeChangeWeb>();
    	
    	String changes = "832 142"; // how does this number come about (see DiffSearchWebServer)
    	ServerData serverdata = new ServerData(outputList, Double.toString(durationMatching / 1000.0), changes);
    	var JSONOutput = new Gson().toJson(serverdata);
    	out.println(JSONOutput);
        
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
    
    @Override
    protected void writeHeader(PrintWriter out) {
        out.print("HTTP/1.0 200 OK\r\n");
		// out.print("Date: .....\r\n");
		out.print("Server: MINISERVER/1.0\r\n");
		out.print("Content-type: text/html; charset=utf-8\r\n");
		out.print("\r\n"); // End of headers
    }
	
}
