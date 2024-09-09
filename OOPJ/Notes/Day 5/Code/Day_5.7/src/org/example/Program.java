package org.example;

import java.time.LocalDate;

class Date{
	private int day;
	private int month;
	private int year;
	
	public Date( ) {
		LocalDate ldt = LocalDate.now();
		this.day = ldt.getDayOfMonth();
		this.month = ldt.getMonthValue();
		this.year = ldt.getYear();
	}
	
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public void setDay(int day) {
		this.day = day;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void printRecord( ) {
		System.out.println( this.day+" / "+this.month+" / "+this.year);
	}
}
public class Program {
	public static void main(String[] args) {
		
		final Date dt1 = new Date( 7, 9, 2024 );
		
		dt1.setDay(3);
		dt1.setMonth(5);
		dt1.setYear(2005);
		
		//dt1 = new Date( 23, 7, 1983 ); //Not OK
		
		dt1.printRecord();
	}
}
