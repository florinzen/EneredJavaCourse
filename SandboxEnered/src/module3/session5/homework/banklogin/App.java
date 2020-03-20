package module3.session5.homework.banklogin;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // First off, when the application starts, we need to load all the contents from the file.
        // args[0] -> calea catre fisierul de credentiale
        Map<String, User> availableUsers = loadUserData("credentials.txt");

        Scanner input = new Scanner(System.in);
        // Secondly, when an actual user enters its username, we need to check if it exists.
        System.out.println("Please enter your username");
        String usernameInput = input.nextLine();

        // boolean isUserLoggedIn
        // boolean userCancelled

        if(availableUsers.containsKey(usernameInput)) {
            // Check password
            System.out.println("Welcome back " + usernameInput);
            System.out.println("Please enter your password");
            String passwordInput = input.nextLine();

            User userToBeLoggedIn = availableUsers.get(usernameInput);
            if(userToBeLoggedIn.getPassword().equals(passwordInput)) {
                System.out.println("You are now logged in");
                // metoda care afiseaza meniul aplicatiei
            } else {
                System.err.println("Wrong password. Please try again.");
                // Throw invalid password exception
            }
        } else {
            System.err.println("User not allowed to log in; Please contact service desk!");
            // Throw invalid username exception
        }
    }


    private static Map<String, User> loadUserData(String pathToFile) {
        Map<String, User> availableUsers = new HashMap<>();
        try (BufferedReader bufInput = new BufferedReader(new FileReader(pathToFile))) {
            String userDataRaw;
            while((userDataRaw = bufInput.readLine()) != null) {
                String[] userDataParsed = userDataRaw.split("-");
                availableUsers.put(userDataParsed[0], new User(userDataParsed[0], userDataParsed[1]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return availableUsers;
    }
}
