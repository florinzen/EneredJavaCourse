package module2.practice;

import java.util.Arrays;
import java.util.Scanner;

public class InputFromUser {

    public static int numberOfVowels(String s) {
        String lowerCase = s.toLowerCase();
        int vowelCounter = 0; // Initialize an int variable where we will store the number of values
        for (int i = 0; i < lowerCase.length(); i++) {
            if (lowerCase.charAt(i) == 'a' || lowerCase.charAt(i) == 'e'
                    || lowerCase.charAt(i) == 'i' || lowerCase.charAt(i) == 'o' || lowerCase.charAt(i) == 'u') {
                vowelCounter++; // Increment the vowel counter if a vowel was found
            }
        }

        return vowelCounter;
    }

    public static void main(String[] args) {
        String toBeChecked = "AABBCC";
        System.out.println("Numarul vocalelor din " + toBeChecked
                + " este: " + numberOfVowels(toBeChecked));


        //inputFromUser();

        storeArrayValuesFromUser();
    }

    public static void inputFromUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a word, if the word is \"exit\" to program will end.");
        String input = scanner.nextLine();

        do {
            System.out.println("Numarul vocalelor din " + input
                    + " este: " + numberOfVowels(input));

            input = scanner.nextLine();
        } while (!"exit".equals(input));

        System.out.println("Good bye!");
    }

    public static void storeArrayValuesFromUser() {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[0];
        System.out.println("Let's create an array. Please fill in the array size");
        System.out.print("Array size: ");
        int arraySize = Integer.parseInt(scanner.nextLine());
        System.out.println("\nAre you sure you want the array to be of size " + arraySize + "?");
        System.out.println("Yes/No?");
        String message = scanner.nextLine();

        if("No".equals(message)) {
            System.out.print("Enter another value then: ");
            arraySize = Integer.parseInt(scanner.nextLine());
        }

        System.out.println("Array size: " + arraySize);
        array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            System.out.print("\nEnter the value for index " + i + " ");
            array[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.println("Your array is:");
        System.out.println(Arrays.toString(array));

    }

}
