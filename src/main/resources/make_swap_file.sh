sudo fallocate -l 38G /swapfile
sudo chmod 600 /swapfile
sudo swapon /swapfile
sudo swapon --show