public class FullTimeEmployee extends Employee {
    private String jobTitle;
    private double salary;

    // constructor
    public FullTimeEmployee(String name, String jobTitle, double salary, String phoneNumber, String email) {
        super(name, phoneNumber, email);
        this.jobTitle = "Full-time " + jobTitle;
        this.salary = salary;
    }

    @Override
    public void getEmployeeInfo() {
        System.out.println("---------------");
        System.out.println("Name:         " + getName());
        System.out.println("Employee ID:  " + getId());
        System.out.println("Job title:    " + getJobTitle());
        System.out.printf("Salary:       $%.2f\n", getPay());
        System.out.println("Phone number: " + getPhoneNumber());
        System.out.println("Email:        " + getEmail());
        System.out.println("---------------");
    }

    // getters
    @Override
    public String getJobTitle() {
        return this.jobTitle;
    }

    @Override
    public double getPay() {
        return this.salary;
    }

    // setters
    @Override
    public void setJobTitle(String jobTitle) {
        this.jobTitle = "Full-time " + jobTitle;
    }

    @Override
    public void setPay(double salary) {
        this.salary = salary;
    }
}
