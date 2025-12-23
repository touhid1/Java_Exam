public class BankAccount {
    private String accountNumber;
    private double balance;
// Constructor
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }
// Getter for account number
    public String getAccountNumber() {
        return accountNumber;
    }
// Getter for balance
    public double getBalance() {
        return balance;
    }
// Deposit method with exception handling
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
        balance += amount;
    }
// Withdraw method with exception handling
    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds");
        }
        balance -= amount;
    }
// Main method to demonstrate functionality
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789", 1000.0);

        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Initial Balance: " + account.getBalance());

        account.deposit(500.0);
        System.out.println("Balance after deposit: " + account.getBalance());

        account.withdraw(200.0);
        System.out.println("Balance after withdrawal: " + account.getBalance());
    }
    
}
