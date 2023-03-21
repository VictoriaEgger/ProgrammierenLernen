package Aufgaben;

import java.util.Scanner;

public class Aufgabe7 {
    public static void main(String[] args) {
        String correctUsername = "user123";
        String correctPasword = "password123";

        Scanner scannedUsername = new Scanner(System.in);
        String enteredUsername;

        Scanner scannedPassword = new Scanner (System.in);
        String enteredPassword;

        for(int i = 0; i <= 3; i++){
            System.out.println("Enter your username: ");
            enteredUsername = scannedUsername.next();
            System.out.println("Enter your password: ");
            enteredPassword = scannedPassword.next();
            if(!(enteredPassword.equals(correctPasword) || enteredUsername.equals(correctUsername)))
                {
                    System.out.println("Wrong. Try Again.");
                    continue;}
            System.out.println("Correct!");
            break;
        }
    }
}
