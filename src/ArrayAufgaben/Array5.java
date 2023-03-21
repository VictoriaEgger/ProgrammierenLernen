package ArrayAufgaben;

import java.util.Random;

public class Array5 {
    public static void main(String[] args) {
        int[] array = new int[15];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.println(array[i]);
        }
    }
}



