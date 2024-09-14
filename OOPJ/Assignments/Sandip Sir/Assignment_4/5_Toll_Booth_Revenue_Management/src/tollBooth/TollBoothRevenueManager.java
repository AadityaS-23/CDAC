package tollBooth;

public class TollBoothRevenueManager {
 private double carRate;
 private double truckRate;
 private double motorcycleRate;
 private int carCount;
 private int truckCount;
 private int motorcycleCount;
 
 //constructor
 
 public TollBoothRevenueManager(double carRate,double truckRate, double motorcycleRate) {
	 this.carRate=carRate;
	 this.truckRate=truckRate;
	 this.motorcycleRate=motorcycleRate;
	 this.carCount=0;
	 this.truckCount=0;
	 this.motorcycleCount=0;
	 
 }
 
 //getter and setter
 
 public double getCarRate() {
	return carRate;
}
 
 public void setCarRate(double carRate) {
	this.carRate = carRate;
}
 
 public double getTruckRate() {
	return truckRate;
}
 
 
 public void setTruckRate(double truckRate) {
	this.truckRate = truckRate;
}
 
 public double getMotorcycleRate() {
	return motorcycleRate;
}
 
 public void setMotorcycleRate(double motorcycleRate) {
	this.motorcycleRate = motorcycleRate;
}
 
 public int getCarCount() {
	return carCount;
}
 
 public void setCarCount(int carCount) {
	this.carCount = carCount;
}
 
 public int getTruckCount() {
	return truckCount;
}
 public void setTruckCount(int truckCount) {
	this.truckCount = truckCount;
}
 public int getMotorcycleCount() {
	return motorcycleCount;
}
 
 public void setMotorcycleCount(int motorcyclebikeCount) {
	this.motorcycleCount = motorcyclebikeCount;
 }
 
public double calculateTotalRevenue() {
	return(carCount * carRate)+(truckCount*truckRate)+(motorcycleCount*motorcycleRate);
}


//Updated toString method to display details on new lines
@Override
public String toString() {
    return "TollBoothRevenueManager Details:\n" +
           "Car Rate: ₹" + carRate + "\n" +
           "Truck Rate: ₹" + truckRate + "\n" +
           "Motorcycle Rate: ₹" + motorcycleRate + "\n" +
           "Number of Cars: " + carCount + "\n" +
           "Number of Trucks: " + truckCount + "\n" +
           "Number of Motorcycles: " + motorcycleCount + "\n" +
           "Total Revenue: ₹" + calculateTotalRevenue();
}


	
}




