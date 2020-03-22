package module3.examples.exceptions.customexceptions;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PasswordController {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduceti parola:");
        String userPass = in.nextLine();

        try {
            handlePasswordInput(userPass);
        } catch(InvalidPasswordException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Un utilizator a accesat functionalitatea de login.");
        }
    }

    public static void handlePasswordInput(String input) throws InvalidPasswordException {
        boolean isPasswordValid = checkPassword(input);

        if(isPasswordValid) {
            System.out.println("Te-ai logat cu success");
        } else {
            throw new InvalidPasswordException("Parola invalida!!!");
        }
    }

    public static boolean checkPassword(String password) {
        List<String> passwords = Arrays.asList("12345", "parolamea");
        return passwords.contains(password);
    }
}
