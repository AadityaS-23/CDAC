package org.example;
class InstanceCounter{
	private static int count;
	
	public InstanceCounter( ) {
		InstanceCounter.count = InstanceCounter.count + 1;
	}
	public static int getCount() {
		return count;
	}
}

public class Program {
	public static void main(String[] args) {
		System.out.println("Instance Counter	:	"+InstanceCounter.getCount());
		
		InstanceCounter c1 = new InstanceCounter();
		InstanceCounter c2 = new InstanceCounter();
		InstanceCounter c3 = new InstanceCounter();
		
		System.out.println("Instance Counter	:	"+InstanceCounter.getCount());
	}
}
