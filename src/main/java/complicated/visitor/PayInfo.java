package complicated.visitor;

import java.util.Map;

/**
 * @Author: Cloud Yang
 * @Mail: yangyunteng@meituan.com
 * @Date: 2021/7/19
 **/
public class PayInfo extends Element<PayInfo.Field> {

    public PayInfo(int id) {
        super(id);
    }

    @Override
    public Map<PayInfo.Field, Object> query() {
        System.out.println("履约支付信息");
        return null;
    }

    protected enum Field implements complicated.visitor.Field {
        AMOUNT, TYPE, OFFER, VALUE
    }
}
