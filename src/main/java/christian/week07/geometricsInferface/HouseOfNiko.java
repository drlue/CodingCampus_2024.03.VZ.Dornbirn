package christian.week07.geometricsInferface;

public class HouseOfNiko implements InterfaceGeometry {
    private double squareSideLength;
    private double triangleLength;

    public HouseOfNiko(double squareSideLength, double triangleLength) {
        this.squareSideLength = squareSideLength;
        this.triangleLength = triangleLength;
    }

    @Override
    public double getCircumference() {
        return squareSideLength * 3 + triangleLength * 2;
    }

    @Override
    public double getArea() {
        return Math.pow(squareSideLength, 2) + (Math.pow(triangleLength, 2) * Math.sqrt(3)) / 4;
    }
}
