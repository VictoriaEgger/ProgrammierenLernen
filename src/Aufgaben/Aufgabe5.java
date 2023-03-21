package Aufgaben;

import java.util.Scanner;

public class Aufgabe5 {
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner scannerNumber = new Scanner (System.in);
        int number = scannerNumber.nextInt();

        for (int i = 0; i <= number; i++){
            if (i % 2 == 0){ continue;}
            System.out.print(i + " ");
        }
    }
}
