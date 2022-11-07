package research.diffsearch.server;

import org.apache.log4j.Level;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.zeroturnaround.exec.ProcessExecutor;
import org.zeroturnaround.exec.StartedProcess;
import org.zeroturnaround.exec.stream.LogOutputStream;
import research.diffsearch.Config;
import research.diffsearch.util.Util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Predicate;

/**
 * This class executes python files with certain arguments.
 * The output to the console from the python execution will
 * be logged.
 *
 * @author Paul Bredl
 */
public class  PythonRunner {

    private final List<String> args = new ArrayList<>();
    private StartedProcess pythonProcess;

    private final Logger logger;

    public PythonRunner(String pythonFileName, String... args) {
        this.args.addAll(Arrays.asList(Config.PYTHON_CMD.split(" ")));
        this.args.add(pythonFileName);
        this.args.addAll(Arrays.asList(args));
        String fileName = new File(pythonFileName).getName().split("\\.", 2)[0];
        logger = LoggerFactory.getLogger(fileName);
    }

    /**
     * Runs the python file and waits until the script terminates.
     *
     * @throws IOException          when the python command could not be started.
     * @throws InterruptedException if the thread is interrupted.
     */
    public void runAndWaitUntilEnd() throws IOException, InterruptedException {
        runAndWaitUntil(input -> false);
    }

    /**
     * Runs the python file and waits until the script terminates or
     * a statement is printed out that matches the given predicate.
     *
     * @param inputMatcher when this predicate given a python console output
     *                     returns true, this method will return.
     * @throws IOException          when the python command could not be started.
     * @throws InterruptedException if the thread is interrupted.
     */
    public void runAndWaitUntil(Predicate<String> inputMatcher) throws IOException, InterruptedException {
        long startTime = System.currentTimeMillis();

        var waiter = new Object();
        pythonProcess = new ProcessExecutor()
                .command(args.toArray(new String[0]))
                .environment(System.getenv())
                .redirectOutput(new LogOutputStream() {
                    @Override
                    public void processLine(String s) {
                        logPythonEvent(s);

                        if (inputMatcher.test(s)) {
                            synchronized (waiter) {
                                waiter.notifyAll();
                            }
                        }
                    }
                }).start();

        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.submit(() -> {
            var ret = pythonProcess.getFuture().get();
            synchronized (waiter) {
                waiter.notifyAll();
            }
            return ret;
        });

        // wait until python is finished
        synchronized (waiter) {
            waiter.wait();
        }
        var endTime = System.currentTimeMillis();
        LoggerFactory.getLogger(getClass()).info("Python file returned in " + Util.formatDuration(startTime, endTime));
        executor.shutdown();
    }

    public void shutDownProcess() {
        if (pythonProcess != null) {
            pythonProcess.getProcess().destroy();
        }
    }

    private void logPythonEvent(String pythonLogEvent) {
        var parts = pythonLogEvent.split(":", 3);

        if (parts.length < 3) {
            logger.error(pythonLogEvent);
        } else {
            String logLevelString = parts[0].trim().toUpperCase();
            Level logLevel;
            try {
                logLevel = Level.toLevel(logLevelString, Level.ERROR);
            } catch (RuntimeException e) {
                logLevel = Level.ERROR;
            }

            switch (logLevel.toInt()) {
                case Level.TRACE_INT:
                    logger.trace(parts[2]);
                    break;
                case Level.DEBUG_INT:
                    logger.debug(parts[2]);
                    break;
                case Level.INFO_INT:
                    logger.info(parts[2]);
                    break;
                case Level.WARN_INT:
                    logger.warn(parts[2]);
                    break;
                default:
                    logger.error(parts[2]);
                    break;
            }
        }

    }
}
