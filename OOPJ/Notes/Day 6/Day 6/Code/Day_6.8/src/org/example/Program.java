package org.example;

class Singleton{
	private int num1;
	private int num2;
	private Singleton() {
		this.num1 = -1;
		this.num2 = -1;
	}
	private static Singleton reference = null;
	public static Singleton getReference( ) {
		if( reference == null )
			reference = new Singleton();
		return reference;
	}
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
}
public class Program {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getReference();
		s1.setNum1(10);
		s1.setNum2(20);
		System.out.println( s1.getNum1()+"	"+s1.getNum2());
		
		Singleton s2 = Singleton.getReference();
	}
}
