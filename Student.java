import com.sun.jdi.Value;
import java.util.ArrayList;
public class Student {
    String name;
    int id;
    String bg;

    public  Student(String name, int id, String bg) {
        this.name = name;
        this.id = id;
        this.bg = bg;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", id=" + id + ", bg='" + bg + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        Student s= (Student)o;
        if(!this.name.equals(s.name))
            return false;
        if (!(this.id==s.id))
            return false;
        if (!this.bg.equals(s.bg))
            return false;

        return true;

    }
}

