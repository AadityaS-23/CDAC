package empData;

import java.util.Scanner;

public class Program{

    // Main method with a menu-driven program to test the functionalities
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee[] employees = new Employee[100];  // Fixed-size array to hold employees
        int employeeCount = 0;  // To track the number of employees

        boolean exit = false;
        while (!exit) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Employee");
            System.out.println("2. Apply Raise");
            System.out.println("3. Display Total Salary Expense");
            System.out.println("4. Update Employee Salary");
            System.out.println("5. Display Total Employees");
            System.out.println("6. Exit");

            System.out.print("Choose an option: ");
            int option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();  // Consume the newline
                    System.out.print("Enter Employee Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Employee Salary: ");
                    double salary = sc.nextDouble();

                    employees[employeeCount] = new Employee(id, name, salary);  // Add employee to the array
                    System.out.println("Employee added: " + employees[employeeCount]);
                    employeeCount++;  // Increment employee count
                    break;

                case 2:
                    System.out.print("Enter percentage raise to apply: ");
                    double percentage = sc.nextDouble();
                    Employee.applyRaise(employees, employeeCount, percentage);
                    System.out.println("Salary raise applied.");
                    break;

                case 3:
                    System.out.println("Total Salary Expense: " + Employee.calculateTotalSalaryExpense());
                    break;

                case 4:
                    System.out.print("Enter Employee ID to update salary: ");
                    int updateId = sc.nextInt();
                    for (int i = 0; i < employeeCount; i++) {
                        if (employees[i].getId() == updateId) {
                            System.out.print("Enter new salary: ");
                            double newSalary = sc.nextDouble();
                            employees[i].updateSalary(newSalary);
                            System.out.println("Salary updated for Employee ID " + updateId);
                        }
                    }
                    break;

                case 5:
                    System.out.println("Total Employees: " + Employee.getTotalEmployees());
                    break;

                case 6:
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        sc.close();
    }
}
