package module2.numberguess;

import java.util.Scanner;

public class NumberGuess {

    public static void main(String[] args) {
        //int secretNumber = 51;
        int secretNumber = (int)(Math.random()*100);
        int tries = 0;
        int guess = -1;
        do{
            Scanner input = new Scanner(System.in);
            System.out.println("Please enter a number");
            guess = input.nextInt();

            tries++;
            if(guess == secretNumber){
                System.out.println("Nice job, you got it in " + tries + " tries");
            }else if (guess > secretNumber) {
                System.out.println("Try lower");
            } else {
                System.out.println("Try higher");
            }
        }while(guess != secretNumber);
    }
}
