#! /home/luca/anaconda3/bin/python3.7
import csv
import numpy as np 
import pandas as pd
import faiss
import sys

def indexing(nchange):
    #Reading csv feature vectors files
    changes_feature_vectors = pd.read_csv('./src/main/resources/Features_Vectors/changes_feature_vectors.csv', header=None, nrows=int(nchange)).iloc[:, :].values[0:, :-1].astype('float32')


    #######################################################################
    #FAISS Installation:
    # CPU version only
    #conda install faiss-cpu -c pytorch

    # GPU version
    #conda install faiss-gpu cudatoolkit=8.0 -c pytorch # For CUDA8
    #conda install faiss-gpu cudatoolkit=9.0 -c pytorch # For CUDA9
    #conda install faiss-gpu cudatoolkit=10.0 -c pytorch # For CUDA10

                                       # make faiss available
    dimension = len(changes_feature_vectors[0])    # dimensions of each vector                         
    #n = len(changes_feature_vectors)               # number of vectors 

    nlist = 100
    quantiser = faiss.IndexFlatL2(dimension)
    index = faiss.IndexIVFFlat(quantiser, dimension, nlist,   faiss.METRIC_L2)

    print(index.is_trained)   # False
    index.train(np.ascontiguousarray(changes_feature_vectors))  # train on the database vectors
    print(index.ntotal)   # 0
    index.add(np.ascontiguousarray(changes_feature_vectors))   # add the vectors and update the index
    print(index.is_trained)  # True
    print(index.ntotal)   # 200

    faiss.write_index(index, "./src/main/resources/Features_Vectors/faiss.index")


#print(str(sys.argv[-1]))
indexing(sys.argv[-1])