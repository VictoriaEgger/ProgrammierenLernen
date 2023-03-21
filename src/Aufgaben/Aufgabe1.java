package Aufgaben;

import java.util.Scanner;

public class Aufgabe1 {
    public static void main(String[] args) {
        System.out.println("Please enter your name: ");
        Scanner nameScanner = new Scanner(System.in);
        String name = nameScanner.next();

        System.out.println("Enter your age: ");
        Scanner ageScanner = new Scanner(System.in);
        int age = ageScanner.nextInt();

        System.out.println("Hallo, " + name + "! Du bist " + age + " Jahre alt.");
    }
}
