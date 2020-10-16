This is a short guide how to run the jar file to test the new GUI.

=========================================================================================

I used the following Java version on Ubuntu:

openjdk 11.0.7 2020-04-14
OpenJDK Runtime Environment (build 11.0.7+10-post-Ubuntu-2ubuntu219.10)
OpenJDK 64-Bit Server VM (build 11.0.7+10-post-Ubuntu-2ubuntu219.10, mixed mode, sharing)


You can run diffsearch.jar using with the following command:

java -jar ./out/artifacts/diffsearch_jar/diffsearch.jar

where . is the folder Diffsearch/

If you have the error: java.net.BindException: Address already in use

you can fix with the command:
fuser -k 8843/tcp

To stop diffsearch you can use CTRL+C instead of CTRL+Z, because CTRL+Z keeps the ports open.

========================================================================================== 

The server waits on the port 8843 for a post data. The post data is with two elements: Text1: "old part" of the query and Text2: "new part" of the query.

Then, the server will send the JSON file with the results on the same port. The JSON file is also saved in the file GUI/Output/output.json for tests.

A practical example:

[INPUT]

The query is, for example: 

old part: ID<1>(ID<2>, LT<3>); 
new part: ID<1>(LT<3>, ID<2>);

The post data is with two elements: Text1: "old part" of the query and Text2: "new part" of the query: Text1=ID%3C1%3E%28ID%3C2%3E%2C+LT%3C3%3E%29%3B&Text2=ID%3C1%3E%28LT%3C3%3E%2C+ID%3C2%3E%29%3B

Then I use: 

 result = java.net.URLDecoder.decode(postData.toString().replaceAll("Text1=","").replaceAll("&Text2=","-->"), StandardCharsets.UTF_8);

and I have:

ID<1>(ID<2>, LT<3>);-->ID<1>(LT<3>, ID<2>);

[OUTPUT]

An example of the JSON file with two code changes is:

[
{"url":"https://github.com/quarkusio/quarkus/commit/8b3d76af5e8f056334cc6ca39b78b90eedd8136a",
"hunk_lines":"-120,15 +120,15",
"codeChange_old":"assertEquals(numberOfSegments,2);",
"codeChange_new":"assertEquals(2,numberOfSegments);"},

{"url":"https://github.com/quarkusio/quarkus/commit/1c89c51f6626fed09d594ea69289da13736d613b",
"hunk_lines":"-0,0 +1,34",
"codeChange_old":"assertFalse(deployed,\"Shouldnotdeployinvalidrule\");",
"codeChange_new":"assertFalse(\"Shouldnotdeployinvalidrule\",deployed);"}
]

The urls can be sometimes wrong, I will fix this bug soon.

===============================================================================================

If you want to read the code of the java server, it is in the file:
src/main/java/research/diffsearch/WebServerGUI.java

===============================================================================================

There are some queries tested by me that you can use at the beginning, they are in the file:
src/main/resources/queries.txt

