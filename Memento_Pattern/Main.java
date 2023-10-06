
package Memento_Pattern;


public class Main {
    public static void main(String[] args){
        Originator or = new Originator();
        Caretaker ct = new Caretaker();
        
        or.setState("Don't");
        ct.addTo(or.saveSate());
        
        or.setState("Don't let");
        ct.addTo(or.saveSate());
        
        or.setState("Don't let me");
        ct.addTo(or.saveSate());
        
        or.setState("Don't let me go");
        System.out.println("Current State: "+ or.getState());
        
        or.getStateFromMemento(ct.get(2));
        System.out.println("First Saved State: "+ or.getState());
        
        or.getStateFromMemento(ct.get(1));
        System.out.println("Second Saved State: "+ or.getState());
        
         or.getStateFromMemento(ct.get(0));
        System.out.println("Second Saved State: "+ or.getState());
    }
    
}
