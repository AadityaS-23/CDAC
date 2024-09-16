package minMax;

public class Program{

    // Method to find the maximum value in the array
    public static int findMax(int[] arr) {
        int max = arr[0];  //  first element is the max
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];  // Update max if current element is greater
            }
        }
        return max;
    }

    // Method to find the minimum value in the array
    public static int findMin(int[] arr) {
        int min = arr[0];  // first element is the min
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];  // Update min if current element is smaller
            }
        }
        return min;
    }

    public static void main(String[] args) {

        int[] array = {10, 5, 20, 8, 3};

        
        int max = findMax(array); // Find and print the maximum value
        System.out.println("Maximum value: " + max);

        
        int min = findMin(array); // Find and print the minimum value
        System.out.println("Minimum value: " + min);
    }
}

