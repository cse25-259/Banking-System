import java.time.LocalDate;

public class SavingsAccount extends Account {
    private static final double minimumInitialDeposit = 50.00;
    private static final double monthlyInterestRate = 0.0005;

    public SavingsAccount(String accountNumber, double balance, String branch, LocalDate openingDate, Customer customer) {

        super(accountNumber, balance, branch, openingDate, "Savings",customer); 

        if(balance < minimumInitialDeposit) {
            throw new IllegalArgumentException(
                "Savings account requires an initial deposit of at least P50."
            );
        }
    }

    public double getMonthlyInterestRate() {
        return monthlyInterestRate;
    }

    @Override
    public void withdraw(double amount) {
        throw new UnsupportedOperationException(
            "Withdrawals are not allowed from a savings account."
        );
    }
}