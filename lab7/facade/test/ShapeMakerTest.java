
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Test class for the ShapeMaker class.
 * 
 * This class tests the functionality of the ShapeMaker class, ensuring that it
 * correctly delegates the drawing operations to the appropriate shape objects.
 * Each test validates the behavior of the drawCircle, drawRectangle, and drawSquare methods.
 * 
 * Test Methods:
 * - testDrawCircle: Verifies the correct behavior of the drawCircle method.
 * - testDrawRectangle: Verifies the correct behavior of the drawRectangle method.
 * - testDrawSquare: Verifies the correct behavior of the drawSquare method.
 * 
 * Assertions:
 * - Ensures that the correct string is returned for each shape drawing method.
 * - Validates that incorrect values are not returned by the methods.
 * 
 * @author yashu
 */
public class ShapeMakerTest {
    /**
     * Default constructor for ShapeMakerTest.
     * Initializes the test class.
     */
    public ShapeMakerTest() {
    }
    
    /**
     * Tests the drawCircle method of the ShapeMaker class.
     * Ensures that the method correctly draws a circle and returns the expected result.
     */
    @Test
    public void testDrawCircle() {
        System.out.println("drawCircle");
        ShapeMaker instance = new ShapeMaker();
        String expResult = "circle is drawn";
        String result = instance.drawCircle();
        
        // Verify the expected result
        assertEquals(expResult, result);
        
        // Additional assertions
        assertEquals("circle is drawn", instance.drawCircle());
        assertNotEquals("not circle", instance.drawCircle());
        assertNotEquals("Rectangle", instance.drawCircle());

    }

    /**
     * Tests the drawRectangle method of the ShapeMaker class.
     * Ensures that the method correctly draws a rectangle and returns the expected result.
     */
    @Test
    public void testDrawRectangle() {
        System.out.println("drawRectangle");
        ShapeMaker instance = new ShapeMaker();
        String expResult = "rectangle is drawn";
        String result = instance.drawRectangle();
        
        // Verify the expected result
        assertEquals(expResult, result);
        
        // Additional assertions
        assertEquals("rectangle is drawn", instance.drawRectangle());
        assertNotEquals("not rectangle", instance.drawRectangle());
        assertNotEquals("circle", instance.drawRectangle());
    }

    /**
     * Tests the drawSquare method of the ShapeMaker class.
     * Ensures that the method correctly draws a square and returns the expected result.
     */
    @Test
    public void testDrawSquare() {
        System.out.println("drawSquare");
        ShapeMaker instance = new ShapeMaker();
        String expResult = "square is drawn";
        String result = instance.drawSquare();
        
        // Verify the expected result
        assertEquals(expResult, result);
        
        // Additional assertions
        assertEquals("square is drawn", instance.drawSquare());
        assertNotEquals("not square", instance.drawSquare());
        assertNotEquals("circle", instance.drawSquare());
    
    }
    
}
