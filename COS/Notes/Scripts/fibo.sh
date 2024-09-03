#fibonacci
#!/bin/bash
echo "Enter the number of terms:"
read n

a=0
b=1

echo "The Fibonacci series up to $n terms is: "

for ((i=0; i<n; i++))
do
   echo  "$a" 
   next=$((a+b))
   a=$b
   b=$next
done

echo
