interface InventoryOperations {
    public void addToMenuStock(MenuItem itemName, int quantity);
    public boolean subtractFromMenuStock(MenuItem itemName, int quantity);
    public void checkMenuStock();
}
