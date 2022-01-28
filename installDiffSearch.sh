#!/bin/bash -e
# Script to install DiffSearch

# Run the script:
#chmod 754 installDiffSearch.sh
#./installDiffSearch.sh

echo Cloning repository..
if git clone https://github.com/luca-digrazia/DiffSearch.git; then
  echo Finished cloning repository
else
  rm -rf DiffSearch
  echo Cloning failed..Aborting the setup 1>&2
  exit 1
fi
echo Setting up virtual environment
if virtualenv -p /usr/bin/python3 diffsearch-env; then
  echo Finished setting up virtual environment
else
  rm -rf DiffSearch
  rm -rf diffsearch-env
  echo Failed to setup virtualenv..Aborting the setup 1>&2
  exit 1
fi
echo Activating the virtual environment
if source diffsearch-env/bin/activate; then
  echo Virtual environment activated
else
  rm -rf DiffSearch
  rm -rf diffsearch-env
  echo Failed to activate virtualenv..Aborting the setup 1>&2
  exit 1
fi
echo Installing faiss..
if pip3 install faiss-cpu; then
  echo Installed faiss
else
  rm -rf DiffSearch
  rm -rf diffsearch-env
  echo Failed to install Faiss..Aborting the setup 1>&2
  exit 1
fi
echo Installing numpy
if pip3 install numpy; then
  echo Installed numpy
else
  rm -rf DiffSearch
  rm -rf diffsearch-env
  echo Failed to install numpy..Aborting the setup 1>&2
  exit 1
fi
echo Installing pandas
if pip3 install pandas; then
  echo Installed pandas
else
  rm -rf DiffSearch
  rm -rf diffsearch-env
  echo Failed to install pandas..Aborting the setup 1>&2
  exit 1
fi
echo Installing dask
if pip3 install dask[dataframe]; then
  echo Installed dask
else
  rm -rf DiffSearch
  rm -rf diffsearch-env
  echo Failed to install dask..Aborting the setup 1>&2
  exit 1
fi
echo Creating and copying required folders and files
if mkdir DiffSearch/src/main/resources/Features_Vectors; then
  echo Created Features_Vectors folder in resources
else
  echo Failed to create Features_Vectors folder in resources.. Aborting the setup
  rm -rf DiffSearch
  rm -rf diffsearch-env 1>&2
  exit 1
fi
if touch DiffSearch/src/main/resources/Features_Vectors/server_log.log; then
  echo Created server_log file
else
  echo Failed to create server_log file.. Aborting the setup
  rm -rf DiffSearch
  rm -rf diffsearch-env 1>&2
  exit 1
fi
# To get the direct download link: https://bydik.com/onedrive-direct-link/
if wget -O DiffSearch/src/main/resources/Features_Vectors/index.zip 'https://onedrive.live.com/download?cid=C19790BB35A78C2C&resid=C19790BB35A78C2C%2114267&authkey=AJp_CBLDdCH1X1A'; then
  echo Downloaded the zip file
else
  echo Failed to download the required files.. Aborting the setup
  rm -rf DiffSearch
  rm -rf diffsearch-env 1>&2
  exit 1
fi
if unzip DiffSearch/src/main/resources/Features_Vectors/index.zip -d DiffSearch/src/main/resources/Features_Vectors/; then
  rm -rf DiffSearch/src/main/resources/Features_Vectors/index.zip
  echo Extracted the files
else
  echo Extraction failed.. Aborting the setup
  rm -rf DiffSearch
  rm -rf diffsearch-env 1>&2
  exit 1
fi
echo Setup done... You can compile now.
