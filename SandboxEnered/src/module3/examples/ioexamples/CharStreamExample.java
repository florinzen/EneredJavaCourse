package module3.examples.ioexamples;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamExample {

    public static void main(String[] args) {
        char[] c = new char[128];
        try (FileReader fr = new FileReader("files/just-for-test.txt");
             FileWriter fw = new FileWriter("files/output.txt")) {
            int count = 0;
            int read = 0;
            while ((read = fr.read(c)) != -1) {
                fw.write(c);
                count += read;
            }
            System.out.println("Wrote: " + count + " characters");

        } catch (FileNotFoundException f) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("IOExceptions: " + e);
        }
    }
}
