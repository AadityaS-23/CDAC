class Factorial{
   public static void main(String args[]){
      int num = 10;
      long fac = 1;
	  
	  for(int i=1;i<=10;i++){
		  fac *=i;
	  }
	  
	  System.out.println("The factorial of " + num +  "is"   +  fac);
   
   }
}

//Output:
//The factorial of 10 is 3628800.