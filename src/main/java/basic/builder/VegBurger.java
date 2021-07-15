package basic.builder;

/**
 * @fileName: VegBurger
 * @author: Cloud
 * @create: 2020-05-05
 * @description:
 **/
public class VegBurger extends Burger {

    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
