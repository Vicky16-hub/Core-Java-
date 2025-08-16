import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList a =new ArrayList();
        a.add(10000);
        a.add(90);
        ArrayList b = new ArrayList();
        b.add(1);
        b.add(2);
        a.addAll(b);
        System.out.println(a);
    }
}
