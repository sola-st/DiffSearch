from os import listdir
from os.path import isfile, join

mypath = "./"
final_path = "../dataset_userstudy.patch"
onlyfiles = [f for f in listdir(mypath) if isfile(join(mypath, f))]
final_file = []

def read_first_lines(filename, limit):
  result = []
  with open(filename, 'r') as input_file:
    try:
      # files are iterable, you can have a for-loop over a file.
      for line_number, line in enumerate(input_file):
        if line_number > limit:  # line_number starts at 0.
          break
        result.append(line)
    except:
      return result
  return result


for patch_file in onlyfiles:
    if 'extract_N_Lines.py' in patch_file:
        continue

    final_file += read_first_lines(patch_file, 7500)


#for items in final_file:
#    print(items)

textfile = open(final_path, "w")

for element in final_file:
    textfile.write(element)

textfile.close()
