package findIntersection;

public class Program {
  
	// brute force method
	public static void FindIntersection(int[] arr1,int[] arr2) {
		System.out.println("Intersection : ");
		
	//Outer loop 
		for(int i = 0;i<arr1.length;i++) {
			//Inner Loop
			for(int j = 0;j<arr2.length;j++) {
				//if element from arr1 matches element from arr2
				if(arr1[i] == arr2[j]) {
					System.out.print(arr1[i]+ "  ");
					break;
				}
			}
		}
	}

  

 public static void main(String args[]) {
	//Declare and initialize two arrays
	 int[] array1 = {101,255,13,44,85};
	 int[] array2 = {13,44,85,66,57};
	 
	 //Find intersection using brute force
	 FindIntersection(array1,array2);
    }
  }