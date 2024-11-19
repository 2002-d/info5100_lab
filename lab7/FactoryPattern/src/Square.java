/**
 * The Square class implements the Shape interface and provides functionality to draw a square.
 * This is one of the concrete implementations of the Shape interface.
 * 
 * @author yashu
 */
public class Square implements Shape {
    /**
     * Draws a square and prints a message indicating the action.
     *
     * @return A string indicating that a square has been drawn.
     */
    public String draw(){
        System.out.println("Inside Square::draw() method.");
        return "Square is drawn";
    }
}
