package Übung1;

import java.nio.file.Paths;
import java.util.Scanner;

public class WoerterVonBuchZaehlen {
    public static void main(String[] args) throws Exception {
//String wordToSearch = scanWord.next();


// Nur den Pfad zur txt.datei hineinkopieren.
        String file = "C:\\Users\\s53028\\Documents\\abschlussuebung.txt";

//Mittels Scanner und der Option "Paths.get(Pfad)" den Inhalt der dort befindlichen Datei auslesen.
        Scanner buchText = new Scanner(Paths.get(file));
        String textBook = buchText.next();


//Neue Scanner für den User zum eingeben.
        System.out.println("Geben Sie bitte das Wort ein, welches gezaehlt werden soll(Gross- & Kleinschreibung ist egal): ");
        Scanner wordScanner = new Scanner(System.in);
        String scannedWord = wordScanner.next();
        scannedWord = scannedWord.toLowerCase();

        int counter = 0;

        while (buchText.hasNext()) {
            String text = buchText.next();
            text = text.toLowerCase();
            if (scannedWord.equals(text)) {
                counter++;
            }
        }
        System.out.println("Das Wort " + scannedWord + " wurde: " + counter + " mal in diesem Dokument gefunden.");
    }


}
