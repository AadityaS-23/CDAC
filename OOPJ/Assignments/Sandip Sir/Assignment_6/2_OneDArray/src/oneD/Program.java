package oneD;
import java.util.Scanner;
public class Program {
   
     //accept values
	public static void acceptRecord(int[] arr) {
	   	 Scanner sc = new Scanner (System.in);
	   	 for(int i = 0; i<arr.length;i++) {
	   		 System.out.println("Enter the value for element " + (i + 1) + ":");
	   		 arr[i] = sc.nextInt();
	   		}
	   	sc.close();
	}

	// print values 
public static void printRecord(int[] arr) {
   System.out.println("Array elements are: "); 	
   for(int value : arr) {
	   System.out.print(value + "");
	 }
    System.out.println();
  }


public static void main(String[] args) {
	//to declare array
	int[] array = new int[5];

   //accept i/p to array
   acceptRecord(array);

  //print values of array
  printRecord(array); 
  
 
   }
 
}
