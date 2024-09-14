package counter;

public class Program {
   public static void main(String[] args) {
	//Creating instances to test
	   
	 InstanceCounter a1 = new InstanceCounter();  
	 InstanceCounter a2 = new InstanceCounter();  
	 InstanceCounter a3 = new InstanceCounter();   
	 InstanceCounter a4 = new InstanceCounter();
	 InstanceCounter a5 = new InstanceCounter();
	 InstanceCounter a6 = new InstanceCounter();
	 InstanceCounter a7 = new InstanceCounter();
   
   System.out.println("Instance :  "  +InstanceCounter.getInstanceCount());
    }
}
