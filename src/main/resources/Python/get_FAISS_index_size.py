#! /usr/bin/python3
import logging
import faiss  # make faiss available
import sys

logging.basicConfig()
logger = logging.getLogger()
logger.setLevel(logging.DEBUG)

def get_size(index_path, size_file_name):
    index = faiss.read_index(index_path)
    logger.debug("FAISS index size: " + str(index.ntotal))
    # write the index size to file
    with open(size_file_name, 'w') as f:
        f.write("%s" % str(index.ntotal))
        
get_size(index_path=str(sys.argv[1]),
         size_file_name=str(sys.argv[2]));
