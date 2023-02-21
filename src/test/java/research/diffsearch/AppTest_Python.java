package research.diffsearch;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;
import research.diffsearch.main.App;

/**
 * Unit test for simple App.
 */
@SuppressWarnings("RedundantThrows")
public class AppTest_Python extends TestCase {
    /*
     * This small version is compatible only with Python candidates.
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
     */

    @Test
    public void test0() throws Exception {
        String query = "ID() --> ID()";
        String candidate = "f() --> g()";

        assertTrue(App.runJunit_Python(query, candidate));
    }

    @Test
    public void test1() throws Exception {
        String query = "ID binOP LT-->ID binOP LT";
        String candidate = "x + 5-->x - 5";

        assertTrue(App.runJunit_Python(query, candidate));
    }

    @Test
    public void test2() throws Exception {
        String query = "if x>0: --> if x<0:";
        String candidate = "if x>0: --> if x<0:";

        assertTrue(App.runJunit_Python(query, candidate));
    }

    @Test
    public void test3() throws Exception {
        String query = "if EXPR<0>:<...> --> if EXPR<1>:<...>";
        String candidate = "if x>0:x=5 --> if x<0:x=5";

        assertTrue(App.runJunit_Python(query, candidate));
    }

    @Test
    public void test4() throws Exception {
        String query = "if ID binOP<0> LT: --> if ID binOP<1> LT:";
        String candidate = "if x<0: --> if y<0:";

        assertTrue(App.runJunit_Python(query, candidate));
    }

    @Test
    public void test5() throws Exception {
        String query = "ID binOP<0> LT --> ID binOP<0> LT";
        String candidate = "if x<0: --> if y<0:";

        assertTrue(App.runJunit_Python(query, candidate));
    }

    @Test
    public void test6() throws Exception {
        String query = "ID = ID --> ID = ID";
        String candidate = "x = y --> y = z";

        assertTrue(App.runJunit_Python(query, candidate));
    }

    @Test
    public void test7() throws Exception {
        String query = "ID = ID --> ID := ID";
        String candidate = "x = y --> if y := z:";

        assertFalse(App.runJunit_Python(query, candidate));
    }

    @Test
    public void test8() throws Exception {
        String query = "ID = ID" + " --> <...>" + System.lineSeparator() + "ID = ID" + System.lineSeparator() + "<...>";
        String candidate = "ID = ID" + " --> f()" + System.lineSeparator() + "ID = ID" + System.lineSeparator()
                + "<...>";

        assertTrue(App.runJunit_Python(query, candidate));
    }

    @Test
    public void test9() throws Exception {
        String query = " <...>\nID = ID\n<...>  -->  <...>\nID = ID\n<...> ";
        String candidate = " x = y\nf() -->  f()\ny = z";

        assertTrue(App.runJunit_Python(query, candidate));
    }

    @Test
    public void test10() throws Exception {
        String query = "<...>\nID = ID\n<...> --> <...>\nID = ID\n<...>";
        String candidate = "x = y\nf() --> f()";

        assertFalse(App.runJunit_Python(query, candidate));
    }

    @Test
    public void test11() throws Exception {
        String query = "<...>\nID<0>()\n<...>\nID<0>()\n-->\n<...>\nID<1>()\n<...>\nID<1>()";
        String candidate = "g()\nf()\nh()\nj()\nf()\n-->\ng()\nz()\nh()\nj()\nz()";

        assertTrue(App.runJunit_Python(query, candidate));
    }

    @Test
    public void test12() throws Exception {
        String query = "<...>\nID<0>()\n<...>\nID<0>() --> <...>\nID<1>()\n<...>\nID<1>()";
        String candidate = "g()\nf()\nh()\nj()\nf() --> g()\nz()\nh()\nj()\nz()";

        assertTrue(App.runJunit_Python(query, candidate));
    }

