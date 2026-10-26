public class Customer
{
    private int customerID;
    private String firstName;
    private String address;
    private int phoneNumber;

    public Customer(int customerID, String firstName, String address,int phoneNumber) {
        this.customerID = customerID;
        this.firstName = firstName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

     public int getCustomerID() {
        return customerID;
     }

     public String getFirstName() {
        return firstName;
     }

     public String getAddress() {
        return address;
     }
     
     public String getPhoneNumber() {
        return phoneNumber;
     }
}