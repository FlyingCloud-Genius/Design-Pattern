package filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @fileName: CriteriaSingle
 * @author: Cloud
 * @create: 2020-05-19
 * @description:
 **/
public class CriteriaSingle implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if (person.getMaritalStatus().equalsIgnoreCase("SINGLE")) {
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
