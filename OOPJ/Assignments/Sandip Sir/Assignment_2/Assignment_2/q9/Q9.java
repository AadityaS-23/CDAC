package day3.Assignment_2.q9;

public class Q9 {
    // Instance variables (non-static)
    boolean boolInstance;
    byte byteInstance;
    short shortInstance;
    char charInstance;
    int intInstance;
    long longInstance;
    float floatInstance;
    double doubleInstance;

    // Static variables
    static boolean boolStatic;
    static byte byteStatic;
    static short shortStatic;
    static char charStatic;
    static int intStatic;
    static long longStatic;
    static float floatStatic;
    static double doubleStatic;

    public static void main(String args[]) {
        Q9 obj = new Q9(); // Create an instance of the class

        // Print default values of instance variables
        System.out.println("Instance variables:");
        System.out.println("boolInstance: " + obj.boolInstance);
        System.out.println("byteInstance: " + obj.byteInstance);
        System.out.println("shortInstance: " + obj.shortInstance);
        System.out.println("charInstance: " + obj.charInstance);
        System.out.println("intInstance: " + obj.intInstance);
        System.out.println("longInstance: " + obj.longInstance);
        System.out.println("floatInstance: " + obj.floatInstance);
        System.out.println("doubleInstance: " + obj.doubleInstance);

        // Print default values of static variables
        System.out.println("\nStatic variables:");
        System.out.println("boolStatic: " + boolStatic);
        System.out.println("byteStatic: " + byteStatic);
        System.out.println("shortStatic: " + shortStatic);
        System.out.println("charStatic: " + charStatic);
        System.out.println("intStatic: " + intStatic);
        System.out.println("longStatic: " + longStatic);
        System.out.println("floatStatic: " + floatStatic);
        System.out.println("doubleStatic: " + doubleStatic);
    }
}