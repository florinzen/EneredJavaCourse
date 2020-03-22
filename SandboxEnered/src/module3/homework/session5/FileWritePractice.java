package module3.homework.session5;

import java.io.*;

public class FileWritePractice {

    public static void main(String[] args) {
        try (BufferedWriter bufOutput = new BufferedWriter(new FileWriter("files/input-from-user.txt"));
             BufferedReader bufInput = new BufferedReader(new InputStreamReader(System.in))) {
            //Scanner input = new Scanner(System.in);

            String userInput;
            do {
                // scrie inputul utilizatorului intr-un fisier
                System.out.println("Enter something: ");
                userInput = bufInput.readLine();

                if(!userInput.equals("exit")) {
                    bufOutput.write(userInput + "\n");
                }

                // bufOutput.newLine();
            } while(!userInput.equals("exit")); //cat timp inputul utilizatorului este diferit de "exit"
        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }

    }

    private static boolean isFinishCondition(String userInput) {
        return !userInput.equals("exit");
    }
}
