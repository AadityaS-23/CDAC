//array and scanner

import java.util.scanner;

class ArrayD{
public static void main(String args[]){

   Scanner sc = new Scanner(System.in);
   /*methods>>
   sc.nextInt(); >>integer ip
   sc.nextFloat(); >> float ip
   sc.next(); >> single word ip   
   sc.nextLine(); >>whole line ip
   sc.nextLong(); >> ex ==9579883194
   sc.next().charAt(0);
   
   
   
   */
   
   int arr[] = new int [5];
   
    // for input
   for(int i=0;i<5;i++){
       System.out.println("Pls enter"+ (i) +"st value");
	   arr[i]=sc.nextInt();
	   
    }

// for output
for(int i=0;i<5;i++){
	System.out.println(arr[i]);
                 }


}


}