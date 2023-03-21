package Übung1;

import java.util.Scanner;

public class Polizist {
float gemessenKmh;

    public float geschwMessen(float kmh) {
        gemessenKmh = kmh;
        System.out.println("Enter kmh: ");
        Scanner kmhscanner = new Scanner(System.in);
        float gemesseneKmh = kmhscanner.nextFloat();

        return kmh;

    }
}
