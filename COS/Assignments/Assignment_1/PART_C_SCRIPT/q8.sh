

#!/bin/bash
filename="/home/cdac/text.txt"
if [ -f "$filename" ]; then
         echo "File exists."
else
         echo "File does not exist."
fi
