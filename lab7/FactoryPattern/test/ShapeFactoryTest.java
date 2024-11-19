

import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Test class for the ShapeFactory class.
 * 
 * This class validates the functionality of the ShapeFactory class, ensuring that it correctly
 * creates instances of different shapes (Circle, Rectangle, Square) based on the provided shape type.
 * 
 * Test Methods:
 * - testCreateCircle: Verifies that the factory creates a Circle object when requested.
 * - testCreateRectangle: Verifies that the factory creates a Rectangle object when requested.
 * - testCreateSquare: Verifies that the factory creates a Square object when requested.
 * 
 * Assertions:
 * - Ensures that the factory returns the expected class type for each shape.
 * - Ensures that the returned shape is not of an incorrect type.
 * 
 * @author yashu
 */
public class ShapeFactoryTest {
   
   /**
     * Tests the creation of a Circle object by the ShapeFactory.
     * 
     * Validates that:
     * - The factory returns an instance of the Circle class when "CIRCLE" is passed as the shape type.
     * - The returned object is not of an incorrect type (e.g., Square).
     */
   @Test
   public void testCreateCircle() {
       System.out.println("createCircle");
       ShapeFactory shapeFactory = new ShapeFactory();
       Class expectedClass = Circle.class;
       // Create a Circle object using the factory
       Shape circle = shapeFactory.getShape("CIRCLE");
       Class actualClass = circle.getClass();
        
        // Assertions
        assertNotEquals("Shape should not be square", Square.class, actualClass);
        assertEquals("Expected Circle class but got different shape", expectedClass, actualClass);
   }
   /**
     * Tests the creation of a Rectangle object by the ShapeFactory.
     * 
     * Validates that:
     * - The factory returns an instance of the Rectangle class when "RECTANGLE" is passed as the shape type.
     * - The returned object is not of an incorrect type (e.g., Circle).
     */
   @Test
   public void testCreateRectangle() {
       System.out.println("createRectangle");
       ShapeFactory shapeFactory = new ShapeFactory();
       Class expectedClass = Rectangle.class;
       
       // Create a Rectangle object using the factory
       Shape rectangle = shapeFactory.getShape("RECTANGLE");
       Class actualClass = rectangle.getClass();
        
        // Assertions
        assertNotEquals("Shape should not be Circle", Circle.class, actualClass);
        assertEquals("Expected Rectangle class but got different shape", expectedClass, actualClass);
   }
   /**
     * Tests the creation of a Square object by the ShapeFactory.
     * 
     * Validates that:
     * - The factory returns an instance of the Square class when "SQUARE" is passed as the shape type.
     * - The returned object is not of an incorrect type (e.g., Circle).
     */
   @Test 
   public void testCreateSquare() {       
       System.out.println("createSquare");
       Class expectedClass = Square.class;
       ShapeFactory shapeFactory = new ShapeFactory();
       
       // Create a Square object using the factory
       Shape square = shapeFactory.getShape("SQUARE");
       Class actualClass = square.getClass();
        
        // Assertions
        assertNotEquals("Shape should not be Circle", Circle.class, actualClass);
        assertEquals("Expected Square class but got different shape", expectedClass, actualClass);
   }
   
 
}