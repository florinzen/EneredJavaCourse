package module2.numberguess;

import java.util.Scanner;

public class InputValidation {

    public static void main(String[] args) {
        boolean isValid;

        isValid=false;
        do{
            Scanner input = new Scanner(System.in);
            System.out.println("Please enter a number between [0-10] or [90-100]");
            int inputFromUser = Integer.parseInt(input.nextLine());

            if((inputFromUser >= 0 && inputFromUser <= 10) ||
                    (inputFromUser >= 90 && inputFromUser <= 100)) {
                System.out.println("Nice! The input is valid");
                isValid = true;
            }

        }while(!isValid);
    }
}
