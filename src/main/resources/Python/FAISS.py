#! /home/luca/anaconda3/bin/python3.7
import csv
import numpy as np 
import pandas as pd
import faiss 
import time
import logging

#######################################################################
#FAISS Installation:
# CPU version only
#conda install faiss-cpu -c pytorch

# GPU version
#conda install faiss-gpu cudatoolkit=8.0 -c pytorch # For CUDA8
#conda install faiss-gpu cudatoolkit=9.0 -c pytorch # For CUDA9
#conda install faiss-gpu cudatoolkit=10.0 -c pytorch # For CUDA10

#################################################################################
#INDEXING
#################################################################################

logging.basicConfig(filename="./src/main/resources/Python/logfilename.log", level=logging.INFO)

#Reading csv feature vectors files
changes_feature_vectors = pd.read_csv('./src/main/resources/Features_Vectors/changes_feature_vectors.csv', header=None).iloc[:, :].values[0:, :-1].astype('float32')
#print(changes_feature_vectors)
#query_feature_vectors = pd.read_csv('./src/main/resources/Features_Vectors/query_feature_vectors.csv', header=None).iloc[:, :].values[0:, :-1].astype('float32')
#print(query_feature_vectors)
with open('./src/main/resources/Features_Vectors/changes_strings.txt') as f:
    changes_strings = f.readlines()
#print(changes_strings)

logging.info('Read csv feature vectors files')

                                  # make faiss available
dimension = len(changes_feature_vectors[0])    # dimensions of each vector                         
n = len(changes_feature_vectors)               # number of vectors 

#print(dimension, n)

nlist = 3  # number of clusters
quantiser = faiss.IndexFlatL2(dimension)  
#quantiser = faiss.IndexIVFFlat(dimension)
index = faiss.IndexIVFFlat(quantiser, dimension, nlist,   faiss.METRIC_L2)

print(index.is_trained)   # False
index.train(np.ascontiguousarray(changes_feature_vectors))  # train on the database vectors
print(index.ntotal)   # 0
index.add(np.ascontiguousarray(changes_feature_vectors))   # add the vectors and update the index
print(index.is_trained)  # True
print(index.ntotal)   # 200

query_feature_vectors = pd.read_csv('./src/main/resources/Features_Vectors/query_feature_vectors.csv', header=None).iloc[:, :].values[0:, :-1].astype('float32')

#print("indexing ended")
logging.info('indexing ended')
#faiss.write_index(index, "./src/main/resources/Features_Vectors/faiss.index")
go = False


#################################################################################
#PROCESS SYNCRONIZATION 
#################################################################################

while(True):
    #less frequency to keep less busy cpu
    #time.sleep(1)
    while(go == False):
        #less frequency to keep less busy cpu
        time.sleep(0.5)
        with open("./src/main/resources/Python/lock.txt", "r+") as fp:
      #      print("GO")
            if("PYTHON" in fp.readline()):
               # print("in")
                go = True
              #  fp.seek(0)
              #  fp.write("STOP")
              #  fp.truncate()
        fp.close()    
    go = False

#################################################################################
#SEARCHING
#################################################################################
   # print("SEARCHING START")
    logging.info('SEARCHING STARTED')
    start = time.time()
    #Reading csv feature vectors files
    
    #print(query_feature_vectors)
    with open('./src/main/resources/Features_Vectors/changes_strings.txt') as f:
        changes_strings = f.readlines()
    #print(changes_strings)


    #start = time.time()
    #index2 = faiss.read_index("./src/main/resources/Features_Vectors/faiss.index")
    #end = time.time()

    #print(end - start)
    #nprobe = 2  # find 2 most similar clusters
    #n_query = 1
    k = 500  # return k-nearest neighbours


    distances, indices = index.search(query_feature_vectors, k)

    logging.info('SEARCHING FINISHED')


    #print(distances)
    #print(indices)

    np.savetxt('./src/main/resources/Features_Vectors/vector.txt', indices)
    values = open('./src/main/resources/Features_Vectors/vector.txt').read().split()

    index_list = [round(int(float(x))) for x in values]
    with open('./src/main/resources/Features_Vectors/vector.txt', 'w') as f:
        for item in index_list:
            f.write("%s\n" % item)
    #print(index_list)

    #for i in index_list:
    #  print(changes_strings[i])

    with open('./src/main/resources/Features_Vectors/candidate_changes.txt', 'w') as f:
        for item in index_list:
            f.write("%s" % changes_strings[item])

    with open("./src/main/resources/Features_Vectors/searching_time.txt", "r+") as fp:
        fp.seek(0)
        fp.write(str(time.time() - start) + "")
        fp.truncate()
    fp.close() 

    #print("END.")
    with open("./src/main/resources/Python/lock.txt", "r+") as fp:
        fp.seek(0)
        fp.write("JAVA")
        fp.truncate()
    fp.close() 