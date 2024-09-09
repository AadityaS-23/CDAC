package org.example;

class Test{
	static {	//Static Initialization Block
		System.out.println("Static Initialization Block#3");
		Test.num2 = 40;
	}
	
	private int num1=10;	//Instance field initializer
	private static int num2 = 100;

	static {	//Static Initialization Block
		System.out.println("Static Initialization Block#1");
		Test.num2 = 20;
	}
	
	{
		System.out.println("Instance Initialization Block#1");
		this.num1 = 10;
	}
	public Test( ) {
		System.out.println("Inside constructor");
		this.num1 = 0;
	}
	
	public Test( int num1 ) {
		this.num1 = num1;
	}
	public void printRecord( /*Test this*/) {
		System.out.println( this.num1 +"	"+Test.num2);
	}
	static {	//Static Initialization Block
		System.out.println("Static Initialization Block#2");
		Test.num2 = 20;
	}
}

public class Program {
	public static void main(String[] args) {
		Test t1 = new Test( );
		Test t2 = new Test( );
		Test t3 = new Test( );
	}
}
