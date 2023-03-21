package Übung1;

public class Justitz {
    float geschwindigkeit;
    int justitzStrafe;

    public float StrafErrechnung(float geschw, int str) {
        geschwindigkeit = geschw;
        justitzStrafe = str;

        if (geschw <= 30) {
            System.out.println("30 Euro");
            str = 60;
        } else {
            System.out.println("60 Euro");
            str = 100;
        }
        return str;
    }
}
