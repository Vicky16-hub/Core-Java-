package Practice;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentDriver {
    public static void main(String[] args) {
        ArrayList<Student> a = new ArrayList<Student>();
        a.add(new Student("Aswanth", 125));
        a.add(new Student("Mani", 142));
        a.add(new Student("Anto", 108));
        Collections.sort(a);
        System.out.println(a);
        
    }
}
