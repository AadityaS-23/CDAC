package org.example;

public class Program {
	private static int count;
	public static void printCount ( ) {
		//static int count = 0; //Method local variable: Not OK
		count = count + 1;
		System.out.println("Count	:	"+count);
	}
	public static void main(String[] args) {
		Program.printCount();	//1
		Program.printCount();	//2
		Program.printCount();	//3
	}
}
