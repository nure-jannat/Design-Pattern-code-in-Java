
package PrototypePattern;


public interface Enemy extends Cloneable{
    Enemy clone();
    void attack();
}
