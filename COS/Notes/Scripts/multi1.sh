#!/bin/bash

# Print header row
echo "     1   2   3   4   5"
echo "   ---------------------"

# Outer loop for rows (numbers 1 to 5)
for i in {1..5}; do
  # Print row header
  echo -n "$i |"
  
  # Inner loop for columns (multiplication results)
  for j in {1..5}; do
    # Calculate the product
    product=$((i * j))
    
    # Print the product, padded to 3 spaces
    printf "%3d" $product
  done
  
           # Move to the next line after each row
   echo
done
