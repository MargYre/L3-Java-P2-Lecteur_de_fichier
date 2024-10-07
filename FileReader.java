import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class FileReader {
    public static void main(String[] args) throws IOException {
        File f = new File("plop.txt");
        try {
            FileInputStream in = new FileInputStream(f);
            int i = in.read();
            while (i != -1) {
                System.out.print((char) i);
                i = in.read();
            }
            in.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

}
