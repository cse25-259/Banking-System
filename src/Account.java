import java.time.LocalDate;

public class Account {
    private String accountNumber;
    private double balance;
    private String branch;
    private LocalDate openingDate;
    private String accountType;
    private Customer customer;

    public Account (String accountNumber, double balance, String branch, LocalDate openingDate, String accountType, Customer customer) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.branch = branch;
        this.openingDate = openingDate;
        this.accountType = accountType;
        this.customer = customer;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getBranch() {
        return branch;
    }

    public LocalDate getOpeningDate() {
        return openingDate;
    }

    public String getAccountType() {
        return accountType;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException(
                "Deposit must be greater than zero"
            );
        }

        balance += amount;

    }

    public void withdraw(double amount) {
        if(amount <= 0) {
            throw new IllegalArgumentException(
                "Withdrawal must be greater than zero"
            );
        }

        if (amount > balance) {
            throw new IllegalArgumentException(
                "Insufficient funds"
            );
        }

        balance -= amount;

    }
}