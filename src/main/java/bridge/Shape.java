package bridge;

/**
 * @fileName: Shape
 * @author: Cloud
 * @create: 2020-05-19
 * @description:
 **/
public abstract class Shape {

    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
