package Übung1;

import java.util.Locale;
import java.util.Scanner;

public class MonatTagSwitch {
    public static void main(String[] args) {
        System.out.println("Please enter month: ");
        Scanner scanner = new Scanner(System.in);
        String month = scanner.next();
        month = month.toLowerCase();

//        switch (month){
//            case "februar":
//                System.out.println("Dieser Monat hat 28 oder 29 Tage.");
//                break;
//            case "jänner":
//            case "märz":
//            case "mai":
//            case "juli":
//            case "august":
//            case "oktober":
//            case "dezember":
//                System.out.println("Dieser Monat hat 31 Tage");
//                break;
//            case "april":
//            case "juni":
//            case "september":
//            case "november":
//                System.out.println("Dieser Monat hat 30 Tage");
//                break;
//            default:
//                System.out.println("Bitte einen gültigen Monat eingeben");
//
//        }

        if (month.equals("jänner")) {
            System.out.println("Dieser Monat hat 31 Tage");
        } else if (month.equals("april")) {
            System.out.println("Dieser Monat hat 30 Tage");
        } else {
            System.out.println("Dieser Monat hat 28 oder 29 Tage.");

        }

    }
}
