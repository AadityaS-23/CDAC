package ADS;

import java.util.Arrays;

public class selectionSort {
   public static void sort(int[] arr){
     for(int i=0;i<arr.length-1 ;i++){
        for(int j=i+1; j<arr.length;j++ ){
          if (arr[i] > arr[j]){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
          }   
        }
        System.out.println("Next Step :");  
        System.out.println(Arrays.toString(arr)); //this will print each pass and give brief idea
     }   
   }
    public static void main(String[] args) {
       int[] arr = {6,4,2,8,3,1};
       System.out.println("Selection Sort -> ");
       System.out.println("Before sorting : " +Arrays.toString(arr)); //tostring to print in 1 line
        sort(arr);
       System.out.println("After sorting : " +Arrays.toString(arr));
    }
}
