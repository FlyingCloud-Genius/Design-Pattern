package basic.command;

/**
 * @fileName: BuyStock
 * @author: Cloud
 * @create: 2020-05-31
 * @description:
 **/
public class BuyStock implements Order{

    private Stock abcStock;

    public BuyStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.buy();
    }
}
