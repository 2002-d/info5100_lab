/**
 * The SingleObject class demonstrates the Singleton design pattern.
 * 
 * Attributes:
 * - instance: A private static instance of the SingleObject class.
 * 
 * Methods:
 * - getInstance(): Provides access to the single instance of this class.
 * - showMessage(): Displays and returns a predefined message.
 * 
 * Singleton Design Pattern:
 * - The private constructor prevents instantiation from other classes.
 * - The static method getInstance() ensures that only one instance exists.
 * 
 * @author yashu
 */
public class SingleObject {
    /**
     * The single instance of the SingleObject class.
     */
    private static SingleObject instance = new SingleObject();
    /**
     * Private constructor to prevent instantiation from other classes.
     */
    private SingleObject(){}
    /**
     * Returns the single instance of the SingleObject class.
     * 
     * @return The singleton instance of SingleObject.
     */
    public static SingleObject getInstance(){
        return instance;
    }
    /**
     * Displays and returns a predefined message.
     * 
     * @return A string containing the message "hello world".
     */
    public String showMessage(){
        System.out.print("hello world");
        return "hello world";
    }
}
