git init
git push -u origin master
git add --all
git commit -m " "
git pull
git push  



git remote add upstream https://github.com/octocat/Spoon-Knife.git
git fetch upstream
git merge upstream/master
git push origin master