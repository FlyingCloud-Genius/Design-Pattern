package builder;

/**
 * @fileName: Pepsi
 * @author: Cloud
 * @create: 2020-05-05
 * @description:
 **/
public class Pepsi extends ColdDrink {

    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
