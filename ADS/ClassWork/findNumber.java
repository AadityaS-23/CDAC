package ADS;
import java.util.Arrays;
import java.util.Scanner;


public class findNumber {
  
  
    public static int linearSearch(int[] arr,int key){
    for(int i=0;i<arr.length;i++){
        if(arr [i] == key ) 
        return i;
    }
     return -1;
} 

     public static int binarySearch(int [] arr,int key){
         int left=0,right = arr.length-1,mid;
      while(left <= right){
        mid = (left + right)/2;
      if(key == arr[mid])
           return mid;
      if(key < arr[mid])
           right = mid -1;
      else 
           left = mid + 1;
        }
     return -1;
}

    public static int recBinarySearch(int[] arr,int left,int right,int key){
     if(right < left)  //if true,invalid array
       return -1;  
     int index2, mid = (left + right)/2;
     if(key == arr[mid])
        return mid;
     if(key<arr[mid])
        index2=recBinarySearch(arr, left, mid-1, key); //search left part of array
        else  
         index2=recBinarySearch(arr, mid+1, right, key); //search right part of array
         return index2;   
}

     
public static void insertion(int[] arr)
{}

    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
       int [] arr = {88,33,66,99,77,44,22,55,11};
       Arrays.sort(arr); 
       
       
       System.out.println("Enter Key to search :  ");
        int key = sc.nextInt();
       
         //Binary Search can work on both unsorted and sorted arrays.

        int index = linearSearch(arr, key);
         if(index != -1)
          System.out.println("Using Linear Search -> Key found at index : "  +index);
         else 
          System.out.println("Using Linear Search -> Key not found!!");
          
         //Binary Search can work only on sorted arrays .

        int index1 = binarySearch(arr, key);
         if(index1 != -1)
          System.out.println("Using Binary Search -> Key found at index : "  +index);
         else 
          System.out.println("Using Binary Search -> Key not found!!");    
           
          
        int index2=  recBinarySearch(arr,0,arr.length-1,key);
           if(index != -1)
               System.out.println("Using recBinary Search -> Key found at index : " +index2);
           else 
               System.out.println("Using recBinary Search -> Key not found!!");        
             sc.close(); 
     }
   
    }


