package org.example.demo6;

import java.util.Scanner;

class Shape {
	protected float area; // common fields in super class
    public Shape() {
    }
    public void calculateArea() {
    	/* no logic here,bcoz in upcasting by reference of super class we want to call sub class method 
    	 * that method should be present in super class*/
    }
    
	public float getArea() {
		return area;
	}

}

class Rectangle extends Shape {

	private float length;
	private float breadth;

	public Rectangle() { // non paramterized const

	}

	public void setLength(float length) {

		this.length = length;
	}

	public void setBreadth(float breadth) {

		this.breadth = breadth;
	}

	public void calculateArea() { // setter method for area

		this.area = this.length * this.breadth;
	}

}

class Circle extends Shape {
	private float radius;

	public Circle() {

	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	public void calculateArea() {
		this.area = (float) (Math.PI * Math.pow(radius, 2));
	}

}

public class program {
	private static Scanner sc = new Scanner(System.in);

	private static void acceptRecord(Shape shape) {
		if (shape instanceof Rectangle) {
			Rectangle rect = (Rectangle) shape; //Downcasting
			System.out.println("Enter Length (in cms) 	:   ");
			rect.setLength(sc.nextFloat());
			System.out.println("Enter Breadth (in cms)    :  ");
		    rect.setBreadth(sc.nextFloat());
		}else {
			Circle c = (Circle) shape; //Downcasting
		    System.out.println("Enter radius (in cms) : ");
	        c.setRadius(sc.nextFloat());
		}
		
		
	}
	private static void printRecord(Shape shape) {
		System.out.println("Area :  " +shape.getArea());
		}
	
	
	
	public static int menuList() {
		System.out.println("0.Exit");
		System.out.println("1.Rectangle");
		System.out.println("2.Circle");
		System.out.print("Enter choice :  ");
		return sc.nextInt();
	}

	public static void main(String[] args) {
		int choice;
		while ((choice = program.menuList()) != 0) {
			
			Shape shape =null;
			//Rectangle rect = null; // By using this there is no need for creating reference in cases.
			//Circle c = null;       // Output is not affected by it,the code becomes maintainable and optimized
			switch (choice) {
			case 1:
				shape = new Rectangle(); // upcasting // variable is created.(not possible in  c/ c++)
				program.acceptRecord(shape);
				//shape.setLength(10); 
				//shape.setBreadth(5);
				shape.calculateArea(); // Dynamic method dispatch
				program.printRecord(shape);
				//System.out.println("Area :" + shape.getArea());
				break;
			case 2:
				shape = new Circle(); // upcasting 
			    program.acceptRecord(shape);
				//shape= new Circle(); // variable is created.(not possible in c,c++)
				//shape.setRadius(10);
				shape.calculateArea(); // Dynamic method dispatch
				program.printRecord(shape);
				//System.out.println("Area :  " + shape.getArea());
				
				break;
			}
        }    /*Here values are hard coded with use of (super class,sub class),scanner
		       non parameterized constuctors, getter setter and a menu driven o/p */
	}       /* this codes has redundant lines of code in both case 1 and case 2,to overcome that
	            next package has the fix */
}

	

