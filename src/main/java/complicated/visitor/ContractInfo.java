package complicated.visitor;

import java.util.Map;

/**
 * @Author: Cloud Yang
 * @Mail: yangyunteng@meituan.com
 * @Date: 2021/7/19
 **/
public class ContractInfo extends Element<ContractInfo.Field> {

    public ContractInfo(int id) {
        super(id);
    }

    @Override
    public Map<Field, Object> query() {
        System.out.println("履约购买信息");
        return null;
    }

    public enum Field implements complicated.visitor.Field {
        DATE, AMOUNT, STATUS, CUSTOMER
    }
}
