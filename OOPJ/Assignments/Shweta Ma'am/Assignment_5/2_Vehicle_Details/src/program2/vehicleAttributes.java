
package program2;

// Base class 
class Vehicle {
    // Attributes
    String brand;
    int year;

    // Constructor to initialize make and year
    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Method to display Vehicle details
    public void displayDetails() {
        System.out.println("Make: " + brand);
        System.out.println("Year: " + year);
    }
}


class Car extends Vehicle {
     String model;

   
    public Car(String brand, int year, String model) {
        
        super(brand, year);
        this.model = model;
    }

   
    @Override
    public void displayDetails() {
        super.displayDetails(); 
        System.out.println("Model: " + model); 
    }
}


public class vehicleAttributes {
    public static void main(String[] args) {
        // Create a Car object
        Car c = new Car("TATA", 2020, "Harrier");

        // Display dets
        System.out.println("Car Details:");
        c.displayDetails();
    }
}
