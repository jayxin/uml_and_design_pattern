#!/usr/bin/env bash

xelatex -interaction=batchmode main.tex
if [[ $? -eq 0 ]] ; then
  printf '\033[;36m%s\033[0m' "Success!"
else
  printf '\033[;45m%s\033[0m' "Failed!"
fi
