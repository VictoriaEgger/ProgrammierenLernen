package ArrayAufgaben;

public class Array4 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int summe = 0;
        for (int i = 0; i < array.length; i ++){
            summe = summe + array[i];
        }
        System.out.println(summe);
    }
}
