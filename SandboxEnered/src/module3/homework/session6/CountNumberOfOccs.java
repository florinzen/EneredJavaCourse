package module3.homework.session6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CountNumberOfOccs {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please insert a word you want to search in the doc");
        String searchString = input.nextLine();
        int numberOfOccs = 0;

        long startTime = System.currentTimeMillis();
        try (BufferedReader bufReader = new BufferedReader(new FileReader("files/captain-zap.txt"));) {
            String line;
            // money.  With no customers, he idled away the day watching TV and reading
            /*
            line = "money.  With no customers, he idled away the day watching TV and reading"
            punctuationRemoved = "money  With no customers he idled away the day watching TV and reading"
            String[] words = {"money", " ", "With", "no", "customers", "he", "..."}
             */
            while ((line = bufReader.readLine()) != null) {
                String punctuationRemoved = line.replaceAll("[^a-zA-Z0-9 ]", ""); // regex
                String[] words = punctuationRemoved.split(" ");

                for (String word : words) {
                    if (searchString.equals(word)) {
                        numberOfOccs++;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        long finishTime = System.currentTimeMillis();

        System.out.format("Number of occurrences for %s is %d.%nThe processing took %d milliseconds", searchString, numberOfOccs, finishTime - startTime);
    }
}
