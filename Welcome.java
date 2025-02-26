import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(
                "Welcome to House Zhong!\nEnter '1' if you're a staff member \nEnter '2' if you're a customer\nEnter 'Exit' to leave");

        String response = sc.next();

        while (true) {
            if (response.equals("1")) {
                Employee employee = new Employee();
                employee.showEmployeeOptions(response, sc);
                break;
            } else if (response.equals("2")) {
                Customer customer = new Customer();
                customer.showCustomerOptions(response, sc);
                break;
            } else if (response.equalsIgnoreCase("Exit")) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Invalid option. Try again.");
            }
        }
    }
}