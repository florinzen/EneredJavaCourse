package module3.examples.ioexamples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class PracticeSolve {
    public static void main(String[] args) {
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("files/just-for-test.txt");
            out = new FileOutputStream("files/output.txt");
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } catch (FileNotFoundException f) {
            System.out.println("File was not found!");
            f.printStackTrace();
        } catch (IOException e) {
            System.out.println("Generic IOException occured!");
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {

                }
            }
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {

                }
            }
        }

        // Try with resources
        try (FileInputStream inWithResources = new FileInputStream("just-for-test.txt");
             FileOutputStream outWithResources = new FileOutputStream("output.txt")) {
            int c;
            while ((c = inWithResources.read()) != -1) {
                outWithResources.write(c);
            }
        } catch (FileNotFoundException f) {
            System.out.println("File was not found!");
            f.printStackTrace();
        } catch (IOException e) {
            System.out.println("Generic IOException occured!");
            e.printStackTrace();
        }
    }

}
