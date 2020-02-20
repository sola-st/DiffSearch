#! /home/luca/anaconda3/bin/python3.7
import csv
import numpy as np 
import pandas as pd
import time



#Reading csv feature vectors files
query_feature_vectors = pd.read_csv('./src/main/resources/Features_Vectors/query_feature_vectors.csv', header=None).iloc[:, :].values[0:, :-1].astype('float32')
#print(query_feature_vectors)
with open('./src/main/resources/Features_Vectors/changes_strings.txt') as f:
    changes_strings = f.readlines()
#print(changes_strings)


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
index2 = faiss.read_index("./src/main/resources/Features_Vectors/faiss.index")
end = time.time()

print(end - start)
#nprobe = 2  # find 2 most similar clusters
#n_query = 1
k = 500  # return k-nearest neighbours


distances, indices = index2.search(query_feature_vectors, k)




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

#print("END.")