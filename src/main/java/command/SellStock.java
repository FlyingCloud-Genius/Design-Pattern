package command;

/**
 * @fileName: SellStock
 * @author: Cloud
 * @create: 2020-05-31
 * @description:
 **/
public class SellStock implements Order {

    private Stock abcStock;

    public SellStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.sell();
    }
}
