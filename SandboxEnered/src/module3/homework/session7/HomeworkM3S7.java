package module3.homework.session7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Optional;
import java.util.Scanner;

public class HomeworkM3S7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        printInitialsV1(name);
        System.out.println();
        printInitialsV2(name);
        System.out.println();

        try {
            printFileNamesHavingExtension("png", "/home/andreiherdes/andrei/Enered");
        } catch (IOException e) {
            System.out.println("Something went wrong!" + e.getMessage());
        }
    }

    // Exercise 1
    public static void printInitialsV1(String fullName) {
        for(int i = 0; i<fullName.length(); i++) {
            if(Character.isUpperCase(fullName.charAt(i))) {
                System.out.print(fullName.charAt(i));
            }
        }
    }

    // Exercise 1
    public static void printInitialsV2(String fullName) {
        String[] names = fullName.split(" ");
        for(String n : names) {
            System.out.print(n.charAt(0));
        }
    }

    // Exercise 2
    public static Optional<String> getFileExtension(String filename) {
        String extension = null;
        if (filename.contains(".")) {
            extension = filename.substring(filename.lastIndexOf(".") + 1);
        }
        return Optional.ofNullable(extension);
    }

    public static void printFileNamesHavingExtension(String extensionFilter, String pathToDirectory) throws IOException {
        File dir = new File(pathToDirectory);
        if(!dir.exists()) {
            throw new FileNotFoundException("Provide a valid path!");
        }
        if(dir.isFile()) {
            throw new IOException("Provide a path for a directory!");
        }

        File[] files = dir.listFiles();
        for(File file : files) {
            Optional<String> fileExtension = getFileExtension(file.getName());

            if(fileExtension.isPresent() && fileExtension.get().equals(extensionFilter)) {
                System.out.println(file.getName());
            }
        }
    }
}
