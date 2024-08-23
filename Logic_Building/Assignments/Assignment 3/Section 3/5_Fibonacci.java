class fibonacciSeq{
	public static void main(String args[]){
		int a = 0, b = 1; //initialize first 2 fib nos
		int nextNumber = a + b;
		
		System.out.println("Fibonacco sequence upto 21:"+ a +"," + b);
		
		while (nextNumber<=21){
			System.out.print("," + nextNumber);
			a=b; // Move to next no.
			b=nextNumber;
			nextNumber= a+b;
		}
		
	}
}

/*Output:
Fibonacco sequence upto 21:0,1
,1,2,3,5,8,13,21*/