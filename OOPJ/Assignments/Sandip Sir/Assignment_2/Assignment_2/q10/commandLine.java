package day3.Assignment_2.q10;

public class commandLine {
 public static void main(int a, int b,String sign){
  switch (sign) {
    case "+":{
        int res = a + b; 
        System.out.println("The result is " + res+".");
        break;
    }
    
    case "-":{
        int res1= a - b ;
        System.out.println("The result is " + res1+".");
        break;
    }  

    case "*":{
        int res2= a*b;
        System.out.println("The result is " + res2+".");
        break;
    }
    
    case "/":{
        int res3= a/b;
        if(b!=0){
            System.out.println("The result is "+res3+".");
        }else{
            System.out.println("The second number cannot be 0.") 
         }
       
         break;

    }


    }    


    default:{
        System.out.println("Operator entered is not recognized");
    }
        
    
    
    }
  }
}
