package day2;

import java.util.Scanner;

public class season {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of the month : ");
        int num = sc.nextInt();
        String season;
        switch(num){
            case 1: case 2 : case 3 :
               season = "Winter";
               System.out.println("The season is " +season+".");
               break;
            case 4: case 5: case 6 :
               season = "Spring";
               System.out.println("The season is " +season+".");
               break;
            case 7: case 8 : case 9 :
               season = "Summer";
               System.out.println("The season is " +season+".");
               break;
            case 10: case 11 : case 12:
               season = "Autumn";
               System.out.println("The season is " +season+".");
               break;
            default :    
               System.out.println("Invalid Input");
        break; 
      }
    sc.close(); 
   }

}
