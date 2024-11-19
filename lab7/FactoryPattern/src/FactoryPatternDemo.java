/**
 * The FactoryPatternDemo class demonstrates the use of the Factory design pattern.
 * It uses the ShapeFactory to create objects of different shapes and invoke their draw methods.
 * 
 * This is the client code that depends on the ShapeFactory to abstract away the creation of specific shape objects.
 * 
 * @author yashu
 */
public class FactoryPatternDemo {
    /**
     * The main method serves as the entry point of the application.
     * It demonstrates the creation and usage of different shapes through the ShapeFactory.
     *
     * @param args Command-line arguments (not used in this application).
     */
        public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        // Get an instance of Circle and draw it
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();
        
        // Get an instance of Rectangle and draw it
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();
        
        // Get an instance of Square and draw it        
        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();
        
        }
}