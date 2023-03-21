package Übung1;

import java.util.Scanner;

public class Uebung1 {
    public static void main(String[] args) {

        //Variablen
//        String vornamen = "Victoria";
//        String nachmane = "Egger";
//
//
//        String name = vornamen + " " + nachmane;
//
//
//        boolean nameLaenge = (name.length() < 10);
//        System.out.println("Die Laenge ist groesser als 10: true und die exakte Laenge ist: " + name.length());
//
//
//        System.out.println("Willkommen " + name.toUpperCase());

        System.out.println("Please enter your name: ");
        Scanner scanner = new Scanner (System.in);
        String fullName = scanner.next();

        System.out.println("Willkommen " + fullName.toUpperCase());

        if (fullName.length() > 10) {
            System.out.println("Name laenger als 10. Genaue Laenge ist: " + fullName.length());
        } else if (fullName.length() == 10) {
            System.out.println("Dein Name is genau 10 lang.");

        } else {
            System.out.println("Dein Name ist kuerzer als 10. Genaue Laenge ist: " + fullName.length());

        }
    }



    public static void nameAusgabe (String vorname, String nachname) {

        String name = vorname + " " + nachname;

        boolean nameLaenge = (name.length() < 10);
        System.out.println("Die Laenge ist groesser als 10: true und die exakte Laenge ist: " + name.length());


        System.out.println("Willkommen " + name.toUpperCase());
    }
}