    @Test
    public void test13() throws Exception {
        String query = "f(ID, ID) --> g(ID, ID)";
        String candidate = "f(a, b, c) --> g(d, e, f)";

        assertFalse(App.runJunit_Python(query, candidate));
    }

    @Test
    public void test14() throws Exception {
        String query = "f()\n<...>\ng() --> g()";
        String candidate = "f()\nh()\ng() --> g()";

        assertTrue(App.runJunit_Python(query, candidate));
    }

    @Test
    public void test15() throws Exception {
        String query = "<...> --> try: <...>\nexcept (ID): <...> ";
        String candidate = "f()\nh()\ng() --> g()";

        assertFalse(App.runJunit_Python(query, candidate));
    }

    @Test
    public void test16() throws Exception {
        String query = "<...> --> try: <...>\nexcept (ID): <...>";
        String candidate = "x=3 --> try:\n    x=3\nexcept (e):";

        assertTrue(App.runJunit_Python(query, candidate));
    }

    @Test
    public void test17() throws Exception {
        String query = "<...> --> try: <...>\nexcept (ID): <...>";
        String candidate = "x=3 --> try:\n    x=3\nexcept (e):\n    print(\"oops\")";

        assertTrue(App.runJunit_Python(query, candidate));
    }

    @Test
    public void test18() throws Exception {
        String query = "<...> ID = 23; <...> --> <...>";
        String candidate = "a=2;b=5;c=7;d=23;e=1;f=2; --> a=2;b=5;c=7;d=23;e=1;f=2;";

        assertTrue(App.runJunit_Python(query, candidate));
    }

    @Test
    public void test19() throws Exception {
        String query = "_ --> 1+1";
        String candidate = "_ --> 1+1+2"; // I added _

        assertTrue(App.runJunit_Python(query, candidate));
    }

    @Test
    public void test20() throws Exception {
        String query = "_ --> 1+1";
        String candidate = "1+1 --> 1+1+2";

        assertFalse(App.runJunit_Python(query, candidate));
    }

    @Test
    public void test21() throws Exception {
        String query = "abc.f=z --> _";
        String candidate = "abc.f=z --> _";

        assertTrue(App.runJunit_Python(query, candidate));
    }

    @Test
    public void test22() throws Exception {
        String query = " <...> ID<0>(); <...> ID<0>(); --> <...> ID<1>(); <...> ID<1>();";
        String candidate = " g(); f(); h(); j(); f(); --> g(); z(); h(); j(); m();";

        assertFalse(App.runJunit_Python(query, candidate));
    }

    @Test
    public void test23() throws Exception {
        String query = "<...> ID<0>(); <...> ID<0>(); -->  <...> foo(); <...> ID<0>(); ";
        String candidate = " g(); f(); h(); j(); f();  -->   g(); z(); h(); j(); m(); ";

        assertFalse(App.runJunit_Python(query, candidate));
    }

    @Test
    public void test24() throws Exception {
        String query = "<...>\n" +
                "ID()\n" +
                "<...> --> <...>\n" +
                "ID(ID)\n" +
                "<...>";
        String candidate = "x =0\n" +
                "foo()\n" +
                "x += 1 --> x=0\n" +
                "foo(x)\n" +
                "x += 1";

        assertTrue(App.runJunit_Python(query, candidate));
    }

    @Test
    public void test26() throws Exception {
        String query = "<...>\n" +
                "ID()\n" +
                "<...> --> <...>\n" +
                "ID(ID)\n" +
                "<...>";
        String candidate = "x =0\n" +
                "foo()\n" +
                "x+= 1 --> x=0\n" +
                "foo()\n" +
                "x+=1";

        assertFalse(App.runJunit_Python(query, candidate));
    }

    // Reduced test 26. The problem is probably with the matching code, since the
    // parse trees look fine.
    // The test case can be changed from matching to non-matching by removing the
    // newline after the query arrow.
    @Test
    public void test26_essence() throws Exception {
        String query = "ID()\n" +
                "-->\n" +
                "ID(ID)";
        String candidate = "foo()\n" +
                "-->\n" +
                "foo()";

        assertFalse(App.runJunit_Python(query, candidate));
    }

