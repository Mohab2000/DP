package Decorator;

public abstract class ShapeDecorator extends Shape{
    protected Shape decoratedShape; //lazm yb2a protected
    public ShapeDecorator(Shape decoratedShape)
    {
        this.decoratedShape=decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
