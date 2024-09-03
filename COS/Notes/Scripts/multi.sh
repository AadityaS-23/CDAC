echo "Multiplication table"
for i in {1..5}; do
        for j in {1..5}; do
                printf "%d\t" $((i*j))
        done
        echo
done
