package org.example;

class Test{
	public int num1 = 10;
	public static int num2 = 20;
	
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public static int getNum2() {
		return num2;
	}
	public static void setNum2(int num2) {
		Test.num2 = num2;
	}
	public void showRecord() {
		System.out.println("Inside showRecord");
	}
	public static void displayRecord() {
		System.out.println("Inside displayRecord");
	}
}

public class Program {
	public static void main(String[] args) {
		//displayRecord();	//Not OK
		
		Test.displayRecord();	//OK
		
		Test t = new Test( );
		t.displayRecord();	//OK: The static method displayRecord() from the type Test should be accessed in a static way
	}
	public static void main3(String[] args) {
		//showRecord( );	//Not OK
		
		Test t = new Test( );
		t.showRecord();//OK
		
		//Test.showRecord( );	//Not OK
	}
	public static void main2(String[] args) {
		//System.out.println("Num2	:	"+num2);	//Not OK
		System.out.println("Num2	:	"+Test.num2);	//OK
		Test t = new Test( );
		System.out.println("Num2	:	"+t.num2);	//OK: The static field Test.num2 should be accessed in a static way
	}
	public static void main1(String[] args) {
		//System.out.println("Num1	:	"+num1);	//Not OK
		//System.out.println("Num1	:	"+Test.num1);	//Not OK
		Test t = new Test( );
		System.out.println("Num1	:	"+t.num1);	//Not OK
	}
}
