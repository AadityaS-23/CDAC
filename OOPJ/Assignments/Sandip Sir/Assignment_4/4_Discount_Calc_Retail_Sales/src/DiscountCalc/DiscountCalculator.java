package DiscountCalc;

public class DiscountCalculator {
  private double originalPrice;
  private double discountRate;
  private double discountAmount;
  private double finalPrice;
  
  
  
  //constructor
  public DiscountCalculator(double originalPrice,double discountRate) {
	  this.originalPrice=originalPrice;
	  this.discountRate=originalPrice;
	  calculateDiscount();
 }
    
  
  public double getOriginalPrice() {
	  return originalPrice;
  }
  
  public void setOriginalPrice(double originalPrice) {
	  this.originalPrice=originalPrice;
  }
  
  public double getDiscountRate() {
	  return discountRate;
  }
  
  public void setDiscountRate(double discountRate) {
	  this.discountRate = discountRate;
  }
  
  public double getDiscountAmount() {
	return discountAmount;
}
 
  public void setDiscountAmount(double discountAmount) {
	this.discountAmount = discountAmount;
}
  
  public double getFinalPrice() {
	return finalPrice;
}
  public void setFinalPrice(double finalPrice) {
	this.finalPrice = finalPrice;
}
  
  //logic to calculate discount and final price
     private void calculateDiscount() {
    	 discountAmount = originalPrice * (discountRate/100);
    	 finalPrice = originalPrice - discountAmount;
     }
  
public String toString() {
	return String.format("Original Price(INR): %.2f\nDiscount Rate(%): %.2f%%\nDiscount Amount(INR): %.2f\nFinal Price(INR): %.2f ",originalPrice,discountRate,discountAmount,finalPrice);
  }

}
