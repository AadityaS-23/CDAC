package com.example.util;

import java.util.Scanner;

import com.example.domain.Employee;

public class EmployeeUtil {
	private Employee emp;
	public EmployeeUtil( ) {
		this.emp = new Employee();
	}
	private static Scanner sc = new Scanner(System.in);
	public void acceptRecord( ) {
		System.out.print("Name	:	");
		sc.nextLine();
		this.emp.setName(sc.nextLine());
		System.out.print("Empid	:	");
		this.emp.setEmpid(sc.nextInt());
		System.out.print("Salary	:	");
		this.emp.setSalary(sc.nextFloat());
	}
	public void printRecord( ) {
		System.out.println(this.emp.getName()+"	"+this.emp.getEmpid()+"	"+this.emp.getSalary());
	}
	public static int menuList( ) {
		System.out.println("0.Exit");
		System.out.println("1.Accept Record");
		System.out.println("2.Print Record");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}
	public static void releaseResource( ) {
		sc.close();
	}
}
