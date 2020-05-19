package bridge;

/**
 * @fileName: GreenCircle
 * @author: Cloud
 * @create: 2020-05-19
 * @description:
 **/
public class GreenCircle implements DrawAPI {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: " + radius +", x: " +x+", "+ y +"]");
    }
}
