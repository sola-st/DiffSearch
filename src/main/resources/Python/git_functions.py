import os
import re 
import json


#Compute the git diff

"""
linkList = list()
nameList = list()
with open('./src/main/resources/GitHub/repository_links.txt', 'r') as content_file:
    for line in content_file:
        linkList.append(line.replace("\n", ""))

with open('./src/main/resources/GitHub/repository_list.txt', 'r') as content_file2:
    for line in content_file2:
        nameList.append(line.replace("\n", ""))

with open('./src/main/resources/GitHub/python.json') as fh:
    articles = json.load(fh)

article_urls = [article['html_url'] for article in articles]
"""

dirlist = [item for item in os.listdir("./src/main/resources/GitHub_Python/") if
                 os.path.isdir(os.path.join("./src/main/resources/GitHub_Python/", item))]

i = 0
for link in dirlist:
    print(i, link)

    command = "git --git-dir ./src/main/resources/GitHub_Python/" + link + "/.git log -p > ./src/main/resources/python_patch/" + link + ".patch"
    os.system(command)
    i = i + 1
