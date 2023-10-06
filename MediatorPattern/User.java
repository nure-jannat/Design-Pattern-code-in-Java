
package MediatorPattern;


public abstract class User {
   protected ChatMediator chatmediator;
   protected String name;
   User(ChatMediator chatmediator, String name){
       this.chatmediator = chatmediator;
       this.name = name;
   }
   public abstract void sendMsg(String msg);
   public abstract void receiveMsg(String msg);
}
