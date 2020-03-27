package module3.examples.ioexamples.nio;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

public class FileVisitorImpl implements FileVisitor<Path> {

    private static int depth = 0;
    private static String space = "    ";

    @Override
    public FileVisitResult preVisitDirectory(
            Path dir, BasicFileAttributes attrs) {
        addSpaces();
        System.out.print(dir.getFileName() + "\n");
        depth++;
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(
            Path file, BasicFileAttributes attrs) {
        addSpaces();
        System.out.print(file.getFileName()+ "\n");
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(
            Path file, IOException exc) {
        System.out.println("Exception occured while accessing file " + file.getFileName());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(
            Path dir, IOException exc) {
        depth--;
        return FileVisitResult.CONTINUE;
    }

    public void addSpaces() {
        for(int i = 0; i < depth; i++) {
            System.out.print(space);
        }
    }
}
