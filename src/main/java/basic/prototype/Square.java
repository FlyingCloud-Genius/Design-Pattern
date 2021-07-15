package basic.prototype;

/**
 * @fileName: Square
 * @author: Cloud
 * @create: 2020-05-14
 * @description:
 **/
public class Square extends Shape {

    public Square(){
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Square's drawing");
    }
}
