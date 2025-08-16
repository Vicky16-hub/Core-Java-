package Practice;

public class Student implements Comparable<Student>{
    String name;
    int id;
    Student(String name,int id) {
          this.name=name;
          this.id=id;
    }

    @Override
    public int compareTo(Student o) {
        return this.id-o.id;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", id=" + id + '}';
    }
}

