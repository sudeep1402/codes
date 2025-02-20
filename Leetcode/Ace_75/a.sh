#!/bin/bash

# Prompt for a commit message
echo "Enter your commit message:"
read commit_message

# Git add, commit, and push
git add .
git commit -m "$commit_message"
git push

echo "Git operations completed successfully!"
