import java.time.Date

public class Account {
    private String accountNumber;
    private double balance;
    private String branch;
    private date openingDate;
    private String accountType;
    private Customer customer;

    public Account (String accountNumber,String balance, String branch, Date openingDate, String accountType, Customer customer) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
        this.branch = branch;
        this.openingDate = Date.now();
        this.accountType = accountType;
        this.customer = customer;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String Branch() {
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

    public void deposit(doble amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException(
                "Deposit must be greater than zero"
            );
        }

        balance += amount;

    }

    public void void withdraw(double amount) {
        if(amount <=) {
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