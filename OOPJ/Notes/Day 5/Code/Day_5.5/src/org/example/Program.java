package org.example;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Number	:	");
		final int number = sc.nextInt();
		//number = number + 5;	//OK
		System.out.println( "Number	:	"+number);
	}
	public static void main2(String[] args) {
		final int number; 
		number = 10;	//Assignment
		//number = number + 5;	//Not OK
		System.out.println( "Number	:	"+number);
	}
	
	public static void main1(String[] args) {
		final int number = 10; //Initialization
		//number = number + 5;	//Not OK
		System.out.println( "Number	:	"+number);
	}
}
