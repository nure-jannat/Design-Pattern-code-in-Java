
package ChainOfResponsibility;


public class ConsoleLogger extends AbstractLogger {
    public ConsoleLogger(int level){
        this.level = level;
    }


    @Override
    public void write(String msg) {
        System.out.println("Console Display: " + msg);
    }
}
