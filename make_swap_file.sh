sudo fallocate -l 48G /swapfile
sudo chmod 600 /swapfile
sudo swapon /swapfile
sudo swapon --show