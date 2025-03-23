import java.util.Scanner;

public class Options {

    // welcome options
    public static void showWelcomeOptions(Scanner sc, Restaurant restaurant) {
        System.out.println("-----------------------");
        System.out.println("Are you an employee or customer?\n");
        System.out.println(
                "  1. Employee\n  2. Customer\n  3. Exit\n");
        System.out.println("Pick an option (1-3):");

        String response = sc.next();

        while (true) {
            if (response.equals("1")) {
                Options.showEmployeeOptions(sc, restaurant);
                break;
            } else if (response.equals("2")) {
                Options.showCustomerOptions(sc);
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
    public static void showEmployeeOptions(Scanner sc, Restaurant restaurant) {
        System.out.println("-----------------------");
        System.out.println("Are you a full-time or part-time employee?\n");
        System.out.println(
                "  1. Full-time\n  2. Part-time\n  3. Back\n  4. Exit\n");
        System.out.println("Pick an option (1-4):");

        String response = sc.next();

        while (true) {
            if (response.equals("1")) {
                Options.showFullTimeOptions(sc, restaurant);
                break;
            } else if (response.equals("2")) {
                Options.showPartTimeOptions(sc);
                break;
            } else if (response.equals("3")) {
                Options.showWelcomeOptions(sc, restaurant);
                break;
            } else if (response.equals("4") || response.equalsIgnoreCase("Exit")) {
                System.out.println("Goodbye!");
                sc.close();
                System.exit(0);
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
    public static void showFullTimeOptions(Scanner sc, Restaurant restaurant) {
        System.out.println("-----------------------");
        System.out.println("Full-time Employee Options\n");
        System.out.println(
                "  1. Restaurant Admin\n  2. Inventory\n  3. Back\n  4. Exit\n");
        System.out.println("Pick an option (1-4):");

        String response = sc.next();

        while (true) {
            if (response.equals("1")) {
                Options.showRestaurantAdminOptions(sc, restaurant);
                break;
            } else if (response.equals("2")) {
                Options.showInventoryOptions(sc);
                break;
            } else if (response.equals("3")) {
                Options.showEmployeeOptions(sc, restaurant);
                break;
            } else if (response.equals("4") || response.equalsIgnoreCase("Exit")) {
                System.out.println("Goodbye!");
                sc.close();
                System.exit(0);
            } else {
                System.out.printf("\n'%s' is not an available option. Try again.\n", response);
                System.out.println("Full-time Employee Options\n");
                System.out.println(
                        "  1. Restaurant Admin\n  2. Inventory\n  3. Back\n  4. Exit\n");
                System.out.println("Pick an option (1-4):");
                response = sc.next();
            }
        }
    }

    // part-time employee options
    public static void showPartTimeOptions(Scanner sc) {

    }

    // customer options
    public static void showCustomerOptions(Scanner sc) {

    }

    // restaurant admin options
    public static void showRestaurantAdminOptions(Scanner sc, Restaurant restaurant) {
        System.out.println("-----------------------");
        System.out.println("Restaurant Admin Options\n");
        System.out.println(
                "  1. Hire Full-Time Employee\n  2. Hire Part-Time Employee\n  3. Fire Employee\n  4. Get All Employee Details\n  5. Back\n  6. Exit\n");
        System.out.println("Pick an option (1-6):");

        String response = sc.next();

        while (true) {
            if (response.equals("1")) {
                System.out.println("Name?");
                String name = sc.next();

                System.out.println("Job title? 'Full-time' [enter]");
                String jobTitle = sc.next();

                double hourlyWage = 0;
                while (true) {
                    try {
                        System.out.println("Salary?");
                        hourlyWage = sc.nextDouble();

                        if (hourlyWage <= 0) {
                            throw new InvalidPayException("Salary must be greater than 0. Please try again.");
                        }
                        break;
                    } catch (InvalidPayException e) {
                        System.out.println("Error: " + e.getMessage());
                    } catch (Exception e) {
                        System.out.println("Error: Enter a numeric value.");
                        sc.next();
                    }
                }

                System.out.println("Phone number?");
                String phoneNumber = sc.next();

                System.out.println("Email?");
                String email = sc.next();

                Employee newFullTimeEmployee = new FullTimeEmployee(name, jobTitle, hourlyWage, phoneNumber, email);

                restaurant.addEmployee(newFullTimeEmployee);
                System.out.println("Added " + newFullTimeEmployee.getName() + " to " + restaurant.getName());
                System.out.println("Returning to Restaurant Admin Options...");
                Options.showRestaurantAdminOptions(sc, restaurant);
                break;

            } else if (response.equals("2")) {
                System.out.println("Name?");
                String name = sc.next();

                System.out.println("Job title? 'Part-time [enter]'");
                String jobTitle = sc.next();

                double hourlyWage = 0;
                while (true) {
                    try {
                        System.out.println("Hourly wage?");
                        hourlyWage = sc.nextDouble();

                        if (hourlyWage <= 0) {
                            throw new InvalidPayException("Hourly wage must be greater than 0. Please try again.");
                        }
                        break;
                    } catch (InvalidPayException e) {
                        System.out.println("Error: " + e.getMessage());
                    } catch (Exception e) {
                        sc.next();
                        System.out.println("Error: Enter a number.");
                    }
                }

                System.out.println("Phone number?");
                String phoneNumber = sc.next();

                System.out.println("Email?");
                String email = sc.next();

                Employee newPartTimeEmployee = new PartTimeEmployee(name, jobTitle, hourlyWage, phoneNumber, email);

                restaurant.addEmployee(newPartTimeEmployee);
                System.out.println("\nAdded " + newPartTimeEmployee.getName() + " to " + restaurant.getName());
                System.out.println("\nReturning to Restaurant Admin Options...");
                Options.showRestaurantAdminOptions(sc, restaurant);
                break;

            } else if (response.equals("3")) {
                System.out.println("Enter employee ID to fire:");
                int employeeId;
                while (true) {
                    try {
                        employeeId = sc.nextInt();
                        if (employeeId <= 0) {
                            throw new InvalidIdException("ID must be greater than 0.");
                        }
                        boolean removed = false;
                        for (Employee employee : restaurant.getEmployees()) {
                            if (employee.getId() == employeeId) {
                                restaurant.removeEmployee(employee);
                                System.out.println("\nRemoved " + employee.getName() + ":" + employee.getId()
                                        + " from " + restaurant.getName());
                                removed = true;
                                break;
                            }
                        }
                        if (!removed) {
                            throw new InvalidIdException("Employee ID: " + employeeId + " doesn't exist. Try again.");
                        }
                        break;
                    } catch (InvalidIdException e) {
                        System.out.println("Error: " + e.getMessage());
                    } catch (Exception e) {
                        sc.next();
                        System.out.println("Error: Enter a number.");
                    }
                    System.out.println("\nReturning to Restaurant Admin Options...");
                    Options.showRestaurantAdminOptions(sc, restaurant);
                    break;
                }
            } else if (response.equals("4")) {
                for (Employee employee : restaurant.getEmployees()) {
                    employee.getEmployeeInfo();
                }
                System.out.println("Returning to Restaurant Admin Options...");
                Options.showRestaurantAdminOptions(sc, restaurant);
                break;
            } else if (response.equals("5")) {
                Options.showFullTimeOptions(sc, restaurant);
                break;
            } else if (response.equals("6") || response.equalsIgnoreCase("Exit")) {
                System.out.println("Goodbye!");
                sc.close();
                System.exit(0);
            } else {
                System.out.printf("\n'%s' is not an available option. Try again.\n", response);
                System.out.println("Pick an option (1-6):");
                response = sc.next();
            }
        }
    }

    // inventory options
    public static void showInventoryOptions(Scanner sc) {

    }

}
