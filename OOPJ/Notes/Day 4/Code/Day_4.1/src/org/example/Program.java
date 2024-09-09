package org.example;

import java.util.Scanner;

class Date{
	//Fields
	private int day;		//Non static field( is also called as instance variable )	
	private int month;		//Non static field( is also called as instance variable )
	private int year;		//Non static field( is also called as instance variable )
	
	//Methods
	public void acceptRecord( /*Date this*/ ) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Day	:	");
		this.day = sc.nextInt();
		System.out.print("Month	:	");
		this.month = sc.nextInt();
		System.out.print("Year	:	");
		this.year = sc.nextInt();
	}
	public void printRecord( /*Date this*/ ) {
		System.out.println( this.day+" / "+this.month+" / "+this.year );
	}
}

public class Program {
	public static void main(String[] args) {
		Date dt1 = new Date();	//day, month, year
		Date dt2 = new Date();	//day, month, year
		Date dt3 = new Date();	//day, month, year
		
		dt1.acceptRecord();	//dt1.acceptRecord( dt1 );
		dt2.acceptRecord();	//dt2.acceptRecord( dt2 ) ;
		dt3.acceptRecord();	//dt3.acceptRecord( dt3 );
	}
	public static void main2(String[] args) {
		//Instantiation
		Date date = new Date();//Instance: Here class Date in instantiated
		
		date.acceptRecord( );	//date.acceptRecord( date );
		date.printRecord( );	//date.printRecord( date );
	}
	public static void main1(String[] args) {
		Date date;		///reference
		date = new Date( );	//Instance
	}
}