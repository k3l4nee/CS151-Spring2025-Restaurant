import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to House Zhong!");
        System.out.println("-----------------------");
        System.out.println("Are you an employee or customer?\n");
        System.out.println(
                "  1. Employee\n  2. Customer\n  3. Exit\n");
        System.out.println("Pick an option (1-3):");

        String response = sc.next();

        while (true) {
            if (response.equals("1")) {
                Employee.showEmployeeOptions(response, sc);
                break;
            } else if (response.equals("2")) {
                Customer.showCustomerOptions(response, sc);
                break;
            } else if (response.equals("3")) {
                System.out.println("Goodbye!");
                break;
            } else if (response.equalsIgnoreCase("Exit")) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.printf("\n'%s' is not an available option. Try again.\n", response);
                System.out.println("Are you an employee or customer?\n");
                System.out.println(
                        "  1. Employee\n  2. Customer\n  3. Exit\n");
                System.out.println("Pick an option (1-3):");
                response = sc.next();
            }
        }
    }
}