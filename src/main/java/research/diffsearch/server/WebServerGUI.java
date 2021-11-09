package research.diffsearch.server;

import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import research.diffsearch.Config;
import research.diffsearch.pipeline.base.CodeChange;
import research.diffsearch.pipeline.base.DiffsearchResult;
import research.diffsearch.server.PythonRunner;
import research.diffsearch.util.FilePathUtils;
import research.diffsearch.util.ProgrammingLanguage;
import research.diffsearch.util.Util;

import java.io.*;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
// import java.util.List;
import java.util.Collection;

/**
 * @author Paul Bredl
 * @author Luca Di Grazia
 */
public class WebServerGUI extends DiffSearchWebServer {
	private static final Logger logger = LoggerFactory.getLogger(WebServerGUI.class);

	public WebServerGUI(Socket socket, Socket socketFaiss, FileOutputStream log) {
		super(socket, socketFaiss, log);
	}

	public static class ServerData {
		Collection<CodeChange> outputList;
		String duration;
		String changesnumber;

		public ServerData(Collection<CodeChange> list, String time, String number) {
			outputList = list;
			duration = time;
			changesnumber = number;
		}
	}

	// the used FAISS index size
	String indexSize = "";

	@Override
	protected void handleRequest() throws IOException {
		PrintWriter out = new PrintWriter(socket.getOutputStream());
		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		String line = "";
		String auxLine = "";
		String lang = "";

		// get the used FAISS index size
		// create a temporary file
		String sizeFilename = "./src/main/resources/Features_Vectors/index_size.txt";
		File indexsizeFile = new File(sizeFilename);
		indexsizeFile.createNewFile();
		try {
			var pythonRunner = new PythonRunner("./src/main/resources/Python/get_FAISS_index_size.py",
					FilePathUtils.getIndexFilePath(Config.PROGRAMMING_LANGUAGE), sizeFilename);
			pythonRunner.runAndWaitUntil(input -> false);
			// file index_size contains the index size in first line
			if (indexsizeFile.exists()) {
				try (BufferedReader br = new BufferedReader(new FileReader(sizeFilename))) {
					indexSize = br.readLine();
				} catch (IOException e) {
					logger.error(e.getMessage(), e);
					if (indexsizeFile.exists()) {
						indexsizeFile.delete();
					}
				}
			}
			// remove the temporary File
			indexsizeFile.delete();
		} catch (IOException | InterruptedException exception) {
			logger.error(exception.getMessage(), exception);
			if (indexsizeFile.exists()) {
				indexsizeFile.delete();
			}
		}
		if (indexsizeFile.exists()) {
			indexsizeFile.delete();
		}
		// looks for post data
		while ((line = in.readLine()) != null && (!line.isEmpty())) {
			if (line.contains("?Text1=") && line.contains("Text2=")) {
				logger.info(line);
				auxLine = line.substring(line.indexOf("?Text1=") + 1, line.indexOf(" HTTP/1.1"));
			}
		}
		StringBuilder postData = new StringBuilder();
		DiffsearchResult result = null;

		long durationMatching;
		boolean flagFirstConnection = false;

		String query = "";

		lang = auxLine.substring(auxLine.lastIndexOf("=") + 1);
		// for (int i = 0; i < auxLine.length());
		for (int i = 0; i < auxLine.length() - lang.length() - "&Language=".length(); i++) {
			postData.append((char) auxLine.charAt(i));
		}

		switch (lang) {
		case "Java":
			Config.PROGRAMMING_LANGUAGE = ProgrammingLanguage.JAVA;
			break;
		case "Python":
			Config.PROGRAMMING_LANGUAGE = ProgrammingLanguage.PYTHON;
			break;
		case "JavaScript":
			Config.PROGRAMMING_LANGUAGE = ProgrammingLanguage.JAVASCRIPT;
			break;
		}

		logger.info(Config.PROGRAMMING_LANGUAGE.name());
		long startTimeMatching = System.currentTimeMillis();
		logger.info(Config.PROGRAMMING_LANGUAGE.name());
		boolean valid_query = true;

		if (!auxLine.isEmpty()) {
			flagFirstConnection = true;
			logger.info("Search started.");
			logger.info(postData.toString());
			query = getQuery(postData);

			try {
				if (Util.checkIfQueryIsValid(query)) {
					result = performSearch(query);
				} else {
					logger.trace("INVALID QUERY");
					valid_query = false;
					DiffsearchResult.invalidQuery(query);
				}
			} catch (Exception e) {
				valid_query = false;
				logger.error(e.getMessage(), e);
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
//		assert result != null;
//		if (!result.getResults().isEmpty()) {
		if (result != null) {
			writeOutput(out, result, durationMatching, channel);
		} else if (!valid_query) {
			writeNoValidQuery(out, durationMatching, query, channel);
		} else {
			writeNoMatchingCodeFound(out, durationMatching, query, channel);
		}

		lock.release();
		out.flush();
		out.close();
		logger.trace("Connection closed with thread " + Thread.currentThread().getId());
	}

	@Override
	protected void writeOutput(PrintWriter out, DiffsearchResult result, long durationMatching, FileChannel channel)
			throws IOException {
		super.writeOutput(out, result, durationMatching, channel);
		var JSONOutput = new Gson().toJson(result.getResults());
		PrintWriter writer = new PrintWriter("./src/main/resources/GUI/Output/output.json", StandardCharsets.UTF_8);
		writer.println(JSONOutput);
		writer.close();
	}

	protected void writeOutputList(PrintWriter out, DiffsearchResult result, long durationMatching,
			FileChannel channel) {
		boolean incorrect = false;
		var outputList = result.getResults();
		for (CodeChange change : outputList) {
			try {
				if (change == CodeChange.INVALID_QUERY_CODE_CHANGE) {
					incorrect = true;
					channel.write(ByteBuffer.wrap("The query is not correct, please try again.\n".getBytes()));
					break;
					// lock.release();
				} else {
					channel.write(ByteBuffer.wrap((change + "\n").getBytes()));
				}
			} catch (Exception e) {
				logger.error(e.getMessage(), e);
			}
		}
		if (incorrect) {
			outputList.add(CodeChange.INVALID_QUERY_CODE_CHANGE);
		}

		// send the commit url to client
		outputList.forEach(e -> {
			e.commit = e.getCommitUrl();
		});

		ServerData serverdata = new ServerData(outputList, Double.toString(durationMatching / 1000.0), indexSize);

		var JSONOutput = new Gson().toJson(serverdata);
		// Writing the JSON file on the port 8843 (or 8844 or 8845)
		out.println(JSONOutput);
	}

	@Override
	protected void writeNoMatchingCodeFound(PrintWriter out, long durationMatching, String result, FileChannel chan)
			throws IOException {

		Collection<CodeChange> outputList = new ArrayList<>();

		ServerData serverdata = new ServerData(outputList, Double.toString(durationMatching / 1000.0),
				Long.toString(Config.code_changes_num));
		var JSONOutput = new Gson().toJson(serverdata);
		out.println(JSONOutput);

		chan.write(ByteBuffer
				.wrap((new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new java.util.Date()) + "\n").getBytes()));
		chan.write(ByteBuffer.wrap(("QUERY: " + result.replaceAll("\r", "") + "\n").getBytes()));

		chan.write(ByteBuffer.wrap(("No Matching Code changes found in <span style='color: #0071e3'>"
				+ durationMatching / 1000.0 + " seconds </span>\n").getBytes()));

		chan.write(ByteBuffer.wrap(("========================================================="
				+ "==================================" + "================================"
				+ "============================================================\n\n").getBytes()));
	}

	@Override
	protected void writeNoValidQuery(PrintWriter out, long durationMatching, String result, FileChannel chan)
			throws IOException {

		// List<CodeChange> outputList = new ArrayList<>();
		Collection<CodeChange> outputList = new ArrayList<>();
		outputList.add(new CodeChange("invalid query", "invalid query"));

		ServerData serverdata = new ServerData(outputList, Double.toString(durationMatching / 1000.0),
				Long.toString(Config.code_changes_num));
		var JSONOutput = new Gson().toJson(serverdata);
		out.println(JSONOutput);

		chan.write(ByteBuffer
				.wrap((new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new java.util.Date()) + "\n").getBytes()));
		// chan.write(ByteBuffer.wrap(("QUERY: " + result.replaceAll("\r", "") +
		// "\n").getBytes()));

		chan.write(ByteBuffer.wrap(("The query is invalid, please try again.='color: #0071e3'>").getBytes()));

		chan.write(ByteBuffer.wrap(("========================================================="
				+ "==================================" + "================================"
				+ "============================================================\n\n").getBytes()));
	}

	@Override
	protected void writeHeader(PrintWriter out) {
		out.print("HTTP/1.0 200 OK\r\n");
		// out.print("Date: .....\r\n");
		out.print("Server: MINISERVER/1.0\r\n");
		out.print("Content-type: text/html; charset=utf-8\r\n");
		// out.print("Access-Control-Allow-Origin: http://localhost:4200\r\n"); //
		// Angular development server
		out.print("Access-Control-Allow-Origin: " + Config.web_url + "\r\n");
		out.print("\r\n"); // End of headers
	}

}
