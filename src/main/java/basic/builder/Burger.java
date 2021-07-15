package basic.builder;

/**
 * @fileName: Burger
 * @author: Cloud
 * @create: 2020-05-05
 * @description:
 **/
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
