package basic.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @fileName: CriteriaFemale
 * @author: Cloud
 * @create: 2020-05-19
 * @description:
 **/
public class CriteriaFemale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<>();
        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("female")) {
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
