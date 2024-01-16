#!/usr/bin/env bash

num="30"

ls /mnt/hgfs/Desktop/"$num"_*.jpg
if [[ $? -eq 0 ]] ; then
  mv /mnt/hgfs/Desktop/"$num"_*.jpg ../figures/
fi

xelatex -interaction=batchmode "$num".tex
if [[ $? -eq 0 ]] ; then
  printf '\033[;36m%s\033[0m' "Success!"
else
  printf '\033[;45m%s\033[0m' "Failed!"
fi
