package RetoArrayList;
import java.util.ArrayList;

public class Inventory {
    private final ArrayList<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public boolean removeItem(String itemName) {

        for (var item : items) {
            if (item.getName().equals(itemName)) {
                return items.remove(item);
            }
        }
        return false;
    }

    public Item findItem(String itemName) {

        for (var item : items) {
            if (item.getName().equals(itemName)) {
                return item;
            }
        }

        return null;
    }


    public double getTotalWeight() {

        double totalSum = 0;

        for (var item : items) {
            totalSum += item.getWeight() ;
        }
        return totalSum;
    }


    public ArrayList<Item> getItems() {
        return items;
    }
}
