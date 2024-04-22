package katherina.week08.Geometrie;

public class Rhomboid extends Geometry{
    private double height;
    public Rhomboid(double a, double b, double height) {
        super(a, b);
        this.height=height;
    }

    public double getCircumference() {
        double circumference = 2*(a+b);
        return circumference;
    }

    public double getArea() {
        double area = a*height;
        return area;
    }
}
