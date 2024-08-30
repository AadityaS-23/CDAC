import java.util.Scanner;
class NestedSwitchDemo{
 public static void main(String args[]){
  Scanner sc = new Scanner (System.in);
  
  char c = sc.next().charAt(0);
  
  
  switch(c){
  
  case '+':
  System.out.println("please enter how many numbers you want to add!");
        int i=sc.nextInt();
   		switch(i){
		        case 1:
					 System.out.println("one number cannot be added");
		             break;
				case 2:	 
                     int a1= sc.nextInt();		
	                 int a2= sc.nextInt();
                     int result= a1 + a2;
                     System.out.println("Result"+ " " +result);
                     break;					 
		        default:
					 System.out.println("we can add only 2 numbers");
                     break;					 
		
		
		
		         }
		  


		  break;
  case '-':
          System.out.println("Substract");  
           break;
  default :
           System.out.println("Invalid input");
           break;		   
   
  
  }
  
  
  
 
 
 
 }

}