import java.util.Scanner;

class h8 {
    // Data Members
    private String depositorName;
    private int accountNumber;
    private String accountType;
    private double balance;

    // Constructor
    public h8(String depositorName, int accountNumber, String accountType) {
        this.depositorName = depositorName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = 10000; // Initial balance is assumed to be Rs. 10000
    }

    // Method to read account details
    public void readAccountDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Depositor Name: ");
        this.depositorName = scanner.nextLine();

        System.out.print("Enter Account Number: ");
        this.accountNumber = scanner.nextInt();

        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter Account Type (Savings/Current): ");
        this.accountType = scanner.nextLine();
    }

    // Method to deposit amount
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Amount deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount. Please enter a positive amount.");
        }
    }

    // Method to withdraw amount
    public void withdraw(double amount) {
        if (amount > 0) {
            if (this.balance - amount >= 500) {
                this.balance -= amount;
                System.out.println("Amount withdrawn successfully.");
            } else {
                System.out.println("Insufficient balance. Minimum balance should be Rs. 500.00.");
            }
        } else {
            System.out.println("Invalid withdrawal amount. Please enter a positive amount.");
        }
    }

    // Method to display balance
    public void displayBalance() {
        System.out.println("Account Balance: Rs. " + this.balance);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Assuming an initial balance of Rs. 10000
        h8 account = new h8("John Doe", 123456, "Savings");

        // Display initial balance
        account.displayBalance();

        // Read account details
        account.readAccountDetails();

        // Deposit and display balance
        System.out.println("Enter the amount to deposit:");
        double am=scanner.nextDouble();
        account.deposit(am);
        account.displayBalance();

        // Withdraw and display balance
        System.out.println("Enter the amount to withdraw:");
        double ww=scanner.nextDouble();
        account.withdraw(ww);
        account.displayBalance();
    }
}
