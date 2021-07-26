package complicated.visitor;

import java.util.List;
import java.util.Map;

/**
 * @Author: Cloud Yang
 * @Mail: yangyunteng@meituan.com
 * @Date: 2021/7/19
 **/
public abstract class Element<T extends Field> {

    protected final int id;

    protected List<T> queryFields;

    Element(int id) {
        this.id = id;
    }

    public void setQueryFields(List<T> queryFields) {
        this.queryFields = queryFields;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
        if (queryFields == null || queryFields.isEmpty()) {
            System.out.println(this.getClass().getName() + "无查询需求，不执行操作");
            return;
        }
        System.out.println("查询字段列表：");
        queryFields.forEach(item -> System.out.println(item.getClass().getName() + ";"));
        System.out.println();
    }

    public abstract Map<T, Object> query();
}
