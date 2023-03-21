package Aufgaben;

import java.util.Scanner;

public class Aufgabe4 {
    public static void main(String[] args) {
//4.1
        System.out.println("Enter a Word: ");
        Scanner wordScanner = new Scanner(System.in);
        String word = wordScanner.next();
        word = new StringBuffer(word).reverse().toString();

        System.out.println(word);

        System.out.println("Enter a int number: ");
        Scanner numberScanner = new Scanner(System.in);
        int number = numberScanner.nextInt();
//4.2
        if (number % 2 == 0) {
            System.out.println("This number is even.");
        } else {
            System.out.println("This number is uneven.");
        }
//4.3
        System.out.println("Enter a sentence: ");
        Scanner sentenceScanner = new Scanner(System.in);
        String scannedSentence = sentenceScanner.nextLine();
        scannedSentence = scannedSentence.toLowerCase();
        int vocalCounter = 0;
while(sentenceScanner.hasNextLine()){
}
            if ( scannedSentence.contains("a")){
            vocalCounter = vocalCounter + 1;
        }
        System.out.println("This sentence contains " + vocalCounter + " vocals.");

    }
}
