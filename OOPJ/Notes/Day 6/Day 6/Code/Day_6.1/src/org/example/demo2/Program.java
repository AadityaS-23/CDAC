package org.example.demo2;

class Employee{
	private String name;
	private int empid;
	private String department;
	private String designation;
	private float salary;
	
	public Employee() {
		this("",0,"","",0.0f);
	}
	
	public Employee(String name, int empid, String department, String designation, float salary) {
		this.name = name;
		this.empid = empid;
		this.department = department;
		this.designation = designation;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", empid=" + empid + ", salary=" + salary + "]";
	}
}

public class Program {
	public static void main(String[] args)  {
		Employee emp = new Employee("Sandeep", 33,"Dev","Soft.Engg.",45000.50f);
		
		System.out.println( emp );	
			//String.valueOf(x);
				//obj.toString();
	}
	public static void main2(String[] args)  {
		Employee emp = new Employee("Sandeep", 33,"Dev","Soft.Engg.",45000.50f);
		
		System.out.println( emp.toString() );
	}
	public static void main1(String[] args)  {
		Employee emp = new Employee("Sandeep", 33,"Dev","Soft.Engg.",45000.50f);
		
		String str = emp.toString();
		
		System.out.println( str );
	}
}
