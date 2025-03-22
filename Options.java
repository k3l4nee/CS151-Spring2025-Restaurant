import java.util.Scanner;

public class Options {

    // welcome options
    public static void showWelcomeOptions(Scanner sc) {
        System.out.println("Welcome to House Zhong!");
        System.out.println("-----------------------");
        System.out.println("Are you an employee or customer?\n");
        System.out.println(
                "  1. Employee\n  2. Customer\n  3. Exit\n");
        System.out.println("Pick an option (1-3):");

        String response = sc.next();

        while (true) {
            if (response.equals("1")) {
                Options.showEmployeeOptions(response, sc);
                break;
            } else if (response.equals("2")) {
                Customer.showCustomerOptions(response, sc);
                break;
            } else if (response.equals("3") || response.equalsIgnoreCase("Exit")) {
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

    // employee options
    public static void showEmployeeOptions(String response, Scanner sc) {
        System.out.println("-----------------------");
        System.out.println("Are you a full-time or part-time employee?\n");
        System.out.println(
                "  1. Full-time\n  2. Part-time\n  3. Back\n  4. Exit\n");
        System.out.println("Pick an option (1-4):");

        response = sc.next();

        while (true) {
            if (response.equals("1")) {
                Options.showFullTimeOptions(response, sc);
                break;
            } else if (response.equals("2")) {
                Options.showPartTimeOptions(response, sc);
                break;
            } else if (response.equals("3")) {
                Options.showWelcomeOptions(sc);
                break;
            } else if (response.equals("4") || response.equalsIgnoreCase("Exit")) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.printf("\n'%s' is not an available option. Try again.\n", response);
                System.out.println("Are you a full-time or part-time employee?\n");
                System.out.println(
                        "  1. Full-time\n  2. Part-time\n  3. Back\n  4. Exit\n");
                System.out.println("Pick an option (1-4):");
                response = sc.next();
            }
        }
    }

    // full-time employee options
    public static void showFullTimeOptions(String response, Scanner sc) {
        
    }

    // part-time employee options
    public static void showPartTimeOptions(String response, Scanner sc) {
        
    }
}
