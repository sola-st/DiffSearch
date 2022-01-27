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


def indexing(feature_in, index_out, dimension, nlist, tfidf=False):
    # Reading csv feature vectors files
    feature_in = str(feature_in) + (".tfidf" if tfidf else "")
    logger.info("Reading " + str(feature_in))
    changes_feature_vectors = dd.read_csv(str(feature_in), header=None)
    changes_feature_vectors = changes_feature_vectors.iloc[:, :]
    # changes_feature_vectors = changes_feature_vectors.values[0:, :-1]
    changes_feature_vectors = changes_feature_vectors.astype('float32')
    logger.debug(f"nlist = {nlist}")

    #######################################################################
    # FAISS Installation:
    # CPU version only
    # pip3 install faiss-cpu --no-cache

    # make faiss available
    # n = len(changes_feature_vectors)               # number of vectors
    logger.debug("Dimension: " + str(dimension))
    logger.info("Starting indexing")
    quantiser = faiss.IndexFlatL2(dimension)
    metric = faiss.METRIC_L2

    if tfidf:
        qtead uantiser = faiss.IndexFlatIP(dimension)
        metric = faiss.METRIC_INNER_PRODUCT

    index = faiss.IndexIVFFlat(quantiser, dimension, nlist, metric)

    np_array = np.ascontiguousarray(changes_feature_vectors)

    if tfidf:
        faiss.normalize_L2(np_array)
    index.train(np_array)  # train on the database vectors
    logger.info("Training finished")
    index.add(np_array)  # add the vectors and update the index
    logger.info("Index added: " + str(index.ntotal) + " entries")

    faiss.write_index(index, str(index_out))


indexing(sys.argv[1], sys.argv[2], int(sys.argv[3]), int(sys.argv[4]), sys.argv[5] == 'true')
