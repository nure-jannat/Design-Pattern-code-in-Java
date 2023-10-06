
package MediatorPattern;


public class Main {
    public static void main(String[] args){
        ChatMediator mediator = new ChatMediatorImpl();
        User user1 = new ChatUser(mediator, "User1");
        User user2 = new ChatUser(mediator, "User2");
        User user3 = new ChatUser(mediator, "User3");
        
        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        
        user1.sendMsg("Hello World!");
        user2.sendMsg("It's a rainy day!");
        
    }
}
