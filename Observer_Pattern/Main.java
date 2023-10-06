
package Observer_Pattern;


public class Main {
    public static void main(String[] args){
        Subject sub = new Subject();
        
        new BinaryObserver(sub);
        new OctaObserver(sub);
        new HexaObserver(sub);
        System.out.println("First state Change: 15 ");
        sub.setState(15);
        
        System.out.println("2nd state Change: 10 ");
        sub.setState(10);
    }
}
