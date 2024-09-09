package org.example.demo2;

import java.util.Scanner;

class Employee{
	private String name;
	private int empid;
	private float salary;


	public Employee( ) {
		this( "", 0, 0.0f );	//Constructor Chaining
	}
	
	public Employee( String name, int empid, float salary ) {
		this.name = name;
		this.empid = empid;
		this.salary = salary;
	}
	
	public String getName() {	
		return this.name;
	}

	public void setName(String name) {	
		this.name = name;
	}

	public int getEmpid() {	
		return this.empid;
	}

	public void setEmpid(int empid) {	
		this.empid = empid;
	}

	public float getSalary() {	
		return this.salary;
	}

	public void setSalary(float salary) {	
		this.salary = salary;
	}
}

public class Program {
	public static void main(String[] args) {
		Employee emp = new Employee();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Name	:	");
		emp.setName( sc.nextLine() );
		
		System.out.print("Empid	:	");
		emp.setEmpid(sc.nextInt());
		System.out.print("Salary	:	");
		emp.setSalary(sc.nextFloat());
		
		
		System.out.println("Name	:	"+ emp.getName());
		System.out.println("Empid	:	"+emp.getEmpid());
		System.out.println("Salary	:	"+emp.getSalary());
		
		sc.close();
	}
	public static void main1(String[] args) {
		Employee emp = new Employee();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Name	:	");
		String name = sc.nextLine();
		emp.setName( name );
		
		System.out.print("Empid	:	");
		int empid = sc.nextInt();
		emp.setEmpid(empid);
		System.out.print("Salary	:	");
		float salary = sc.nextFloat();
		emp.setSalary(salary);
		
		
		System.out.println("Name	:	"+ emp.getName());
		System.out.println("Empid	:	"+emp.getEmpid());
		System.out.println("Salary	:	"+emp.getSalary());
		
		sc.close();
	}
}
