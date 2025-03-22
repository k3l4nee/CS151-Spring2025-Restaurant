import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

abstract class Employee {
    private static int idCount = 1;
    private static Set<Integer> ids = new HashSet<>();
    private String name;
    private int id;
    private String phoneNumber;
    private String email;

    public abstract double getPay();

    public abstract String getJobTitle();

    public abstract void getEmployeeInfo();

    public abstract void setPay(double pay);

    public abstract void setJobTitle(String jobTitle);

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

    private static int getAvailableId() {
        while (ids.contains(idCount)) {
            idCount++;
        }
        ids.add(idCount);
        return idCount;
    }

    public static void showEmployeeOptions(String response, Scanner sc) {
        System.out.println("-----------------------");
        System.out.println("Are you a full-time or part-time employee?");
        System.out.println(
                "  1. Full-time\n  2. Part-time\n  3. Exit\n");
        System.out.println("Pick an option (1-3):");

        response = sc.next();

        while (true) {
            if (response.equals("1")) {
                FullTimeEmployee.showFullTimeOptions(response, sc);
                break;
            } else if (response.equals("2")) {
                PartTimeEmployee.showPartTimeOptions(response, sc);
                break;
            } else if (response.equals("3")) {
                System.out.println("Goodbye!");
                break;
            } else if (response.equalsIgnoreCase("Exit")) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.printf("\n'%s' is not an available option. Try again.\n", response);
                System.out.println("Are you a full-time or part-time employee?");
                System.out.println(
                        "  1. Full-time\n  2. Part-time\n  3. Exit\n");
                System.out.println("Pick an option (1-3):");
                response = sc.next();
            }
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

    public void setId(int id) { // throw InvalidIdException?
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
