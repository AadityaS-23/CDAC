class ReverseDigits {
    public static void main(String[] args) {
        int number = 1234;
        String reversed = "";

                                      // Convert number to string and reverse it
        while (number > 0) {
            reversed += number % 10; // It used to add the last digit to the reversed string
            number /= 10; // It is used to remove the last digit from the number
        }

        // Output the result
        System.out.println("Reversed number is: " + reversed);
    }
}


//Output:
//Multiples of 7 between 1 and 100:
7
14
21
28
35
42
49
56
63
70
77
84
91
98