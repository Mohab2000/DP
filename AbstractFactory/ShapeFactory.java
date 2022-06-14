package AbstractFactory;

public class ShapeFactory extends AbstractFactory{
   public Shape getShape(String shapeType) {
       if (shapeType==null) return null;
       else if (shapeType.equalsIgnoreCase("Rectangle"))
           return new Rectangle();
       else if(shapeType.equalsIgnoreCase("Square"))
           return new Square();
       return null;
   }
}
