package OOPs;

// Encapsulation example
class BankAccount {
    // Private variables (data hiding)
    private String accountHolder;
    private double balance;
    
    // Constructor
    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }
    
    // Public getter for accountHolder
    public String getAccountHolder() {
        return accountHolder;
    }
    
    // Public getter for balance
    public double getBalance() {
        return balance;
    }
    
    // Public method to deposit money
    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }
    
    // Public method to withdraw money
    public void withdraw(double amount) {
        if(amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }
}

public class _02oops {
    public static void main(String[] args) {
        // Create a bank account
        BankAccount account = new BankAccount("John Doe", 1000.0);
        
        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Initial Balance: $" + account.getBalance());
        
        // Deposit money
        account.deposit(500.0);
        System.out.println("Balance after deposit: $" + account.getBalance());
        
        // Withdraw money
        account.withdraw(300.0);
        System.out.println("Balance after withdrawal: $" + account.getBalance());
        
        // Try invalid withdrawal
        account.withdraw(2000.0);
    }
}