public class Customer {
    private String type;
    private String name;
    private String phoneNumber;
    private String email;
    private int loyaltyPoints;
    //private Table currentTable;
    //private ArrayList<Order> orderHistory;

    // constructor
    public Customer(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = (phoneNumber != null ? phoneNumber : "N/A");
        this.email = (email != null ? email : "N/A");
    }
    
    // getters
    public String getName() {
        return this.name;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String email() {
        return this.email;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void updateInfo(String name, String phoneNumber, String email) {

    }
}
