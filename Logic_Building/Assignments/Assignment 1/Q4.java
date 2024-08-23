class displayMessage{
    public static void main(String args[]){
	int time=23;
	
	if(time>=5 && time<12){
		System.out.println("Good Morning!!");
	}else if
		(time>=13 && time<=15){
		System.out.println("Good Afternoon!!");	
    }else if
		(time>=16 && time<=19){
		System.out.println("Good Evening!!");
	}else if
	    (time>=20 && time<=24){
		System.out.println("Good Night!!");	
	}else{
		System.out.println("Incorrect time entered.");
	}  
	
	
  }
}