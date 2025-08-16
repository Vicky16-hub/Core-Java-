package Practice.FileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOstream {
    public static void main(String[] args) throws IOException {
        File f = new File("Real Madrid");
        f.createNewFile();
        System.out.println(f.exists());

        FileOutputStream f1 = new FileOutputStream(f);
        String s = "Hala Madrid ";
        f1.write(s.getBytes());
    }
}
