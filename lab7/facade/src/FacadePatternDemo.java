/**
 * The FacadePatternDemo class demonstrates the use of the Facade design pattern.
 * It uses the ShapeMaker class to interact with different shape objects without
 * needing to know their implementation details.
 * 
 * @author yashu
 */
public class FacadePatternDemo {
    /**
     * The main method is the entry point of the application.
     * It creates a ShapeMaker object and uses it to draw different shapes.
     * 
     */
    public static void main(String[] args) {
        ShapeMaker shapemaker = new ShapeMaker();
        shapemaker.drawCircle();
        shapemaker.drawRectangle();
        shapemaker.drawSquare();
    }
}
