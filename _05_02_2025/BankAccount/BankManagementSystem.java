import java.util.Scanner;

public class BankManagementSystem {
    private static void displayMainMenu() {
        System.out.println("\n========== Welcome to State Bank of India ==========");
        System.out.println("1. Open New Account");
        System.out.println("2. Exit Application");
        System.out.print("Select an option (1-2): ");
    }

    private static void displayTransactionMenu() {
        System.out.println("\n============ Transaction Menu ============");
        System.out.println("1. Deposit Funds");
        System.out.println("2. Withdraw Funds");
        System.out.println("3. View Account Details");
        System.out.println("4. Return to Main Menu");
        System.out.print("Select an option (1-4): ");
    }

    public static void main(String[] args) {
        try (Scanner inputScanner = new Scanner(System.in)) {
            BankAccount activeAccount;
            int mainChoice = 0;
            
            while (mainChoice != 2) {
                displayMainMenu();
                mainChoice = inputScanner.nextInt();
                inputScanner.nextLine(); // Clear buffer
                
                switch (mainChoice) {
                    case 1 -> {
                        // Account Creation Process
                        System.out.println("\n====== Account Opening Form ======");
                        System.out.print("Enter Full Name: ");
                        String customerName = inputScanner.nextLine();
                        
                        System.out.print("Create 4-digit PIN: ");
                        int securityPin = inputScanner.nextInt();
                        
                        System.out.print("Initial Deposit Amount (₹): ");
                        double initialAmount = inputScanner.nextDouble();
                        
                        System.out.print("Current Interest Rate (%): ");
                        double interestRate = inputScanner.nextDouble();
                        
                        activeAccount = new BankAccount(customerName, securityPin, initialAmount, interestRate);
                        System.out.println("\nAccount Created Successfully!");
                        System.out.println("Your Account Number: " + activeAccount.accountNum());
                        
                        // Transaction Menu Loop
                        int transactionChoice = 0;
                        while (transactionChoice != 4) {
                            displayTransactionMenu();
                            transactionChoice = inputScanner.nextInt();
                            
                            switch (transactionChoice) {
                                case 1 -> {
                                    System.out.print("\nEnter Deposit Amount (₹): ");
                                    if (activeAccount.deposit(inputScanner.nextDouble())) {
                                        System.out.printf("Updated Balance: ₹%.2f%n",
                                                activeAccount.checkBalance());
                                    }
                                }
                                    
                                case 2 -> {
                                    System.out.print("\nEnter Withdrawal Amount (₹): ");
                                    double withdrawAmount = inputScanner.nextDouble();
                                    System.out.print("Enter PIN: ");
                                    double withdrawn = activeAccount.withdraw(inputScanner.nextInt(),
                                            withdrawAmount);
                                    if (withdrawn > 0) {
                                        System.out.printf("Amount Withdrawn: ₹%.2f%n", withdrawn);
                                    }
                                }
                                    
                                case 3 -> {
                                    System.out.print("\nEnter PIN: ");
                                    activeAccount.displayAccount(inputScanner.nextInt());
                                }
                                    
                                case 4 -> System.out.println("\nReturning to Main Menu...");
                                    
                                default -> System.out.println("\nInvalid Option! Please try again.");
                            }
                        }
                    }
                        
                    case 2 -> System.out.println("\nThank you for banking with us!");
                        
                    default -> System.out.println("\nInvalid Option! Please try again.");
                }
            }
        }
    }
}