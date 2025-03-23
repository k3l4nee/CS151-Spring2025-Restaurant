import java.util.List;
import java.util.ArrayList;

public class Menu {
    private String categories;
    private List<MenuItem> menu;

    public Menu() {
        menu = new ArrayList<>();
    }

    public List<MenuItem> getMenu() {
        return menu;
    }

    public void addToMenu(MenuItem item) {
        menu.add(item);
    }

    // when an item from the menu is unavailable
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
}