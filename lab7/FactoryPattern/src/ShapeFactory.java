/**
 * The ShapeFactory class is a factory class that provides objects of concrete classes
 * implementing the Shape interface. This class demonstrates the Factory design pattern.
 * 
 * Attributes:
 * - None
 * 
 * Methods:
 * - getShape(String shapeType): Returns an instance of the requested shape type.
 * 
 * The factory pattern is used here to encapsulate the creation logic for different shapes,
 * simplifying client code.
 * 
 * @author yashu
 */
public class ShapeFactory {
    /**
     * Returns an object of the requested shape type.
     * 
     * @param shapeType The type of shape to create. Supported values are "CIRCLE", "RECTANGLE", and "SQUARE".
     *                  The parameter is case-insensitive.
     * @return An instance of the requested shape type, or null if the shape type is not recognized.
     */
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
           
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();

        }
        return null;
    }
}