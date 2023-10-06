
package MediatorPattern;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator {
    private List<User> users = new ArrayList<User>();
    @Override
    public void sendMsg(String msg, User user) {
        for(User u: users){
            if(u != user) u.receiveMsg(msg);
        }
         }

    @Override
    public void addUser(User user) {
        users.add(user);
          }
    
    
}
