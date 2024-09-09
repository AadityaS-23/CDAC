package TestDiscount;
import java.util.Scanner;

class calc{
	private float orgPrice;
	private float discPercentage;
    private float discountAmount;
    private float finalPrice;
    
    
    
 public void  acceptRecord(){
  Scanner sc = new Scanner(System.in);  
    System.out.println("Enter the original price(in Rupees): ");  
    orgPrice=sc.nextFloat();
    
    System.out.println("Enter the discount percentage(%):  ");
    discPercentage=sc.nextFloat();
    
    sc.close();
 }
 
 public void calculateDiscount() {
	 discountAmount = (orgPrice*(discPercentage/100));
	 finalPrice = (orgPrice-discountAmount);
 }

 
 public void printRecord() {
	 System.out.printf("The discounted amount is (Rupees):  %.2f %n " ,discountAmount);
	 System.out.printf("The final price is (Rupees): %.2f " ,finalPrice);
 }
}



public class discount {

	public static void main(String[] args) {
		calc calculator = new calc();
		calculator.acceptRecord();
		calculator.calculateDiscount();
		calculator.printRecord();

	}

}
