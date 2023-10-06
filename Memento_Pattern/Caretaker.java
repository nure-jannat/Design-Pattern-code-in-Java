
package Memento_Pattern;

import java.util.ArrayList;


public class Caretaker {
    ArrayList<Memento> memList = new  ArrayList<Memento>();
    public void addTo(Memento state){
        memList.add(state);
    }
    public Memento get(int index){
        return memList.get(index);
    }
}
