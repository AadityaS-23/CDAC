package day2;
import java.util.*;

public class leapYear {
    public static void main(String args []){
     System.out.println("Enter the year: "); 
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
    if(( year % 4 == 0 && year % 100 != 0) || year % 400 == 0  ){
        System.out.println("The year is leap year.");
        
    }
    else{
        System.out.println("This year is not a leap year. ");
    }

    sc.close();
    
/*switch(){
 * case 1:
 * 
 * 
} */



}

}
 