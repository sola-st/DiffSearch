# DiffSearch

The goal of this project is to design, implement, and evaluate a search
engine for code changes. Similar to traditional search engines, e.g., for the
web, the approach consists of two main components. At first, an indexing
component scans a large number of version histories and extracts relevant
information about each code change. Then, a querying component matches
a query for a specific kind of code change against all indexed changes and
retrieves a ranked list of changes that match the query.

**Main files:**
- src/main/java/research.diffsearch/**App.java** -> Main file
- src/main/java/research.diffsearch/**Change_extraction.java** -> Clone repository and extract changes
- src/main/java/research.diffsearch/**Matching_Methods.java** -> Cosine distance with minor optimizations for binary vectors
- src/main/java/research.diffsearch/**Pipeline.java** -> Feature extraction stage, FAISS stage and final matching stage
- src/main/java/research.diffsearch/**Python3_Tree.java** -> Python tree class 
- src/main/java/grammar/**Python3(...).java** -> ANTLR java classes
- src/main/java/research.diffsearch/**Java_Tree.java** -> Java tree class 
- src/main/java/grammar/**Java(...).java** -> ANTLR java classes
- src/main/java/research.diffsearch/**TreeUtils.java** -> Methods to visit and work with trees
- src/main/java/research.diffsearch/**Config.java** -> File with important configuration constants.
- src/main/java/resources/Python/**FAISS_indexing.py** -> FAISS indexing (without query)
- src/main/java/resources/Python/**FAISS_Nearest_Neighbor_Search.py** -> FAISS Nearest Neighbor Search
- src/main/java/resources/Python/**git_functions.py** -> python script that clones and performs the git diff. It has to be run first, because it has not been linked yet with the Java project.

**Main folders:**
- src/main/java/resources/**ANTLR** -> ANTLR modified grammars
- src/main/java/resources/**Features_Vectors** -> Folder where the feature vectors are saved
- src/main/java/resources/**GitHub** -> There are the toy test files with changes

**Requirements**
- JAVA 8 and PYTHON 3.7
- [ANTLR 4.7.1](https://github.com/antlr/antlr4/blob/master/doc/getting-started.md) -> apt install antlr  
- [ANACONDA 4.8.0](https://docs.anaconda.com/anaconda/install/linux/) -> preferably in /home/username/anaconda3 
- [FAISS 1.6.1](https://github.com/facebookresearch/faiss/blob/master/INSTALL.md) -> conda install faiss


extra: I use IntelliJ IDEA for this maven project.

**How to reproduce results**

Scalability:
- In src/main/java/research.diffsearch/**Config.java** set SCALABILITY  = true;
- In src/main/java/resources/Python/**FAISS_indexing.py** set nlist = 100;
- Run the file src/main/java/research.diffsearch/**App.java**
- The results are in the file src/main/java/resources/**Features_Vectors/scalability.csv**, where each line is the test performed using different number of changes. For each query the first column is the FAISS searching time and the second is the final matching time. 

Effectiveness:
- In src/main/java/research.diffsearch/**Config.java** set SCALABILITY  = false;
- In src/main/java/resources/Python/**FAISS_indexing.py** set nlist = 3;
- Run the file src/main/java/research.diffsearch/**App.java**
- The results are in the files: queryN.txt, in each file there is the output of each query. 

**Example of queries**
Tested Keywords: _ (for insertion of removal), ID, OP, LT, EXPR, ID<1>, etc.
ID<N> is a specific identifier that changes, ID without number means: I don't care

Examples with Python:

- ID OP LT<0> -> ID OP LT<1>

- if(EXPR<0>): -> if(EXPR<1>):

- if(EXPR<0>):\n    ID OP LT -> if(EXPR<1>): \n     ID OP LT (you don't have to manually insert the newline symbol)
      
- ID OP LT -> _  (THIS LINE IS REMOVED)

