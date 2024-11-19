

import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Test class for the SingleObject class.
 * 
 * This class validates the behavior of the Singleton design pattern implementation
 * in the SingleObject class, ensuring that:
 * - Only one instance of the class is created.
 * - The showMessage() method returns the correct output.
 * 
 * Test Methods:
 * - testShowMessage: Validates the functionality of the showMessage() method.
 * 
 * Assertions:
 * - Ensures that the showMessage() method returns the expected string.
 * 
 * @author yashu
 */
public class SingleObjectTest {
    /**
     * Default constructor for SingleObjectTest.
     */
    public SingleObjectTest() {
    }
    
    /**
     * Tests the showMessage() method of the SingleObject class.
     * 
     * Validates that the method correctly displays and returns the message "hello world".
     */
    @Test
    public void testShowMessage() {
        System.out.println("showMessage");
        
        // Access the single instance of SingleObject
        SingleObject instance = SingleObject.getInstance();
        
        // Expected output
        String expectedOutput = "hello world";
        String actualOutput = instance.showMessage();
        
        // Assert the results
        assertEquals(expectedOutput, actualOutput);
        assertEquals("hello world", instance.showMessage());
    }
    
}
