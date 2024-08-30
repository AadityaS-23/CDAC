class Student{
 int id;
 String name;
 String address;
 float marks;
 
 
 Student(){}
 
 Student(int id){
 this.id=id;
 }
 
 Student(int a, String b,String c, float d){
 this.id=a ;
 this.name=b; //points current keyword of the class(this.)
 this.address=c;
 this.marks=d;
 
 }
 
 void display(){
  System.out.println("Student Details" + " " + id);
 }
 
 class StudentDemo2{
  public static void main(String args[]){
  Student obj1= new Student();
  Student obj2= new Student(1);
  obj2.display();
  obj1.display();
  
  
  }
 
 }
 
 
 
}