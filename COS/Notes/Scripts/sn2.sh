#!/bin/bash

# Function to calculate the sum of first n natural numbers

echo "enter no"
 read n
    sum=0
    for (( i=1; i<=n; i++ ))
    do
        sum=$((sum + i))
    done
    echo "The sum of the first $n natural numbers is: $sum"





