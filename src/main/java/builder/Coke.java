package builder;

/**
 * @fileName: Coke
 * @author: Cloud
 * @create: 2020-05-05
 * @description:
 **/
public class Coke extends ColdDrink {

    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
