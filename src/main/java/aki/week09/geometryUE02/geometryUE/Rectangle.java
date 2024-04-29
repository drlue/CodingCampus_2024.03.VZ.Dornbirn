package aki.week09.geometryUE02.geometryUE;

public class Rectangle extends Geometry {
    String name;
    double laenge;
    double breite;

    Rectangle(String name, double laenge, double breite){
        this.name = name;
        this.laenge = laenge;
        this.breite = breite;
    }

    public String getName() {
        return name;
    }

    @Override
    double getCircumference() {
        return 2 * (laenge + breite);
    }

    @Override
    double getArea() {
        return laenge * breite;
    }
}
