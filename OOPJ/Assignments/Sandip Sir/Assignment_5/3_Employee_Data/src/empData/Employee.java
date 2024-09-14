package empData;


public class Employee {
    // Static fields to keep track of the total number of employees and total salary expense
    private static int totalEmployees = 0;
    private static double totalSalaryExpense = 0;

    // Non-static fields for individual employee details
    private int id;
    private String name;
    private double salary;

    // Constructor to initialize an employee
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        totalEmployees++;  // Increase the total number of employees
        totalSalaryExpense += salary;  // Add to the total salary expense
    }

    // Static method to get the total number of employees
    public static int getTotalEmployees() {
        return totalEmployees;
    }

    // Static method to apply a raise to the salary of all employees
    public static void applyRaise(Employee[] employees, int employeeCount, double percentage) {
        for (int i = 0; i < employeeCount; i++) {
            Employee emp = employees[i];
            double raise = emp.salary * (percentage / 100);
            emp.salary += raise;
            totalSalaryExpense += raise;  // Update total salary expense
        }
    }

    // Static method to calculate the total salary expense
    public static double calculateTotalSalaryExpense() {
        return totalSalaryExpense;
    }

    // Non-static method to update the salary of an individual employee
    public void updateSalary(double newSalary) {
        totalSalaryExpense = totalSalaryExpense - this.salary + newSalary;  // Adjust the total salary expense
        this.salary = newSalary;
    }

    // Getter methods for individual employee details
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // toString() method to display employee information
    @Override
    public String toString() {
        return "Employee ID: " + id + ", Name: " + name + ", Salary: " + salary;
    }
}
