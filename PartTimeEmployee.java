public class PartTimeEmployee extends Employee {
    private String jobTitle;
    private double hourlyWage;

    // constructor
    public PartTimeEmployee(String name, String jobTitle, double hourlyWage, String phoneNumber, String email) {
        super(name, phoneNumber, email);
        this.jobTitle = "Part-time " + jobTitle;
        this.hourlyWage = hourlyWage;
    }

    @Override
    public void getEmployeeInfo() {
        System.out.println("---------------");
        System.out.println("Name:         " + getName());
        System.out.println("Employee ID:  " + getId());
        System.out.println("Job title:    " + getJobTitle());
        System.out.printf("Hourly wage:  $%.2f\n", getPay());
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
        return this.hourlyWage;
    }

    // setters
    @Override
    public void setJobTitle(String jobTitle) {
        this.jobTitle = "Part-time " + jobTitle;
    }

    @Override
    public void setPay(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }
}
