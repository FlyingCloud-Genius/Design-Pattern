package basic.bridge;

/**
 * @fileName: RedCircle
 * @author: Cloud
 * @create: 2020-05-19
 * @description:
 **/
public class RedCircle implements DrawAPI {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: " + radius +", x: " +x+", "+ y +"]");
    }
}
