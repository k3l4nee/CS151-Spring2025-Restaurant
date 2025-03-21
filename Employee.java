import java.util.Set;
import java.util.HashSet;

abstract class Employee {
    private static int idCount = 0;
    private static Set<Integer> ids = new HashSet<>();
    private String name;
    private int id;
    private String phoneNumber;
    private String email;

    public abstract double getPay();

    public abstract String getJobTitle();

    // constructor
    public Employee(String name, String phoneNumber, String email) {
        this.name = name;
        this.id = getAvailableId();
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

    protected static int getAvailableId() {
        while (ids.contains(idCount)) {
            idCount++;
        }
        ids.add(idCount);
        return idCount;
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
        if (id < 1) {
            System.out.println("Error: ID must be positive.");
        } else if (ids.contains(id)) {
            System.out.println("Error: ID is in use already.");
        }
        ids.remove(this.id);
        this.id = id;
        ids.add(id);
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
