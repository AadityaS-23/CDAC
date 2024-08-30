class SwitchDemo{
     public static void main(String args[]){
	 
	int day= '2';
     
     switch(day){
		 
		 case 1:
		     System.out.println("today is monday");
			 break;
			 
		case 2:
            System.out.println("Today is tuesday");
            break;
		case 3:
		    System.out.println("Today is Wednesday");
			break;
		case 4:	
		    System.out.println("Today is Thursday");
			break;
		default:
             System.out.println("Invalid Input");  // inthis case days are from 1-7		
            break;
		//case 2.0f:              lossy conversion
		   // System.out.println("double 2");
		//	break;
		case '2' :
            System.out.println("char 2");
            break;			
        		
		 
		 
		 
	 }	 
	 
	 
	 
	 
	 }



}