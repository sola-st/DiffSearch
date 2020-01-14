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
- src/main/java/research.diffsearch/**Python3(...).java** -> ANTLR java classes
- src/main/java/research.diffsearch/**TreeUtils.java** -> Methods to visit and work with trees
- src/main/java/resources/Python/**Nearest_Neighbor_Search.py** -> FAISS framework wrapper
- src/main/java/resources/Python/**git_functions.py** -> python script that clones and performs the git diff. It has to be run first, because it has not been linked yet with the Java project.
- src/main/java/resources/MainPage/**main.html** -> Graphic interface using HTML and Javascript (only a draft, not complete)

**Main folders:**
- src/main/java/resources/**ANTLR** -> ANTLR modified grammar(s)
- src/main/java/resources/**Features_Vectors** -> Folder where the feature vectors are saved
- src/main/java/resources/**GitHub** -> There are the toy test files with changes

**Requirements**
- JAVA 8 and PYTHON 3.7
- [ANTLR](https://github.com/antlr/antlr4/blob/master/doc/getting-started.md) -> apt install antlr  
- [ANACONDA](https://docs.anaconda.com/anaconda/install/linux/) -> preferably in /home/username/anaconda3 
- [FAISS](https://github.com/facebookresearch/faiss/blob/master/INSTALL.md) -> conda install faiss


extra: I use IntelliJ IDEA for this maven project

**How to use**
- Run the file src/main/java/research.diffsearch/**App.java**
- Insert old code query, then a blank line (no arrow)
- Insert new code query, then a blank line (no arrow)
- Check the results

- Type END instead of the query to end the program

Additional:
- You can change the "change database" modifying the input in the file src/main/java/research.diffsearch/**Change_extraction.java** , line 40. The inputs available are git_changes.txt, git_changes2.txt and git_changes3.txt

**Example of queries**
Tested Keywords: _ (for insertion of removal), ID, OP, LT, EXPR, ID<1>, etc.
ID<N> is a specific identifier that changes, ID without number means: I don't care

Examples:

- if(ID OP LT): -> if(ID OP LT):

- if(EXPR<0>): -> if(EXPR<1>):

- if(EXPR<0>): ID OP LT \n if(EXPR<1>): \n ID OP LT (you don't have to manually insert the newline symbol)
      
- ID OP LT -> _  (THIS LINE IS REMOVED)

