package org.example;

import java.util.Scanner;

public class Date{
	//Fields
	private int day;		//Non static field( is also called as instance variable )	
	private int month;		//Non static field( is also called as instance variable )
	private int year;		//Non static field( is also called as instance variable )
	
	static Scanner sc = new Scanner(System.in);
	//Methods
	public void acceptRecord( /*Date this*/ ) {//Instance method
		System.out.print("Day	:	");
		this.day = sc.nextInt();
		System.out.print("Month	:	");
		this.month = sc.nextInt();
		System.out.print("Year	:	");
		this.year = sc.nextInt();
	}
	public void printRecord( /*Date this*/ ) {//Instance method
		System.out.println( this.day+" / "+this.month+" / "+this.year );
	}
}