package OopUebung;

public class MainRechteck {
    public static void main(String[] args) {
        Rechteck r1 = new Rechteck(2, 3);
        r1.getArea();
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());

        r1.setHeigth(35);
        r1.setWidth(10);


    }


}
