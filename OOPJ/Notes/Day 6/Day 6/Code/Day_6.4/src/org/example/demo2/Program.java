package org.example.demo2;
public class Program {
	public int num1 = 10;
	public static int num2 = 20;	
	
	public void showRecord( ) {
		System.out.println("Inside showRecord");
	}
	
	public static void displayRecord( ) {
		System.out.println("Inside displayRecord");
	}
	
	public static void main(String[] args) {
		//System.out.println("Num1	:	"+num1);	//Not OK
		Program p = new Program( );
		System.out.println("Num1	:	"+p.num1);	//Not OK
		
		System.out.println("Num2	:	"+num2);	//OK
		System.out.println("Num2	:	"+Program.num2);	//OK
		
		displayRecord( );	//OK
		Program.displayRecord( );	//OK
		
		//showRecord( );	//Not OK
		p.showRecord();	//OK
	}
}
