public class PartTimeEmployee extends Employee {
    private String jobTitle;
    private double hourlyWage;
    private double hoursWorked;

    // constructor
    public PartTimeEmployee(String name, String jobTitle, double hourlyWage, double hoursWorked, String phoneNumber,
            String email) {
        super(name, phoneNumber, email);
        this.jobTitle = "Part-time " + jobTitle;
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public void getEmployeeInfo() {
        System.out.println("---------------");
        System.out.println("Name:         " + getName());
        System.out.println("Employee ID:  " + getId());
        System.out.println("Job title:    " + getJobTitle());
        System.out.printf("Hourly wage:  $%.2f\n", getHourlyWage());
        System.out.printf("Hours worked: %.2f\n", getHoursWorked());
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
        return this.hourlyWage * this.hoursWorked;
    }

    public double getHoursWorked() {
        return this.hoursWorked;
    }

    public double getHourlyWage() {
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

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}
