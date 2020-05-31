package command;

import java.util.ArrayList;
import java.util.List;

/**
 * @fileName: Broker
 * @author: Cloud
 * @create: 2020-05-31
 * @description:
 **/
public class Broker {

    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
