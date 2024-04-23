package christian.week07.geometrics;

public class Triangle extends GeometryAbstractClass {
    public double length;

    public Triangle(double length) {
        this.length = length;

    }

    public double getCircumference() {
        return length * 3;
    }

    public double getArea() {
        return (Math.pow(length, 2) * Math.sqrt(3)) / 4;
    }
}
