import java.util.List;

public interface Orderable {
    public void addToOrder(MenuItem item, int quantity);
    public void removeFromOrder(MenuItem item, int quantity);
    public double calculateTotal(List<MenuItem> order);
    public void submitOrder(List<MenuItem> order);
    public String getSummary();
}