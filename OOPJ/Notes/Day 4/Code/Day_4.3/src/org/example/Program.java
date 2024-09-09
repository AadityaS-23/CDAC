package org.example;
public class Program {
	public static void main(String[] args) {			
		//null is literal in Java
		Date date = null;		//date is called as null object
		
		date = new Date( );
		
		date.acceptRecord();
		
		date.printRecord();
		
		Date.sc.close();
	}
}