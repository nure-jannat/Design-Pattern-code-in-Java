
package MediatorPattern;


public interface ChatMediator {
    void sendMsg(String msg, User user);
    void addUser(User user);
}
