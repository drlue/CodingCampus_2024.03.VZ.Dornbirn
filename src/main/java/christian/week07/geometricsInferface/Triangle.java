package christian.week07.geometricsInferface;

public class Triangle implements InterfaceGeometry {
    private double length;

    public Triangle(double length) {
        this.length = length;

    }

    @Override
    public double getCircumference() {
        return length * 3;
    }

    @Override
    public double getArea() {
        return (Math.pow(length, 2) * Math.sqrt(3)) / 4;
    }
}
