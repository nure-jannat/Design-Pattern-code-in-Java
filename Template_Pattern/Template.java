
package Template_Pattern;

public abstract class Template {
    abstract void start();
    abstract void end();
    abstract void initialize();
    public void play(){
        initialize();
        start();
        end();       
    }
}
