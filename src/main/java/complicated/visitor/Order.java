package complicated.visitor;

/**
 * @Author: Cloud Yang
 * @Mail: yangyunteng@meituan.com
 * @Date: 2021/7/19
 **/
public class Order {

    protected int fakeOrderId = 1;

    protected int fakePurchaseId = 2;

    protected int fakeRefundId = 3;

    protected int fakeContractId = 4;

    protected int fakePayId = 5;

    protected Element<PurchaseInfo.Field> purchaseElement;

    protected Element<RefundInfo.Field> refundElement;

    protected Element<ContractInfo.Field> contractElement;

    protected Element<PayInfo.Field> payElement;

    public static class OrderRepository {
        public static Order query(int id) {
            Order order = new Order();
            order.purchaseElement = new PurchaseInfo(order.fakePurchaseId);
            order.refundElement = new RefundInfo(order.fakeRefundId);
            order.contractElement = new ContractInfo(order.fakeContractId);
            order.payElement = new PayInfo(order.fakePayId);
            return order;
        }
    }
}