    @Test
    public void test25() throws Exception {
        String query = "ID<0>(EXPR)\n" +
                "ID<1>(EXPR)\n" +
                "-->\n" +
                "ID<1>(EXPR)\n" +
                "ID<0>(EXPR)";
        String candidate = "foo1(x+1)\n" +
                "foo2(x+2)\n" +
                "-->\n" +
                "foo2(x+2)\n" +
                "foo1(x+1)";

        assertTrue(App.runJunit_Python(query, candidate));
    }

    @Test
    public void test27() throws Exception {
        String query = "EXPR<0>.next()\n" +
                "-->\n" +
                "if EXPR<0>.hasNext(): \n" +
                "    EXPR<0>.next()\n" +
                "";
        String candidate = "x.next()\n" +
                "-->\n" +
                "if x.hasNext():\n" +
                "    x.next()\n" +
                "";

        assertTrue(App.runJunit_Python(query, candidate));
    }

    @Test
    public void test28() throws Exception {
        String query = "EXPR<0>.ID<0>()\n" +
                "-->\n" +
                "if EXPR<0> != None:\n" +
                "    EXPR<0>.ID<0>()\n" +
                "";
        String candidate = "x.start()\n" +
                "-->\n" +
                "if x != None: \n" +
                "    x.start()\n" +
                "";

        assertTrue(App.runJunit_Python(query, candidate));
    }

    @Test
    public void test29() throws Exception {
        String query = "_ --> if ID binOP LT: ID = LT";
        String candidate = "_ --> if frequency < 1: frequency = 1";

        assertTrue(App.runJunit_Python(query, candidate));
    }

    @Test
    public void test30() throws Exception {
        String query = "if EXPR: ID = ID --> if EXPR: ID = ID";
        String candidate = "if vmType == None: vmType = Type --> if vmType == None: vmType = defaultVmType";

        assertTrue(App.runJunit_Python(query, candidate));
    }

    @Test
    public void test31() throws Exception {
        String query = "_ --> exit(EXPR)";
        String candidate = "_ --> exit(x)";

        assertTrue(App.runJunit_Python(query, candidate));
    }

    @Test
    public void test32() throws Exception {
        String query = "_ --> exit(ID)";
        String candidate = "_ --> exit(x)";

        assertTrue(App.runJunit_Python(query, candidate));
    }

    @Test
    public void test33() throws Exception {
        String query = " if ID != None: --> if ID == None:";
        String candidate = " if x != None: --> if x == None:";

        assertTrue(App.runJunit_Python(query, candidate));
    }

    @Test
    public void test38() throws Exception {
        String query = " if EXPR != None: --> if EXPR == None:";
        String candidate = " if x != None: --> if x == None:";

        assertTrue(App.runJunit_Python(query, candidate));
    }

    @Test
    public void test34() throws Exception {
        String query = " _ --> EXPR(EXPR)";
        String candidate = " _ --> foo(x)";

        assertTrue(App.runJunit_Python(query, candidate));
    }

    @Test
    public void test35() throws Exception {
        String query = " if EXPR binOP LT: ID = LT --> _\n";
        String candidate = " if frequency < 1: frequency = 1 --> _\n";

        assertTrue(App.runJunit_Python(query, candidate));
    }

    @Test
    public void test36() throws Exception {
        String query = " _ --> ID(5)";
        String candidate = " _ --> foo(5)";

        assertTrue(App.runJunit_Python(query, candidate));
    }

    @Test
    public void test37() throws Exception {
        String query = " _ --> ID(EXPR)";
        String candidate = " _ --> foo(5)";

        assertTrue(App.runJunit_Python(query, candidate));
    }

