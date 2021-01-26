sudo fallocate -l 78G /swapfile
sudo chmod 600 /swapfile
sudo swapon /swapfile
sudo swapon --show