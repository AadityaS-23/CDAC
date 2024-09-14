package ciCalculator;

import java.util.Scanner;
public class CompoundInterestCalculatorUtil {
    private CompoundInterestCalculator calculator;
    
    
    //Method for user ip
    
  public void acceptRecord() {
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Enter the principal amount (INR): ");
	  double principal = sc.nextDouble();
	  
	  
	  System.out.println("Enter the annual interest rate(%): ");
	  double annualInterestRate = sc.nextDouble();
	  
	  
	  System.out.println("Enter number of  times interest is compounded per year: ");
       int numberOfCompounds = sc.nextInt();
       
       System.out.println("Enter the investment duration(years): ");
       int years = sc.nextInt();
       
       calculator = new CompoundInterestCalculator(principal, annualInterestRate, numberOfCompounds, years );
     }

   // method for displaying records
  public void printRecord() {
	  if(calculator != null) {
		  System.out.println(calculator);
	  }else {
		  System.out.println("No record found.");
	  }
   }

// Method for displaying the menu
  public void menuList() {
	  Scanner sc = new Scanner (System.in);
	  int choice;
	  
	  do {
		  System.out.println("\nCompound Interest Calculator Menu :  ");
		  System.out.println("1. Enter Investment Details. ");
		  System.out.println("2. Display Investment Details. ");
		  System.out.println("0. Exit ");
		  choice = sc.nextInt();
		  
		  switch(choice) {
		  case 1: 
			  acceptRecord();
		      break;
		  case 2:
			  printRecord();
			  break;
		  case 0:
			  System.out.println("Exiting the application.");
			  break;
		  default:
			  System.out.println("Invalid choice.");
			}
	  }while (choice !=0);
  
     sc.close();
  }

}
