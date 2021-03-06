package module3.examples.ioexamples;

import java.io.*;

public class BufferedStreamExample {
    public static void main(String[] args) {
        try(BufferedReader bufInput = new BufferedReader(new FileReader("files/just-for-test.txt"));
            BufferedWriter bufOutput = new BufferedWriter(new FileWriter("files/output.txt"))) {
            String line;
            while((line = bufInput.readLine()) != null) {
                bufOutput.write(line);
                bufOutput.newLine();
            }
        } catch (FileNotFoundException f) {
            System.out.println("File not found : " + f.getMessage());
        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }
    }
}
