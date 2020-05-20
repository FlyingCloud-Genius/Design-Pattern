package decorator;

/**
 * @fileName: DecoratorPatternDemo
 * @author: Cloud
 * @create: 2020-05-20
 * @description:
 * 1. the decorator and the decorated can develop independently. they will not couple with
 * each other. it can decorate the class dynamicly.
 * 2. if there exists multi-layer of decorators, it will be complicated.
 * 3. it is good to use decorator to decrease the number of sub-class.(with different functions)
 **/
public class DecoratorPatternDemo {

    public static void main(String[] args) {

        Shape circle = new Circle();
        ShapeDecorator redCircle = new RedShapeDecorator(new Circle());
        ShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());
        //Shape redCircle = new RedShapeDecorator(new Circle());
        //Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
