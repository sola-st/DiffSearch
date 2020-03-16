# DiffSearch

This package contains the code of DiffSearch and the data required to reproduce the results reported in the paper. If you want simply run the tool see the section "how to run".

**Main files:**
- src/main/java/research.diffsearch/**App.java** -> Main file
- src/main/java/research.diffsearch/**Change_extraction.java** -> Clone repository and extract changes
- src/main/java/research.diffsearch/**Pipeline.java** -> Feature extraction stage, FAISS stage and final matching stage
- src/main/java/research.diffsearch/**Python3_Tree.java** -> Python tree class 
- src/main/java/grammar/**Python3(...).java** -> ANTLR Java classes
- src/main/java/research.diffsearch/**Java_Tree.java** -> Java tree class 
- src/main/java/grammar/**Java(...).java** -> ANTLR Java classes
- src/main/java/research.diffsearch/**TreeUtils.java** -> Methods to visit and work with trees
- src/main/java/research.diffsearch/**Config.java** -> File with important configuration constants.
- src/main/java/resources/Python/**FAISS_indexing.py** -> FAISS indexing (without query)
- src/main/java/resources/Python/**FAISS_Nearest_Neighbor_Search.py** -> FAISS Nearest Neighbor Search
- src/main/java/resources/Python/**git_functions.py** -> python script that clones and performs the git diff.

**Main folders:**
- src/main/java/resources/**ANTLR** -> ANTLR modified grammars
- src/main/java/resources/**Features_Vectors** -> Folder where the feature vectors are saved
- src/main/java/resources/**GitHub** -> There are the toy test files with changes

**Requirements**
- Java 8 and Python 3.7
- [ANTLR 4.7.1](https://github.com/antlr/antlr4/blob/master/doc/getting-started.md) -> apt install antlr
- [FAISS 1.6.1](https://github.com/facebookresearch/faiss/blob/master/INSTALL.md) -> pip3 install faiss-cpu --no-cache

**How to run**
- In src/main/java/research.diffsearch/**Config.java** set NORMAL = true, SCALABILITY  = false and EFFECTIVENESS = false;
- In src/main/java/resources/Python/**FAISS_indexing.py** set nlist = 100;
- Run the file src/main/java/research.diffsearch/**App.java**
- The results are in the file src/main/java/resources/**Features_Vectors/scalability.csv**, where each line is the test performed using different number of changes. For each query the first column is the FAISS searching time and the second is the final matching time. 


**How to reproduce results**

Scalability:
- In src/main/java/research.diffsearch/**Config.java** set NORMAL = false, SCALABILITY  = true and EFFECTIVENESS = false;
- In src/main/java/resources/Python/**FAISS_indexing.py** set nlist = 100;
- Run the file src/main/java/research.diffsearch/**App.java**
- The results are in the file src/main/java/resources/**Features_Vectors/scalability.csv**, where each line is the test performed using different number of changes. For each query the first column is the FAISS searching time and the second is the final matching time. 

Effectiveness:
- In src/main/java/research.diffsearch/**Config.java** set NORMAL = false, SCALABILITY  = false and EFFECTIVENESS = true;
- In src/main/java/resources/Python/**FAISS_indexing.py** set nlist = 3;
- Run the file src/main/java/research.diffsearch/**App.java**
- The results are in the files: queryN.txt, in each file there is the output of each query. 

**Example of queries**

Note that the query syntax slightly differs from the paper for named placeholders, e.g., ID2 in the paper is ID<2> in the implementation.

Examples with Java:

- ID OP LT<0>; -> ID OP LT<1>;

- if(EXPR<0>){    ID OP LT;} -> if(EXPR<1>): {     ID OP LT;}
      
- ID OP LT; -> _

