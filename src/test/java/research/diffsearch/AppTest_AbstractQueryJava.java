package research.diffsearch;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;
import research.diffsearch.main.AbstractQueryMode;

/**
 * Unit test for simple App.
 */
@SuppressWarnings("RedundantThrows")
public class AppTest_AbstractQueryJava extends TestCase {

    @Test
    public void test0() throws Exception {
        String input = "return a; --> return 5;";
        String expected_output = "return ID ; --> return LT ;";

        String output = AbstractQueryMode.runJunit(input, false);

        System.out.println("\n\nInput : " + input);
        System.out.println("Output: " + output);
        assertEquals(output, expected_output);
    }

    @Test
    public void test1() throws Exception {
        String input = "return a; --> return b;";
        String expected_output = "return ID ; --> return ID ;";

        String output = AbstractQueryMode.runJunit(input, false);

        System.out.println("\n\nInput : " + input);
        System.out.println("Output: " + output);
        assertEquals(output, expected_output);
    }

    @Test
    public void test2() throws Exception {
        String input = "return 'a'; --> return b;";
        String expected_output = "return LT ; --> return ID ;";

        String output = AbstractQueryMode.runJunit(input, false);

        System.out.println("\n\nInput : " + input);
        System.out.println("Output: " + output);
        assertEquals(output, expected_output);
    }

    @Test
    public void test3() throws Exception {
        String input = "f(); --> g();";
        String expected_output = "ID(); --> ID();";

        String output = AbstractQueryMode.runJunit(input, false);

        System.out.println("\n\nInput : " + input);
        System.out.println("Output: " + output);
        assertEquals(output.replaceAll("\\s+", ""), expected_output.replaceAll("\\s+", ""));

    }

    @Test
    public void test4() throws Exception {
        String input = "x + 5; --> x - 5;";
        String expected_output = "ID binOP LT; --> ID binOP LT;";

        String output = AbstractQueryMode.runJunit(input, false);

        System.out.println("\n\nInput : " + input);
        System.out.println("Output: " + output);
        assertEquals(output.replaceAll("\\s+", ""), expected_output.replaceAll("\\s+", ""));

    }

    @Test
    public void test5() throws Exception {
        String input = "if(x>0){x=5;} --> if(x<0){x=5;}";
        String expected_output = "if(ID binOP LT){ ID OP LT;} --> if(ID binOP LT){ID OP LT;}";

        String output = AbstractQueryMode.runJunit(input, false);

        System.out.println("\n\nInput : " + input);
        System.out.println("Output: " + output);
        assertEquals(output.replaceAll("\\s+", ""), expected_output.replaceAll("\\s+", ""));
    }

    @Test
    public void test6() throws Exception {
        String input = "{ x = y; } --> { y = z; }";
        String exp_out = "{ ID OP ID; } --> { ID OP ID; }";

        String output = AbstractQueryMode.runJunit(input, false);

        System.out.println("\n\nInput : " + input);
        System.out.println("Output: " + output);
        assertEquals(output.replaceAll("\\s+", ""), exp_out.replaceAll("\\s+", ""));
    }

    @Test
    public void test7() throws Exception {
        String input = "f(a, b, c); --> g(d, e, f);";
        String exp_out = "ID(ID, ID, ID); --> ID(ID, ID, ID);";

        String output = AbstractQueryMode.runJunit(input, false);

        System.out.println("\n\nInput : " + input);
        System.out.println("Output: " + output);
        //assertEquals(output.replaceAll("\\s+",""), exp_out.replaceAll("\\s+",""));
    }


}
