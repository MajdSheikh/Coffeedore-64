import java.util.ArrayList;

public class Order{
    private String name;
    // private double total;
    private boolean ready;
    private ArrayList<Item> items;

    // a constructor that takes no arguments, and initializes the items array to an empty ArrayList<Item>
    public Order(){
        this.name = "Guest";
        this.items = new ArrayList<Item>();
    }

    // overloaded constructor for Order that takes String name as an argument
    public Order(String name) {
        this.name = name;
        this.items = new ArrayList<Item>();
    }

     // getter for name
    public String getName() {
        return this.name;
    }

    // getter for ready
    public boolean isReady() {
        return this.ready;
    }

    // getter for items
    public ArrayList<Item> getItems() {
        return this.items;
    }

    // setter for name 
    public void setName(String name) {
        this.name = name;
    }

    // setter for ready 
    public void setReady(boolean ready) {
        this.ready = ready;
    }

    // a method called addItem  that takes an Item object as an argument and adds the item to the order's items array
    public void addItem(Item item) {
        this.items.add(item);
    }

    //a method called getStatusMessage that returns a String message 
    public String getStatusMessage() {
        if (this.ready == true){
            return "Your order is ready.";
        }
        else {
            return "Thank you for waiting. Your order will be ready soon.";
        }
    }


    //  a method called display
    public void display () {
        System.out.println("Customer name: " +this.name);
        for (int i = 0; i < this.items.size(); i++) {
            System.out.println(this.items.get(i).getName() + " _ "  + this.items.get(i).getPrice()); 
            System.out.println("total:" + " - "  + "$ " + this.getOrderTotal());
                
            }
    }


    // a method called getOrderTotal that sums together each of the item's prices, and returns the total amount. 
    public double getOrderTotal(){
        double total = 0.0;
        for (int i = 0; i < this.items.size(); i++) {
            total += this.items.get(i).getPrice();
        }
        return total;
    }

}