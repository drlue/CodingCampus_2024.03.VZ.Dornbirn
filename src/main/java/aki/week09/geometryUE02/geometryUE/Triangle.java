package aki.week09.geometryUE02.geometryUE;

public class Triangle extends Geometry {
    String name;
    double seiteA;
    double seiteB;
    double seiteC;

    Triangle(String name, double seiteA, double seiteB, double seiteC) {
        this.name = name;
        this.seiteA = seiteA;
        this.seiteB = seiteB;
        this.seiteC = seiteC;
    }

    public String getName() {
        return name;
    }

    @Override
    double getCircumference() {
        return seiteA + seiteB + seiteC;
    }

    @Override
    double getArea() {
        double s = getCircumference() / 2;
        return Math.sqrt(s * (s - seiteA) * (s - seiteB) * (s - seiteC));
    }
}
