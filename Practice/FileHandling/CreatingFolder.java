package Practice.FileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreatingFolder {
    public static void main(String[] args) {
        File f = new File("Test.test");
        try{
            f.createNewFile();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        System.out.println(f.exists());
        File f1 = new File("abc.txt");
        f.renameTo(f1);
        //FileOutputStream f2 = new FileOutputStream(f1);

    }
}
