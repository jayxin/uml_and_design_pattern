#!/usr/bin/env bash

num="28"

ls /mnt/hgfs/Desktop/"$num"_*.jpg
if [[ $? -eq 0 ]] ; then
  mv /mnt/hgfs/Desktop/"$num"_*.jpg ../figures/
fi

xelatex -interaction=batchmode -synctex=0 "$num".tex
if [[ $? -eq 0 ]] ; then
  printf '\033[;36m%s\033[0m' "Success!"
else
  printf '\033[;45m%s\033[0m' "Failed!"
fi
