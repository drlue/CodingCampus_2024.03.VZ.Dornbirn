package demian.week09.Geometry;

public class Square extends Geometry{

    private double lenght;
    private double width;

    public Square(double lenght, double width) {
        this.lenght = lenght;
        this.width = width;
    }

    @Override
    public double getCircumference() {
        return 2*(lenght+width);
    }

    @Override
    public double getArea() {
        return lenght*width;
    }
}
