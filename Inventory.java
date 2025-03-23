public class Inventory {
    private String ingredientName;
    private int quantity;
    private int minimumRequired;
    private String supplier;
    private double unitCost;

    // constructor
    public Inventory(String ingredientName, int quantity, int minimumRequired, String supplier, double unitCost) {
        this.ingredientName = ingredientName;
        this.quantity = quantity;
        this.minimumRequired = minimumRequired;
        this.supplier = supplier;
        this.unitCost = unitCost;
    }

    // getters
    public String getIngredientName() {
        return ingredientName;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getMinimumRequired() {
        return minimumRequired;
    }

    public String getSupplier() {
        return supplier;
    }

    public double getUnitCost() {
        return unitCost;
    }

    // setters
    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setMinimumRequired(int minimumRequired) {
        this.minimumRequired = minimumRequired;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public void setUnitCost(double unitCost) {
        this.unitCost = unitCost;
    }

    // methods
    public boolean checkLowStock() {
        return true;
    }

    public void updateStock(int newQuantity) {

    }

    public int countAllProducts() {
        return 1;
    }

    public boolean placeOrder(int quantity) {
        return true;
    }

    public double calculateValue() {
        return 1.1;
    }





}
