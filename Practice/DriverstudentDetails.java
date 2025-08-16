package Practice;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class DriverstudentDetails {
    public static void main(String[] args) {
        Map<Integer,String>stu=new TreeMap<>();
        stu.put(125,"aswanth");
        stu.put(142,"mani");
        stu.put(129,"jeevan");
        System.out.println(stu);
    }
}
class reverse implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Integer i1=(Integer) o1;
        Integer i2=(Integer) o2;
        return i2-i1;
    }
}
