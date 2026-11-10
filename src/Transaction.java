import java.time.LocalDate;

public class Transaction {
    private int transactionID;
    private String accountNumber;
    private String accountType;
    private double amount;
    private LocalDate date;
    private double balanceAfter;

    public Transaction ( int transactionID, String accountNumber,String accountType, double amount, LocalDate date, double balanceAfter) {
        this.transactionID = transactionID;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.amount = amount;
        this.date = date;
        this.balanceAfter = balanceAfter;
    }

    public void recordTransaction() {
        System.out.println(getTransactionDetails());
    }

    public String getTransactionDetails() {
        return "Transaction ID: " + transactionID +
               "\nAccount Number: " + accountNumber +
               "\nAccount Type: " + accountType +
               "\nAmount: P" + amount +
               "\nDate: " + date +
               "\nBalance After: P" + balanceAfter;
    }
}