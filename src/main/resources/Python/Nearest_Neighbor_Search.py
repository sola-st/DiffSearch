import csv


#Reading csv feature vectors files
with open('./src/main/resources/Features_Vectors/changes_feature_vectors.csv','rt') as f:
  changes_feature_vectors = csv.reader(f)
#  for row in changes_feature_vectors:
#        print(row)

with open('./src/main/resources/Features_Vectors/query_feature_vectors.csv','rt') as f:
  query_feature_vectors = csv.reader(f)

import faiss                   # make faiss available
index = faiss.IndexFlatL2(len(changes_feature_vectors[0]))   # build the index
print(index.is_trained)
index.add(changes_feature_vectors)                  # add vectors to the index
print(index.ntotal)