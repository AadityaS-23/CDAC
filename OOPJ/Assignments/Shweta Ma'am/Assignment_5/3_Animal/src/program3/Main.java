package program3;

//Base class Animal
class Animal {
	// Attri
	String name;

	// Const
	public Animal(String name) {
		this.name = name;
	}

	// eating
	public void eat() {
		System.out.println(name + " is eating.");
	}

	// sleeping
	public void sleep() {
		System.out.println(name + " is sleeping.");
	}
}


class Dog extends Animal {
	
	public Dog(String name) {
		super(name);
	}

	// Additional method bark
	public void bark() {
		System.out.println(name + " is barking.");
	}
}

public class Main {
	public static void main(String[] args) {
		
		Animal animal = new Animal("Dog");
		System.out.println("Animal:");
		animal.eat();
		animal.sleep();

		
		Dog dog = new Dog("Badshah");
		System.out.println("\nDog:");
		dog.eat(); // Inherited from base  class
		dog.sleep(); // Inherited from base class
		dog.bark(); // Specific to sub class
	}
}
