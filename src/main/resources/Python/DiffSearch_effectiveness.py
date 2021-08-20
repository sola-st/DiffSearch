import json

def compare_JSON():
    with open("../Features_Vectors/result_changes.json") as f1:
        diffSeach_changes = json.load(f1)

    print(len(diffSeach_changes))
    with open("./sstubs5.json") as f2:
        sstubs_changes = json.load(f2)

    intersection = 0

    for change_diffsearch in diffSeach_changes:  
        for change_sstubs in sstubs_changes:

            if change_diffsearch['c'] == change_sstubs['fixCommitSHA1']:
                if change_diffsearch['f'] == change_sstubs['bugFilePath']:
                    intersection += 1
                    print(change_diffsearch['o'])
                    print(change_sstubs['sourceBeforeFix'],"\n")
                    break
        
    print("intersection: ", intersection)
    print("End of the program.")

##################################
##### MAIN #######################
##################################
if __name__ == "__main__":
    compare_JSON()
