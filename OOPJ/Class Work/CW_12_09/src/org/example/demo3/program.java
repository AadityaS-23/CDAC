package org.example.demo3;


class Shape{
	protected float area;   // common fields in super class
	
	
	public Shape() {
	
	}
    public float getArea() {
		return area;
	}
	
}
class Rectangle extends Shape{
	
	 private float length;
	 private float breadth;
	
   public Rectangle() {    //non paramterized const
	   
   }
   public void setLenght(float length) {
	
	   this.length = length;
   }
   public void setBreadth(float breadth) {
		
	   this.breadth = breadth;
   }
   public void calculateArea( ) {    //setter method for area
   
	   this.area =this.length * this.breadth;
   }
   

   
}


class Circle extends Shape{
	private float radius;
	
	
	
	public Circle() {
		
	}
    public void setRadius(float radius) {
		this.radius = radius;
	}
    public void calculateArea() {
		this.area = (float)(Math.PI * Math.pow(radius, 2));
    }
    
}



public class program {
	public static void main(String args[]) {
	    Circle r = new Circle(); //Instance of circle
	    r.setRadius(50.4f);
	    r.calculateArea();
	    r.getArea();
		System.out.println("The area of Circle is :  " + r.getArea() );
	}
	
	
	 public static void main1(String args[]) {
	  Rectangle rect = new Rectangle();  //Instance of Rectangle
	  rect.setLenght(20);
	  rect.setBreadth(10);
	  rect.calculateArea();
		System.out.println("The area of rectangle is :" + rect.getArea());

	}
}
