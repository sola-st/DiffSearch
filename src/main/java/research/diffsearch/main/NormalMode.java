package research.diffsearch.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class NormalMode extends App {

    private static final Logger logger = LoggerFactory.getLogger(NormalMode.class);

    private Scanner scanner = new Scanner(System.in);

    private String readLine(String msg) {
        writeLine(msg);
        return scanner.nextLine();
    }

    private static void writeLine(Object msg) {
        System.out.println(msg);
    }

    @Override
    public void run() {
        writeLine("Enter a command or --exit to quit. Show help with -h.");


    }
}
