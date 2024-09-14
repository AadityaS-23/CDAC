package messageLogs;

public class Logger {
    // holds the single instance of logger
    private static Logger instance;

    // store log messages
    private String logMessages = "";  // Use a String instead of StringBuilder

    // prevention of instantiation
    private Logger() { }

    // returns the single instance of logger
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();  // Create a new Logger instance if none exists
        }
        return instance;
    }

    // for adding a mssg to log
    public void log(String message) {
        logMessages += message + "\n";  // Append the message to the log
    }

    // returns all mssgs
    public String getLog() {
        return logMessages;
    }

    // clear all mssgs
    public void clearLog() {
    	// Clear the log by setting logMessages to an empty string   
    	logMessages = "";  
    }

    
 
}
