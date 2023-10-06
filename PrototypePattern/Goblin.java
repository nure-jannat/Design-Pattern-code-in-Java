
package PrototypePattern;


public class Goblin implements Enemy{

    @Override
    public Enemy clone() {
        return new Goblin();
    }

    @Override
    public void attack() {
       System.out.println("Goblin attack with smoke bombs!");
    }
    
}
