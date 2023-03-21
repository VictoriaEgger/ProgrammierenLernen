package Übung1;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacTo {
    public static void main(String[] args) {
        char player1 = 'x';
        char player2 = 'o';

        System.out.println("Enter player1: ");
        Scanner scannerPlayer1 = new Scanner(System.in);


        char[][] tictactoe = new char[3][3];




            for (char[] ersteDim : tictactoe) {

                for (char zweiteDim : ersteDim) {
                    System.out.print('|');
                }
                System.out.println();               //spring in die nächste zeile

            }


    }
}


