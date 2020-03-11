import os
import re 


#Compute the git diff


linkList = list()
nameList = list()
with open('./src/main/resources/GitHub/repository_links.txt', 'r') as content_file:
    for line in content_file:
        linkList.append(line.replace("\n", ""))

with open('./src/main/resources/GitHub/repository_list.txt', 'r') as content_file2:
    for line in content_file2:
        nameList.append(line.replace("\n", ""))

i = 0
for link in linkList:
    command = "git clone " + link + " ./src/main/resources/GitHub/" + nameList[i]
    os.system(command)

    command = "git --git-dir ./src/main/resources/GitHub/" + nameList[i] + "/.git log -p > ./src/main/resources/GitHub/" + nameList[i] + ".patch"
    os.system(command)
    i = i + 1