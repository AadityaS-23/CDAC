package tracker;
import java.util.Scanner;
public class Program {
   
	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	   
	   BMITrackerUtil util = new BMITrackerUtil();
	   BMITracker tracker = null;
	   
	   int choice;
		   
		   do {
		  	 util.menuList();
		  	 System.out.println("Enter your choice :  ");
		       choice = sc.nextInt();
		       
		       switch(choice) {
		       case 1: 
		      	 tracker= util.acceptRecord();  //Accept new record
		      	 util.printRecord(tracker);    // Display the calc BMI
		       break;
		       
		       case 2: 
		      	 util.printRecord(tracker); // Display the last BMI record
		       break;
		       
		       case 3:
		      	 System.out.println("Exiting....");
		       }
		     }while (choice != 3);
		      sc.close();
		   }
}

