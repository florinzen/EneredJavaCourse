package module3.examples.ioexamples.files;

import java.io.*;

public class Examples {

    public static void main(String[] args) {
        createFile();
        try {
            moveFile();
        } catch (IOException e) {
            e.printStackTrace();
        }


        writeToAFile();
        deleteFile();

        File file = new File("files/credentials.txt");
        getFileExtention(file.getName());
        getFileExtention("files/test-serialization.obj");

        iterateOverAllFiles();
    }

    public static void createFile() {
        File newFile = new File("files/in-class-examples/just-created-file.txt");
        try {
            boolean isSuccess = newFile.createNewFile();
            System.out.println("Is file created: " + isSuccess);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void moveFile() throws IOException {
        File fileToMove = new File("files/in-class-examples/just-created-file.txt");
        boolean isMoved = fileToMove.renameTo(new File("files/other/just-moved-file.txt"));

        if (!isMoved) {
            throw new IOException("Could not move file!");
        }
    }

    public static void readFromAFile() {
        File file = new File("files/in-class-examples/just-created-file.txt");
        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufReader = new BufferedReader(fileReader)) {
            String line;
            while ((line = bufReader.readLine()) != null) {
                System.out.println(line);
            }
            /*
            //alternative: with Java8 streams
            bufReader.lines().forEach(line -> System.out.println(line));*/
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeToAFile() {
        createFile();
        File file = new File("files/in-class-examples/just-created-file.txt");
        try (FileWriter writer = new FileWriter(file)) {
            for (int i = 0; i < 1000; i++) {
                writer.write(i + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        readFromAFile();
    }

    public static void deleteFile() {
        File file = new File("files/other/just-moved-file.txt");
        boolean isDeleted = file.delete();
        System.out.println("Successfully deleted file: " + isDeleted);
    }

    public static void getFileExtention(String filename) {
        if (filename.contains(".")) {
            String extension = filename.substring(filename.lastIndexOf(".") + 1);
            System.out.println(extension);
        } else {
            System.out.println("No extension found");
        }
    }

    public static void iterateOverAllFiles() {
        File folder = new File("src");
        recursiveFileIteration(folder);
    }

    private static int depth = 0;

    private static void recursiveFileIteration(File input) {
        String space = "        ";
        for(int i = 0; i < depth; i++) {
            System.out.print(space);
        }

        if (input.isDirectory()) {
            System.out.println("Dir name: " + input.getName());
            File[] files = input.listFiles();
            for (File file : files) {
                depth++;
                recursiveFileIteration(file);
                depth--;
            }
        } else {
            System.out.println(input.getName());
        }
    }
}
