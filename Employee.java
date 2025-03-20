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

}
