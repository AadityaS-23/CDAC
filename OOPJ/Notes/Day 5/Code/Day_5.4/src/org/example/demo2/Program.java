package org.example.demo2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Test{
	private int num1 = 10;	//Instance Field Initializer
	private int num2;
	private int num3;
	
	public Test( ) {
		//this.num1 = 10;
		
		try {
			String pathName = "Sample.txt";
			File file = new File(pathName );
			Scanner sc = new Scanner( file );
			this.num2 = sc.nextInt();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		this.num3 = 30;
	}
	
	public Test( int num3 ) {
		//this.num1 = 10;
		
		try {
			String pathName = "Sample.txt";
			File file = new File(pathName );
			Scanner sc = new Scanner( file );
			this.num2 = sc.nextInt();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		this.num3 = num3;
	}
	public void printRecord( ) {
		System.out.println("Num1	:	"+this.num1);
		System.out.println("Num2	:	"+this.num2);
		System.out.println("Num3	:	"+this.num3);
	}
}
public class Program {
	public static void main(String[] args) {
		Test t1 = new Test( );
		t1.printRecord();
		
		System.out.println("****************");
		
		Test t2 = new Test( 300 );
		t2.printRecord();
	}
}
