public class BankAccount {
    private static int accountCounter = 2000;        // Counter for generating unique account numbers
    private final String customerName;               // Customer's full name
    private String accountId;                        // Unique account identifier
    private final int securityPin;                   // Account security PIN
    private double balance;                          // Current account balance
    private double annualInterestRate;               // Annual interest rate for the account
    
    private static final double MINIMUM_BALANCE = 1000.0;  // Minimum required balance
    private static final String ACCOUNT_PREFIX = "SBI";    // Bank identifier prefix

    // Initialize new bank account with customer details
    BankAccount(String customerName, int securityPin, double initialDeposit, double annualInterestRate) {
        this.customerName = customerName;
        this.securityPin = securityPin;

        if (initialDeposit < MINIMUM_BALANCE) {
            System.out.println("Error: Initial deposit must be at least " + MINIMUM_BALANCE + " rupees.");
            return;
        }
        
        this.balance = initialDeposit;
        this.accountId = ACCOUNT_PREFIX + ++accountCounter;
        this.annualInterestRate = annualInterestRate;
    }

    // Process deposit transaction
    boolean deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Transaction Failed: Deposit amount must be positive!");
            return false;
        }
        
        balance += amount;
        return true;
    }

    // Process withdrawal transaction
    double withdraw(int pin, double amount) {
        if (pin != this.securityPin) {
            System.out.println("Transaction Failed: Invalid security PIN!");
            return 0;
        }
        
        if (balance < amount) {
            System.out.println("Transaction Failed: Insufficient funds available!");
            return 0;
        }
        
        balance -= amount;
        return amount;
    }

    // Display account information
    void displayAccount(int pin) {
        if (pin != this.securityPin) {
            System.out.println("Access Denied: Invalid security PIN provided!");
            return;
        }
        
        System.out.println("\n=== Account Statement ===");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Account Number: " + accountId);
        System.out.println("Current Balance: ₹" + String.format("%.2f", balance));
        System.out.println("Interest Rate: " + annualInterestRate + "%");
        System.out.println("=====================");
    }
    
    // Get current balance
    double checkBalance() {
        return balance;
    }
    
    // Get account number
    String accountNum() {
        return accountId;
    }
}