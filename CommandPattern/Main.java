
package CommandPattern;


public class Main {
    public static void main(String[] args){
        Stock st1 = new Stock("Kurti", 14);
        Stock st2 = new Stock("Kurti", 4);
        
        buyStock bs = new buyStock(st1);
        sellStock ss = new sellStock(st2);
        
        Salesman sal1 = new Salesman();
        sal1.takeOder(bs);
        sal1.takeOder(ss);
        sal1.placeOrder();
    }
}
