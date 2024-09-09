package day2;
import java.util.*;
public class BMI {
    public static void main(String args[]){
           System.out.println("Enter Height(in meter):   ");
    Scanner sc = new Scanner(System.in);
      int height = sc.nextInt();
           System.out.println("Enter Weight(in kg):  ");
      int weight = sc.nextInt();
           float BMI= weight/(height*height);
        
        if( BMI <= 18.5f){
            System.out.println("You are underweight.");
        }else if ( 18.6f <= BMI && BMI <=24.9f){
            System.out.println("You are Normal Weight.");
        }else{
            System.out.println("You are over weight.");
        }    
        sc.close();      
      }
    }
