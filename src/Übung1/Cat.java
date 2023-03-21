package Übung1;

import java.util.Scanner;

public class Cat {
    String name;
    String rasse;
    int alter;
    int schnurrCounter = 0;
    boolean trick;
    
    Cat (String n, int a, String r, boolean t){
        name = n;
        alter = a;
        rasse = r;
        trick = t;
    }

    public void hatGeschnurrt() {
        System.out.println("schnurr schnurr");
        System.out.println("Die Katze " + name + " hat geschnurrt.");
        schnurrCounter++;
    }

    public boolean kannTrickMachen() {
        System.out.println("Kann die Katze einen Trick machen?");
        Scanner trickSCanner = new Scanner(System.in);

        if (trickSCanner.next().equals("Y")) {
            return true;

        } else {
            return false;

        }

    }
}


