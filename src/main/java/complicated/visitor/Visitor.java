package complicated.visitor;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @Author: Cloud Yang
 * @Mail: yangyunteng@meituan.com
 * @Date: 2021/7/19
 **/
public class Visitor<E extends Element, T> {

    protected final List<Field> fields = new ArrayList<>();

    protected final T target; //这种做法会导致累严重膨胀，这里仅为示意

    public Visitor(T target){
        this.target = target;
    }

    public void addField(Field field) {
        this.fields.add(field);
    }

    public void visit(E element) {
        if (fields.isEmpty()) {
            return;
        }
        element.setQueryFields(this.fields);
        Map<Field, Object> resultMap = element.query();
        backFillResult(resultMap, target);
    }

    public void backFillResult(Map<Field, Object> resultMap, T target) {
        System.out.println("字段回填");
    }
}
