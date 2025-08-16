package Practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamAPI{
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(29);
        a.add(56);
        a.add(100);
        a.add(100);
        a.add(54);
        a.add(35);

        List<Integer> l = a.stream().filter((x)-> x<35).toList();
        System.out.println(l);

        Comparator<Integer> c= (o1,o2)->o1-o2;

        List<Integer> l1 = a.stream().sorted(c).toList();
        System.out.println(l1);

        List<Integer> l2 = a.stream().distinct().toList();
        System.out.println(l2);

        List<Integer> l3 = a.stream().limit(3).toList();
        System.out.println(l3);

        List<Integer> l4 = a.stream().map((x)-> x*3).toList();
        System.out.println(l4);

        Integer i = a.stream().max(c).get();
        System.out.println(i);

        long z = l1.stream().count();
        System.out.println(z);


    }
}
