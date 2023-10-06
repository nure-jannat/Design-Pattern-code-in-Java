
package Template_Pattern;

public class Main {
    public static void main(String[] args){
        Template tem = new BubbleGame();
        tem.play();
        System.out.println();
        tem = new Temple_Run();
        tem.play();
    }
}
