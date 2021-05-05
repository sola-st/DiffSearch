# DiffSearch

DiffSearch is a search engine for code changes. The input is a query that describes the code
change and the output is a list of code changes. The following explains how the queries work.
Then, your task is to formulate queries to find specific code changes.

**Syntax and Semantics of Queries**
Queries are formulated in an extension of Java. The structure of a query is the following:

                                 old code --> new code

Here’s an example query:

                                 x = foo(); --> x = bar();
                                 
Queries are compared against the **lines changed in a commit**, by checking that everything in
the query indeed appears in the commit. If a commit changes more than what is asked for in a
query, then this commit counts as a match. In contrast, if a query contains code not among the
changed lines, it’ll not match. For example, the above query will match

                               x = foo(); y = z; --> x = bar(); z = y;
                               
but it won’t match the following:

                                     foo(); --> x = bar();

The syntax of queries follows the Java language and also allows for some **syntactically
incomplete code snippets**. For example, a query may open a block with “{“ but not close it with
a matching “}”.

In addition to the syntax of the target programming language, queries support some special
symbols (note: the symbols are case-sensitive):

**LT** which matches any literal, e.g., a number, a char, or a string
**ID** which matches any identifier, e.g., a variable name or method name
**EXPR** which matches any expression, e.g., x < y + 1 or x.foo
**binOP** which matches any binary operator, e.g., + and -
**unOP** which matches any unary operator, e.g., ++ and --
**OP** which matches any assign operator, e.g., = , -=, and +=

These symbols can also be **labeled with a number** (0 to 3) to match the same syntactic
element multiple times, e.g., ID<1> and LT<2>. For example, this query searches for code
changes where the binary operands inside an if condition changes:

                      if (ID<0> binOP LT<0>) { --> if (ID<0> binOP LT<0>) {

The query matches this code change:

                                   if (x > 0) { --> if (x < 0) {

But not this one (because x changes to y):

                                   if (x > 0) { --> if (y < 0) {

Another special symbol is ​ _ ​ , which indicates that one part of the code change is **empty**. It is
useful for finding inserted and deleted code. For example, the following query looks for an
inserted return statement:

                                           _ --> return EXPR;

There is a last special symbol, ​ <...>​ , which represents a **wildcard**. It matches zero, one, or more
statements or expressions and helps with queries where some other code may be interspersed
between the code to find. For example, the following query searches for any code change that
replaces some (potentially empty) code with a return statement that returns a variable:

                                            <...> --> return ID;


**Examples of Queries and Matching Code Changes**

Query:    
               	
               	       <...>                      <...>
                           ID<0>();                   ID<1>();
                           <...>         	-->       <...>
                           ID<0>();                	  ID<1>();
               	 
Matching change:   
    
                           g();              	   g();
                           f();                        z();
                           h();    		-->        h();
                           j();                        j();
                           f(); }                	   z();


Query:     
               	
               	       <...> 		         try {
                                                           <...>
                                            -->      } catch (ID ID) {
                                                           <...> }

Matching change: 	

                           x=3; 		  	try {
                                            -->          x=3;
                                                    } catch (Exception e) {
                                                         System.out.println("oops");}


Query:                  
  	
  	                      <...>
                          ID = 23;   	 -->  	<...>
                          <...>

Matching change: 	

                            a=2;             		a=2;
                            b=5;             		b=5;
                            c=7;    	  -->	        c=7;
                            d=23;           		d=23;
                            e=1;             		e=1;
                            f=2;              		f=2;



This package contains the code of DiffSearch. If you want simply run the tool see the section "how to run".

**Requirements**
- Java 11 and Python 3.7
- [ANTLR 4.7.1](https://github.com/antlr/antlr4/blob/master/doc/getting-started.md) -> apt install antlr

**How to run**

FOR THE DIFFSEARCH SERVER:

  - clone the repository: https://github.com/lucaresearch/DiffSearch.git
  - Type the commands:  
      - virtualenv -p /usr/bin/python3 diffsearch-env     
      - source diffsearch-env/bin/activate  
      - pip3 install faiss-cpu 
      - pip3 install numpy     
      - pip3 install pandas
      - pip3 install pygit2
      - pip3 install dask[dataframe]

  - Create the folder "Features_Vectors" in DiffSearch/src/main/resources/
  - Copy the file "faiss_java.index" in DiffSearch/src/main/resources/Features_Vectors/   (You can download the index [here](https://drive.google.com/file/d/1DOk5UpJiwBg4YkuQ43lk0qEu726iGLNY/view) )
  - Copy the file "changes_strings_java.txt" in DiffSearch/src/main/resources/Features_Vectors/   (You can download the index [here](https://drive.google.com/file/d/1ZISwrmRnNTLZSjS5tmOqU7QcH7Dd793z/view?usp=sharing) )
  - Copy the file "changes_strings_prop_java.txt" in DiffSearch/src/main/resources/Features_Vectors/   (You can download the index [here](https://drive.google.com/file/d/1Dp1IALq9W8Ktu1nlBcP3h8oVP24wlo4Q/view?usp=sharing) )
  - Create an empty file "server_log.log" in DiffSearch/src/main/resources/Features_Vectors/

  - Then:   
      - mvn compile  
      - mvn exec:java -Dexec.mainClass=research.diffsearch.main.App -Dexec.args="-g -lang java"

  - Extra:
      
      - If you received the error: " OSError: [Errno 98] Address already in use"
      
      - Use the following commands:
           
          - fuser -k 5002/tcp
          - fuser -k 8843/tcp
          
  - More DiffSearch arguments:
 
        - Recall experiments:        -Dexec.args="-r -b -lang java"
        - Features extraction:       -Dexec.args="-fe -lang java"
        - Old GUI:                   -Dexec.args="-w -lang java"
        - Options for flag -lang: PYTHON3, JAVA, JAVASCRIPT (case-insensitive)
        - DiffSearch Beta: -Dexec.args="-r -k 5000 -silent -lang java -extractors node:300;triangle:300;rulecount:1400 -mt 10"
        - DiffSearch Alpha: -Dexec.args="-r -k 1000 -silent -lang java -extractors parentchild:2048;triangle:2048 -t 1 --extract-query-placeholders -nondividedextraction -noquerymultiplpication"
        

FOR THE GUI:

- clone the repository: https://github.com/sola-st/DiffSearch-UI
- Run the command: ng serve --proxy-config src/proxy.conf.json
- Go in "http://localhost:4200/diffsearch" with your browser 
