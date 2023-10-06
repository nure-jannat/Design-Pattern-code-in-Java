
package Visitor_Pattern;


public class Customer_B implements Shopping {

    @Override
    public void discount() {
         System.out.println("12% to 15% discount is available for you");
    }
}
