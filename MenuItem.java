import java.util.ArrayList;
import java.util.List;

public class MenuItem implements Comparable<MenuItem> {
    private String name;
    private String category;
    private double price;
    private int id;
    private String description;
    private List<String> ingredients;
    private int stock;
    private static final List<String> COMMON_FOOD_ALLERGIES = List.of("Peanuts", "Tree Nuts", "Dairy", "Soy", "Eggs",
            "Fish", "Shellfish", "Wheat");
    private static final List<String> NOT_VEGETARIAN_FRIENDLY = List.of("Chicken", "Beef", "Pork", "Turkey", "Fish",
            "Shrimp");

    // constructor
    public MenuItem(String name, double price, int stock, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.stock = stock;
    }

    // getters
    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public int getStock() {
        return stock;
    }

    // setters
    public void setName(String name) {
        this.name = name;
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

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    // methods
    @Override
    public int compareTo(MenuItem other) {
        return this.name.compareTo(other.name);
    }

    public boolean isAvailable() {
        if (stock > 0) {
            return true;
        }
        return false;
    }

    public boolean isVegetarian() {
        List<String> itemIngredients = getIngredients();
        for (String ingredient : itemIngredients) {
            if (NOT_VEGETARIAN_FRIENDLY.contains(ingredient)) {
                return false; // menu item is not vegetarian
            }
        }
        return true;
    }

    public List<String> findAllergens() {
        List<String> itemIngredients = getIngredients();
        List<String> allergensList = new ArrayList<>();
        for (String ingredient : itemIngredients) {
            if (COMMON_FOOD_ALLERGIES.contains(ingredient)) {
                allergensList.add(ingredient); // menu item contains allergen(s)
            }
        }
        return allergensList;
    }

    public void listAllergens() {
        List<String> allergensList = findAllergens();
        if (allergensList.isEmpty()) {
            System.out.println("N/A");
        } else {
            System.out.println("Contains: " + allergensList);
        }
    }

    public void updatePrice(double updatedPrice) {
        this.price = updatedPrice;
    }

    public boolean checkIngredientsAvailability() {
        return true;
    }

    public boolean changeAvailability() {
        return true;
    }
}