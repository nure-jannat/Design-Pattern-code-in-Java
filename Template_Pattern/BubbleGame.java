
package Template_Pattern;


public class BubbleGame extends Template{
    @Override
    void start() {
        System.out.println("Start the game!");
    }

    @Override
    void end() {
       System.out.println("End the game!"); 
    }

    @Override
    void initialize() {
        System.out.println("Initializing the game 'Bubble Game'!");
    }
    
}
