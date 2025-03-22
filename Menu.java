public class Menu {
    private String item;
    private String category;
    private double price;
    private int id;
    private String description;
    private boolean isAvailable;
    private String ingredients;

    // constructor
    public Menu(String item, String category, double price) {
        this.item = item;
        this.category = category;
        this.price = price;
    }

    // getters
    public String getItem(String item) {
        return item;
    }

    public String getCategory(String category) {
        return category;
    }

    public double getPrice(double price) {
        return price;
    }

    public int getId(int id) {
        return id;
    }

    public String getDescription(String description) {
        return description;
    }

    public boolean getIsAvailable(boolean isAvailable) {
        return isAvailable;
    }

    public String getIngredients(String ingredients) {
        return ingredients;
    }

    // setters
    public void setItem(String item) {
        this.item = item;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public void setIngredients(String ingredients) { 
        this.ingredients = ingredients;
    }

    public void listBestSellers() {

    }

    public void listVegetarianOptions() {

    }

    public void listAllergens() {
        
    }

    public void updatePrice() {

    }

    public boolean checkIngredientsAvailability() {
        return true;
    }
    
    public boolean changeAvailability() {
        return true;
    }
}