package module2.wordcounter;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    public static void main(String[] args) {
        String input = "aaa aaa a b bb b aaa mmmm nm nm n mmm mmmm bb b";
        wordCounter(input);
    }

    public static void wordCounter(String sentence) {
        // First we split the sentence in words. We are splitting the string in an array of words
        String[] words = sentence.split(" ");

        // We create a HashMap so that we can map each word with its number of occurrences
        Map<String, Integer> wordsByNumberOfOccurrences = new HashMap<>();

        for (String word : words) {
            if (wordsByNumberOfOccurrences.containsKey(word)) {
                int numberOfOccurences = wordsByNumberOfOccurrences.get(word);
                numberOfOccurences++;
                wordsByNumberOfOccurrences.put(word, numberOfOccurences);
            } else {
                wordsByNumberOfOccurrences.put(word, 1);
            }
        }

        wordsByNumberOfOccurrences.forEach((word, numberOfOccurences) -> {
            String msg = numberOfOccurences == 1 ? " time " : " times ";
            System.out.println(word + " appears " + numberOfOccurences + msg + "in the input string.");
        });
    }
}
