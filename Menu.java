import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Menu {
    private List<MenuItem> menu;
    private MenuItem itemName;
    private int quantity;
    private Map<MenuItem, Integer> inventoryStock;
    

    public Menu() {
        this.menu = new ArrayList<>();
        this.inventoryStock = new HashMap<>();
    }

    // getters
    public MenuItem getItemName() {
        return itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public List<MenuItem> getMenu() {
        return menu;
    }

    // setters
    public void setItemName(MenuItem itemName) {
        this.itemName = itemName;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // methods for MenuItem
    public void listAllMenuItems() {
        System.out.println("Menu Items: ");
        for (MenuItem item : menu) {
            System.out.printf("%s - $%.2f - %s\n", item.getName(), item.getPrice(), item.getCategory());
        }
    }

    public void addToMenu(MenuItem item) {
        menu.add(item);
    }

    public void removeFromMenu(MenuItem item) {
        menu.remove(item);
    }

    public void listVegetarianOptions() {
        List<MenuItem> vegetarianOptions = new ArrayList<>();
        for(MenuItem item : menu) {
            if(item.isVegetarian()) {
                vegetarianOptions.add(item);
            }
        }
        if(vegetarianOptions.isEmpty()) {
            System.out.println("No Vegetarian Options");
        } else {
            System.out.println("Vegetarian Options: " + vegetarianOptions);
        }
    }

    // methods for Inventory
    public void addToMenuStock(MenuItem itemName, int quantity) {
        this.itemName = itemName;
        this.quantity = quantity;

        // add or update inventory
        inventoryStock.put(itemName, inventoryStock.getOrDefault(itemName, 0) + quantity);

        System.out.println("Added " + quantity + " of " + itemName);
    }

    public void checkMenuStock() {
        System.out.println("Inventory Stock: ");
        for (MenuItem item : inventoryStock.keySet()) {
            int qty = inventoryStock.get(item);
            System.out.printf("%s - Quantity: %d\n", item, qty);
        }
    }

    // when a customer orders the item
    public boolean consumeItem(MenuItem item, int quantity) {
        if (!inventoryStock.containsKey(item)) {
            System.out.println("Item: " + item.getName() + " not found in inventory");
            return false;
        }

        int currentStock = inventoryStock.get(item);
        if (currentStock < quantity) {
            System.out.println("Not enough " + item.getName() + " in stock. Available: " + currentStock + ", Requested: " + quantity);
            return false;
        }

        inventoryStock.put(item, currentStock - quantity);
        System.out.println("Consumed " + quantity + " of " + item.getName() + ". Remaining: " + (currentStock - quantity));

        this.itemName = item;
        this.quantity = currentStock - quantity;
        
        return true;

    }



}