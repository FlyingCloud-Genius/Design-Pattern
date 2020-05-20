package decorator;

/**
 * @fileName: Rectangle
 * @author: Cloud
 * @create: 2020-05-20
 * @description:
 **/
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Rectangle");
    }
}
