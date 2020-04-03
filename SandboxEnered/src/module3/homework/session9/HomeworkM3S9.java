package module3.homework.session9;

public class HomeworkM3S9 {

    /*
Write a Java application that implements the following operations:

Display on the screen the message "Hello World!". Run the application. If it works, go to the next step
Define an array of strings languages, containing {"C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"}
Generate a random integer n: int n = (int) (Math.random() * 1_000_000);

Compute the result obtained after performing the following calculations:
multiply n by 3
Divide the number by 7
Extract the last 5 digits of the number
Compute the sum of digits of the new number


This is the new result. While the new result has more than one digit, continue to sum the digits of the result.
Display on the screen the message: "This summer I will learn " + languages[result].
*/
    public static void main(String[] args) {
        System.out.println("Hello World!");

        String[] array = {"C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"};
        int n = (int) (Math.random() * 1_000_000_000);
        n = n * 3;
        n = n / 7;
        System.out.println("Full number: " + n);
        n = n % 1_000_000;
        System.out.println("Last 5 digits: " + n);

        int sumNumber = computeDigitSum(n);

        while(sumNumber > 9) {
            System.out.println(sumNumber);
            sumNumber = computeDigitSum(sumNumber);
            System.out.println(sumNumber);
        }

        System.out.println("Willy-nilly, this summer I will learn " + array[sumNumber]);
    }

    public static int computeDigitSum(int number) {
        int sum = 0;
        while(number != 0) {
            sum = sum + number%10;
            number = number/10;
        }
        return sum;
    }
}
