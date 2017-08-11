package example;

public class Item extends Object {
    int ID;
    String name;
    int price;
    public Item (int itemID, String itemName, int itemPrice){
        ID = itemID;
        name = itemName;
        price = itemPrice;
    }
    public void changeID(int newID){
        ID = newID;
    }
    public void changeName (String newName){
        name = newName;
    }
    public void changePrice (int newPrice){
        price = newPrice;
    }
    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
