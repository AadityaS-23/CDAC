package A1;
import java.util.Scanner;
import java.util.InputMismatchException;

class LoanCalculator{
	double principal;
	double annualInterestRate;
	int loanTerm;
	
	
	void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		 
		System.out.println("Enter the loan amount(Principal): ₹ " );
		principal = sc.nextDouble();
		
		System.out.println("Enter the annual interest rate (in %) :  ");
		annualInterestRate = sc.nextDouble();
		
		System.out.println("Enter the loan term(in years):  ");
		loanTerm = sc.nextInt();
		
		sc.close();
	}		
		
		
 double calculateMonthlyPayment() {
	 double monthlyInterestRate = annualInterestRate / 12 / 100 ;
	 int numberOfMonths = loanTerm * 12;
	 return  (principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfMonths))/(Math.pow(1 + monthlyInterestRate, numberOfMonths) - 1));

	 
    }

 void printRecord() {
	 
	 double monthlyPayment = calculateMonthlyPayment();
	 double totalPayment = monthlyPayment * loanTerm * 12;
	 
	 System.out.printf("Montly Payment : Ruppees %.2f\n", monthlyPayment);
	 System.out.printf("Total Payment over the life of loan : Ruppees %.2f\n", totalPayment);
	 
     }
}
	 
 public class Calc{
	 public static void main(String args[]) {
		 LoanCalculator calculator = new LoanCalculator();
         	calculator.acceptRecord();	 
         	calculator.printRecord();
		 
	 }
	 
 }








