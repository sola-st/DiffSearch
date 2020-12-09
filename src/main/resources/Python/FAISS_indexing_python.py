#! /usr/bin/python3
import logging

import dask.dataframe as dd
import faiss
import numpy as np
import sys

logging.basicConfig()
logger = logging.getLogger()
logger.setLevel(logging.DEBUG)
logger.info("Starting python")


def indexing(feature_in, index_out, dimension):
    # Reading csv feature vectors files
    logger.info("Reading " + str(feature_in))
    changes_feature_vectors = dd.read_csv('./src/main/resources/' + str(feature_in), header=None)
    changes_feature_vectors = changes_feature_vectors.iloc[:, :]
    # changes_feature_vectors = changes_feature_vectors.values[0:, :-1]
    changes_feature_vectors = changes_feature_vectors.astype('uint8')


    #######################################################################
    # FAISS Installation:
    # CPU version only
    # pip3 install faiss-cpu --no-cache

    # make faiss available
    # n = len(changes_feature_vectors)               # number of vectors
    logger.debug("Dimension: " + str(dimension))
    logger.info("Starting indexing")
    nlist = 8
    quantiser = faiss.IndexBinaryFlat(dimension)
    index = faiss.IndexBinaryIVF(quantiser, dimension, nlist)

    np_array = np.ascontiguousarray(changes_feature_vectors)
    # print(faiss.MatrixStats(np_array).comments)

# norm = np.linalg.norm(np_array)
    # if norm != 0:
    #     np_array = np_array / norm
    #     print(str(np_array))

    index.train(np_array)  # train on the database vectors
    logger.info("Training finished")
    index.add(np_array)  # add the vectors and update the index
    logger.info("Index added: " + str(index.ntotal) + " entries")

    faiss.write_index(index, "./src/main/resources/" + str(index_out))


# print(str(sys.argv[-3]), str(sys.argv[-2]), str(sys.argv[-1]))
indexing(sys.argv[-3], sys.argv[-2], int(sys.argv[-1]))
