/**
 * The Rectangle class implements the Shape interface and provides functionality to draw a rectangle.
 * This is one of the concrete implementations of the Shape interface.
 * 
 * @author yashu
 */
public class Rectangle implements Shape {
    /**
     * Draws a rectangle and prints a message indicating the action.
     *
     * @return A string indicating that a rectangle has been drawn.
     */
    public String draw(){
        System.out.println("Inside Rectangle::draw() method.");
        return "Rectangle is drawn";
    }
}
