import csv
import numpy as np 
import pandas as pd



#Reading csv feature vectors files
changes_feature_vectors = pd.read_csv('./src/main/resources/Features_Vectors/changes_feature_vectors.csv', header=None).iloc[:, :].values[0:, :-1].astype('float32')
#print(changes_feature_vectors)
query_feature_vectors = pd.read_csv('./src/main/resources/Features_Vectors/query_feature_vectors.csv', header=None).iloc[:, :].values[0:, :-1].astype('float32')
#print(query_feature_vectors)

#######################################################################
#FAISS Installation:
# CPU version only
#conda install faiss-cpu -c pytorch

# GPU version
#conda install faiss-gpu cudatoolkit=8.0 -c pytorch # For CUDA8
#conda install faiss-gpu cudatoolkit=9.0 -c pytorch # For CUDA9
#conda install faiss-gpu cudatoolkit=10.0 -c pytorch # For CUDA10

import faiss                                   # make faiss available
dimension = len(changes_feature_vectors[0])    # dimensions of each vector                         
n = len(changes_feature_vectors)               # number of vectors 

#print(dimension, n)

nlist = 3  # number of clusters
quantiser = faiss.IndexFlatL2(dimension)  
index = faiss.IndexIVFFlat(quantiser, dimension, nlist,   faiss.METRIC_L2)

print(index.is_trained)   # False
index.train(np.ascontiguousarray(changes_feature_vectors))  # train on the database vectors
print(index.ntotal)   # 0
index.add(np.ascontiguousarray(changes_feature_vectors))   # add the vectors and update the index
print(index.is_trained)  # True
print(index.ntotal)   # 200


nprobe = 2  # find 2 most similar clusters
n_query = 1  
k = 17  # return 3 nearest neighbours
distances, indices = index.search(query_feature_vectors, k)

print(distances)
print(indices)

print("END.")