package builder;

/**
 * @fileName: ChickenBurger
 * @author: Cloud
 * @create: 2020-05-05
 * @description:
 **/
public class ChickenBurger extends Burger {

    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
