import java.util.Scanner;

public class PartTimeEmployee extends Employee {
    private String jobTitle;
    private double hourlyWage;
    private double hoursWorked;

    public PartTimeEmployee(String name, String jobTitle, double hourlyWage, double hoursWorked, String phoneNumber,
            String email) {
        super(name, phoneNumber, email);
        this.jobTitle = "Part-time " + jobTitle;
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    public static void showPartTimeOptions(String response, Scanner sc) {
        
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
