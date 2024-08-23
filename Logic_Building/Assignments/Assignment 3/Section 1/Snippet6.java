/* Snippet 6:
public class MisplacedForLoopBody { 
    public static void main(String[] args) { 
        for (int i = 0; i < 5; i++) 
            System.out.println(i); 
            System.out.println("Done"); 
    } 
} 
// Error to investigate: 
Why does "Done" print only once,outside the loop? 
>>It happened because second SOP was not considered part 
of the loop,due to missing curly braces.
How should the loop body be enclosed to include all statements 
within the loop?
>>Enclose all loop statements with curly braces{}


Correct code:*/
  class MisplacedForLoopBody { 
    public static void main(String[] args) { 
        for (int i = 0; i < 5; i++) 
		{System.out.println(i); 
		System.out.println("Done");} 
    } 
} 