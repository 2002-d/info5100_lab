/**
 * The Square class implements the Shape interface to represent a square.
 * This class provides functionality to draw a square.
 * 
 * @author yashu
 */
public class Square implements Shape {
    /**
     * Draws a square and returns a confirmation message.
     *
     * @return A string indicating that a square has been drawn.
     */
    public String draw(){
        System.out.println("Square::draw()");
        return "Square::draw()";
    }
}
