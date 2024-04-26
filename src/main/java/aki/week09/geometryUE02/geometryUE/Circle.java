package aki.week09.geometryUE02.geometryUE;

public class Circle extends Geometry {
    double radius;
    String name;

    Circle(String name, double radius) {
        this.radius = radius;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    double getCircumference() {
        return 2 * Math.PI * radius;
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }
}
