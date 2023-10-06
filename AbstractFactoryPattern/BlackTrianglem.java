
package AbstractFactoryPattern;


public class BlackTrianglem implements AbstractFactory {

    @Override
    public Shape selectShape() {
        return new Triangle();
    }

    @Override
    public Colour selectColour() {
     return new Black();   
    }
    
}