    @Test
    public void test39() throws Exception {
        String query = " _ --> ID(ID)";
        String candidate = " _ --> foo(x,y)";

        assertFalse(App.runJunit_Python(query, candidate));
    }

    @Test
    public void test40() throws Exception {
        String query = " while EXPR: -->while ID(<...>):";
        String candidate = " while a(): --> while a(): # a() exits root, while() exits root";

        assertTrue(App.runJunit_Python(query, candidate));
    }

    @Test
    public void test41() throws Exception {
        String query = " while ID():-->while ID(<...>):";
        String candidate = " while a(): --> while a(): # a() exits root, while() exits root";

        assertTrue(App.runJunit_Python(query, candidate));
    }

    @Test
    public void test42() throws Exception {
        String query = " while EXPR:-->while ID(<...>):";
        String candidate = " while True: --> while isIdlingEventEnabled():";

        assertTrue(App.runJunit_Python(query, candidate));
    }

    @Test
    public void test43() throws Exception {
        String query = " while EXPR:-->while ID(<...>):";
        String candidate = " while expandTree(graph, assumptions): --> while expandTree(graph, assumptions, expansionLogger):";

        assertTrue(App.runJunit_Python(query, candidate));
    }

    @Test
    public void test44() throws Exception {
        String query = " <...> --> try: <...>\nexcept <...> : <...>   ";
        String candidate = " profileKey = Optional.fromNullable(details.getProfileKey().toByteArray()) --> try: profileKey = Optional.fromNullable(ProfileKey(details.getProfileKey().toByteArray()))\nexcept e: Log.w(TAG, \"Invalid profile key ignored\", e)";

        assertTrue(App.runJunit_Python(query, candidate));
    }

    @Test
    public void test45() throws Exception {
        String query = " EXPR.ID(ID,ID) --> EXPR.ID(ID) ";
        String candidate = "x.y(t,r) --> x.y(t) ";
        assertTrue(App.runJunit_Python(query, candidate));
    }

    @Test
    public void test46() throws Exception {
        String query = " ID<0>.ID<1>(<...>) --> ID<2>.ID<1>(<...>)";
        String candidate = " when(context.getContextPath()).thenReturn(\"/context\") -->  when(request.getContextPath()).thenReturn(\"/context\")";
        assertFalse(App.runJunit_Python(query, candidate));
    }

    @Test
    public void test47() throws Exception {
        String query = " ID binOP<0> LT -->  ID binOP<1> LT ";
        String candidate = " return mError != None and not mCancel and not mEof --> return mError is None is not mCancel is not mEof";
        assertTrue(App.runJunit_Python(query, candidate));
    }

    @Test
    public void test48() throws Exception {
        String query = " EXPR<1>.ID<0>(ID<1>, ID<2>)-->EXPR<1>.ID<0>(ID<2>, ID<1>) ";
        String candidate = " Files.write(badKeystore, keystore) --> Files.write(keystore, badKeystore)";
        assertTrue(App.runJunit_Python(query, candidate));
    }

    @Test
    public void test49() throws Exception {
        String query = " EXPR<1>.ID<0>(EXPR<3>, EXPR<2>)-->EXPR<1>.ID<0>(EXPR<2>, EXPR<3>) ";
        String candidate = " Files.write(badKeystore, keystore) --> Files.write(keystore, badKeystore)";
        assertTrue(App.runJunit_Python(query, candidate));
    }

    @Test
    public void test50() throws Exception {
        String query = " while True:  --> while EXPR: ";
        String candidate = " while True: --> while x>0:";
        assertTrue(App.runJunit_Python(query, candidate));
    }

    @Test
    public void test51() throws Exception {
        String query = " while True:  --> while EXPR ";
        String candidate = " while True: --> while x>0:";
        assertFalse(App.runJunit_Python(query, candidate));
    }

    @Test
    public void test54() throws Exception {
        String query = " EXPR<0> binOP EXPR<1> --> EXPR<0> binOP EXPR<1> ";
        String candidate = " return mError != None --> return mError == None";
        assertTrue(App.runJunit_Python(query, candidate));
    }

