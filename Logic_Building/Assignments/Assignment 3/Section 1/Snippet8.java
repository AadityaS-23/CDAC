/*Snippet 8:
class OffByOneDoWhileLoop { 
    public static void main(String[] args) { 
        int num = 1; 
        do { 
            System.out.println(num); 
            num--; 
        } while (num > 0); 
    } 
} 
// Error to investigate: 
Why does this loop print unexpected numbers? 
>> 
What adjustments are needed to print the 
numbers from 1 to 5?
>>Update statment from num-- to num++ to increment and 
change the loop condition

Correct code:*/
class OffByOneDoWhileLoop { 
    public static void main(String[] args) { 
        int num = 1; 
        do { 
            System.out.println(num); 
            num++; 
        } while (num < 6); 
    } 
} 