package Übung1;

import java.util.Scanner;

public class WhileSchleife {
    public static void main(String[] args) {
        System.out.println("Please enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int summe = 0; //Eingabe vom User.
        int i = 1; //Mein Zähler
        while (i <= number) {
            summe = summe + i;
            i++;
        }

        System.out.println("Die Summe aller Zahlen von 1 bis " + number + " ist " + summe + ".");
    }
}

