#! /usr/bin/python3
import faiss  # make faiss available
import logging
import numpy as np
import pandas as pd
import socket
import sys
import time

#######################################################################
# FAISS Installation:
# CPU version only
# pip3 install faiss-cpu --no-cache

logging.basicConfig()
logger = logging.getLogger()
logger.setLevel(logging.DEBUG)
logger.info("Starting python")


def searching(index_path,
              k,
              host,
              port,
              nprobe=1,
              range_search=False,
              k_max=100,
              tfidf=False,
              changes_string="",
              changes_string_prop=""):
    """
    Sets up a server for faiss nearest neighbour searches.

    :param index_path: path to the index file.
    :param k: number of (minimum) candidate changes.
    :param host: host name of the server
    :param port: port of the server
    :param nprobe: number of clusters to consider.
    :param range_search: if range search should be used (instead of finding the k nearest neighbours)
    :param k_max: number of additional features to consider for the range search
    :param tfidf: if vectors contain tfidf weights
    """
    index = faiss.read_index(index_path)

    logger.debug("Index read.")
    logger.debug(f"k = {k}")
    logger.debug(f"Range search={range_search}")

    # server #

    serversocket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    serversocket.setsockopt(socket.SOL_SOCKET, socket.SO_REUSEADDR, 1)
    logger.debug(f"running on {host}:{port}")
    serversocket.bind(('', int(port)))

    serversocket.listen(5)
    logger.info('Server started and listening')

    with open(str(changes_string)) as f:
        changes_strings = f.readlines()

    with open(str(changes_string_prop)) as f:
        changes_info = f.readlines()

    while 1:
        logger.debug('WAITING A NEW CONNECTION.. ')
        (clientsocket, address) = serversocket.accept()
        logger.debug("CONNECTED WITH " + str(address))

        while 1:

            logger.debug('WAITING A MESSAGE FROM ' + str(address))
            data = clientsocket.recv(1024).decode().replace("\r\n", "")

            if not data:
                logger.debug('CONNECTION WITH ' + str(address) + ' CLOSED!')
                break

            if data == "END":
                serversocket.shutdown(socket.SHUT_RDWR)
                serversocket.close()
                logger.debug('CONNECTION WITH ' + str(address) + ' ENDED!')
                exit()

            # logger.info(data)

            if data == "PYTHON":
                logger.info('Searching started')
                start = time.time()

                # Reading csv feature vectors files
                query_feature_vectors = pd.read_csv('./src/main/resources/Features_Vectors/query_feature_vectors.csv',
                                                    header=None).iloc[:, :].values.astype('float32')

                if tfidf:
                    faiss.normalize_L2(query_feature_vectors)
                # np_array = np.ascontiguousarray(query_feature_vectors)
                # norm = np.linalg.norm(np_array)
                # if norm != 0:
                #     np_array = np_array / norm
                #     # print(str(np_array))

                # if len(indices) < k:
                index.nprobe = nprobe
                logger.debug(f"nprobe = {index.nprobe}")
                if not range_search:
                    distances, indices = index.search(query_feature_vectors, k)
                    # if len(indices) > 10 * k:
                    #   distances = distances[:10 * k]
                    # indices = indices[:10 * k]
                else:

                with open(str(changes_string_prop)) as f:
                    changes_info = f.readlines()
                    candidate_change_limit = k_max

                    search_range: int = 0
                    for vector in query_feature_vectors:
                        for feature in vector:
                            search_range += (feature - 1) ** 2

                    # search_range *= 2

                    logger.debug(f"range={search_range}")
                    limits, distances, indices = index.range_search(query_feature_vectors, search_range)

                    if len(indices) < k:
                        distances, indices = index.search(query_feature_vectors, k)
                    if len(indices) > candidate_change_limit:
                        distances, indices = distances[:int(candidate_change_limit)], \
                                             indices[:int(candidate_change_limit)]

                logger.info('Searching finished')

                # why are we saving here?
                np.savetxt('./src/main/resources/Features_Vectors/vector.txt', indices)
                values = open('./src/main/resources/Features_Vectors/vector.txt').read().split()

                index_list = [round(int(float(x))) for x in values]
                with open('./src/main/resources/Features_Vectors/vector.txt', 'w') as f:
                    for item in index_list:
                        f.write("%s\n" % item)

                with open('./src/main/resources/Features_Vectors/candidate_changes.txt', 'w') as f:
                    for item in index_list:
                        f.write("%s" % changes_strings[item])

                with open('./src/main/resources/Features_Vectors/candidate_changes_info.txt', 'w') as f:
                    for item in index_list:
                        if len(changes_info) > item + 1:
                            f.write("%s" % changes_info[item+1])
                        else:
                            f.write("%s" % changes_info[item])

                logger.info(f"Searching done in {time.time() - start} seconds")

                clientsocket.send(bytes("JAVA" + "\r\n", 'UTF-8'))


searching(index_path=str(sys.argv[1]),
          k=int(sys.argv[2]),
          host=str(sys.argv[3]),
          port=str(sys.argv[4]),
          nprobe=int(sys.argv[5]),
          range_search=sys.argv[6] == "true",
          k_max=int(sys.argv[7]),
          tfidf=sys.argv[8] == "true",
          changes_string=str(sys.argv[-2]), changes_string_prop=str(sys.argv[-1]))
