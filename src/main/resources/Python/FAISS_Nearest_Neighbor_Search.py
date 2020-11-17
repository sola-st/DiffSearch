#! /usr/bin/python3
import csv
import numpy as np
import pandas as pd
import time

#######################################################################
# FAISS Installation:
# CPU version only
# pip3 install faiss-cpu --no-cache


import faiss  # make faiss available

start = time.time()
index = faiss.read_index("./src/main/resources/Features_Vectors/faiss_java.index")
end = time.time()

print("Index read.")
k = 1000  # return k-nearest neighbours

######server#####
import socket

serversocket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
serversocket.setsockopt(socket.SOL_SOCKET, socket.SO_REUSEADDR, 1)
host = "localhost"
port = 5002
print(host)
print(port)
serversocket.bind(('', port))

serversocket.listen(5)
print('server started and listening')
while 1:
    print('WAITING A NEW CONNECTION.. ')
    (clientsocket, address) = serversocket.accept()
    print("CONNECTED WITH ", address)

    while 1:

        print('WAITING A MESSAGE FROM ', address)
        data = clientsocket.recv(1024).decode().replace("\r\n", "")

        if not data:
            print('CONNECTION WITH ', address, ' CLOSED!')
            break

        if data == "END":
            serversocket.shutdown(socket.SHUT_RDWR)
            serversocket.close()
            print('CONNECTION WITH ', address, ' ENDED!')
            exit()

        print(data)

        if data == "PYTHON":
            print('searching started')
            start = time.time()

            # Reading csv feature vectors files
            query_feature_vectors = pd.read_csv('./src/main/resources/Features_Vectors/query_feature_vectors.csv',
                                                header=None).iloc[:, :].values[0:, :-1].astype('float32')

            with open('./src/main/resources/Features_Vectors/changes_strings_java.txt') as f:
                changes_strings = f.readlines()

            with open('./src/main/resources/Features_Vectors/changes_strings_prop_java.txt') as f:
                changes_info = f.readlines()

            distances, indices = index.search(query_feature_vectors, k)

            print('searching finished')

            np.savetxt('./src/main/resources/Features_Vectors/vector.txt', indices)
            values = open('./src/main/resources/Features_Vectors/vector.txt').read().split()

            index_list = [round(int(float(x))) for x in values]
            with open('./src/main/resources/Features_Vectors/vector.txt', 'w') as f:
                for item in index_list:
                    f.write("%s\n" % item)

            with open('./src/main/resources/Features_Vectors/candidate_changes.txt', 'w') as f:
                for item in index_list:
                    if len(changes_strings[item]) < 300:
                        f.write("%s" % changes_strings[item])

            with open('./src/main/resources/Features_Vectors/candidate_changes_info.txt', 'w') as f:
                for item in index_list:
                    f.write("%s" % changes_info[item])

            clientsocket.send(bytes(str(time.time() - start) + "\r\n", 'UTF-8'))

            clientsocket.send(bytes("JAVA" + "\r\n", 'UTF-8'))
            print('Message sent.')
