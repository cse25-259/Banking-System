import java.time.Date;

public class ChequeAccount extends Account {
    private String employerName;
    private String employerAddress;

    public ChequeAccount (String accountNumber, double balance, String branch, Date openingDate, Customer customer, String emloyerName, String employerAddress) {
        super (accountNumber, balance, branch, openingDate, "Cheque", customer);

        if (balance < 0) {
            throw new IllegalArgumentException (
                "Initial balance cannot be negative."
            );
        }

        if (employeeAddress == null  || employerAddress.trim().isEmpty()) {
            throw new IllegalArgumentException(
                "Employer address is required for a cheque account."
            )
        }
        this.employerName = employerName;
        this.employerAddress = employerAddress;
    }

    public String getEmployerName() {
        return employerName;
    }
    
    public String getEmployerAddress() {
        return employerAddress;
    }
}