import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
        ArrayList<Student> s=new ArrayList<Student>();
        s.add(new Student("Anto",108,"B+"));
        s.add(new Student("Mani",142,"B+"));
        s.add(new Student("guru",123,"O+"));
        s.add(new Student("Aswanth",125,"AB+"));

        Student Value = new Student("guru",123,"O+");
        System.out.println(s.contains(Value));

        for(Student s1 : s){
            System.out.println(s1);
        }

    }
}
