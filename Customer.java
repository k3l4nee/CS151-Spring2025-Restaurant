public class Customer {
    private String name;
    private String phoneNumber;
    //private Table currentTable;

    // constructor
    public Customer(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = (phoneNumber != null ? phoneNumber : "N/A");
    }
    
    // getters
    public String getName() {
        return this.name;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void updateInfo(String name, String phoneNumber, String email) {

    }
}
