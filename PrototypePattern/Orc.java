
package PrototypePattern;


public class Orc implements Enemy{

    @Override
    public Enemy clone() {
          return new Orc();
    }

    @Override
    public void attack() {
        System.out.println("Orc attack with sword!");
    }
    
}
