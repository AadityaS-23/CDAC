package day2;

import java.util.*;

public class a1{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the shape of whose area you want.");
       String shape = sc.nextLine();
       switch(shape){
           case "Circle":
          
           System.out.println("Enter the radius of Circle (in cms): ");
           int r = sc.nextInt();
           double area0 = (3.14*r*r);
           System.out.println("Area of Circle is  "+ area0 + "cm^2");
           break;

           case "Square" :
           System.out.println("Enter the length of  side of a Square (in cms)");
           int s = sc.nextInt();
           int area1 = (s*s);
           System.out.println("Area of Square is  " + area1+"cm^2" );
           break;

           case "Rectangle" :
           
           System.out.println("Enter the length of Rectangle(in cms).");
           int l = sc.nextInt();
           
           System.out.println("Enter the breadth of Rectangle(in cms).");
           int b = sc.nextInt();
           int area2 = (l*b);
           System.out.println("The area of Rectangle is  " + area2+"cm^2" );
           break;

           case "Triangle" :
         
           System.out.println("Enter the length of base of the Triangle(in cms): ");
           int a = sc.nextInt();
           System.out.println("Enter the length  of the Triangle(in cms): ");
           int c = sc.nextInt();
           double area3 = 0.5 *a*c;
           System.out.println("The area of Triangle is   " + area3+"cm^2");
           break;

           default:
           System.out.println("Invalid Input");
        }
       sc.close();

    }
    

}
