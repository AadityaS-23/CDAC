package tracker;

public class BMITracker {
   private double weight;   // declare variables
   private double height;
   private double bmi;


//Constructor
 public BMITracker(double weight , double height){
	 this.weight = weight;
	 this.height = height;
	 calculateBMI();
 }
 
 public double getWeight() {
	 return getHeight();
 }
 
 public void setWeight(double weight) {
	 this.weight = weight ; 
	 calculateBMI(); // recalculate BMI when weight is updated
 }
 
 public double getHeight() {
	 return getHeight();
 }
 
 public void setHeight(double height) {
	 this.height = height ;
	 calculateBMI();
 }

 public double getBMI() {
	 return getBMI();
 }
  
 public void calculateBMI() {
	 if (height > 0 ) {
		 this.bmi = weight / (height * height);
	 }
 }
 
public String classifyBMI() {
	if (bmi < 18.5) {
		return "Underweight";
	}else if (bmi < 24.9) {
		return "Normal weight";
	}else if(bmi < 29.9) {
	    return "Overweight";
	}else {
		return "Obese";
	}
}

public String toString() {
	return String.format("BMI:%2f\n%s",bmi,classifyBMI());
     }
}