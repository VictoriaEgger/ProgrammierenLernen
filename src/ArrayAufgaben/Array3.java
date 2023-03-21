package ArrayAufgaben;

public class Array3 {
    public static void main(String[] args) {
        String[] array = {"Hallo", "ich", "heiße", "Victoria"};

        for(int i = 0; i < array.length; i++){
            if (array[i].length() >= 8){
                System.out.println("Array " + array[i] + " ist größer 8. Real length: " + array[i].length());

            }

        }
    }

}
