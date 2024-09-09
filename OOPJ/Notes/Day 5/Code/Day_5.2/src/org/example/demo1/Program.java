package org.example.demo1;

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
		
		emp.setName("Sandeep");
		emp.setEmpid(33);
		emp.setSalary(45000.50f);
		
		String name = emp.getName();
		System.out.println("Name	:	"+ name);
		int empid = emp.getEmpid();
		System.out.println("Empid	:	"+empid);
		float salary = emp.getSalary();
		System.out.println("Salary	:	"+salary);
	}
}
