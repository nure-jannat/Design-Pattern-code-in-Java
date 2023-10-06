
package Observer_Pattern;


public class OctaObserver extends Observer {
    OctaObserver(Subject subject){
      this.subject = subject;
      this.subject.attach(this);
   }

   @Override
   public void update() {
      System.out.println( "Octal String: " + Integer.toOctalString(subject.getState() ) ); 
   }
}
