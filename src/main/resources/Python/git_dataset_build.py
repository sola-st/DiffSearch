import os
import shutil
import io
import subprocess
from os import walk

def perform_commit(r, files, commit, commit_message):
    
    # parent commit
    subprocess.run(f"git checkout {commit[:-1]}^".split(" "), cwd=r)

    for file in files:
        with open(r + file) as f:
            lines = f.read()

        temp = file.split("/")
        with open('/home/luca/Downloads/datset/java_top100_dataset/dataset/Activiti-Activiti/' + temp[-1], "w") as myfile:
            myfile.write(lines)
        
    subprocess.run(f"git add .".split(" "), cwd='/home/luca/Downloads/datset/java_top100_dataset')
    subprocess.run(f"git~commit~-m~'ARTIFICIAL COMMIT FOR NEW FILES'".split("~"), cwd='/home/luca/Downloads/datset/java_top100_dataset')
    subprocess.run(f"git push".split(" "), cwd='/home/luca/Downloads/datset/java_top100_dataset')

    # commit
    subprocess.run(f"git checkout {commit[:-1]}".split(" "), cwd=r)

    for file in files:
        with open(r + file) as f:
            lines = f.read()

        temp = file.split("/")
        with open('/home/luca/Downloads/datset/java_top100_dataset/dataset/Activiti-Activiti/' + temp[-1], "w") as myfile:
            myfile.write(lines)
        
    subprocess.run(f"git add .".split(" "), cwd='/home/luca/Downloads/datset/java_top100_dataset')
    subprocess.run(f"git~commit~-m~{commit_message}".split("~"), cwd='/home/luca/Downloads/datset/java_top100_dataset')
    subprocess.run(f"git push".split(" "), cwd='/home/luca/Downloads/datset/java_top100_dataset')

filenames = next(walk('./java_patch/'), (None, None, []))[2]  # [] if no file

for filename in filenames:

    file1 = open('./java_patch/' + filename, 'r')
    Lines = file1.readlines()

    count = 0
    repo = './GitHub_Java/' + filename.replace('.patch', '')
    d = {}
    files = []
    commit = ''
    commit_message = ''
    flag = False
    flag_merge = False

    for line in Lines:
        if 'Merge:' in line[:6]:
            flag_merge = True
        
        if flag_merge == True and 'commit' not in line[:6]:  
            continue
        else:
            if flag_merge == True:
                commit = ''
                if count > 0 and count % 2 != 0:
                    count -= 1 
                flag_merge = False
        
        if 'commit' in line[:6]:

            count += 1
            if count % 2 == 0 and 'Merge' not in line:
                if count > 1 and commit != '':
                    perform_commit(repo, files, commit, commit_message)

                commit = line.replace('commit ', '')
                files = []
                commit_message = ''
                flag = False
            continue
        
        if 'Date:' in line[:5] and flag_merge == False:
            flag = True
            continue

        if 'diff --git' in line:
            flag = False
            temp = line.split(' ')
            
            if '.java' in temp[2][-7:]:
                files.append(temp[2][1:])
            continue

        if flag:
            commit_message += line

    perform_commit(repo, files, commit, commit_message)
    print(repo, "COMPLETED\n")

print("ALL REPO COMPLETED\n")