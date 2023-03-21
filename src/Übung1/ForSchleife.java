package Übung1;

public class ForSchleife {
    public static void main(String[] args) {
        int number = 0;
        for (int i = 0; i < 30; i++) {
            number++;
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }
}
