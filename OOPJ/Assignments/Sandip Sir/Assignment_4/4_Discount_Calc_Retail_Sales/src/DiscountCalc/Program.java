package DiscountCalc;
import java.util.Scanner;
public class Program {
  public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	int choice;
	do {
		DiscountCalculatorUtil.menuList();
		System.out.println("Enter your choice: ");
		choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			DiscountCalculatorUtil.acceptRecord(sc);
			break;
			
		case 2:
			DiscountCalculatorUtil.printRecord();
			break;
			
		case 3:
			System.out.println("Exiting............");
			break;
		  }
	}while (choice !=3);
  sc.close();
  } 
}
