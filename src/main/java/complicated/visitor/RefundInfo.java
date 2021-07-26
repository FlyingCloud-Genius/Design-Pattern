package complicated.visitor;

import java.util.Map;

/**
 * @Author: Cloud Yang
 * @Mail: yangyunteng@meituan.com
 * @Date: 2021/7/19
 **/
public class RefundInfo extends Element<RefundInfo.Field>{

    public RefundInfo(int id) {
        super(id);
    }

    @Override
    public Map<Field, Object> query() {
        System.out.println("查询退款信息");
        return null;
    }

    protected enum Field implements complicated.visitor.Field {
        COMMISION, STATUS, TIME, USER, FEE
    }
}
