import java.util.ArrayList;

public class CoffeeKiosk{

    private ArrayList<Item> menu;
    private ArrayList<Order> orders;


    // Constructor - no params, initializes items and orders to empty arrays
    public CoffeeKiosk(){
        this.menu = new ArrayList<Item>();
        this.orders = new ArrayList<Order>();
    }

    // addMenuItem method
    public void addMenuItem(String name, double price) {
        Item item = new Item(name, price); 
        this.menu.add(item); // Add the new Item object to the menu items array
    }

     // displayMenu method
    public void displayMenu() {
        for(int i = 0; i < this.menu.size(); i++) {
            System.out.println(i + " " + this.menu.get(i).getName() + " -- " + this.menu.get(i).getPrice());
        }
    }

    // newOrder method
        public void newOrder() {
        
    	// Shows the user a message prompt and then sets their input to a variable, name
        System.out.println("Please enter customer name for new order:");
        String name = System.console().readLine();
    
    	// Your code:
        // Create a new order with the given input string
        // Show the user the menu, so they can choose items to add.
        Order order = new Order(name);
        this.displayMenu();


    	// Prompts the user to enter an item number
        System.out.println("Please enter a menu item index or q to quit:");
        String itemNumber = System.console().readLine();
        
        // Write a while loop to collect all user's order items
        while(!itemNumber.equals("q")) {
            
        // Get the item object from the menu, and add the item to the order
        // Ask them to enter a new item index or q again, and take their input
        order.addItem(this.menu.get(Integer.parseInt(itemNumber)));
        System.out.println("Please enter a menu item index or q to quit:");
        itemNumber = System.console().readLine();
        }
        // After you have collected their order, print the order details 
    	// as the example below. You may use the order's display method.
        order.display();
        
    }



}