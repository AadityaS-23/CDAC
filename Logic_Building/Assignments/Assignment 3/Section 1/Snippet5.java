/*Snippet5:
class WrongInitializationForLoop { 
    public static void main(String[] args) { 
        for (int i = 10; i >= 0; i++) { 
            System.out.println(i); 
        } 
    } 
} 
// Error to investigate: Why does this loop not print numbers 
in the expected order? 
>>The loop used increment,causing the loop to count up 
instead of down.

//What is the problem with the initialization and update 
statements in the `for` loop?
>>There is no problem with initialization,the update statement
had to be changed[i--]


Corrected code:*/
class WrongInitializationForLoop { 
    public static void main(String[] args) { 
        for (int i = 10; i>=0; i--) { 
            System.out.println(i); 
        } 
    } 
} 