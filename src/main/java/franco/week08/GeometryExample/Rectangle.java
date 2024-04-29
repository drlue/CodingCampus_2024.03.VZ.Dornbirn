package franco.week08.GeometryExample;

public class Rectangle extends Geometry {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        super();
        this.width = width;
        this.height = height;

    }
    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public double getCircumference() {return 2 * (height + width);}
}
