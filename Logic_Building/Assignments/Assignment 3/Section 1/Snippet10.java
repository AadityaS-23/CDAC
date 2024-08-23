/*Snippet 11:

public class IncorrectLoopUpdate { 
 public static void main(String[] args) { 
 int i = 0; 
 while (i < 5) { 
 System.out.println(i); 
 i += 2; // Error: This may cause unexpected results in output 
 } 
 } 
} 
// Error to investigate: 
What will be the output of this loop? 
>>0 2 4
How should the loop variable be updated to achieve the 
desired result?
>>If the desired result is 0 1 2 3 4
   then instead of incrementing by 2 change it 1[i+=1]  





Correct Code:*/
 class IncorrectLoopUpdate { 
 public static void main(String[] args) { 
 int i = 0; 
 while (i < 5) { 
 System.out.println(i); 
 i += 1; // Error: This may cause unexpected results in output 
 } 
 } 
} 