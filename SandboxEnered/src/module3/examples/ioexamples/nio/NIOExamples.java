package module3.examples.ioexamples.nio;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class NIOExamples {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(5000);
        String filePath = String.format("files/nio-created-file-%d.txt", randomNumber);
        try {
           createFile(filePath);
            moveFile(filePath, "files/other");
            writeToAFile("Hello, World!","files/other/nio-created-file.txt");
            deleteFile("files/other/some-file");
            iterateOverAllFiles();
            printMimeType();
        } catch(IOException e) {
            e.printStackTrace();
        }

        FileSystem fs = FileSystems.getDefault();
        Path p1 = fs.getPath("/home/andreiherdes/andrei/Enered/cache-definition.png");

        if (Desktop.isDesktopSupported()) {
            Desktop desktop = Desktop.getDesktop();
            try {
                desktop.open(p1.toFile());
            } catch(IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void createFile(String filePath) throws IOException {
        Path newFilePath = Paths.get(filePath);
        Files.createFile(newFilePath);
    }

    public static void moveFile(String filePathFrom, String filePathTo) throws IOException {
        Path fileToMovePath = Paths.get(filePathFrom);
        Path targetPath = Paths.get(filePathTo);

        Files.move(fileToMovePath, targetPath.resolve(fileToMovePath.getFileName()));
    }

    public static List<String> readFromAFile(String filePath) throws IOException {
        Path file = Paths.get(filePath);
        List<String> lines = Files.readAllLines(file);
        return lines;
    }

    public static void writeToAFile(String text, String filePath) throws IOException {
        Path path = Paths.get(filePath);
        byte[] contentInBytes = text.getBytes();

        Files.write(path, contentInBytes);

        List<String> results = readFromAFile(filePath);

        boolean areLinesEqual = results.get(0).equals(text);
        System.out.println("Are the contents of the two files equal? " + areLinesEqual);
    }

    public static void deleteFile(String filePath) throws IOException {
        createFile(filePath);
        Path path = Paths.get(filePath);

        Files.delete(path);
    }

    public static void printMimeType() throws IOException {
        Path path = new File("files/in-class-examples/asdf.pdf").toPath();
        String mimeType = Files.probeContentType(path);
        System.out.println(mimeType);
    }

    public static void iterateOverAllFiles() throws IOException {
        Path path = Paths.get("src");
        Stream<Path> files = Files.walk(path);
        files.forEach(file -> System.out.println(file.getFileName()));
    }
}
