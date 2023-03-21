package Übung1;

import java.util.Scanner;

public class ContinueBreak {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner (System.in);
//        int sitzplatzNummer = 0;



        boolean a380 = false;

        for (int i = 0; i < 50; i++) {

            if (i == 4 || i == 17){
            continue;}
            System.out.println("Sitzplatz " + i);
            if (a380 == true && i == 19) {
                break;
            }
        }
    }
}


