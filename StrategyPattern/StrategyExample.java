
package StrategyPattern;


public class StrategyExample {
    Strategy strategy;
    StrategyExample(Strategy strategy){
        this.strategy = strategy;
    }
    public int executeStrategy(int a, int b){
        return  strategy.calculate(a, b);    
    }
}
