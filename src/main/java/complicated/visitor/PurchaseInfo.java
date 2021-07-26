package complicated.visitor;

import java.util.Map;

/**
 * @Author: Cloud Yang
 * @Mail: yangyunteng@meituan.com
 * @Date: 2021/7/19
 **/
public class PurchaseInfo extends Element<PurchaseInfo.Field> {

    public PurchaseInfo(int id) {
        super(id);
    }

    @Override
    public Map<Field, Object> query() {
        System.out.println("查询购买信息");
        return null;
    }

    protected enum Field implements complicated.visitor.Field {
        PRICE, PRODUCT, AMOUNT, USER, STATUS, TIME
    }
}
