package RetoArrayList;
import java.util.ArrayList;

public class Inventory {
    private final ArrayList<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        // Aquí tu código
        items.add(item);
    }

    public boolean removeItem(String itemName) {
        // Aquí tu código
        for (var item : items) {
            if (item.getName().equals(itemName)) {
                return items.remove(item);
            }
        }
        return false;
    }

    public Item findItem(String itemName) {
        // Aquí tu código

        for (var item : items) {
            if (item.getName().equals(itemName)) {
                return item;
            }
        }

        return null;
    }


    public double getTotalWeight() {
        // Aquí tu código
        // sustituye esto por el valor real
        double totalSum = 0;

        for (var item : items) {
            totalSum += item.getWeight() ;
        }
        return totalSum;
    }

    // Este getter no es necesario modificarlo
    public ArrayList<Item> getItems() {
        return items;
    }
}
