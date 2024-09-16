package missing;
public class MissingNumber{
    public static void main(String[] args) {
        int[] numbers = {1, 2, 4, 5, 6}; // Example array with missing number 3
        int n = numbers.length + 1; // N is the total number of elements from 1 to N
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        
        for (int num : numbers) {
            actualSum += num;
        }
        
        int missingNumber = expectedSum - actualSum;
        System.out.println("The missing number is: " + missingNumber);
    }
}

