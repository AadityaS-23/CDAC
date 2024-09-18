package org.example.demo7;

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

class ShapeUtil{
	private Shape shape; // def vl null
    Scanner sc = Scanner(System.in);
	
	public void acceptRecord();{
    	
    }
    public void printRecord();{
    	
    }  
    public static int menuList() {
    	System.out.println("0.Exit");
		System.out.println("1.Rectangle");
		System.out.println("2.Circle");
		System.out.print("Enter choice :  ");
		return sc.nextInt()
    	
    }
   public 

}

public class program {
	
public static void main(String[] args) {
     int choice;
     while((choice = Shape.Util.menuList()) !=0  ) {
    	switch (choice ) {
    	case 1 :
    		  util.acceptRecord();
    		  util.printRecord();
    	      break;
    	}
    	 
    	 
                  }
     
			}
        }    
}	

