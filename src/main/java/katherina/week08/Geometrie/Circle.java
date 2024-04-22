package katherina.week08.Geometrie;

public class Circle extends Geometry{
    private int radius;

    public Circle(int radius) {
        super();
        this.radius = radius;
    }

    public double getCircumference() {
        double circumference = radius * 2 * Math.PI;
        return circumference;
    }

    public double getArea() {
        double area = (radius * radius) * Math.PI;
        return area;
    }
}
