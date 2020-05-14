package prototype;

/**
 * @fileName: Circle
 * @author: Cloud
 * @create: 2020-05-14
 * @description:
 **/
public class Circle extends Shape {

    public Circle() {
        type = "Circle";
    }
    @Override
    void draw() {
        System.out.println("Circle's drawing");
    }
}
