package org.example.demo3;

class Test{
	public int num1 = 10;
	public static int num2 = 20;	
	
	public void showRecord( ) {
		System.out.println("Inside showRecord");
	}
	
	public static void displayRecord( ) {
		System.out.println("Inside displayRecord");
	}
}
public class Program {
	public static void main(String[] args) {
		//System.out.println("Num1	:	"+num1);//Not OK
		Test t = new Test( );
		System.out.println("Num1	:	"+t.num1);//OK
		
		//System.out.println("Num2	:	"+num2);//Not OK
		System.out.println("Num2	:	"+Test.num2);//Not OK
		
		//showRecord( ); //Not OK
		t.showRecord();//OK
		
		//displayRecord( );//Not OK
		Test.displayRecord( );//Not OK
	}
}
