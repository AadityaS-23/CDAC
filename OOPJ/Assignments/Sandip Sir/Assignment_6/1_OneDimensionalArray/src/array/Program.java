package array;
import java. util. Scanner;
public class Program {
public static void main(String[] args) {
int []arr = new int[5];

 System.out.println("Default values of the array:");  
 for(int i = 0 ; i < arr.length; i++) {
 System.out.println("Element " + (i+1) + ":" + arr[i]);
}

 Scanner sc = new Scanner(System.in);
 System.out.println("Enter  5 integers");
 for(int i = 0; i< arr.length;i++){
    System.out.println("Enter element " + (i+1)+ ":" );
     arr[i] = sc.nextInt();
 }
 
 System.out.println("Updated values of the array:");
 for(int i=0;i<arr.length;i++) {
	 System.out.println("Element " + (i+1)+ ":" + arr[i]);
    } 
 sc.close();
  }

}