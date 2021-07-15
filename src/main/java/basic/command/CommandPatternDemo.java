package basic.command;

/**
 * @fileName: CommandPatternDemo
 * @author: Cloud
 * @create: 2020-05-31
 * @description:
 * 1. Easy to add basic.command to new system.
 * 2. Reduce coupling in the system.
 * 3. Lead to too many basic.command line class in the system.
 * 4. In GUI, every button is a single basic.command.
 * 5. Imitating the CMD.
 **/
public class CommandPatternDemo {

    public static void main(String[] args) {
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}
