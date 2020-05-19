package bridge;

/**
 * @fileName: BridgePatternDemo
 * @author: Cloud
 * @create: 2020-05-19
 * @description:
 * 1. division of implementation and abstraction
 * 2. easy to extend
 * 3. implementation is visible for client
 * 4. hard to design, have to implement via abstraction
 * 5. prevent from multilayer inheritance (leads to too many classes)
 * 6. one class exist different extensions
 **/
public class BridgePatternDemo {

    public static void main(String[] args) {
        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
