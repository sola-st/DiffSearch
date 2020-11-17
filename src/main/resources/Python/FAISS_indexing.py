#! /usr/bin/python3
import csv
import numpy as np
import pandas as pd
import faiss
import sys


def indexing(nchange):
    # Reading csv feature vectors files
    changes_feature_vectors = pd.read_csv('./src/main/resources/Features_Vectors/changes_feature_vectors.csv',
                                          header=None, nrows=int(nchange)).iloc[:, :].values[0:, :-1].astype('float32')

    #######################################################################
    # FAISS Installation:
    # CPU version only
    # pip3 install faiss-cpu --no-cache

    # make faiss available
    dimension = len(changes_feature_vectors[0])  # dimensions of each vector
    # n = len(changes_feature_vectors)               # number of vectors

    nlist = 3
    quantiser = faiss.IndexFlatL2(dimension)
    index = faiss.IndexIVFFlat(quantiser, dimension, nlist, faiss.METRIC_L2)

    print(index.is_trained)  # False
    index.train(np.ascontiguousarray(changes_feature_vectors))  # train on the database vectors
    print(index.ntotal)  # 0
    index.add(np.ascontiguousarray(changes_feature_vectors))  # add the vectors and update the index
    print(index.is_trained)  # True
    print(index.ntotal)  # 200

    faiss.write_index(index, "./src/main/resources/Features_Vectors/faiss_java.index")


# print(str(sys.argv[-1]))
indexing(sys.argv[-1])
