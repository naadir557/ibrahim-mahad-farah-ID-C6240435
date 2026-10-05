public class BankAccount {

    // Encapsulated account information
    private String accountNumber;
    private String customerName;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String customerName, double initialBalance) {

        this.accountNumber = accountNumber;
        this.customerName = customerName;

        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative.");
        }

        this.balance = initialBalance;
    }

    // Read the balance
    public double getBalance() {
        return balance;
    }

    // Update the balance by depositing money
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be greater than 0.");
        }

        balance += amount;
    }

    // Update the balance by withdrawing money
    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be greater than 0.");
        }

        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient balance.");
        }

        balance -= amount;
    }

    // Display account information
    public void displayAccountInformation() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Balance: $" + balance);
        System.out.println("----------------------------");
    }

    // Main method to demonstrate the class
    public static void main(String[] args) {

        BankAccount account = new BankAccount(
                "ACC001",
                "Ibrahim",
                1000.00
        );

        System.out.println("Initial Balance: $" + account.getBalance());

        // Deposit money
        account.deposit(500.00);
        System.out.println("After Deposit: $" + account.getBalance());

        // Withdraw money
        account.withdraw(200.00);
        System.out.println("After Withdrawal: $" + account.getBalance());

        // Display complete account information
        account.displayAccountInformation();
    }
}

