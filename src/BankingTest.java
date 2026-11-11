import java.time.LocalDate;
import java.util.Scanner;

public class BankingTest {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("---------------------");
        System.out.println("   BANKING SYSTEM    ");
        System.out.println("---------------------");

        //CUSTOMER DETAILS
        System.out.println("\n--CUSTOMER REGISTRATION--");

        System.out.println("Enter Customer ID: ");
        int customerID = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter First Name: ");
        String firstName = scanner.nextLine();

        System.out.println("Enter Address: ");
        String address = scanner.nextLine();

        System.out.println("Enter Phone Number: ");
        int phoneNumber = Integer.parseInt(scanner.nextLine());

        Customer customer = new Customer(
            customerID, firstName, address, phoneNumber
        );

        System.out.println("\nCUSTOMER CREATED SUCCESSFULLY!");

        //ACCOUNT DETAILS
        System.out.println("\n--- ACCOUNT CREATION ---");

        System.out.println("1. Savings Account");
        System.out.println("2. Investment Account");
        System.out.println("3. Cheque Account");

        System.out.println("Seelect Account Type: ");
        int choice = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter Account Number: ");
        String accountNumber = scanner.nextLine();

        System.out.println("Enter Branch: ");
        String branch = scanner.nextLine();

        System.out.println("Enter Initial Deposit: P");
        double balance = Double.parseDouble(scanner.nextLine());

        Account account;

        try {

            switch (choice) {

                case 1:
                    account = new SavingsAccount(
                        accountNumber,
                        balance,
                        branch,
                        LocalDate.now(),
                        customer
                    );
                    break;
                case 2:
                    account = new InvestmentAccount(
                        accountNumber,
                        balance,
                        branch,
                        LocalDate.now(),
                        customer
                    );
                    break;

                case 3:
                    System.out.println("Enter Employer Name: ");
                    String employerName = scanner.nextLine();

                    System.out.println("Enter Employer Address: ");
                    String employerAddress = scanner.nextLine();

                    account = new ChequeAccount(
                        accountNumber,
                        balance,
                        branch,
                        LocalDate.now(),
                        customer,
                        employerName,
                        employerAddress
                    );
                    break;

                default:
                    System.out.println("Invalid account selection!");
                    return;            
            }

            //ACCOUNT CONFIRMATION
            System.out.println("\n-------------------------------");
            System.out.println("\n      ACCOUNT CREATED          ");
            System.out.println("\n-------------------------------");

            System.out.println("Customer: " + customer.getFirstName());
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Account Type: " + account.getAccountType());
            System.out.println("Branch: " + account.getBranch());
            System.out.println("Opening Date: " + account.getOpeningDate());
            System.out.println("Balance: P" + account.getBalance());

            if (account instanceof SavingsAccount) {
                System.out.println("Monthly Interest Rate: " +
                ((SavingsAccount) account).getMonthlyInterestRate() * 100 + "%");
            }

            if (account instanceof InvestmentAccount) {
                System.out.println("Monthly Interest Rate: " +
                ((InvestmentAccount) account).getMonthlyInterestRate() * 100 + "%");
            }
            if(account instanceof ChequeAccount) {
                ChequeAccount cheque = (ChequeAccount) account;
                System.out.println("Employer: " + cheque.getEmployerName());
                System.out.println("Employer Address: " + cheque.getEmployerAddress());
            }
    
        } catch (IllegalArgumentException e) {
            System.out.println("\nAccount creation failed: " + e.getMessage());
        }

        scanner.close();
    }
}    