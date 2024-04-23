package demian.week09.Geometry;

public class Triangle extends Geometry{

    private double length;

    public Triangle(double length) {
        this.length = length;
    }

    @Override
    public double getCircumference() {
        return length*3;
    }

    @Override
    public double getArea() {
        return 0;
    }
}
