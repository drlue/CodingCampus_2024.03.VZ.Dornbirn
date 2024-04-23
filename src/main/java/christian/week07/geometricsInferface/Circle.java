package christian.week07.geometricsInferface;

public class Circle implements InterfaceGeometry {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getCircumference() {
        return 2 * radius * Math.PI;
    }

    @Override
    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }
}
