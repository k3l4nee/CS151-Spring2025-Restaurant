import java.util.ArrayList;

public class Restaurant {
    private String name;
    private String address;
    private String openHours;
    private String phoneNumber;
    private int capacity;
    private ArrayList<Employee> employees;
    private ArrayList<Customer> customers;

    public Restaurant(String name, String address, String openHours, String phoneNumber, int capacity) {
        this.name = name;
        this.address = address;
        this.openHours = openHours;
        this.phoneNumber = phoneNumber;
        this.capacity = capacity;
        this.employees = new ArrayList<>();
        this.customers = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void removeCustomer(Customer customer) {
        customers.remove(customer);
    }

    // getters
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getOpenHours() {
        return openHours;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
    
    public int getEmployeeCount() {
        return employees.size();
    }

    public int getCustomerCount() {
        return customers.size();
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setOpenHours(String openHours) {
        this.openHours = openHours;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }
}
