/**
 * The ShapeMaker class is a facade that simplifies the interaction with different shapes.
 * It provides methods to draw circles, rectangles, and squares without exposing the details of individual shape implementations.
 * 
 * This class demonstrates the Facade design pattern.
 * 
 * Attributes:
 * - circle: Represents a Circle object.
 * - rectangle: Represents a Rectangle object.
 * - square: Represents a Square object.
 * 
 * These attributes are private to encapsulate the shape implementations and are instantiated
 * in the constructor to provide default behavior for drawing shapes.
 * 
 * @author yashu
 */
public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;
     /**
     * Constructs a ShapeMaker instance and initializes the shape objects.
     */
    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }
    /**
     * Draws a circle using the Circle object.
     *
     * @return A string indicating that a circle has been drawn.
     */
    public String drawCircle(){
        circle.draw();
        return "circle is drawn";
    }
    
    
    /**
     * Draws a rectangle using the Rectangle object.
     *
     * @return A string indicating that a rectangle has been drawn.
     */
    public String drawRectangle(){
        rectangle.draw();
        return "rectangle is drawn";
    }

    /**
     * Draws a square using the Square object.
     *
     * @return A string indicating that a square has been drawn.
     */
    public String drawSquare(){
        square.draw();
        return "square is drawn";
    }
}
