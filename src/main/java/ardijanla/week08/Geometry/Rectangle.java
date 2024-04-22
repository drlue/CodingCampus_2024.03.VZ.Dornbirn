package ardijanla.week08.Geometry;

public class Rectangle extends Geometry {

    double length;
    double height;

    public Rectangle(double length, double height) {
        this.length = length;
        this.height = height;
    }


    public double getCircumference() {
        return (length * 2) + (height * 2);
    }

    public double getArea() {
        return length * height;
    }

}
