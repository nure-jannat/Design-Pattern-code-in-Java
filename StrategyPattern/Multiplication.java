
package StrategyPattern;


public class Multiplication implements Strategy {
    @Override
    public int calculate(int a, int b) {
       return a*b;
    }
    
}
