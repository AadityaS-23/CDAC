package org.example.demo1;

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

	/*public String toString() {	//Method of java.lang.Object
        return this.getClass().getName() + "@" + Integer.toHexString(hashCode());
    }*/
	
	 public String toString( ) {
		//String str = this.name+" "+this.empid+" "+this.department+" "+this.designation+" "+this.salary;
		 //String str = this.name+" "+this.empid+" "+this.salary;
		 //String str = String.format("%-15s%-10d%-10.2f", this.name, this.empid, this.salary);
		//return str;
		 
		 return  String.format("%-15s%-10d%-10.2f", this.name, this.empid, this.salary);
	}
}

public class Program {
	public static void main(String[] args)  {
		Employee emp = new Employee("Sandeep", 33,"Dev","Soft.Engg.",45000.50f);
		
		String str = emp.toString();
		
		System.out.println( str );
	}
}
