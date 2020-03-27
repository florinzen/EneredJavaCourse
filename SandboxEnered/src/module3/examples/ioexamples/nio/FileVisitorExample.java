package module3.examples.ioexamples.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileVisitorExample {
    public static void main(String[] args) {
        Path startingDir = Paths.get("src");
        FileVisitorImpl visitor = new FileVisitorImpl();
        try {
            Files.walkFileTree(startingDir, visitor);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
