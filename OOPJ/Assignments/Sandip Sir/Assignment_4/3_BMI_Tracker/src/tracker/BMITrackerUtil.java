package tracker;
import java.util.Scanner;


public class BMITrackerUtil {
   private Scanner sc = new Scanner(System.in);
   
 public BMITracker acceptRecord() {
	 System.out.println("Enter the weight(Kg):  ");
	 double weight = sc.nextDouble();
	 System.out.println("Enter the height(m):    ");
	 double height = sc.nextDouble();
	 return new BMITracker(weight,height);
 }
 
 public void printRecord(BMITracker tracker) {
	 System.out.println(tracker);
 }
//Method to display menu
 
 public void menuList() {
	 System.out.println("1.Calculate BMI");
	 System.out.println("2.Display Last BMI Record.");
     System.out.println("3.Exit");
 }
 
}