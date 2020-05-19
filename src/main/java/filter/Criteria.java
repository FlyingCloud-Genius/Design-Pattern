package filter;

import java.util.List;

/**
 * @fileName: Criteria
 * @author: Cloud
 * @create: 2020-05-19
 * @description:
 **/
public interface Criteria {

    public List<Person> meetCriteria(List<Person> persons);
}
