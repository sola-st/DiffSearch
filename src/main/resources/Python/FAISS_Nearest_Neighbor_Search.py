#! /home/luca/anaconda3/bin/python3.7
import csv
import numpy as np 
import pandas as pd
import time



#######################################################################
#FAISS Installation:
# CPU version only
#conda install faiss-cpu -c pytorch

# GPU version
#conda install faiss-gpu cudatoolkit=8.0 -c pytorch # For CUDA8
#conda install faiss-gpu cudatoolkit=9.0 -c pytorch # For CUDA9
#conda install faiss-gpu cudatoolkit=10.0 -c pytorch # For CUDA10

import faiss                                   # make faiss available
start = time.time()
index = faiss.read_index("./src/main/resources/Features_Vectors/faiss.index")
end = time.time()

print("Index read time: ")# + end - start)
#nprobe = 2  # find 2 most similar clusters
#n_query = 1
k = 2500 # return k-nearest neighbours

######server#####
import socket


serversocket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
host = "localhost"
port = 5002
print (host)
print (port)
serversocket.bind((host, port))

serversocket.listen(5)
print ('server started and listening')
while 1:
    print ('WAITING A NEW CONNECTION.. ')
    (clientsocket, address) = serversocket.accept()
    print ("CONNECTED WITH ", address)

    while 1:
        
        print ('WAITING A MESSAGE FROM ', address)
        data = clientsocket.recv(1024).decode().replace("\r\n", "")
        
        if not data: 
            print ('CONNECTION WITH ', address, ' CLOSED!')
            break

        print (data)
        
        if(data == "PYTHON"):
            print('searching started')
            start = time.time()
        
            #Reading csv feature vectors files
            query_feature_vectors = pd.read_csv('./src/main/resources/Features_Vectors/query_feature_vectors.csv', header=None).iloc[:, :].values[0:, :-1].astype('float32')

            with open('./src/main/resources/Features_Vectors/changes_strings.txt') as f:
                changes_strings = f.readlines()

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
                    f.write("%s" % changes_strings[item])


            clientsocket.send(bytes(str(time.time() - start) +"\r\n",'UTF-8'))

            clientsocket.send(bytes("JAVA"+"\r\n",'UTF-8'))
            print('Message sent.')