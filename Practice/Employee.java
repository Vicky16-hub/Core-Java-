package Practice;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    String name;
    int age;
    int id;
    String dept;
    double salary;

    public Employee(String name, int age, int id, String dept, double salary) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.dept = dept;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "name='" + name + '\'' + ", age=" + age + ", id=" + id +
                ", dept='" + dept + '\'' + ", salary=" + salary + '}';
    }


}