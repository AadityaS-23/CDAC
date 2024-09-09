package day3.Assignment_2.q2;

public class i2 {
    public static void main(String args[]){
        float floatI=3.3f;
double doubleI=3.3342d;
byte i1=(byte)floatI;
byte i2=(byte)floatI;
byte i3=(byte)doubleI;
//byte datatype can be typecasted to other types but there is loss of decimal from float to byte.
System.out.print(i1+ " " + i2+ " " +i3 );
    }

}
