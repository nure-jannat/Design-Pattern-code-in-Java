
package CommandPattern;

public class buyStock implements Order{

    Stock stock;
    buyStock(Stock stock){
        this.stock = stock;
    }
    @Override
    public void execute() {
        stock.buy();
    }
    
}
