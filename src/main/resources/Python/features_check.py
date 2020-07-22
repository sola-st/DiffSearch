
import csv
import numpy as np

with open('/home/luca/IdeaProjects/DiffSearch/src/main/resources/Features_Vectors/query_feature_vectors.csv', newline='') as csvfile:
    data_query = list(csv.reader(csvfile))


with open('/home/luca/IdeaProjects/DiffSearch/src/main/resources/Features_Vectors/changes_feature_vectors_candidates.csv', newline='') as f:
    reader = csv.reader(f)
    data_changes = list(reader)

i = 0
j = 0
similarity_important_feature = np.zeros(2048)

for bit in np.array(data_query[0]):
    if bit == '1':
        for code_change in np.array(data_changes):
            x = code_change[i]
            if code_change[i] == '1':
                x = 5
                similarity_important_feature[i] += 1
            j += 1
        if similarity_important_feature[i]:
            
    i += 1

for x in similarity_important_feature:
    if x > 0:
        print(x/10, '%')

print('Hello')

