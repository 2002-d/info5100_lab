/**
 * The SingletonPatternDemo class demonstrates the use of the SingleObject class.
 * 
 * This class accesses the single instance of SingleObject using the getInstance() method
 * and calls its showMessage() method to display a message.
 * 
 * @author yashu
 */
public class SingletonPatternDemo {
    /**
     * The main method serves as the entry point of the application.
     * It demonstrates the Singleton design pattern by accessing and using the single
     * instance of the SingleObject class.
     */
    public static void main(String[] args) {
        
        // Access the single instance of SingleObject
        SingleObject object = SingleObject.getInstance();
        
        // Display the message
        object.showMessage();
    }
}
