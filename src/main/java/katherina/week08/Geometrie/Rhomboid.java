package katherina.week08.Geometrie;

public class Rhomboid extends Geometry{
    private double height;
    private double a;
    private double b;
    public Rhomboid(double a, double b, double height) {
        super();
        this.height=height;
        this.a=a;
        this.b=b;
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
