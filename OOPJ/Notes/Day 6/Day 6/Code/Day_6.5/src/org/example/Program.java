package org.example;
public class Program {
	
	public static int power( int base, int exponent ) {
		int result = 1;
		for( int count = 1; count <= exponent; ++ count )
			result = result * base;
		return result;
	}
	
	public static void main(String[] args) {
		int result =  ( int )Program.power(5, 2);	
		System.out.println("Result	:	"+result);
	}
}
