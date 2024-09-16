package program5;

class Vehicle {
	// method to start the engine
	void startEngine() {
		System.out.println("Starting Engine.........>");
	}

	// method to stop the engine
	void stopEngine() {
		System.out.println("Stopping Engine ........>");
	}
}

// sub class
class Car extends Vehicle {
	void startEngine() {
		System.out.println("Car engine is starting->>>>>");
	}

	void stopEngine() {
		System.out.println("Car engine is stopping->>>>>");

	}
}

// subclass
class Motorcycle extends Vehicle {
	void startEngine() {
		System.out.println("Motocycle engine is starting->>>>>>");

	}

	void stopEngine() {
		System.out.println("Motorycle engine is stopping->>>>>>");

	}

}

public class Main {
	public static void main(String[] args) {
		// Create an instance of Car
		Vehicle c = new Car();
		System.out.println("Testing Car:");
		c.startEngine();
		c.stopEngine();

		// Create an instance of Motorcycle
		Vehicle M = new Motorcycle();
		System.out.println("\nTesting Motorcycle:");
		M.startEngine();
		M.stopEngine();
	}
}
