package org.example.demo4;

import java.util.Scanner;

class Shape {
	protected float area; // common fields in super class

	public Shape() {

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
			switch (choice) {
			case 1:
				Rectangle rect = new Rectangle(); // variable is created.(not possible in  c/ c++)
				rect.setLength(10);
				rect.setBreadth(5);
				rect.calculateArea();
				System.out.println("Area :" + rect.getArea());
				break;
			case 2:
				Circle c = new Circle(); // variable is created.(not possible in c,c++)
				c.setRadius(10);
				c.calculateArea();
				System.out.println("Area :  " + c.getArea());
				break;
			}
        }    /*Here values are hard coded with use of (super class,sub class),scanner
		       non parameterized constuctors, getter setter and a menu driven o/p */
	}       /* this codes has redundant lines of code in both case 1 and case 2,to overcome that
	            next package has the fix */ 
}
