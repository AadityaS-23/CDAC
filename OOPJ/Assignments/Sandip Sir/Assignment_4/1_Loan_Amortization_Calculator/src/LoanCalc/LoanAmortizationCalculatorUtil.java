package LoanCalc;

import java.util.Scanner;

public class LoanAmortizationCalculatorUtil {
	
		  
		  private LoanAmortizationCalculatorUtil LoanAmortizationCalculatorUtil;
		private Object loanCalculator;

		//method to accept records(user i/p)
		  
		  public LoanAmortizationCalculatorUtil(double principal, double annualInterestRate, int loanTerm) {
			// TODO Auto-generated constructor stub
		}

		public void acceptRecord() {
			  Scanner sc = new Scanner(System.in);
			  
			  
			  System.out.println("Enter Principal Amount (INR) :  ");
			  double principal = sc.nextDouble();
			  
			  System.out.println("Enter Annual Interest Rate(%) : ");
			  double annualInterestRate = sc.nextDouble();
			  
			  System.out.println("Enter the loan term (years):  ");
			  int loanTerm = sc.nextInt();
			  
			  LoanAmortizationCalculatorUtil = new LoanAmortizationCalculatorUtil (principal, annualInterestRate, loanTerm);
		
		  }
	 
	  //Method to print the record (o/p details)
	   public void printRecord() {
		   if (loanCalculator != null) {
			   System.out.println(loanCalculator);
		   }else{
			   System.out.println("No record found. Enter the loan details first");
		   }
	   }
		  
		// Method to display the menu
	   public void menuList() {
		   Scanner sc = new Scanner(System.in);
		   int choice;

	   do {
		   System.out.println("\nLoan Amortization Calculator Menu : ");
		   System.out.println("1. Enter Loan Details ");
		   System.out.println("2. Display Loan Details");
		   System.out.println("0. Exit");
		   choice = sc.nextInt();
		   
		   switch(choice) {
		     case 1 : 
		    	 acceptRecord();
		         break;
		   
		     case 2 :
		    	 printRecord();
		    	 break;
		     case 0 :
		    	 System.out.println("Exiting the application.");
		    	 break;
		     default :
		    	 System.out.println("Invalid choice. Try again");
		           }
	            } while (choice != 0);
	   }
}
		 
	 
