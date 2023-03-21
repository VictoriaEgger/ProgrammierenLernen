package Übung1;

public class Hund {
    String name;
    String rasse;
    int alter;
    String farbe;
    int bellCounter = 0;

    boolean hatStock = false;

    public void hatGebellt(){
        System.out.println("Der Hund " + name + " hat gebellt.");
bellCounter++;

    }

    public boolean hatStockGebracht(){
        return true;
    }

    }

