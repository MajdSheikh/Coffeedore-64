import java.util.ArrayList;

public class TestOrders {

    public static void main(String[] args) {

        CoffeeKiosk CoffeeKiosk = new CoffeeKiosk();
        
        CoffeeKiosk.addMenuItem("latte", 5.5);
        CoffeeKiosk.addMenuItem("drip coffee", 6.5);
        CoffeeKiosk.newOrder();
    }
}