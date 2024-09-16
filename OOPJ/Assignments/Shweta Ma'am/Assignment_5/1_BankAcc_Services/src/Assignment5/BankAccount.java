package Assignment5;

class BankAccount {
	protected double balance; // to allow derived class access
   
	//const to initialize the balance
	public BankAccount(double initialBalance) {
	 this.balance = initialBalance;
   } 

// method 1 (deposit money)
	public void deposit(double amount ) {
		if(amount > 0 ) {
			balance +=amount;
			System.out.println("Deposited(INR): " +amount  );
		} else {
			System.out.println("Ammount must be positive.");
		}
   	 }

// method 2 (deposit mpney)
	public void deposit1(double amount) {
		if(amount > 0) {
			balance += amount;
			System.out.println("Deposited(INR) : " + amount);
		}else {
			System.out.println("Amount must be positive.");
		}
		
	}

	// Method to withdraw money (no limit in base class)
	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrew: $" + amount);
	        } else {
	            System.out.println("Insufficient balance or invalid amount!");
	        }
	    }

	    // Method to get the current balance
	    public double getBalance() {
	        return balance;
	    }
	}

	// Derived class representing a Savings Account with a withdrawal limit
	class SavingsAccount extends BankAccount {
	    private double withdrawalLimit;

	    // Constructor to initialize balance and withdrawal limit
	    public SavingsAccount(double initialBalance, double withdrawalLimit) {
	        super(initialBalance); // Call the base class constructor
	        this.withdrawalLimit = withdrawalLimit;
	    }

	    // Overridden method to impose a withdrawal limit
	    @Override
	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance && amount <= withdrawalLimit) {
	            balance -= amount;
	            System.out.println("Withdrew: $" + amount + " from Savings Account");
	        } else if (amount > withdrawalLimit) {
	            System.out.println("Withdrawal failed: Amount exceeds limit of $" + withdrawalLimit);
	        } else {
	            System.out.println("Insufficient balance or invalid amount!");
	        }
	    }
	}


	