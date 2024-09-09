package org.example;

class Test{
	private int num1=10;	//Non static field ( it is also called as instance variable)
	private int num2;	//Non static field ( it is also called as instance variable)
	private static int num3 = 100;	//Static field ( it is also called as class-level variable)

	static {	//Static Initialization Block
		Test.num3 = 500;
	}
	
	public Test( ) {
		this.num1 = 0;
		this.num2 = 0;
		//Test.num3 = 500;
	}
	
	public Test( int num1, int num2 ) {
		this.num1 = num1;
		this.num2 = num2;
		//Test.num3 = 500;
	}
	public void printRecord( /*Test this*/) {
		System.out.println( this.num1 +"	"+this.num2+"	"+Test.num3);
		System.out.println();
	}
}

public class Program {
	public static void main(String[] args) {
		Test t1 = new Test( 10, 20);
		Test t2 = new Test( 30, 40);
		Test t3 = new Test( 50, 60);
		
	
		t1.printRecord( );	//t1.printRecord( t1 );
		t2.printRecord( );	//t2.printRecord( t2 );
		t3.printRecord( );	//t3.printRecord( t3 );
	}
}
