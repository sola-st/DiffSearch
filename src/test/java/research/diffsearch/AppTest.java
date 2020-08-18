package research.diffsearch;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /*
     * This small version is compatible only with Java candidates.
     *
     * The "arrow" is --> (double -)
     *
     *
     * Special keywords available for the query are:
     *
     * <...> wildcard
     * LT literal
     * ID identifier
     * binOP binary operator
     * OP assign operator
     * EXPR expression
     *
     * The <N>, e.g. ID<0>, can be: 0,1,2 or 3.
     *
     * */

    //@org.junit.jupiter.api.Test
    public void test0() throws Exception {
        String query = "ID(); --> ID();";
        String candidate = "f(); --> g();";

        assertEquals(true, App.run_junit(query, candidate));
    }

    //@org.junit.jupiter.api.Test
    public void test1() throws Exception {
        String query = "ID binOP<0> LT; --> ID binOP<1> LT;";
        String candidate = "x + 5; --> x - 5;";

        assertEquals(true, App.run_junit(query, candidate));
    }

    //@org.junit.jupiter.api.Test
    public void test2() throws Exception {
        String query = "if(EXPR<0>){ID OP LT;} --> if(EXPR<1>){ID OP LT;}";
        String candidate = "if(x>0){x=5;} --> if(x<0){x=5;}";

        assertEquals(true, App.run_junit(query, candidate));
    }

    //@org.junit.jupiter.api.Test
    public void test3() throws Exception {
        String query = "if(EXPR<0>){<...>} --> if(EXPR<1>){<...>}";
        String candidate = "if(x>0){x=5;} --> if(x<0){x=5;}";

        assertEquals(true, App.run_junit(query, candidate));
    }

    //@org.junit.jupiter.api.Test
    public void test4() throws Exception {
        String query = "if(ID binOP<0> LT){ --> if(ID binOP<1> LT){";
        String candidate = "if(x<0){ --> if(y<0){";

        assertEquals(true, App.run_junit(query, candidate));
    }

    //@org.junit.jupiter.api.Test
    public void test5() throws Exception {
        String query = "ID binOP<0> LT --> ID binOP<0> LT";
        String candidate = "if(x<0){ --> if(y<0){";

        assertEquals(true, App.run_junit(query, candidate));
    }

    //@org.junit.jupiter.api.Test
    public void test6() throws Exception {
        String query = "{ ID = ID; } --> { ID = ID; }";
        String candidate = "{ x = y; } --> { y = z; }";

        assertEquals(true, App.run_junit(query, candidate));
    }

    //@org.junit.jupiter.api.Test
    public void test7() throws Exception {
        String query = "{ ID = ID; } --> { ID = ID; }";
        String candidate = "{ x = y; } --> y = z;";

        assertEquals(false, App.run_junit(query, candidate));
    }

    //@org.junit.jupiter.api.Test
    public void test8() throws Exception {
        String query = "{ <...> ID = ID; <...> } --> { <...> ID = ID; <...> }";
        String candidate = "{ f(); x = y; f(); } --> { f(); y = z; f(); }";

        assertEquals(true, App.run_junit(query, candidate));
    }

    //@org.junit.jupiter.api.Test
    public void test9() throws Exception {
        String query = "{ <...> ID = ID; <...> } --> { <...> ID = ID; <...> }";
        String candidate = "{ x = y; f(); } --> { f(); y = z; }";

        assertEquals(true, App.run_junit(query, candidate));
    }

    //@org.junit.jupiter.api.Test
    public void test10() throws Exception {
        String query = "{ <...> ID = ID; <...> } --> { <...> ID = ID; <...> }";
        String candidate = "{ x = y; f(); } --> { f(); }";

        assertEquals(false, App.run_junit(query, candidate));
    }

    //@org.junit.jupiter.api.Test
    public void test11() throws Exception {
        String query = "{ <...> ID<0>(); <...> ID<0>(); } --> { <...> ID<1>(); <...> ID<1>(); }";
        String candidate = "{ g(); f(); h(); j(); f(); } --> {  g(); z(); h(); j(); z(); }";

        assertEquals(true, App.run_junit(query, candidate));
    }

    //@org.junit.jupiter.api.Test
    public void test12() throws Exception {
        String query = "{ <...> ID<0>(); <...> ID<0>(); } --> { <...> ID<1>(); <...> ID<1>(); }";
        String candidate = "{ g(); f(); h(); j(); f(); } --> {  g(); z(); h(); j(); z(); }";

        assertEquals(true, App.run_junit(query, candidate));
    }

    //@org.junit.jupiter.api.Test
    public void test13() throws Exception {
        String query = "f(ID, ID); --> g(ID, ID);";
        String candidate = "f(a, b, c); --> g(d, e, f);";

        assertEquals(false, App.run_junit(query, candidate));
    }

    //@org.junit.jupiter.api.Test
    public void test14() throws Exception {
        String query = "{ f(); <...> g(); } --> g();";
        String candidate = "{ f(); h(); g(); } --> g();";

        assertEquals(true, App.run_junit(query, candidate));
    }

    //@org.junit.jupiter.api.Test
    public void test15() throws Exception {
        String query = "<...> --> try { <...> } catch (ID ID) { <...> }";
        String candidate = "{ f(); h(); g(); } --> g();";

        assertEquals(false, App.run_junit(query, candidate));
    }

    //@org.junit.jupiter.api.Test
    public void test16() throws Exception {
        String query = "<...> --> try { <...> } catch (ID ID) { <...> }";
        String candidate = "x=3; --> try { x=3; } catch (Exception e) {}";

        assertEquals(true, App.run_junit(query, candidate));
    }

    //@org.junit.jupiter.api.Test
    public void test17() throws Exception {
        String query = "<...> --> try { <...> } catch (ID ID) { <...> }";
        String candidate = "x=3; --> try { x=3; } catch (Exception e) { System.out.println(\"oops\"); }";

        assertEquals(true, App.run_junit(query, candidate));
    }

    //@org.junit.jupiter.api.Test
    public void test18() throws Exception {
        String query = "<...> ID = 23; <...> --> <...>";
        String candidate = "a=2;b=5;c=7;d=23;e=1;f=2; --> a=2;b=5;c=7;d=23;e=1;f=2;";

        assertEquals(true, App.run_junit(query, candidate));
    }

    //@org.junit.jupiter.api.Test
    public void test19() throws Exception {
        String query = "_ --> 1+1";
        String candidate = "_ --> 1+1+2"; // I added _ 

        assertEquals(true, App.run_junit(query, candidate));
    }

    //@org.junit.jupiter.api.Test
    public void test20() throws Exception {
        String query = "_ --> 1+1";
        String candidate = "1+1 --> 1+1+2";

        assertEquals(false, App.run_junit(query, candidate));
    }

    //@org.junit.jupiter.api.Test
    public void test21() throws Exception {
        String query = "{ abc.f=z; } --> _";
        String candidate = "{ abc.f=z; } --> _";

        assertEquals(true, App.run_junit(query, candidate));
    }

    //@org.junit.jupiter.api.Test
    public void test22() throws Exception {
        String query = "{ <...> ID<0>(); <...> ID<0>(); } --> { <...> ID<1>(); <...> ID<1>(); }";
        String candidate = "{ g(); f(); h(); j(); f(); } --> {  g(); z(); h(); j(); m(); }";

        assertEquals(false, App.run_junit(query, candidate));
    }

    //@org.junit.jupiter.api.Test
    public void test23() throws Exception {
        String query = "{ <...> ID<0>(); <...> ID<0>(); } --> { <...> foo(); <...> ID<0>(); }";
        String candidate = "{ g(); f(); h(); j(); f(); } --> {  g(); z(); h(); j(); m(); }";

        assertEquals(false, App.run_junit(query, candidate));
    }

    //@org.junit.jupiter.api.Test
    public void test24() throws Exception {
        String query = "<...>\n" +
                "ID();\n" +
                "<...> --> <...>\n" +
                "ID(ID);\n" +
                "<...>";
        String candidate = "x =0;\n" +
                "foo();\n" +
                "x++; --> x=0;\n" +
                "foo(x);\n" +
                "x++;";

        assertEquals(true, App.run_junit(query, candidate));
    }

    //@org.junit.jupiter.api.Test
    public void test26() throws Exception {
        String query = "<...>\n" +
                "ID();\n" +
                "<...> --> <...>\n" +
                "ID(ID);\n" +
                "<...>";
        String candidate = "x =0;\n" +
                "foo();\n" +
                "x++; --> x=0;\n" +
                "foo();\n" +
                "x++;";

        assertEquals(false, App.run_junit(query, candidate));
    }

    //@org.junit.jupiter.api.Test
    public void test25() throws Exception {
        String query = "ID<0>(EXPR);\n" +
                "ID<1>(EXPR);\n" +
                "-->\n" +
                "ID<1>(EXPR);\n" +
                "ID<0>(EXPR);";
        String candidate = "foo1(x+1);\n" +
                "foo2(x+2);\n" +
                "-->\n" +
                "foo2(x+2);\n" +
                "foo1(x+1);";

        assertEquals(true, App.run_junit(query, candidate));
    }

    //@org.junit.jupiter.api.Test
    public void test27() throws Exception {
        String query = "EXPR<0>.next();\n" +
                "-->\n" +
                "if (EXPR<0>.hasNext()) {\n" +
                "  EXPR<0>.next();\n" +
                "}";
        String candidate = "x.next();\n" +
                "-->\n" +
                "if (x.hasNext()) {\n" +
                "  x.next();\n" +
                "}";

        assertEquals(true, App.run_junit(query, candidate));
    }

    //@org.junit.jupiter.api.Test
    public void test28() throws Exception {
        String query = "EXPR<0>.ID<0>();\n" +
                "-->\n" +
                "if (EXPR<0> != null) {\n" +
                "  EXPR<0>.ID<0>();\n" +
                "}";
        String candidate = "x.start();\n" +
                "-->\n" +
                "if (x != null) {\n" +
                "  x.start();\n" +
                "}";

        assertEquals(true, App.run_junit(query, candidate));
    }

    //@org.junit.jupiter.api.Test//error
    public void test29() throws Exception {
        String query = "_ --> if(ID binOP LT){ ID = LT;}";
        String candidate = "_ --> if (frequency < 1) { frequency = 1; }";

         assertEquals(true, App.run_junit(query, candidate));
    }

    //@org.junit.jupiter.api.Test
    public void test30() throws Exception {
        String query = "if (EXPR) { ID = ID; } --> if (EXPR) { ID = ID; }";
        String candidate = "if (vmType == null) { vmType = Type; } --> if (vmType == null) { vmType = defaultVmType; }";

        assertEquals(true, App.run_junit(query, candidate));
    }

    //@org.junit.jupiter.api.Test
    public void test31() throws Exception {
        String query = "_ --> assert EXPR;";
        String candidate = "_ --> assert x;";

        assertEquals(true, App.run_junit(query, candidate));
    }

    //@org.junit.jupiter.api.Test
    public void test32() throws Exception {
        String query = "_ --> assert ID;";
        String candidate = "_ --> assert x;";

        assertEquals(true, App.run_junit(query, candidate));
    }

    //@org.junit.jupiter.api.Test
    public void test33() throws Exception {
        String query = " if (ID != null) { --> if (ID == null) {";
        String candidate = " if (x != null) { --> if (x == null) {";

        assertEquals(true, App.run_junit(query, candidate));
    }

    //@org.junit.jupiter.api.Test
    public void test38() throws Exception {
        String query = " if (EXPR != null) { --> if (EXPR == null) {";
        String candidate = " if (x != null) { --> if (x == null) {";

        assertEquals(true, App.run_junit(query, candidate));
    }

    //@org.junit.jupiter.api.Test
    public void test34() throws Exception {
        String query = " _ --> EXPR(EXPR);";
        String candidate = " _ --> foo(x);";

        assertEquals(true, App.run_junit(query, candidate));
    }

    //@org.junit.jupiter.api.Test
    public void test35() throws Exception {
        String query = " if(EXPR binOP LT){ ID = LT;} --> _\n";
        String candidate = " if (frequency < 1) { frequency = 1; } --> _\n";

        assertEquals(true, App.run_junit(query, candidate));
    }


    //@org.junit.jupiter.api.Test
    public void test36() throws Exception {
        String query = " _ --> EXPR(5);";
        String candidate = " _ --> foo(5);";

        assertEquals(true, App.run_junit(query, candidate));
    }
    //@org.junit.jupiter.api.Test
    public void test37() throws Exception {
        String query = " _ --> EXPR(EXPR);";
        String candidate = " _ --> foo(5);";

        assertEquals(true, App.run_junit(query, candidate));
    }

    //@org.junit.jupiter.api.Test
    public void test39() throws Exception {
        String query = " _ --> EXPR(ID);";
        String candidate = " _ --> foo(x,y);";

        assertEquals(false, App.run_junit(query, candidate));
    }

    //@org.junit.jupiter.api.Test
    public void test40() throws Exception {
        String query = " while (EXPR) {-->while (ID(<...>)) {";
        String candidate = " while (a()) { --> while (a()) { // a() exits root, while() exits root";

        assertEquals(true, App.run_junit(query, candidate));
    }

    public void test41() throws Exception {
        String query = " while (ID()) {-->while (ID(<...>)) {";
        String candidate = " while (a()) { --> while (a()) { // a() exits root, while() exits root";

        assertEquals(true, App.run_junit(query, candidate));
    }

    public void test42() throws Exception {
        String query = " while (EXPR) {-->while (ID(<...>)) {";
        String candidate = " while (true) { --> while (isIdlingEventEnabled()) {";

        assertEquals(true, App.run_junit(query, candidate));
    }

    public void test43() throws Exception {
        String query = " while (EXPR) {-->while (ID(<...>)) {";
        String candidate = " while (expandTree(graph, assumptions)) { --> while (expandTree(graph, assumptions, expansionLogger)) { ";

        assertEquals(true, App.run_junit(query, candidate));
    }

    public void test44() throws Exception {
        String query = " <...> --> try {<...> } catch (<...>) {<...> }  ";
        String candidate = " profileKey = Optional.fromNullable(details.getProfileKey().toByteArray()); --> try { profileKey = Optional.fromNullable(new ProfileKey(details.getProfileKey().toByteArray())); } catch (InvalidInputException e) { Log.w(TAG, \"Invalid profile key ignored\", e); }  ";

        assertEquals(true, App.run_junit(query, candidate));
    }

    public void test45() throws Exception {
        String query = " EXPR.ID(ID,ID); --> EXPR.ID(ID); ";
        String candidate = "x.y(t,r); --> x.y(t); ";
        assertEquals(true, App.run_junit(query, candidate));
    }

    public void test46() throws Exception {
        String query = " ID<0>.ID<1>(<...>); --> ID<2>.ID<1>(<...>); ";
        String candidate = " when(context.getContextPath()).thenReturn(\"/context\"); -->  when(request.getContextPath()).thenReturn(\"/context\"); ";
        assertEquals(false, App.run_junit(query, candidate));
    }

    public void test47() throws Exception {
        String query = " ID binOP<0> LT -->  ID binOP<1> LT ";
        String candidate = " return mError != null && !mCancel && !mEof; --> return mError == null && !mCancel && !mEof;";
        assertEquals(true, App.run_junit(query, candidate));
    }

    public void test48() throws Exception {
        String query = " EXPR<1>.ID<0>(ID<1>, ID<2>);-->EXPR<1>.ID<0>(ID<2>, ID<1>); ";
        String candidate = " Files.write(badKeystore, keystore); --> Files.write(keystore, badKeystore);";
        assertEquals(true, App.run_junit(query, candidate));
    }

    public void test49() throws Exception {
        String query = " EXPR<1>.ID<0>(EXPR<3>, EXPR<2>);-->EXPR<1>.ID<0>(EXPR<2>, EXPR<3>); ";
        String candidate = " Files.write(badKeystore, keystore); --> Files.write(keystore, badKeystore);";
        assertEquals(true, App.run_junit(query, candidate));
    }

    public void test50() throws Exception {
        String query = " while(true)  --> while(EXPR) ";
        String candidate = " while(true) --> while(x>0)";
        assertEquals(true, App.run_junit(query, candidate));
    }

    public void test51() throws Exception {
        String query = " while(true)  --> while(EXPR) ";
        String candidate = " while(true){ --> while(x>0){";
        assertEquals(false, App.run_junit(query, candidate));
    }

    public void test54() throws Exception {
        String query = " EXPR<0> binOP EXPR<1> --> EXPR<0> binOP EXPR<1> ";
        String candidate = " return mError != null; --> return mError == null;";
        assertEquals(true, App.run_junit(query, candidate));
    }

    public void test53() throws Exception {
        String query = "ID<0>(ID<1>, ID<2>);-->ID<0>(ID<2>, ID<1>); ";
        String candidate = " assertTrue(valid1,1); --> assertTrue(1, valid1);";
        assertEquals(false, App.run_junit(query, candidate));
    }

    public void test55() throws Exception {
        String query = "if(EXPR<0>){<...> --> if(<...> || EXPR<0>){<...> ";
        String candidate = " if (foo()) { --> if (subtypeProps || foo()) {";
        assertEquals(true, App.run_junit(query, candidate));
    }

    public void test64() throws Exception {
        String query = "if(ID<0>){ --> if(EXPR || ID<0>){ ";
        String candidate = " if (isEmpty) { --> if (subtypeProps || isEmpty) {";
        assertEquals(true, App.run_junit(query, candidate));
    }

    public void test56() throws Exception {
        String query = "if(EXPR<0>){-->if(<...> && EXPR<0>){ ";
        String candidate = " if (isEmpty()) { --> if (subtypeProps && isEmpty()) {";
        assertEquals(true, App.run_junit(query, candidate));
    }

    public void test57() throws Exception {
        String query = "EXPR.ID<0>() -->EXPR.ID<1>() ";
        String candidate = " if (graphModel.getGraph().getEdgeCount() > 0) { --> if (graphModel.getGraph().getNodeCount() > 0) {";
        assertEquals(true, App.run_junit(query, candidate));
    }

    public void test58() throws Exception {
        String query = "EXPR.ID<0>() -->EXPR.ID<1>() ";
        String candidate = " if (graphModel.getGraph().getEdgeCount() > 0) { --> if (graphModel.getGraph().getNodeCount() > 0) {";
        assertEquals(true, App.run_junit(query, candidate));
    }

    public void test59() throws Exception {
        String query = "ID<0> unOP; --> ID<0> unOP;  ";
        String candidate = " x++; --> x--;";
        assertEquals(true, App.run_junit(query, candidate));
    }

    public void test60() throws Exception {
        String query = "<...> ID(<...>) { --> <...> ID(<...>) throws ID {";
        String candidate = " public void run() { --> public void run() throws InterruptedException {";
        assertEquals(true, App.run_junit(query, candidate));
    }

    public void test61() throws Exception {
        String query = "ID<0>(EXPR<1>, EXPR<2>);-->ID<0>(EXPR<2>, EXPR<1>); ";
        String candidate = " assertTrue(valid1,1); --> assertTrue(1, valid1);";
        assertEquals(true, App.run_junit(query, candidate));
    }

    public void test62() throws Exception {
        String query = "ID<0>(EXPR<1>, EXPR<0>); --> ID<0>(EXPR<0>, EXPR<1>); ";
        String candidate = " assertTrue(valid1,1); --> assertTrue(1, valid1);";
        assertEquals(true, App.run_junit(query, candidate));
    }

    public void test63() throws Exception {
        String query = "EXPR<3>.ID<0>(EXPR<1>, EXPR<0>); --> EXPR<3>.ID<0>(EXPR<0>, EXPR<1>);";
        String candidate = " ok.assertTrue(valid1,1); --> ok.assertTrue(1, valid1);";
        assertEquals(true, App.run_junit(query, candidate));
    }

    public void test65() throws Exception {
        String query = "unOP EXPR<0>; --> unOP EXPR<0>;";
        String candidate = " --x; --> ++x;";
        assertEquals(true, App.run_junit(query, candidate));
    }

}
