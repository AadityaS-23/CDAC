package DiscountCalc;
import java.util.Scanner;

public class DiscountCalculatorUtil {
    private static DiscountCalculator lastRecord;
    
    public static void acceptRecord(Scanner sc) {
    System.out.println("Enter the original price (INR):  ");
    double originalPrice = sc.nextDouble();
    System.out.println("Enter the percentage discount(%):  ");
    double discountRate = sc.nextDouble();
    
    lastRecord = new DiscountCalculator(originalPrice,discountRate); // Create a new record
    
    System.out.println("Discount Calculation Completed!");
    }
    
 public static void printRecord() {
	System.out.println(lastRecord); // Use toString() of DiscountCalculator
}
    
//Method to display menu options
 public static void menuList() {
	 System.out.println("Menu: ");
	 System.out.println("1.Calculate Discount");
	 System.out.println("2.Display Last Discount");
     System.out.println("3.Exit");
 
      }
 
 }

