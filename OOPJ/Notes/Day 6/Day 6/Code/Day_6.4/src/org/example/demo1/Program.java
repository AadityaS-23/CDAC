package org.example.demo1;

class Test{
	private int num1;	//Instance variable
	private int num2;	//Instance variable
	private static int num3;	//Class level variable
	
	public Test( ){
		this.num1 = 0;
		this.num2 = 0;
	}
	
	public void setNum1( int num1 ) {	//Instance method
		this.num1 = num1;
	}
	public void setNum2( int num2 ) {	//Instance method
		this.num2 = num2;
	}
	public static void setNum3( int num3 ) {	//Class level method
		Test.num3 = num3;
	}
	public void printRecord( ) {
		System.out.println("Num1	:	"+this.num1);
		System.out.println("Num2	:	"+this.num2);
		System.out.println("Num3	:	"+Test.num3);
	}
}

public class Program {
	public static void main(String[] args) {
		Test t = new Test( );
		t.setNum1( 10 );
		t.setNum2( 20 );
		Test.setNum3( 30 );
		
		t.printRecord();//t.printRecord( t );
	}
}
