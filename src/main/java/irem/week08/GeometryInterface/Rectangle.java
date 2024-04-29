package irem.week08.GeometryInterface;

import irem.week08.GeometryAbstract.Geometry;

public class Rectangle extends Geometry implements GeometryInterface{
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        super();
        this.length = length;
        this.width = width;
    }
    @Override
    public double getCircumference() {
        return 2 * (length + width);
    }

    @Override
    public double getArea() {
        return length * width;
    }
}

