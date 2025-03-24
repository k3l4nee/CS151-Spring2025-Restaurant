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

    public List<MenuItem> order() {
        return this.order;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // methods
    public void updateInfo(String newName, String newPhoneNumber) {
        this.name = newName;
        this.phoneNumber = newName;
    }

    @Override
    public void order(MenuItem item, int quantity) {
        int itemStock = item.getStock();
        if(itemStock < quantity) {
            System.out.println("This item: " + item + " is out of stock!");
        } else {
            item.setStock(itemStock - quantity);
        }
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
