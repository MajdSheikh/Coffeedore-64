import java.util.ArrayList;

public class Item {
    
    private String name;
    private double price;

    // new Item
    public Item() {

    }
    
    // new Item that has the two arguments (constructor)
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

     // getter for name
    public String getName() {
        return name;
    }

    // setter for name
    public void setName(String name) {
        this.name = name;
    }
    // getter for price
    public double getPrice() {
        return price;
    }

    // setter for price
    public void setPrice(double price) {
        this.price = price;
    }

    // public int getIndex() {
    //     return index;
    // }
    // public void setIndex(int index) {
    //     this.index = index;
    // }

}




