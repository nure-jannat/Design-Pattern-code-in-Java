
package CommandPattern;

import java.util.ArrayList;


public class Salesman {
    ArrayList<Order> od = new ArrayList<Order>();
    public void takeOder(Order order){
        od.add(order);
    }
    
    public void placeOrder(){
        for(Order order: od){
            order.execute();
        }
        od.clear();
    }
}
