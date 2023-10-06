
package PrototypePattern;


public class Main {
    public static void main(String[] args){
        Enemy originalGoblin = new Goblin();
        Enemy cloneGoblin = originalGoblin.clone();
        originalGoblin.attack();
        cloneGoblin.attack();
        
        Enemy originalOrc = new Orc();
        Enemy cloneOrc = originalOrc.clone();
        originalOrc.attack();
        cloneOrc.attack();
        
    }
}
