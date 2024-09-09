package org.example;

class Test{
	private final int number = 5;
	
	public void showRecord( ) {
		//this.number = this.number + 5; //Not OK
		System.out.println("Number	:	"+this.number);
	}
	public void printRecord( ) {
		//this.number = this.number - 2;	//Not OK
		System.out.println("Number	:	"+this.number);
	}
}
public class Program {
	public static void main(String[] args) {
		Test t = new Test( );
		
		t.showRecord( );	//5
		
		t.printRecord( );	//3
	}
}
