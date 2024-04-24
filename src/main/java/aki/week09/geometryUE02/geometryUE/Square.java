package aki.week09.geometryUE02.geometryUE;

public class Square extends Geometry {
    double laenge;
    String name;

    Square(String name, double laenge){
        this.laenge = laenge;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    double getCircumference() {
        return 4 * laenge;
    }

    @Override
    double getArea() {
        return laenge * laenge;
    }
}
