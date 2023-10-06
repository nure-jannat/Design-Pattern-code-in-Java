
package StrategyPattern;


public class Main {
    public static void main(String[] args){
        StrategyExample st = new StrategyExample(new Addition());
        System.out.println("Addition = "+st.executeStrategy(25, 96));
        
        StrategyExample st2 = new StrategyExample(new Subtraction());
        System.out.println("Subtraction = "+st2.executeStrategy(121, 96));
        
        StrategyExample st3 = new StrategyExample(new Multiplication());
        System.out.println("Multiplication = "+st3.executeStrategy(25, 4));
    }
}
