
package ChainOfResponsibility;




public class Main {
    private static AbstractLogger loggerChaining(){
        AbstractLogger errorlog = new ErrorLogger( AbstractLogger.error);
        AbstractLogger consolelog = new  ConsoleLogger(AbstractLogger.debug); 
        AbstractLogger filelog = new FileLogger(AbstractLogger.info);
        
        errorlog.setNextLogger(consolelog);
        consolelog.setNextLogger(filelog);
        return errorlog;
    }
    public static void main(String[] args){
        AbstractLogger ablog = loggerChaining();
        
        ablog.logMsg(AbstractLogger.info, "There is an information");
        ablog.logMsg(AbstractLogger.debug, "There is debug in the information");
        ablog.logMsg(AbstractLogger.error, "There is an error");
    }
}
