package ArrayAufgaben;

import java.util.Scanner;

public class ArrayScanner {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the amout of elements you want to store: ");
        n = sc.nextInt();


        int[] array = new int [10];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Your elements are: ");
        for (int i=0; i<n;i++){
            System.out.println(array[i]);
        }

        for (int i = 0; i<array.length; i++){
            int itemInArray = array[i];
        }
    }

}
