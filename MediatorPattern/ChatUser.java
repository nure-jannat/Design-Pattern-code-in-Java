
package MediatorPattern;


public class ChatUser extends User{

    public ChatUser(ChatMediator chatmediator, String name) {
        super(chatmediator, name);
    }

    @Override
    public void sendMsg(String msg) {
        System.out.println(name+" Sends: "+ msg);
        chatmediator.sendMsg(msg, this);
        }

    @Override
    public void receiveMsg(String msg) {
        System.out.println(name+" recieves: "+ msg);
    }
    
}
