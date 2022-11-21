@echo off
:: Script to install DiffSearch

:: Run the script:
:: ./installDiffSearch.bat

echo Setting up virtual environment
virtualenv diffsearch-env && (
	echo Finished setting up virtual environment
) || (
	(echo Y | rd /s diffsearch-env) > nul
	echo Failed to setup virtualenv..Aborting the setup 1>&2
	exit /b 1
)

echo Activating the virtual environment
call diffsearch-env\Scripts\activate.bat && (
	echo Virtual environment activated
) || (
	(echo Y | rd /s diffsearch-env) > nul
	echo Failed to activate virtualenv..Aborting the setup 1>&2
	exit /b 1
)

echo Installing faiss..
pip3 install faiss-cpu && (
	echo Installed faiss
) || (
	(echo Y | rd /s diffsearch-env) > nul
	echo Failed to install Faiss..Aborting the setup 1>&2
	exit /b 1
)

echo Installing numpy
pip3 install numpy && (
	echo Installed numpy
) || (
	(echo Y | rd /s diffsearch-env) > nul
	echo Failed to install numpy..Aborting the setup 1>&2
	exit /b 1
)

echo Installing pandas
pip3 install pandas && (
	echo Installed pandas
) || (
	(echo Y | rd /s diffsearch-env) > nul
	echo Failed to install pandas..Aborting the setup 1>&2
	exit /b 1
)

echo Installing dask
pip3 install dask[dataframe] && (
	echo Installed dask
) || (
	(echo Y | rd /s diffsearch-env) > nul
	echo Failed to install dask..Aborting the setup 1>&2
	exit /b 1
)

echo Creating and copying required folders and files
mkdir src\main\resources\Features_Vectors && (
	echo Created Features_Vectors folder in resources
) || (
	(echo Y | rd /s diffsearch-env) > nul
	echo Failed to create Features_Vectors folder in resources.. Aborting the setup 1>&2
	exit /b 1
)

(type nul > src\main\resources\Features_Vectors\server_log.log) && (
	echo Created server_log file
) || (
	echo Failed to create server_log file.. Aborting the setup
	(echo Y | rd /s diffsearch-env) > nul
	(echo Y | rd /s src\main\resources\Features_Vectors) > nul
	exit /b 1
)

:: To get the direct download link: https://bydik.com/onedrive-direct-link/
(powershell -Command "iwr -outf src\main\resources\Features_Vectors\index.zip -Uri 'https://onedrive.live.com/download?cid=C19790BB35A78C2C&resid=C19790BB35A78C2C%%2114267&authkey=AJp_CBLDdCH1X1A'") && (
	echo Downloaded the zip file
) || (
	echo Failed to download the required files.. Aborting the setup 1>&2
	(echo Y | rd /s diffsearch-env) > nul
	(echo Y | rd /s src\main\resources\Features_Vectors) > nul
	exit /b 1
)

powershell -Command "Expand-Archive -Force src\main\resources\Features_Vectors\index.zip -d src\main\resources\Features_Vectors" && (
	(echo Y | del src\main\resources\Features_Vectors\index.zip) > nul
	echo Extracted the files
) || (
	echo Extraction failed.. Aborting the setup
	(echo Y | rd /s diffsearch-env) > nul
	(echo Y | rd /s src\main\resources\Features_Vectors) > nul
	exit /b 1
)
echo Setup done... You can compile now.
