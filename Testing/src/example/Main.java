package example;

public class Main {

    public static ItemCollection<Item> itemCollection;

    public static void main(String[] args) {

        itemCollection = new ItemCollection<Item>();
        int defaultValue = 50;
        Item boot = new Item(0, "Boot", defaultValue);
        Item sword = new Item(1, "Sword", defaultValue);
        Item ring = new Item(2, "Ring", defaultValue);
        Item dagger = new Item(3, "Dagger", defaultValue);
        Item bow = new Item(4, "Bow", defaultValue);

        itemCollection.add(boot); itemCollection.add(sword);
        itemCollection.add(ring); itemCollection.add(dagger);
        itemCollection.add(bow);

        Inventory<Item> myInventory = new Inventory<Item>();
        myInventory.addItemByID(3); // Add a Dagger.
        myInventory.addItemByID(4); // Add a Bow.
        System.out.println(myInventory.get(0).name); // Print the Dagger Item name.
        myInventory.removeItemByID(3);
        System.out.println(myInventory.get(0).name); // Print the Bow Item name.
    }

}