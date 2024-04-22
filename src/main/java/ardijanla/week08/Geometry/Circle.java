package ardijanla.week08.Geometry;

public class Circle extends Geometry {
    double radius;


    public Circle(double radius) {
        this.radius = radius;
    }

    public double getCircumference() {
        return 2 * radius * Math.PI;
    }

    public double getArea() {
        return (radius * radius) * Math.PI;
    }

}
