package duplicate;


public class Program {

	 // rm dupli
	
	public static int removeD(int[] arr,int n ) {
	  if (n==0 || n==1) {
		  return n ;
	}
	
	  int []temp = new int [n];
	  int j =  0;
	  for(int i = 0;i<n-1;i++) {
		  if(arr[i]!=arr[i+1]) {
			  temp[j++] = arr[i];
		  }
	    }
  temp[j++] = arr [n-1];
  // changing og array
  for(int i = 0;i<j;i++) {
	  arr[i]=temp[i];
  }

 return j;	
}

public static void main(String[] args) {
	int arr[] = {10,20,30,40,50,20,40,40,10};
	int length = arr.length;
	
	java.util.Arrays.sort(arr);
	
	length = removeD(arr,length);
	//print array elements
	for(int i = 0;i<length;i++) {
		System.out.println(arr[i] + "  ");
	   }
    }
}
