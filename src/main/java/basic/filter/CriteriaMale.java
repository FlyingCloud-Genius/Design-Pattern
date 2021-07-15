package basic.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @fileName: CriteriaMale
 * @author: Cloud
 * @create: 2020-05-19
 * @description:
 **/
public class CriteriaMale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("male")) {
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
