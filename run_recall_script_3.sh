# mvn exec:java -Dexec.mainClass=research.diffsearch.main.App -Dexec.args="-oj -r -q \"EXPR-->try {EXPR;} catch (ID ID) {<...>}\""
# mvn exec:java -Dexec.mainClass=research.diffsearch.main.App -Dexec.args="-oj -r -q \"EXPR = ID + LT;-->EXPR = LT + ID;\""
# mvn exec:java -Dexec.mainClass=research.diffsearch.main.App -Dexec.args="-oj -r -q \"EXPR.ID<0>(); --> EXPR.ID<0>();\""
mvn exec:java -Dexec.mainClass=research.diffsearch.main.App -Dexec.args="-oj -r -q \"EXPR.ID<0>(EXPR<0>); --> EXPR.ID<0>(EXPR<0>);\""
# mvn exec:java -Dexec.mainClass=research.diffsearch.main.App -Dexec.args="-oj -r -q \"EXPR.ID<0>(EXPR<0>, EXPR<1>); --> EXPR.ID<0>(EXPR<0>, EXPR<1>);\""