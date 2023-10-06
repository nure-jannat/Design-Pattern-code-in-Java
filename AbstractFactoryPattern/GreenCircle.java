
package AbstractFactoryPattern;


public class GreenCircle implements AbstractFactory{

    @Override
    public Shape selectShape() {
        return new Circle();
    }

    @Override
    public Colour selectColour() {
    return new Green();
    }
}
