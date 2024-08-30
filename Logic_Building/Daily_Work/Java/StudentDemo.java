class Student{
    int id;
	String name;
	float marks;
	long mob;
	String address;
	static String instituteName= "CDAC_Juhu";  //w/o static it will consume more memory as institute name will be same for each student
	
	Student(int a,String b,float c,long d,String e,String f){
	id=a;
	name=b;
	marks=c;
	mob=d;
	address=e;
	instituteName=f;
	}
	
	//instance methods
	float displayMarks()
	{
       System.out.println(instituteName+ "PG_DAC_24");
	   int grace = 2;
	   marks+=grace;


	   return marks;	
	}
	  
	void calculatePercentage()
	{
	    System.out.println("percentage");
	}
	
	void displayDetails()
	{
	    System.out.println(id+ " " +name+" "+address+" "+mob+" "+marks);
	
	}


}

class StudentDemo{
   public static void main(String [] args){
      
	  Student studentObj1= new Student();
	  
	  
	  Student studentObj2= new Student(1,"Aadi",82.071f,9579883194l,"Ambarnath");
	  
	 



  }
}

