public interface Orderable {
    public void addToOrder();
    public void removeFromOrder();
    public double calculateTotal();
    public void submitOrder();
    public String getSummary();
}