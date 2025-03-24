import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Menu implements InventoryOperations {
    private List<MenuItem> menu;
    private MenuItem itemName;
    private int quantity;
    private Map<MenuItem, Integer> inventoryStock;


    public Menu() {
        this.menu = new ArrayList<>();
        this.inventoryStock = new TreeMap<>();
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

    public void addToMenu(MenuItem item, int stock) {
        menu.add(item);
        inventoryStock.put(item, stock);
    }

    public void removeFromMenu(MenuItem item) {
        menu.remove(item);
    }

    public void listVegetarianOptions() {
        List<MenuItem> vegetarianOptions = new ArrayList<>();
        for (MenuItem item : menu) {
            if (item.isVegetarian()) {
                vegetarianOptions.add(item);
            }
        }
        if (vegetarianOptions.isEmpty()) {
            System.out.println("No Vegetarian Options");
        } else {
            System.out.println("Vegetarian Options: " + vegetarianOptions);
        }
    }

    // methods for Inventory
    @Override
    public void addToMenuStock(MenuItem itemName, int quantity) {
        this.itemName = itemName;
        this.quantity = quantity;

        // add or update inventory
        inventoryStock.put(itemName, inventoryStock.getOrDefault(itemName, 0) + quantity);
        System.out.println("Added " + quantity + " of " + itemName.getName());
    }

    @Override
    public boolean subtractFromMenuStock(MenuItem itemName, int quantity) {
        try {
            if (!inventoryStock.containsKey(itemName)) {
                throw new InvalidItemException("Item " + itemName.getName() + " not found in inventory.");
            }

            int currentStock = inventoryStock.get(itemName);

            if (currentStock < quantity) {
                throw new Exception("Not enough stock to subtract. Available stock: " + currentStock);
            }

            inventoryStock.put(itemName, currentStock - quantity);
            return true;

        } catch (InvalidItemException e) {
            System.out.println("Error:" + e.getMessage());
            return false;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }

    @Override
    public void checkMenuStock() {
        System.out.println("-----------------------");
        for (MenuItem item : inventoryStock.keySet()) {
            int qty = inventoryStock.get(item);
            System.out.printf("%s - Quantity: %d\n", item.getName(), qty);
        }
    }

    // matches ArrayList with TreeMap object
    public MenuItem matchMenuItemName(String name) {
        for (MenuItem item : inventoryStock.keySet()) {
            if (item.getName().equalsIgnoreCase(name)) {
                return item;
            }
        }
        return null;
    }

    // when a customer orders the item
    public boolean consumeItem(MenuItem item, int quantity) {
        if (!inventoryStock.containsKey(item)) {
            System.out.println("Item: " + item.getName() + " not found in inventory");
            return false;
        }

        int currentStock = inventoryStock.get(item);
        if (currentStock < quantity) {
            System.out.println("Not enough " + item.getName() + " in stock. Available: " + currentStock
                    + ", Requested: " + quantity);
            return false;
        }

        inventoryStock.put(item, currentStock - quantity);
        System.out.println(
                "Consumed " + quantity + " of " + item.getName() + ". Remaining: " + (currentStock - quantity));

        this.itemName = item;
        this.quantity = currentStock - quantity;
        return true;

    }
}