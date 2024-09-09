package toll;
import java.util.Scanner;

class TollBoothRevenueManager {
    private float carRate;
    private float truckRate;
    private float motorcycleRate;

    private int carCount;
    private int truckCount;
    private int motorcycleCount;

    private float totalRevenue;

    public void setTollRates() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the toll rate for Car (in Rupees): ");
        carRate = sc.nextFloat();

        System.out.println("Enter the toll rate for Truck (in Rupees): ");
        truckRate = sc.nextFloat();

        System.out.println("Enter the toll rate for Motorcycle (in Rupees): ");
        motorcycleRate = sc.nextFloat();
    }

    public void acceptRecord() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of Cars passing through the toll booth: ");
        carCount = sc.nextInt();

        System.out.println("Enter the number of Trucks passing through the toll booth: ");
        truckCount = sc.nextInt();

        System.out.println("Enter the number of Motorcycles passing through the toll booth: ");
        motorcycleCount = sc.nextInt();
    }

    public void calculateRevenue() {
        totalRevenue = (carRate * carCount) + (truckRate * truckCount) + (motorcycleRate * motorcycleCount);
    }

    public void printRecord() {
        int totalVehicles = carCount + truckCount + motorcycleCount;

        System.out.println("Total number of vehicles: " + totalVehicles);
        System.out.printf("Total revenue collected: ₹%.2f\n", totalRevenue);
    }
}

public class TollBoothTest {
    public static void main(String[] args) {
        TollBoothRevenueManager manager = new TollBoothRevenueManager();

        manager.setTollRates();
        manager.acceptRecord();
        manager.calculateRevenue();
        manager.printRecord();
    }
}

