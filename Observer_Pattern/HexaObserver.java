
package Observer_Pattern;


public class HexaObserver extends Observer{
    public HexaObserver(Subject subject){
      this.subject = subject;
      this.subject.attach(this);
   }

   @Override
   public void update() {
      System.out.println( "Hexadecimal String: " + Integer.toHexString(subject.getState() ) ); 
   }
}
