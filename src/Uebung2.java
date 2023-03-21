import java.util.Scanner;

public class Uebung2 {
    public static void main(String[] args) {

        System.out.println("Please enter a number: ");
        Scanner scanner = new Scanner (System.in);

        int nummer = scanner.nextInt();

        if (nummer > 5){
            System.out.println("Nummer ist größer als 5.");} else if (nummer < 5) {
            System.out.println("Nummer ist kleiner als 5");} else if (nummer == 5) {
            System.out.println("Die Zahl ist genau 5.");

        }

    }
    }

