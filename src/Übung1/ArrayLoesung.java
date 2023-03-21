package Übung1;

public class ArrayLoesung {
    public static void main(String[] args) {
        int[] test = new int[100];

        for (int i = 1; i < test.length; i++)
            for (int element : test) {
                element += 2 * i;
                i++;
                System.out.println(element);
            }
    }
//int geradeZahl = 2;
//        for(int i = 0; i <= 99; i++) {
//            test[i] = Integer.toString(geradeZahl);
//
//            geradeZahl = geradeZahl + 2;
//        }
//        System.out.println(Arrays.toString(test));
//
//        for (int i = 0; i < test.length; i = i + 2) {
//            int itemOfArray = test[i];
//            System.out.println(itemOfArray);
//        }
        }




