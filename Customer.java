import java.util.ArrayList;
import java.util.List;

public class Customer implements Orderable {
    private String name;
    private String phoneNumber;
    private List<MenuItem> order;
    private String orderStatus;

    // constructor
    public Customer(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = (phoneNumber != null ? phoneNumber : "N/A");
        this.order = new ArrayList<>();
    }
    
    // getters
    public String getName() {
        return this.name;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public List<MenuItem> order() {
        return this.order;
    }

    public String getOrderStatus() {
        return this.orderStatus;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    // methods
    public void updateInfo(String newName, String newPhoneNumber) {
        this.name = newName;
        this.phoneNumber = newName;
    }

    public void order(MenuItem item, int quantity) {
        int itemStock = item.getStock();
        if(itemStock < quantity) {
            System.out.println("This item: " + item + " is out of stock!");
        } else {
            item.setStock(itemStock - quantity); 
        }
    }

    // methods from Orderable
    @Override
    public void addToOrder(MenuItem item, int quantity) {
        for(int i = 0; i < quantity; i++) {
            order.add(item);
        }
    }

    @Override
    public void removeFromOrder(MenuItem item, int quantity) {
        for(int i = 0; i < quantity; i++) {
            order.remove(item);
        }
    }
    
    @Override
    public void submitOrder(List<MenuItem> order) {
        if(order.isEmpty()) {
            System.out.println("Error: No items in order.");
            return;
        } else {
            orderStatus = "Submitted";
        }
        System.out.println("Order has been submitted successfully.");
    }

    @Override
    public double calculateTotal(List<MenuItem> order) {
        double total = 0.0;
        for(MenuItem item : order) {
            total += item.getPrice();
        }
        return total;
    }

    @Override
    public String getSummary() {
        String customerName = getName();
        String customerPhoneNumber = getPhoneNumber();
        String orderSummary = "Order for: " + customerName + " | " + customerPhoneNumber + "\n";
        for(MenuItem item : order) {
            orderSummary += item.getName() + " | $" + item.getPrice() + "\n";
        }
        return orderSummary;
    }
}
