import java.time.Date;

public class InvestmentAccount extends Account {
    private static final double minimumInitialDeposit = 500.00;
    private static final double monthlyInterestRate = 0.05;

    public InvestmentAccount(String accountNumber, double balance, String branch, Date openingDate, String accountType, Customer customer) {
        super (accountNumber,balance, branch, openingDate,  "Investment", customer);

        if (balance < minimumInitialDeposit) {
            throw new IllegalArgumentException(
                "Investment account requires an initial deposit of at least P500."
            );
        }
    }
    public double getMonthlyInterestRate() {
        return monthlyInterestRate;
    }   
}