package example;

import java.util.ArrayList;
public class Inventory<Item> extends ArrayList<Item> {

    public void addItemByID(int itemID) {
        for (example.Item i : Main.itemCollection) {
            if (i!=null) {
                if (i.ID == itemID) {
                    add((Item) i);
                }
            }
        }
    }
    public void removeItemByID(int itemID) {
        for (example.Item i : Main.itemCollection) {
            if (i!=null) {
                if (i.ID == itemID) {
                    remove((Item) i);
                }
            }
        }
    }

}