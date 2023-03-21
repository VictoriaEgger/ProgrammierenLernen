package ArrayAufgaben;

public class Array7 {
    public static void main(String[] args) {
        String[] array = new String[]{"eins", "zwei", "drei", "vier", "funf", "sechs", "sieben", "acht", "neun", "zehn"};
char startBuchstabe = 'i';
        for (int i = 0; i < array.length; i++) {
            if (array[i].charAt(1) == startBuchstabe) {
                System.out.println(array[i]);
            }

        }

    }
}
