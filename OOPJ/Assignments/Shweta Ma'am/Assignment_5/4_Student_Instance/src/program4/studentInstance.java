package program4;

public class studentInstance {
  //Fields to store details
  String name;
  int age;
  String department;
  int id;
  
  
  //const to initialized student details
  
  public studentInstance (String name,int age, String department,int id) {
	  this.name=name;
	  this.age=age;
	  this.department=department;
	  this.id=id;
	  
  }
  
  //method to display student details
  private void displayDetails() {
	System.out.println("Student Name: " +name);
	System.out.println("Age : " +age);
	System.out.println("Department : " +department);
    System.out.println("Student ID: " +id);
   }
  
  
  //main method to create and run an instance of student
  public static void main(String[] args) {
	 // inst of Student
	  
	studentInstance s = new studentInstance("Aaditya Sutar",24,"PG-DAC",001);  

    s.displayDetails();
  }
}
