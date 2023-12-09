public class Account {
    private double balance;
    private double interestRate;
    public Account(double initialBalance) {
        if (initialBalance < 0) {
            System.out.println("Initial balance cannot be negative. Setting balance to $0.");
            this.balance = 0;
        } else {
            this.balance = initialBalance;
        }
        this.interestRate = 0.03;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("$" + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount. Please enter a positive amount.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("$" + amount + " withdrawn successfully.");
            } else {
                System.out.println("Insufficient funds. A $5 penalty will be charged.");
                balance -= 5;
            }
        } else {
            System.out.println("Invalid withdrawal amount. Please enter a positive amount.");
        }
    }
    public double getBalance() {
        return balance;
    }
    public void computeInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Interest of $" + interest + " added to the account.");
    }
    public static void main(String[] args) {
        Account myAccount = new Account(1000);
        myAccount.deposit(500);
        myAccount.withdraw(800);
        myAccount.withdraw(200);
        myAccount.computeInterest();
        double currentBalance = myAccount.getBalance();
        System.out.println("Current balance: $" + currentBalance);
    }
}