 class Student {
    public static void main(String[] args) {
        
        int maths = 41;  
        int physics = 39;  
        int chemistry = 40;  

        int failCount = 0;

        // Check each subject grade using switch statements with integer values
        failCount += checkPassStatus(maths);
        failCount += checkPassStatus(physics);
        failCount += checkPassStatus(chemistry);

        // Determine pass/fail status
        if (failCount == 0) {
            System.out.println("The student passes.");
        } else {
            System.out.println("The student fails in " + failCount + " subject(s).");
        }
    }

   
	
	//Helper method to check pass/fail status
    public static int checkPassStatus(int grade) {
        int status;
        switch (grade) {
            case int n if (n <= 40);
                status = 1; // fail
                break;
            default:
                status = 0; // pass
        }
        return status;
    }

 }