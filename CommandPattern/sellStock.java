
package CommandPattern;


public class sellStock implements Order {
    Stock stock;
    sellStock(Stock stock){
        this.stock = stock;
    }
    @Override
    public void execute() {
        stock.sell();
    }
}
