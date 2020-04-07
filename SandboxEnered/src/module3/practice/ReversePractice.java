package module3.practice;

public class ReversePractice {
    public static void main(String[] args) {
        System.out.println(reverseV1("Reverse"));
        System.out.println(reverseV1("This is a typical sentence."));
        System.out.println(reverseV1("The dog is big."));

        System.out.println(reverseV2("Reverse"));
        System.out.println(reverseV2("This is a typical sentence."));
        System.out.println(reverseV2("The dog is big."));
    }

    public static String reverseV1(String input) {
        String[] words = input.split(" ");
        StringBuilder output = new StringBuilder();

        for(String word : words) {
            if(word.length() >= 5) {
                StringBuilder reversedWord = new StringBuilder(word);
                output.append(reversedWord.reverse());
            } else {
                output.append(word);
            }
            output.append(" ");
        }
        return output.toString();
    }

    public static String reverseV2(String input) {
        String[] words = input.split(" ");
        StringBuilder output = new StringBuilder();

        for(String word : words) {
            if(word.length() >= 5) {// Reverse / 7 - 1
                                    // esreveR
                StringBuilder reversedWord = new StringBuilder();
                for(int i = word.length() - 1; i >= 0; i--) {
                    reversedWord.append(word.charAt(i));
                }
                output.append(reversedWord);
            } else {
                output.append(word);
            }
            output.append(" ");
        }
        return output.toString();
    }
}
