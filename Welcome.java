import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // starting data. imagine you're entering the restaurant during the day and there already employees and customers
        Restaurant restaurant = new Restaurant("House Zhong", "1 Washington Sq, San Jose, CA 95192", "10am to 10pm", "804-737-1111", 50);

        Employee fullEmp1 = new FullTimeEmployee("Sabrina", "Manager",100000, "444-444-4444", "sabrina@gmail.com");
        Employee fullEmp2 = new FullTimeEmployee("Daniel", "Chef",80000, null, "danny@gmail.com");
        Employee partEmp1 = new PartTimeEmployee("Chris", "Waiter",22.50, 12, "232-232-2323", "chris0032@gmail.com");
        Employee partEmp2 = new PartTimeEmployee("Sara", "Waitress", 22.50, 20, "123-456-7890", null);

        Customer customer1 = new Customer("James", "408-222-2222");
        Customer customer2 = new Customer("Jasmine", "804-555-3331");

        restaurant.addEmployee(fullEmp1);
        restaurant.addEmployee(fullEmp2);
        restaurant.addEmployee(partEmp1);
        restaurant.addEmployee(partEmp2);
        restaurant.addCustomer(customer1);
        restaurant.addCustomer(customer2);

        System.out.println("Welcome!");
        Options.showWelcomeOptions(sc);

        sc.close();
    }
}