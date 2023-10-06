
package Observer_Pattern;

import java.util.ArrayList;


public class Subject {
    private ArrayList<Observer> ob = new ArrayList<Observer>();
    private int state;
    
    public void setState(int state){
        this.state = state;
        nottifyAllObserver();
    }
    
    public int getState(){
        return state;
    }
    
    public void nottifyAllObserver(){
        for(Observer observer: ob){
            observer.update();
        }
    }
    
    public void attach(Observer observer){
        ob.add(observer);
    }
}
