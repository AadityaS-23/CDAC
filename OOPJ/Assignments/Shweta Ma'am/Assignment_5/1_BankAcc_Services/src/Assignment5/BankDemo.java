package Assignment5;

public class BankDemo {
    public static void main(String[] args) {
        // Creating a general bank account with $500 balance
        BankAccount bankAccount = new BankAccount(500);
        System.out.println("Initial Balance (BankAccount): $" + bankAccount.getBalance());

        // Depositing $200
        bankAccount.deposit(200);
        System.out.println("Balance after deposit: $" + bankAccount.getBalance());

        // Withdrawing $100 (no limit in base class)
        bankAccount.withdraw(100);
        System.out.println("Balance after withdrawal: $" + bankAccount.getBalance());

        System.out.println("\n------------------------\n");

        // Creating a savings account with $1000 balance and $300 withdrawal limit
        SavingsAccount savingsAccount = new SavingsAccount(1000, 300);
        System.out.println("Initial Balance (SavingsAccount): $" + savingsAccount.getBalance());

        // Depositing $500
        savingsAccount.deposit(500);
        System.out.println("Balance after deposit: $" + savingsAccount.getBalance());

        // Trying to withdraw $400 (should fail due to limit)
        savingsAccount.withdraw(400);
        System.out.println("Balance after failed withdrawal: $" + savingsAccount.getBalance());

        // Withdrawing $200 (within the limit)
        savingsAccount.withdraw(200);
        System.out.println("Balance after successful withdrawal: $" + savingsAccount.getBalance());
    }
}	
