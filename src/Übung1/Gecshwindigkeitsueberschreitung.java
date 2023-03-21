package Übung1;

import java.util.Locale;
import java.util.Scanner;

public class Gecshwindigkeitsueberschreitung {
    public static void main(String[] args) {
        System.out.println("Enter Kmh: ");
        Scanner scanner = new Scanner(System.in);
        int gemesseneKmh = scanner.nextInt();
        int ueberschreitung = gemesseneKmh - 50;
        System.out.println("You drove " + ueberschreitung + " km/h over the speed limit.");

        double kmhStrafe = 0;

        if (ueberschreitung < 0) {
            System.out.println("Alles gut!");
        } else if
        (ueberschreitung <= 10) {
            System.out.println("Schriftliche Verwarnung");
        } else if (ueberschreitung <= 20) {
            System.out.println("30 Euro");
            kmhStrafe = kmhStrafe + 30;
        } else if (ueberschreitung <= 30) {
            System.out.println("50 Euro");
            kmhStrafe = kmhStrafe + 50;
        } else if (ueberschreitung <= 50) {
            System.out.println("100 Euro");
            kmhStrafe = kmhStrafe + 100;
        } else if (ueberschreitung <= 100) {
            System.out.println("500 Euro");
            kmhStrafe = kmhStrafe + 500;
        } else {
            System.out.println("1500 Euro");
            kmhStrafe = kmhStrafe + 1500;

        }
        System.out.println("Enter promille: ");
        Scanner scanner2 = new Scanner(System.in);
        float promille = scanner2.nextFloat();

        double promilleStrafe = 0;
        if (promille <= 0.5) {
            System.out.println("You're free to go!");

        } else if (promille <= 1.0) {
            System.out.println("50 Euro");
            promilleStrafe = promilleStrafe + 50;
        } else if (promille <= 2.0) {
            System.out.println("100 Euro");
            promilleStrafe = promilleStrafe + 100;
        } else {
            System.out.println("2500 Euro");
            promilleStrafe = promilleStrafe + 2500;
        }

        double gesamteStrafe = kmhStrafe + promilleStrafe;


        System.out.println("Please enter month: ");
        Scanner scanner3 = new Scanner(System.in);
        String monat = scanner3.next();
        monat = monat.toLowerCase();
        switch (monat) {
            case "jänner":
            case "februar":
                System.out.println("Blöden Monat erwischt. Die Polizei ist nicht gnädig und sie bekommen KEINEN Rabatt");
                gesamteStrafe = gesamteStrafe;
                break;
            case "märz":
            case "april":
                System.out.println("Die Polizei ist schon etwas besser gelaunt im neuen Jahr. Sie bekommen 10% Rabatt.");

                gesamteStrafe = gesamteStrafe * 0.9;
                break;
            case "mai":
            case "juni":
                System.out.println("Mai oder Juni sind schon günstiger. Die Polizie gönnt Ihnen 15% Rabatt");
                gesamteStrafe = gesamteStrafe * 0.85;
                break;
            case "juli":
            case "august":
                System.out.println("Im Hochsommer hat die polizei selber keine Lust auf der Straße langer herum zuwatscheln. Sie bekommen 20% Rabatt");
                gesamteStrafe = gesamteStrafe * 0.8;
                break;
            case "september":
            case "oktober":
                System.out.println("Der Herbst ist die goldene Zeit des Jahres und auch für Ihre Geldbörse. Sie bekommen 25% Rabatt");
                gesamteStrafe = gesamteStrafe * 0.75;
                break;
            case "november":
            case "dezember":
                System.out.println("Vorweihnachtliche, weihnachtliche oder Silvesterzeit. Die Polizei will Ihnen die Laune nicht verderben. Sie bekommen 30% Rabatt");
                gesamteStrafe = gesamteStrafe * 0.70;
                break;

        }
            System.out.println("Sie zahlen " + gesamteStrafe);

        }


    }





