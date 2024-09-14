package tollBooth;

import java.util.Scanner;

public class TollBoothRevenueManagerUtil {

    private static Scanner scanner = new Scanner(System.in); // Single Scanner instance

    public static TollBoothRevenueManager acceptRecord() {
        System.out.print("Enter toll rate for Car : ");
        double carRate = scanner.nextDouble();

        System.out.print("Enter toll rate for Truck : ");
        double truckRate = scanner.nextDouble();

        System.out.print("Enter toll rate for Motorcycle : ");
        double motorcycleRate = scanner.nextDouble();

        TollBoothRevenueManager manager = new TollBoothRevenueManager(carRate, truckRate, motorcycleRate);

        System.out.print("Enter number of Cars: ");
        manager.setCarCount(scanner.nextInt());

        System.out.print("Enter number of Trucks: ");
        manager.setTruckCount(scanner.nextInt());

        System.out.print("Enter number of Motorcycles: ");
        manager.setMotorcycleCount(scanner.nextInt());

        return manager;
    }

    public static void printRecord(TollBoothRevenueManager manager) {
        System.out.println(manager.toString());
    }

    public static void menuList() {
        System.out.println("Toll Booth Revenue Management System");
        System.out.println("1. Accept Toll Rates and Vehicle Counts");
        System.out.println("2. Display Toll Booth Details");
        System.out.println("3. Exit");
    }
}
