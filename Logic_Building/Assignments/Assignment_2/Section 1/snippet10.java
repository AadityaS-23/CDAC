 class Main { 
    public void display() { 
        System.out.println("No parameters"); 
    } 
    public void display(int num) { 
        System.out.println("With parameter: " + num); 
    } 
    public static void main(String[] args) { 
        Main obj = new Main(); // Create an instance of the Main class
        obj.display(); // Call the no-argument display method
        obj.display(5); // Call the display method with an integer argument
    } 
}
