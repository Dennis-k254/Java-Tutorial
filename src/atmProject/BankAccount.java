package atmProject;

public class BankAccount {
    private double balance; // Private property

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Getter method
    public double getBalance() {
        return balance;
    }

    // Setter method to deposit
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Setter method to withdraw
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else if (amount > 0 && balance < amount) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }
}
