package BMI;
import java.util.Scanner;
//Step 1: create BMI class
//(will have logic for accepting i/p,calculating bmi,classifying the BMI and displaying result)
 class BMI {
	 private float weight;
	 private float height;
	 private float bmi;
	 private String classification;
	
//Step 2: Accept user input
public void acceptRecord() {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter your weight(in kilograms): ");
    weight = sc.nextFloat();
    
   System.out.println("Enter your height (in meters):    ");    
    height = sc.nextFloat();
    
    sc.close();
}
//Step 3: Calculate BMI
public void calculateBMI() {
	bmi = weight / (height * height );
}
//Step 4: Classify the BMI
public void classifyBMI() {
	if  (bmi<18.5f) {
		classification = "Underweight";
	}else if (bmi >= 18.5 && bmi <24.9) {
		classification = "Normal Weight";
	}else if (bmi >= 25 && bmi < 29.9 ) {
		classification = "Overweight";
	}else if (bmi >= 30) {
		classification = "Obese";
	}
}
//Step 5: Display the BMI and classification
public void printRecord() {
	System.out.printf("BMI: %.2f%n" , bmi );
	System.out.println("Classification : "  + classification);
    }
}

 // create test class 
public class BMIT {
     public static void main(String args[]) {
    	BMI calculator = new BMI();
    	 calculator.acceptRecord();
    	 calculator.calculateBMI();
    	 calculator.classifyBMI();
    	 calculator.printRecord();
    	 
     }
}
