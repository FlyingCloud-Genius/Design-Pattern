package facade;

/**
 * @fileName: FacadePatternDemo
 * @author: Cloud
 * @create: 2020-05-25
 * @description:
 *  1. From my point of view, this is another way to implement a method like factory.
 *  They share some similarities. But the factory is about creating object, while the facade
 *  focus on using some specific method of an object.
 *  2. It reduces the reliability between system, increases safety and flexibility.
 *  3. Do not obey the open-closed principle. It is difficult to change, inherit and override.
 **/
public class FacadePatternDemo {

    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
