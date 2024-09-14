package LoanCalc;




public class LoanAmortizationCalulator{
	private double principal;
	private double annualInterestRate;
	private int loanTerm;
	
	//Constructor
	
	public LoanAmortizationCalulator(double principal, double annualInterestRate, int loanTerm) {
		this.principal = principal;
		this.annualInterestRate = annualInterestRate;
		this.loanTerm = loanTerm;
		
	}
	
	// Getter and Setter Method
	public double getPrincipal() {
		return principal;
	}
	
	public void setPrincipal(double principal) {
		this.principal = principal; 
	}
    
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
    
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	public int getLoanTerm() {
		return loanTerm;
	}

	public void setLoanTerm(int loanTerm) {
		this.loanTerm = loanTerm;
	}

	
	
   //biz logic method >> calculator monthly payment
	
	public double calculateMonthlyPayment() {
		double monthlyInterestRate = (annualInterestRate / 12) / 100;
		int numberOfMonths = loanTerm * 12;
		
		return principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfMonths))/ (Math.pow(1+ monthlyInterestRate, numberOfMonths) - 1 );
	}
	
	
	// biz logic method >> calc total amt paid

  public double calculateTotalAmountPaid() {
	  return calculateMonthlyPayment () * loanTerm * 12 ;
	  }

  
   // toStrng method >> display the results
 
  @Override
  
  public String toString() {
	  return "Principal (in INR ): " + String.format("%.2f", principal) + "\n" +
             "Annual Interest Rate : " + annualInterestRate + "%\n" + 
			 "Loan Term: " + loanTerm + "years\n" +
             "Monthly Payment(in INR) : " + String.format("%.2f", calculateMonthlyPayment ()) + "\n" +
			 "Total Amount Paid (in INR) : " + String.format("%.2f" , calculateTotalAmountPaid());
	  }
}


  
 
  
  


  
  

