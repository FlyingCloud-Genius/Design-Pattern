package flywieght;

/**
 * @fileName: FlyweightPatternDemo
 * @author: Cloud
 * @create: 2020-05-28
 * @description:
 * 1. Used when need to create too many object in a short time. There will be a buffer needed for
 * the situation. It is mainly used to prevent from memory leak, also used like a cache to prevent from
 * creating too much object in a short time.
 * 2. The pattern shares a problem when it runs concurrently. Be careful with this. (Solve it with inside and outside status.)
 * 3. Need to be controlled with a factory.
 **/
public class FlyweightPatternDemo {

    private static final String colors[] =
            { "Red", "Green", "Blue", "White", "Black" };

    public static void main(String[] args) {

        for(int i=0; i < 20; ++i) {
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }

    private static String getRandomColor() {
        return colors[(int)(Math.random()*colors.length)];
    }

    private static int getRandomX() {
        return (int)(Math.random()*100 );
    }

    private static int getRandomY() {
        return (int)(Math.random()*100);
    }
}
