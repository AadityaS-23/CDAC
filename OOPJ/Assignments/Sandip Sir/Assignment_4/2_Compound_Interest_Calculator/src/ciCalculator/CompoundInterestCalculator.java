package ciCalculator;

public class CompoundInterestCalculator {
  private double principal;
  private double annualInterestRate;
  private int numberOfCompounds;
  private int years;

public CompoundInterestCalculator(double principal, double annualInterestRate, int numberOfCompounds, int years) {
	this.principal = principal;
	this.annualInterestRate = annualInterestRate;
	this.numberOfCompounds = numberOfCompounds;
	this.years = years;
}

//biz logic methods
public double calculateFutureValue() {
	return principal * Math.pow(1 + (annualInterestRate/numberOfCompounds/100), numberOfCompounds * years);
}

public double calculateTotalInterest() {
	return calculateFutureValue() - principal;
}

@Override
 public String toString() {
	return "Principal (in INR): " + String.format("%.2f", principal) + "\n" +
           "Annual Interest Rate : " + annualInterestRate + "%\n" +
           "Number of Compounds per year : " +numberOfCompounds + "\n" +
           "Investment Duration : " + years + "years\n" +
           "Future Value (in INR) : " + String.format("%.2f", calculateFutureValue()) +
           "Total Interest Earned (in INR) : " + String.format("%.2f", calculateTotalInterest());
    }

}
