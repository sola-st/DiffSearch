import os
import re 


#Choose if you want to use a local repository or download one from GitHub
def git_setup():
    var = input("What do you want to do?:\n1) Clone a new Github Repository\n2) Use a local one\n")

    if(var == "1"):
        repository = git_clone()
    else:
        repository = input("Insert the name of the repository: ")  

    return repository

#Clone a repository from GitHub
def git_clone():
    repository = input("Insert your GitHub repository link: ")
    command = "git clone " + repository + " ./src/main/resources/GitHub/"
    os.system(command)

    return repository

#Compute the log hisotry of the repository
def git_log(repository):
    commit_log = []

    command = "git log > ./src/main/resources/GitHub/git_log.txt"
    os.system(command)
    filename ="./src/main/resources/GitHub/git_log.txt"

    with open(filename) as fp:
        for line in fp:
            line.strip().split('\n')
            if line.__contains__('commit') and (len(line) == 48):
                print(line)
                line = line.replace('commit ','')
                line = line.replace('\n','')
                commit_log.append(line)

    fp.close()
    
    return commit_log

#Compute the git diff
def git_diff(commit_log, repository):

    command = "echo '' > ./src/main/resources/GitHub/git_changes.txt"
    os.system(command)

    for i in commit_log:
        command = "git diff " + i + " HEAD >> ./src/main/resources/GitHub/git_changes.txt"
        os.system(command)


repository = git_clone()
commit_log = git_log(repository)
git_diff(commit_log, repository)