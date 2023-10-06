
package CommandPattern;


public class Stock {
    private String productName;
    private int quantity;
    
    Stock(String productName,int quantity ){
        this.productName = productName;
        this.quantity = quantity;
    }
    public void buy(){
        System.out.println("Product Name: "+productName);
        System.out.println("Quantity: "+ quantity);
    }
     public void sell(){
        System.out.println("Product Name: "+productName);
        System.out.println("Quantity: "+ quantity);
    }
    
}
