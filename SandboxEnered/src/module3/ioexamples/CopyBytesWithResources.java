package module3.ioexamples;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class CopyBytesWithResources {
    public static void main(String[] args) throws IOException {
        byte[] b = new byte[128];
        try (FileInputStream in = new FileInputStream("just-for-test.txt");
             FileOutputStream out = new FileOutputStream("output.txt")) {
            System.out.println("Bytes available: " + in.available());
            int count = 0; int read = 0;
            while ((read = in.read(b)) != -1) {
                System.out.println(Arrays.toString(b));
                out.write(b);
                count += read;
            }
            System.out.println("Wrote: " + count);
        }
    }

}


