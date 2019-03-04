package rocks.zipcode.assessment2.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Use a map to keep track of inventory in a store
 */
public class Inventory {
    List<String> inventory;
    /**
     * @param strings list of strings to add / remove / fetch from
     */

    public Inventory(List<String> strings) {
       this.inventory = strings;

    }

    /**
     * nullary constructor initializes a new list
     */
    public Inventory() {
        this.inventory = new ArrayList<>();

    }

    /**
     * @param item - increment the number of this item in stock by 1
     */
    public void addItemToInventory(String item) {
        inventory.add(item);
    }

    /**
     * @param item - decrement the number of this item in stock by 1
     */
    public void removeItemFromInventory(String item) {
        inventory.remove(item);
    }

    /**
     * @param item - Search for this item in stock
     * @return - return the number of items
     */
    public Integer getItemQuantity(String item) {
        Integer quantity = 0;

        for(int i = 0 ; i< inventory.size();i++) {
            if(inventory.get(i) == item) {
                quantity++;
            }

        } return quantity;
    }
}
