package counter;

 class InstanceCounter {
  //Static field to keep the track of instance count
	private static int instanceCount = 0;
	
  //Constructor to increment the count when a new instance is created
	public InstanceCounter() {
		instanceCount++;
	}	
  //Static method to return the count of instances
	
    public static int getInstanceCount() {
		return instanceCount;
	}
    
  //Optionally,override toString() to show the instance count 
    
    public String toString() {
    	return "Total instances created:  " + instanceCount;
    }

    
	
}
