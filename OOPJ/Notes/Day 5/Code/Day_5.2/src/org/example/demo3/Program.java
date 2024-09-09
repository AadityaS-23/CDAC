package org.example.demo3;

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

class EmployeeUtil{
	//private Employee emp = new Employee();
	private Employee emp;	//null
	public EmployeeUtil() {
		this.emp = new Employee();
	}
	public void acceptRecord( ) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Name	:	");
		emp.setName( sc.nextLine() );
		System.out.print("Empid	:	");
		emp.setEmpid(sc.nextInt());
		System.out.print("Salary	:	");
		emp.setSalary(sc.nextFloat());
	}
	public void printRecord( ) {
		System.out.println("Name	:	"+ emp.getName());
		System.out.println("Empid	:	"+ emp.getEmpid());
		System.out.println("Salary	:	"+ emp.getSalary());
	}
}
public class Program {
	public static void main(String[] args) {
		EmployeeUtil util = new EmployeeUtil();
		
		util.acceptRecord();
		
		util.printRecord();
	}
}
