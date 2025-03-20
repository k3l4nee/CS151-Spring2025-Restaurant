abstract class Employee {
    private String name;
    private int id;
    private String phoneNumber;
    private String email;

    public abstract double getPay();
    public abstract String getJobTitle();

    // constructor
    public Employee(String name, int id, String phoneNumber, String email) {
        this.name = name;
        this.id = id;
        if (phoneNumber == null) {
            this.phoneNumber = "N/A";
        } else {
            this.phoneNumber = phoneNumber;
        }
        if (email == null) {
            this.email = "N/A";
        } else {
            this.email = email;
        }
    }

     // getters
     public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getEmail() {
        return this.email;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
