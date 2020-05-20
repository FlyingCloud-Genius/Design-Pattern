package decorator;

/**
 * @fileName: RedShapeDecorator
 * @author: Cloud
 * @create: 2020-05-20
 * @description:
 **/
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape) {
        System.out.println("Red color");
    }
}
