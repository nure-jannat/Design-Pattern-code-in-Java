
package Memento_Pattern;


public class Originator {
    private String state;
    public void setState(String state){
        this.state = state;
    }
    public String getState(){
        return state;
    }
    public Memento saveSate(){
        return new Memento(state);
    }
    public void getStateFromMemento(Memento memento){
        state = memento.getState();
    }
}
