package module3.homework.session8;

import java.io.IOException;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class HomeworkM3S8 {
    public static void main(String[] args) {

        Path startPoint = Paths.get("/home/andreiherdes/andrei/Enered/EneredJavaCourse/");
        FileVisitor<Path> customFileVisitor = new MyCustomFileVisitor();
        try {
            Files.walkFileTree(startPoint, customFileVisitor);
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
