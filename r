[INFO] Error stacktraces are turned on.
[INFO] Scanning for projects...
[INFO] 
[INFO] ------------------------< research:diffsearch >-------------------------
[INFO] Building diffsearch 0.0.1-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- exec-maven-plugin:3.0.0:java (default-cli) @ diffsearch ---
[39m10:01:30.006 research.diffsearch.main.App                 : DEBUG : Ubuntu
[0;39m[39m10:01:30.670 org.zeroturnaround.exec.ProcessExecutor      : DEBUG : Executing [python3, ./src/main/resources/Python/get_FAISS_index_size.py, ./src/main/resources/Features_Vectors/faiss_JS.index, ./src/main/resources/Features_Vectors/JSindex_size.txt].
[0;39m[39m10:01:30.678 org.zeroturnaround.exec.ProcessExecutor      : DEBUG : Started Process[pid=28932, exitValue="not exited"]
[0;39m[39m10:01:34.444 get_FAISS_index_size                         : DEBUG : FAISS index size: 500000
[0;39m[39m10:01:34.574 org.zeroturnaround.exec.WaitForProcess       : DEBUG : Process[pid=28932, exitValue=0] stopped with exit code 0
[0;39m[34m10:01:34.583 research.diffsearch.server.PythonRunner      : INFO  : Python file returned in 00m:03s:908ms
[0;39m[34m10:01:34.583 research.diffsearch.main.App                 : INFO  : DiffSearch 1.2 for JS
[0;39m[39m10:01:34.583 research.diffsearch.main.App                 : DEBUG : Using 4 threads
[0;39m[34m10:01:34.583 r.diffsearch.main.FeatureExtractionMode      : INFO  : Starting feature extraction on corpus.
[0;39m[34m10:01:34.588 r.diffsearch.main.FeatureExtractionMode      : INFO  : NodeExtractor,TriangleFeatureExtractor,RuleCountExtractor
[0;39m[39m10:01:34.590 r.diffsearch.main.FeatureExtractionMode      : DEBUG : Feature vector length: 2000
[0;39m[39m10:01:35.179 r.diffsearch.main.FeatureExtractionMode      : DEBUG : Corpus size: 1007543
[0;39m[34m10:01:35.206 research.diffsearch.util.ProgressWatcher     : INFO  : Feature extraction started
[0;39m[ ░░░░░░░░░░░░░░░░░░░░ ] Feature extraction: 0% (1,008/1,007,543)