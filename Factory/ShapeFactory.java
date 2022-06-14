package Factory;

public class ShapeFactory {
    public static Shape getShape(String shapeName) {
        if (shapeName==null)
            return null;
        else if(shapeName.equalsIgnoreCase("Circle"))
            return new Circle();
        else if(shapeName.equalsIgnoreCase("Square"))
            return new Square();
        else if (shapeName.equalsIgnoreCase("Rectangle"))
                return new Rectangle();
        return null;
    }
}
