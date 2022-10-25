package research.diffsearch;

import junit.framework.TestCase;
import research.diffsearch.main.AbstractQueryMode;

/**
 * Unit test for simple App.
 */
@SuppressWarnings("RedundantThrows")
public class AppTest_AbstractQueryJava extends TestCase {

    public void test0() throws Exception {
        String input = "return a; --> return 5;";
        String expected_output = "return ID ; --> return LT ;";

        String output = AbstractQueryMode.runJunit(input);

        System.out.println("\n\nInput : " + input);
        System.out.println("Output: " + output);
        assertEquals(output, expected_output);
    }

    public void test1() throws Exception {
        String input = "return a; --> return b;";
        String expected_output = "return ID ; --> return ID ;";

        String output = AbstractQueryMode.runJunit(input);

        System.out.println("\n\nInput : " + input);
        System.out.println("Output: " + output);
        assertEquals(output, expected_output);
    }

    public void test2() throws Exception {
        String input = "return 'a'; --> return b;";
        String expected_output = "return LT ; --> return ID ;";

        String output = AbstractQueryMode.runJunit(input);

        
        System.out.println("\n\nInput : " + input);
        System.out.println("Output: " + output);
        assertEquals(output, expected_output);
    }
}
