package Aufgaben;

import java.util.Scanner;

public class Aufgabe2 {
    public static void main(String[] args) {
        System.out.println("Enter a number between 1 to 10: ");
        Scanner numberScanner = new Scanner(System.in);
        int number = numberScanner.nextInt();

            switch (number) {
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eigth");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
                case 10:
                    System.out.println("ten");
                    break;
                default:
                    System.out.println("Please enter a valid number!");
            }
        }

    }

