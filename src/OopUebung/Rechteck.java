package OopUebung;

public class Rechteck {
   private double breite;
   private double höhe;
    double area;
    double perimeter;


    Rechteck(double b, double h) {
        breite = b;
        höhe = h;

    }

    public void setWidth(double width) {
        breite = width;

    }

    public void setHeigth(double heigth) {
        höhe = heigth;
    }

    public double getWidth(double width) {
        return width;
    }

    public double getHeigth(double heigth) {
        return heigth;
    }

    public double getArea() {
        double area = höhe * breite;
        return area;
    }

    public double getPerimeter() {
        double perimeter = 2 * (getArea());
        return perimeter;
    }
}
