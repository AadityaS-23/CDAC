/*Snippet9:
class InfiniteForLoopUpdate { 
fdf    public static void main(String[] args) { 
        for (int i = 0; i < 5; i += 2) { 
            System.out.println(i); 
        } 
    } 
} 
// Error to investigate: 
Why does the loop print unexpected results or run infinitely? 
>>It does not run infinitely.
How should the loop update expression be corrected?
>>There is nothing to be corrected.

Corrected Code;*/
class InfiniteForLoopUpdate { 
    public static void main(String[] args) { 
        for (int i = 0; i < 5; i += 2) { 
            System.out.println(i); 
        } 
    } 
} 
