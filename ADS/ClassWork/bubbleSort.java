package ADS;
import java.util.*;
public class bubbleSort {
   public static void sort(int[] arr){
     //execute  n-1 passes
    for (int i =0; i<arr.length-1;i++) {
    for (int j=0; j < arr.length - 1;j++ ){
      // compare consecutive elements
      // if left element is greater than right,then we swap
        if (arr[j] > arr[j+1]) {
        int temp = arr[j];
        arr[j] = arr[j+1];
        arr[j+1] = temp; 
      }   
    }
    System.out.println("Next Step ->");
    System.out.println(Arrays.toString(arr));  // to print each steps
 }
}


    public static void impSort(int[] arr){
      //execute  n-1 passes
     for (int i =0; i<arr.length-1;i++) {
     for (int j=0; j < arr.length - 1 -i;j++ ){
       // compare consecutive elements
       // if left element is greater than right,then we swap
         if (arr[j] > arr[j+1]) {
         int temp = arr[j];
         arr[j] = arr[j+1];
         arr[j+1] = temp; 
       }   
     }
     System.out.println("Next Step ->");
     System.out.println(Arrays.toString(arr));  // to print each steps
  }
 }
 
 public static void moreImpSort(int[] arr){
  //execute  n-1 passes
 for (int i =0; i<arr.length-1-i;i++) {
   boolean swapFlag = false ;
 for (int j=0; j < arr.length - 2;j++ ){
   // compare consecutive elements
   // if left element is greater than right,then we swap
     if (arr[j] > arr[j+1]) {
     int temp = arr[j];
     arr[j] = arr[j+1];
     arr[j+1] = temp; 
     swapFlag=true;
   }   
 }
 if(!swapFlag)
 break;
 System.out.println("Next Step ->");
 System.out.println(Arrays.toString(arr));  // to print each steps
}
}
 
public static void insertion(int [ ] arr){
  int j,temp = arr[arr.length -1]; // stores last element in temp
  //start sorting from second last elem,as last elem is in temp
  for(j=arr.length-2;j>=0 && arr[j] > temp ; j--){
   arr[j+1] = arr [j];
  }
  arr[j+1] = temp ; 
}

public static void insertionSort(int [ ] arr){
  // n-1 passes : in each pass consider i th elem as last elem of arr
  for(int i = 1;i<arr.length;i++){
  // stores last element in temp
    int j,temp = arr[i]; 
  //compare temp with all elem before that,find appropriate position for the element
  for(j=i-1;j>=0 && arr[j] > temp ; j--){
   arr[j+1] = arr [j];
  }
  arr[j+1] = temp; 
}
}
 public static void main(String[] args) {
    int[] arr= {6,4,2,8,3,1};
  System.out.println("Before Sorting : "+ Arrays.toString(arr));
  //sort(arr);
  //impSort(arr);
 // moreImpSort(arr);
  //insertion(arr); 
  insertionSort(arr);
 System.out.println("After Sorting : " + Arrays.toString(arr));
  

  }
 }

