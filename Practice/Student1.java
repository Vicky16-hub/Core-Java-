package Practice;

import java.io.*;

public class Student1 implements Serializable {
    String name;
    int id;

    public Student1(String name,int id) {
        this.name = name;
        this.id=id;
    }

    @Override
    public String toString() {
        return "Student1{" + "name='" + name + '\'' + ", id=" + id + '}';
    }
}
 class Examplee{
     public static void main(String[] args)  throws IOException {
         File f = new File("Online.txt");
         f.createNewFile();

         FileOutputStream f1 = new FileOutputStream(f);
         Student1 s1=new Student1("Giri and Pooja ",142);

         ObjectOutputStream o = new ObjectOutputStream(f1);
         o.writeObject(s1);
     }
 }
