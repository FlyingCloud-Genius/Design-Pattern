package basic.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @fileName: Employee
 * @author: Cloud
 * @create: 2020-05-20
 * @description:
 **/
public class Employee {

    private String name;

    private String dept;

    private int salary;

    private List<Employee> subordinates;

    public Employee(String name, String dept, int sal) {
        this.name = name;
        this.salary = sal;
        this.dept = dept;
        subordinates = new ArrayList<>();
    }

    public void add(Employee e) {
        subordinates.add(e);
    }

    public void remove(Employee e) {
        subordinates.remove(e);
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                ", subordinates=" + subordinates +
                '}';
    }
}
