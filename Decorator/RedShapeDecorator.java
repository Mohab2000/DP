package Decorator;

public class RedShapeDecorator extends ShapeDecorator{
    protected Shape decoratedShape; //mesh lazm tb2a mwgoda
    public RedShapeDecorator(Shape decoratedShape)
    {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        super.draw();
        this.setBorder(decoratedShape);
    }
    public void setBorder(Shape decoratedShape) {
        System.out.println("Border Color: Red");
    }
}
