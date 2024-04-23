package ardijanla.week08.Geometry;

public class HouseOfNicolaus extends Geometry {

    private Rectangle rectangle;

    private Triangle triangle;


    public HouseOfNicolaus(double length, double height,double A,double B, double C) {
        this.rectangle = new Rectangle(length, height);
        this.triangle = new Triangle(A,B,C);
    }

    public HouseOfNicolaus(Rectangle rectangle, Triangle triangle) {
        this.rectangle = rectangle;
        this.triangle = triangle;
    }

    @Override
    public double getCircumference() {
        return rectangle.getCircumference() + triangle.getCircumference();
    }

    @Override
    public double getArea() {
        return rectangle.getArea() + triangle.getArea();
    }
}
