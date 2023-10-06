
package ChainOfResponsibility;


public abstract class AbstractLogger {
    public static int info = 1;
    public static int debug = 2;
    public static int error = 3;
    
    public int level;
    public AbstractLogger nextlogger;
    
    public void setNextLogger(AbstractLogger nextlogger){
        this.nextlogger = nextlogger;
    }
   public void logMsg(int level, String msg){
       if(this.level <= level){
           write(msg);
       }
       else if(nextlogger != null){
           nextlogger.logMsg(level, msg);
       }
   }
   public abstract void write(String msg);
}
