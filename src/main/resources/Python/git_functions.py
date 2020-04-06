import os
import re 
import json


#Compute the git diff


linkList = list()
nameList = list()
with open('./src/main/resources/GitHub/repository_links.txt', 'r') as content_file:
    for line in content_file:
        linkList.append(line.replace("\n", ""))

with open('./src/main/resources/GitHub/repository_list.txt', 'r') as content_file2:
    for line in content_file2:
        nameList.append(line.replace("\n", ""))

with open('./src/main/resources/GitHub/topGithubRepos.json') as fh:
    articles = json.load(fh)

article_urls = [article['clone_url'] for article in articles]

i = 0
for link in article_urls:
    ok = link.rsplit('/', 1)[-1].replace('.git', '')

    command = "git clone " + link + " ./src/main/resources/GitHub/" + link.rsplit('/', 1)[-1].replace('.git', '')
    os.system(command)

    command = "git --git-dir ./src/main/resources/GitHub/" + link.rsplit('/', 1)[-1].replace('.git', '') + "/.git log -p > ./src/main/resources/patch/" + link.rsplit('/', 1)[-1].replace('.git', '') + ".patch"
    os.system(command)
    i = i + 1