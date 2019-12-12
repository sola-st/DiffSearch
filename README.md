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
- src/main/java/research.diffsearch/**Indexing_Methods.java** -> (old name, it has to be changed) Clone repository and extract changes
- src/main/java/research.diffsearch/**Matching_Methods.java** -> Cosine distance with minor optimizations for binary vectors
- src/main/java/research.diffsearch/**Pipeline.java** -> feature extraction stage, FAISS stage and final matching stage
- src/main/java/research.diffsearch/**Python3_Tree.java** -> Python tree class 
- src/main/java/research.diffsearch/**Python3(...).java** -> Antlr java classes
- src/main/java/research.diffsearch/**treeUtils.java** -> Methods to visit and work with trees
- src/main/java/resources/Python/**Nearest_Neighbor_Search.py** -> FAISS framework wrapper

**Main folders:**
- src/main/java/resources/**ANTLR** -> ANTLR modified grammar(s)
- src/main/java/resources/**Features_Vectors** -> Folder where the features vector are saved
- src/main/java/resources/**GitHub** -> there are the toy test files with changes