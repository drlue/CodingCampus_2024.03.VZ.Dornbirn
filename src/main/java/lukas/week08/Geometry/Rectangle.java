package lukas.week08.Geometry;

public class Rectangle extends Geometry {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        if (width <=0 || height <= 0) {
            throw new IllegalArgumentException("width and height must be greater than 0");
        }
        this.width = width;
        this.height = height;

    }

    @Override
    public double getCircumference() {
        return 2 * width + 2 * height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String getDimensionString() {
        return "a x b = " + width + " x " + height;
    }

    @Override
    public void doubleSize() {
        width *= 2;
        height *= 2;
    }
}
