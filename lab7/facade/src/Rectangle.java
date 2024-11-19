/**
 * The Rectangle class implements the Shape interface to represent a rectangle.
 * This class provides functionality to draw a rectangle.
 * 
 * @author yashu
 */
public class Rectangle implements Shape {
    /**
     * Draws a rectangle and returns a confirmation message.
     *
     * @return A string indicating that a rectangle has been drawn.
     */
    public String draw(){
        System.out.println("Rectangle::draw()");
        return "Rectangle::draw()";
    }
}
