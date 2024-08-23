 class MissingBreakCase { 
    public static void main(String[] args) { 
        int level = 1; 
        switch(level) { 
            case 1: 
                System.out.println("Level 1"); 
                break; // End switch block for case 1
            case 2: 
                System.out.println("Level 2"); 
                break; // End switch block for case 2
            case 3: 
                System.out.println("Level 3"); 
                break; // End switch block for case 3
            default: 
                System.out.println("Unknown level"); 
        } 
    } 
}
