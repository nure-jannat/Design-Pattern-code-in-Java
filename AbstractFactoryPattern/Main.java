
package AbstractFactoryPattern;


public class Main {
    public static void main(String[] args){
        AbstractFactory abf1 = new GreenCircle();
        Shape shape1 = abf1.selectShape();
        Colour col1 =   abf1.selectColour();
        shape1.draw();
        col1.fillShape();
        
        AbstractFactory abf2 = new BlackTrianglem();
        Shape shape2 = abf2.selectShape();;
        Colour col2 =   abf2.selectColour();
        shape2.draw();
        col2.fillShape();
        
    }
}
