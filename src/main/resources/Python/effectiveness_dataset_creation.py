import json
import os
import re
from difflib import SequenceMatcher
import pygit2 as git
from pprint import pprint


datasetInput = "./sstubs5.json"

with open(datasetInput) as fh:
   dataset = json.load(fh)

total = len(dataset)
counter = 0
for code_change in dataset:
    counter +=1
    print("Commits performed", counter, "/", total)
    try:
        commit = code_change['fixCommitSHA1']
        parent_commit = code_change['fixCommitParentSHA1']
        projectName = code_change['projectName']
        oldline = code_change['bugLineNum']
        newline = code_change['fixLineNum']
        myFile = open("../java_patch/dataset.patch", 'a')
        myFile.write("#@#@!$%#@#@!$%" + commit + "$$$$" + parent_commit  + "$$$$" + oldline  + "$$$$" + newline + "@@" + projectName + "\n")
        myFile.close()
        command = "git --git-dir ../GitHub_Java/" + projectName + "/.git diff " + parent_commit + " " + commit + " >> ../java_patch/dataset.patch"
        os.system(command)
        #print(command)
    except:
        print('[Error]')
        continue
