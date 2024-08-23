/*Snippet 1:  
public class InfiniteForLoop { 
    public static void main(String[] args) { 
        for (int i = 0; i < 10; i--) { 
            System.out.println(i); 
        } 
    } 
} 
// Error to investigate: Why does this loop run infinitely?
 >>Loop runs infinitely because in 'for' loop after the initialization and satisfying 
 the given condition the loop will continue to execute as long as the condition is true.
 After satisying the condition,statement is updated.In this case i decreases each time loop iterates.
 Since after decrement the values obtained would be in negative and the condition will be satisfied the code will run in a loop.
 // How should the loop control variable be adjusted? 
  >>It can controlled by updating the statement[i-- to i++]*/
  
  //Correct Code
    class FiniteForLoop { 
    public static void main(String[] args) { 
        for (int i = 0; i < 10; i++) {  // Increment to avoid infinite loop
            System.out.println(i); 
        } 
    } 
}
