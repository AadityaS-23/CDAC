 class DayOfWeek {
    public static void main(String[] args) {
        
        int day = 7;

        switch (day) {
            case 1:
                System.out.println("Monday");
                System.out.println("It's a weekday.");
                break;
            case 2:
                System.out.println("Tuesday");
                System.out.println("It's a weekday.");
                break;
            case 3:
                System.out.println("Wednesday");
                System.out.println("It's a weekday.");
                break;
            case 4:
                System.out.println("Thursday");
                System.out.println("It's a weekday.");
                break;
            case 5:
                System.out.println("Friday");
                System.out.println("It's a weekday.");
                break;
            case 6:
                System.out.println("Saturday");
                System.out.println("It's a weekend.");
                break;
            case 7:
                System.out.println("Sunday");
                System.out.println("It's a weekend.");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}
