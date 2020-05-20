package decorator;

/**
 * @fileName: ShapeDecorator
 * @author: Cloud
 * @create: 2020-05-20
 * @description:
 **/
public abstract class ShapeDecorator implements Shape {

    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
