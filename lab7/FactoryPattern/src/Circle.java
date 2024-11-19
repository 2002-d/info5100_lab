/**
 * The Circle class implements the Shape interface and provides functionality to draw a circle.
 * This is one of the concrete implementations of the Shape interface.
 * 
 * @author yashu
 */
public class Circle implements Shape {
    /**
     * Draws a circle and prints a message indicating the action.
     *
     * @return A string indicating that a circle has been drawn.
     */
    public String draw(){
        System.out.println("Inside Circle::draw() method.");
        return "Circle is drawn";
    }
}
