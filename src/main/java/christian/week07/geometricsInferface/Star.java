package christian.week07.geometricsInferface;

public class Star implements InterfaceGeometry {
    private double squareSideLength;
    private double triangleLength;

    public Star(double squareSideLength, double triangleLength) {
        this.squareSideLength = squareSideLength;
        this.triangleLength = triangleLength;
    }

    @Override
    public double getCircumference() {
        return 4 * (triangleLength * 2);
    }

    @Override
    public double getArea() {
        return (Math.pow(triangleLength, 2) * Math.sqrt(3)) + Math.pow(squareSideLength, 2);
    }
}
