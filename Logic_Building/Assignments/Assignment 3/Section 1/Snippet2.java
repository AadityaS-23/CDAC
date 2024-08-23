/*Snippet3:

public class DoWhileIncorrectCondition { 
    public static void main(String[] args) { 
        int num = 0; 
        do { 
            System.out.println(num); 
            num++; 
        } while (num > 0); 
 
 
    } 
} 
// Error to investigate: Why does the loop only execute once? What is wrong with the loop condition in the `do
while` loop?*/


 class DoWhileIncorrectCondition { 
    public static void main(String[] args) { 
        int num = 0; 
        do { 
            System.out.println(num); 
            num++; 
        } while (num>0); 
 
 
    } 
} 