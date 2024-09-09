package ciClac;

import java.util.Scanner;

 class Calc1{
	 private double principal;
	 private double annualInterestRate;
	 private int numberOfCompounds;
	 private int years;
	 private double futureValue;
	 private double totalInterest;
 
 


public void acceptRecord() {
	Scanner sc = new Scanner(System.in); 
	
	System.out.print("Enter the inital investment amount (in Rupees):   ");
	principal = sc.nextDouble();
	
	System.out.print("Enter the annual interest rate (in %):   ");
    annualInterestRate = sc.nextDouble() / 100;
    
    System.out.print("Enter the number of times interest is compounded per year:  ");
    numberOfCompounds = sc.nextInt();
    
    System.out.print("Enter the investment duration (in years):  ");
    years = sc.nextInt();
    
    sc.close();
	
}


public void calculateFutureValue() {
	futureValue = principal * Math.pow((1 + annualInterestRate / numberOfCompounds), numberOfCompounds * years);
    totalInterest = futureValue - principal;
}

public void printRecord() {
	System.out.printf("Future Value :" , futureValue);
	System.out.printf( "Total Interest Earned:   "  ,totalInterest);
		
}



public static class Calc {
	public static void main(String args[]) {
		Calc1 calculator = new Calc1();       //Create an instance of Calc1
		calculator.acceptRecord();            // to take input from user
		calculator.calculateFutureValue();    // to compute future values
		calculator.printRecord();	          // to display the results
	 }

   }

}
 
 
 
 
 /* Step 1: Create main class
  * The main method is the entry point of any Java program.
  * When you run a Java program,the main method is the first methods that gets executed.
  * 
  * Step 2: Create compound interest calculator class
  *contains logic for computing future value and interest
  *
  *Step 3: Accept User Input
  *Scanner is used for this.
  *(public void AcceptRecord)- method that doesnt return anything(void) and is accessible from other classes(public)
  *
  *Step 4:Calculate future value  
  * math.pow(base,exponent):method from math class that raises a number (base) to the power of another number(expo)
  * 
  *Step 5: Print the  result
  * Sys.out.printf with %.2f(formats the floating point number to 2 decimal places)
  *
  *
  *
  */
