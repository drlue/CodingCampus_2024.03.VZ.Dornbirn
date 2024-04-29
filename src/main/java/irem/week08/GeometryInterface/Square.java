package irem.week08.GeometryInterface;

public class Square implements GeometryInterface{
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getCircumference() {
        return 4 * side;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}