    @Test
    public void test53() throws Exception {
        String query = "ID<0>(ID<1>, ID<2>)-->ID<0>(ID<2>, ID<1>) ";
        String candidate = " assertTrue(valid1,1) --> assertTrue(1, valid1)";
        assertFalse(App.runJunit_Python(query, candidate));
    }

    @Test
    public void test55() throws Exception {
        String query = "if EXPR<0>:<...> --> if EXPR or EXPR<0>:<...> ";
        String candidate = " if foo(): --> if subtypeProps or foo():";
        assertTrue(App.runJunit_Python(query, candidate));
    }

    @Test
    public void test64() throws Exception {
        String query = "if ID<0>(): --> if EXPR or ID<0>(): ";
        String candidate = " if isEmpty(): --> if subtypeProps or isEmpty():";
        assertTrue(App.runJunit_Python(query, candidate));
    }

    @Test
    public void test56() throws Exception {
        String query = "if EXPR<0>:-->if EXPR and EXPR<0>:";
        String candidate = " if isEmpty(): --> if subtypeProps and isEmpty():";
        assertTrue(App.runJunit_Python(query, candidate));
    }

    @Test
    public void test57() throws Exception {
        String query = "EXPR.ID<0>() -->EXPR.ID<1>() ";
        String candidate = " if graphModel.getGraph().getEdgeCount() > 0: --> if graphModel.getGraph().getNodeCount() > 0:";
        assertTrue(App.runJunit_Python(query, candidate));
    }

    @Test
    public void test58() throws Exception {
        String query = "EXPR.ID<0>() -->EXPR.ID<1>() ";
        String candidate = " if graphModel.getGraph().getEdgeCount() > 0: --> if graphModel.getGraph().getNodeCount() > 0:";
        assertTrue(App.runJunit_Python(query, candidate));
    }

    @Test
    public void test59() throws Exception {
        String query = "ID<0> OP LT<0> --> ID<0> OP LT<0>  ";
        String candidate = " x+=1 --> x-=1";
        assertTrue(App.runJunit_Python(query, candidate));
    }

    @Test
    public void test60() throws Exception {
        String query = "<...> ID(<...>): --> <...> ID(<...>) -> ID:";
        String candidate = " def run():--> def run() -> int:";
        assertTrue(App.runJunit_Python(query, candidate));
    }

    @Test
    public void test61() throws Exception {
        String query = "ID<0>(EXPR<1>, EXPR<2>)-->ID<0>(EXPR<2>, EXPR<1>) ";
        String candidate = " assertTrue(valid1,1) --> assertTrue(1, valid1)";
        assertTrue(App.runJunit_Python(query, candidate));
    }

    @Test
    public void test62() throws Exception {
        String query = "ID<0>(EXPR<1>, EXPR<0>) --> ID<0>(EXPR<0>, EXPR<1>) ";
        String candidate = " assertTrue(valid1,1) --> assertTrue(1, valid1)";
        assertTrue(App.runJunit_Python(query, candidate));
    }

    @Test
    public void test63() throws Exception {
        String query = "EXPR<3>.ID<0>(EXPR<1>, EXPR<0>) --> EXPR<3>.ID<0>(EXPR<0>, EXPR<1>)";
        String candidate = " ok.assertTrue(valid1,1) --> ok.assertTrue(1, valid1)";
        assertTrue(App.runJunit_Python(query, candidate));
    }

    @Test
    public void test65() throws Exception {
        String query = "unOP EXPR<0> --> unOP EXPR<0>";
        String candidate = " not x --> * x";
        assertTrue(App.runJunit_Python(query, candidate));
    }

    @Test
    public void test66() throws Exception {
        String query = "unOP EXPR<0> --> EXPR<0>";
        String candidate = " not x --> x";
        assertTrue(App.runJunit_Python(query, candidate));
    }

