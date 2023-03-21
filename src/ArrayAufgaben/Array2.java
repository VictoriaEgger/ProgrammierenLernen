package ArrayAufgaben;

public class Array2 {
    public static void main(String[] args) {
        double[] array = {1.1, 1.2, 1.3, 1.4, 1.5};

 double max = array[0];

 for (int i = 1; i < array.length; i++){
     if (array[i] > max){
         max=array[i];
     }
 }
        System.out.println(max);
    }
}
