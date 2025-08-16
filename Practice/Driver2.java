package Practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Driver2 {
        public static void main(String[] args) {
            List<Employee> a = new ArrayList<>();
            a.add(new Employee("John",25,12,"devoleper",50000));
            a.add(new Employee("Mark",24,121,"testing",20000));
            a.add(new Employee("King",29,139, "devops",40000));
            a.add(new Employee("Alan",34,14,"sales",15000));
            a.add(new Employee("Smith",31,49,"testing",21000));

            // CREATION OF LIST(converted from arrayList)

            List<Employee> l = a.stream().toList();
            System.out.println(l);

            //FILTER(filtering those who have the salary above 200000)

            List<Employee> l1 = a.stream().filter((x)->x.salary>20000).toList();
            System.out.println(l1);

            System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

            //MAP(salary to be doubled)

            List<Double> l2 = a.stream().map((x)->x.salary=x.salary*2).toList();
            System.out.println(l2);

            System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

            //SORT(sorting employees based on the id)

            Comparator<Employee> z = (o1,o2)->o1.id-o2.id;
            List<Employee> l3 = a.stream().sorted(z).toList();
            System.out.println(l3);

            System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

            //MAX( fetching the maximum salary in the list)

            Comparator<Employee> c = (o1,o2)->
            {
                if(o1.salary>o2.salary)
                    return 1;
                else if(o1.salary==o2.salary)
                    return 0;
                else
                    return -1;
            };
            System.out.println(a.stream().max(c).get());

            System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

            //MIN (fetching the minimum aged person in the list)

            Comparator<Employee> i = (o1,o2)->o1.age-o2.age;
            System.out.println(a.stream().min(i).get());

            System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

            //COUNT (counting the no.of elements in the list)

            System.out.println(a.stream().count());



        }

        }


