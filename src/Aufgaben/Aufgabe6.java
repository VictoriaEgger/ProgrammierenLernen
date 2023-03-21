package Aufgaben;

import java.util.Scanner;

public class Aufgabe6 {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner (System.in);
        int number = scanner.nextInt();
//        int number = 123;
        int multiplier = 2;
        int ergebnis = number * multiplier;

        for (int i = 2; i < 10; i++) {
            ergebnis = number * multiplier;
            number = ergebnis;
            System.out.println(number + " * " + multiplier + " = " + ergebnis);
            multiplier++;
            if (i == 9) {
                multiplier = 2;
                for (int j = 2; j < 10; j++) {
                    ergebnis = number / multiplier;
                    number = ergebnis;
                    System.out.println(number + " / " + multiplier + " = " + ergebnis);
                    multiplier++;
                }
            }
        }

    }
}


