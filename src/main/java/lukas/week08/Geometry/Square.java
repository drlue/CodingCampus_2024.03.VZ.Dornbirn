package lukas.week08.Geometry;

public class Square extends Rectangle {

    private double length;

    public Square(double length) {
        super(length, length);
        this.length = length;
    }

    @Override
    public String getDimensionString() {
        return String.format("a = %.1f", length);
    }
}
