
package SingletonPattern;


public class Mainj {
    public static void main(String[] args){
        //SingletonObject a = new SingletonObject();
        SingletonObject b = SingletonObject.getInstance();
        System.out.println(b);
    }
}
