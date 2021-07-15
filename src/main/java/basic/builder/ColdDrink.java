package basic.builder;

/**
 * @fileName: ColdDrink
 * @author: Cloud
 * @create: 2020-05-05
 * @description:
 **/
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