    @Test
    public void test67() throws Exception {
        String query = "if EXPR<0>: --> if EXPR<0> and EXPR :";
        String candidate = "if contentType == None : --> if contentType == None and charset == None :";
        assertTrue(App.runJunit_Python(query, candidate));
    }

    @Test
    public void test68() throws Exception {
        String query = "ID.ID() binOP LT --> ID.ID() binOP LT";
        String candidate = "return found.iterator().next() if found.size() == 1 else None --> return found.iterator().next() if found.size() >= 1 else None  ";
        assertTrue(App.runJunit_Python(query, candidate));
    }

    @Test
    public void test69() throws Exception {
        String query = "ID<0>.ID<1>(ID<2>,ID) binOP LT --> ID<0>.ID<1>(ID<2>)";
        String candidate = "timeout = clockSource.elapsedMillis(startTime, now) - 1000 --> timeout = hardTimeout - clockSource.elapsedMillis(startTime) ";
        assertTrue(App.runJunit_Python(query, candidate));
    }

    @Test
    public void test70() throws Exception {
        String query = "_ --> print(LT)";
        String candidate = "_ --> print('hello') ";
        assertTrue(App.runJunit_Python(query, candidate));
    }

    @Test
    public void test71() throws Exception {
        String query = "a=1-->b=2";
        String candidate = "a=1-->b=2";
        assertTrue(App.runJunit_Python(query, candidate));
    }

    @Test
    public void test72() throws Exception {
        String query = "def foo(x): --> def bar(x)";
        String candidate = "def foo(x: int) -> list[float]: --> def bar(x: int) -> list[float]:";
        assertFalse(App.runJunit_Python(query, candidate));
    }

    @Test
    public void test73() throws Exception {
        String query = "def ID(ID<0>): --> def ID(ID<0>)";
        String candidate = "def foo(x: int) -> list[float]: --> def bar(x: int) -> list[float]:";
        assertFalse(App.runJunit_Python(query, candidate));
    }

    @Test
    public void test74() throws Exception {
        String query = "a=1-->b='test'";
        String candidate = "a: int =1-->a: str='test'";
        assertFalse(App.runJunit_Python(query, candidate));
    }

    @Test
    public void test75() throws Exception {
        String query = "ID<0>=1-->ID<0>=LT";
        String candidate = "a: int =1-->a: str='test'";
        assertFalse(App.runJunit_Python(query, candidate));
    }

    @Test
    public void test76() throws Exception {
        String query = "ID<0>: ID<1> = LT --> ID<0>: ID<2> = LT";
        String candidate = "a: int = 1 --> a: str='test'";
        assertTrue(App.runJunit_Python(query, candidate));
    }

    @Test
    public void test77() throws Exception {
        String query = "ID<0> = EXPR<0> --> ID<0>: ID = EXPR<0>";
        String candidate = "a = 5 --> a: int = 5";
        assertTrue(App.runJunit_Python(query, candidate));
    }

    @Test
    public void test78() throws Exception {
        String query = "ID<0>: EXPR binOP EXPR --> ID<0>: EXPR";
        String candidate = "a: int | str --> a: int";
        assertTrue(App.runJunit_Python(query, candidate));
    }

    @Test
    public void test79() throws Exception {
        String query = "def ID(ID<0>: <...>): --> def ID(ID<0>: <...>) -> EXPR:";
        String candidate = "def foo(x: int): --> def bar(x: int) -> list[float]:";
        assertTrue(App.runJunit_Python(query, candidate));
    }

    @Test
    public void test80() throws Exception {
        String query = "def ID(ID<0>: <...>) -> EXPR<0>: --> def ID(ID<0>: <...>) -> EXPR<0>:";
        String candidate = "def foo(x: int) -> list[float]: --> def bar(x: int) -> list[float]:";
        assertTrue(App.runJunit_Python(query, candidate));
    }

}
