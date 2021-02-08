#! /usr/bin/python3
import logging
import socket

import faiss  # make faiss available
import numpy as np
import pandas as pd
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


def searching(index_path, k, host, port, nprobe=1, range_search=False):
    index = faiss.read_index(index_path)

    logger.debug("Index read.")
    logger.debug(f"k = {k}")

    # server #

    serversocket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    serversocket.setsockopt(socket.SOL_SOCKET, socket.SO_REUSEADDR, 1)
    logger.debug(f"running on {host}:{port}")
    serversocket.bind(('', int(port)))

    serversocket.listen(5)
    logger.info('Server started and listening')

    with open('./src/main/resources/Features_Vectors/changes_strings_java.txt') as f:
        changes_strings = f.readlines()

    with open('./src/main/resources/Features_Vectors/changes_strings_prop_java.txt') as f:
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
                # np_array = np.ascontiguousarray(query_feature_vectors)
                # norm = np.linalg.norm(np_array)
                # if norm != 0:
                #     np_array = np_array / norm
                #     # print(str(np_array))

                # limits, distances, indices = index.range_search(query_feature_vectors, 5)

                # if len(indices) < k:
                index.nprobe = nprobe
                logger.debug(f"nprobe = {index.nprobe}")
                if not range_search:
                    distances, indices = index.search(query_feature_vectors, k)
                    # if len(indices) > 10 * k:
                    #   distances = distances[:10 * k]
                    # indices = indices[:10 * k]
                else:
                    search_range: int = 0
                    for vector in query_feature_vectors:
                        for feature in vector:
                            search_range += (feature - 1) ** 2

                    # search_range *= 2

                    logger.debug(f"range={search_range}")
                    limits, distances, indices = index.range_search(query_feature_vectors, search_range)

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
                        f.write("%s" % changes_info[item])

                logger.info(f"Searching done in {time.time() - start} seconds")

                clientsocket.send(bytes("JAVA" + "\r\n", 'UTF-8'))


searching(str(sys.argv[-4]), int(sys.argv[-3]), str(sys.argv[-2]), str(sys.argv[-1]))
