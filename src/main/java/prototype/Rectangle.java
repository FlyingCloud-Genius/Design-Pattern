package prototype;

/**
 * @fileName: Rectangle
 * @author: Cloud
 * @create: 2020-05-14
 * @description:
 **/
public class Rectangle extends Shape {

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("rectangle's drawing");
    }
}
