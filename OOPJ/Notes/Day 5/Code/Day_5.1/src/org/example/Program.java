package org.example;

import java.util.Scanner;

class Employee{
	private String name;
	private int empid;
	private float salary;
	
	public Employee( ) {
		this.name  = "";
		this.empid = 0;
		this.salary = 0.0f;
	}

//	public Employee( ) {
//		this( "", 0, 0.0f );	//Constructor Chaining
//	}
	
	public Employee( String name, int empid, float salary ) {
		this.name = name;
		this.empid = empid;
		this.salary = salary;
	}
	
	public void acceptRecord( Scanner sc ) {
		System.out.print("Name	:	");
		this.name = sc.nextLine();
		System.out.print("Empid	:	");
		this.empid = sc.nextInt();
		System.out.print("Salary	:	");
		this.salary = sc.nextFloat();
	}
	
	public String getName() {	//Inspector / Selector / Getter method
		return this.name;
	}

	public void setName(String name) {	//Mutator / Setter method
		this.name = name;
	}

	public int getEmpid() {	//Inspector / Selector / Getter method
		return this.empid;
	}

	public void setEmpid(int empid) {	//Mutator / Setter method
		this.empid = empid;
	}

	public float getSalary() {	//Inspector / Selector / Getter method
		return this.salary;
	}

	public void setSalary(float salary) {	//Mutator / Setter method
		this.salary = salary;
	}

	public void printRecord( ) {
		System.out.println("Name	:	"+this.name);
		System.out.println("Empid	:	"+this.empid);
		System.out.println("Salary	:	"+this.salary);
		System.out.println();
	}
}
public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Employee emp = new Employee(); 
		
		emp.acceptRecord( sc );	//Sandeep, 33, 45000.50
		
		String name = emp.getName( );	//String name = emp.getName( emp );
		name = name.toUpperCase();
		emp.setName(name);
		
		//float salary = emp.salary;	//Not OK
		float salary = emp.getSalary( );	//float salary = emp.getSalary( emp )
		salary = salary + 15000;
		emp.setSalary(salary);
		
		emp.printRecord();
		
	}
	public static void main3(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Employee emp = new Employee(); 
		
		emp.acceptRecord( sc );	//Sandip, 33, 45000.50
		
		emp.printRecord();
		
		//emp.name = "Sandeep";	//Not OK
		emp.setName( "Sandeep" );	//emp.setName( emp, "Sandeep" );
		emp.setEmpid( 10003778 );	//emp.setEmpid( emp, 10003778 );
		emp.setSalary( 145000.50f );	//emp.setSalary( emp, 145000.50f );
		emp.printRecord();
	}
	
	public static void main2(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Employee emp1 = new Employee( );
		
		emp1.acceptRecord( sc );
		
		emp1.printRecord();
		
		sc.close();
	}
	public static void main1(String[] args) {
		Employee emp1 = new Employee( "Sandeep", 33, 45000.50f );	//"Sandeep", 33, 45000.50f <= Arguments
		
		Employee emp2 = new Employee( );
	}
}
