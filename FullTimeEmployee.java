import java.util.Scanner;

public class FullTimeEmployee extends Employee {
    private String jobTitle;
    private double salary;

    public FullTimeEmployee(String name, String jobTitle, double salary, String phoneNumber, String email) {
        super(name, phoneNumber, email);
        this.jobTitle = "Full-time " + jobTitle;
        this.salary = salary;
    }

    public static void showFullTimeOptions(String response, Scanner sc){
        
    }

    @Override
    public String getJobTitle(){
        return this.jobTitle;
    }
    @Override
    public double getPay(){
        return this.salary;
    }
}
