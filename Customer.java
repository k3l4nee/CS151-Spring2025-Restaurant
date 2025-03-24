import java.util.ArrayList;
import java.util.List;

public class Customer implements Orderable {
    private String name;
    private String phoneNumber;
    private List<MenuItem> order;

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

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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
        for(MenuItem item : order) {
            Menu.updateStock(item);
        }
        System.out.println("Order has been submitted.");
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
