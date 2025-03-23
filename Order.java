import java.util.Date;
import java.util.Map;
import java.util.Scanner;

public class Order implements Orderable {
    private String type;
    private Customer customer;
    private int orderId;
    private Map<Menu, Integer> orderItems;
    private int tableNumber;
    private Date orderTime;
    private String status;
    private double totalAmount;

    // constructor
    public Order(String type, Customer customer, int orderId) {
        this.type = type;
        this.customer = customer;
        this.orderId = orderId;
    }

    // getters
    public String getType(String type) {
        return type;
    }

    public Customer getCustomer(Customer customer) {
        return customer;
    }

    public int getOrderId(int orderId) {
        return orderId;
    }

    public int getTableNumber(int tableNumber) {
        return tableNumber;
    }

    public String getStatus(String status) {
        return status;
    }

    public double getTotalAmount(double totalAmount) {
        return totalAmount;
    }

    // setters
    public void setType(String type) {
        this.type = type;
    }
    
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public static void showOrderOptions(String input, Scanner sc) {
        System.out.println("Specify your type of order to proceed");
        System.out.println("1. Dine in\n 2. To-go\n 3. Delivery\n 4. Exit\n");
        System.out.println("Input the corresponding number (1-4):");

        input = sc.next();
        while(true) {
            if(input.equals("1")) {
                //implement
                break;
            } else if(input.equals("2")) {
                //implement
                break;
            } else if(input.equals("3")) {
                //implement
                break;
            } else if(input.equals("4") || input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting.");
                break;
            } else {
                System.out.println("Invalid input, try again.\n");
                System.out.println("Specify your type of order to proceed");
                System.out.println("1. Dine in\n 2. To-go\n 3. Delivery\n 4. Exit\n");
                System.out.println("Input the corresponding number (1-4):");
                input = sc.next();
            }
        }
    }

    @Override
    public void addToOrder() {
        
    }

    @Override
    public void removeFromOrder() {
    }

    /*
    @Override
    public double calculateTotal() {
    }
    */

    @Override
    public void submitOrder() {
    }

    /*
    @Override
    public String getSummary() {
    }
    */
}
