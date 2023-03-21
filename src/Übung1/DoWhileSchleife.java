package Übung1;

import java.util.Scanner;

public class DoWhileSchleife {
    public static void main(String[] args) {
        System.out.println("Please enter the correct password: ");
        Scanner scanner = new Scanner(System.in);
        String passwort = "geheim";
String InputPassword = scanner.next();


        do {
            if (!InputPassword.equals(passwort)){
                System.out.println("Wrong");
            }
            InputPassword = scanner.next();
        } while (!InputPassword.equals(passwort));
        System.out.println("Correct! Goodbye!");

    }
}
