package messageLogs;

public class Program {
	   public static void main(String[] args) {
	        Logger logger = Logger.getInstance();  // to get the singleton instance

	        logger.log("First log message.");
	        logger.log("Second log message.");
	        
	        System.out.println(logger.getLog());  // prints log
	        logger.clearLog();  // clear logs

	        System.out.println("Logs after clearing: " + logger.getLog());  // empties logs
	    }
}
