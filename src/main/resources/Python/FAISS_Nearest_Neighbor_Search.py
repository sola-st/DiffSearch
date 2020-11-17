#! /usr/bin/python3
import csv
import numpy as np
import pandas as pd
import time

#######################################################################
# FAISS Installation:
# CPU version only
# pip3 install faiss-cpu --no-cache


import faiss  # make faiss available

from Python.FAISS_Nearest_Neighbor_Search_python import searching

searching("./src/main/resources/Features_Vectors/faiss_java.index")
