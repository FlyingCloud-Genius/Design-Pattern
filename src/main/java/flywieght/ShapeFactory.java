package flywieght;

import java.util.HashMap;

/**
 * @fileName: ShapeFactory
 * @author: Cloud
 * @create: 2020-05-28
 * @description:
 **/
public class ShapeFactory {

    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) circleMap.get(color);

        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}
