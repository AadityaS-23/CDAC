#!/bin/bash
echo -e "Enter a number to calculate it's factorial: \c "
read f

fact=1

for ((i=f;i>1;i--))
do
fact=$(( fact * i ))
done
echo "Factorial of $f is $fact."
