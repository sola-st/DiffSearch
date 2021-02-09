import json
import os
import re
from difflib import SequenceMatcher
import pygit2 as git
from pprint import pprint


datasetInput = "./sstubs5.json"

with open(datasetInput) as fh:
   dataset = json.load(fh)

for code_change in dataset:
    try:
        commit = code_change['fixCommitSHA1']
        parent_commit = code_change['fixCommitParentSHA1']
        projectName = code_change['projectName']
        command = "git --git-dir ../GitHub_Java/" + projectName + "/.git diff " + commit + " " + parent_commit + " >> ../java_patch/dataset.patch"
        os.system(command)
        print(command)
    except:
        print('[Error]')
        continue