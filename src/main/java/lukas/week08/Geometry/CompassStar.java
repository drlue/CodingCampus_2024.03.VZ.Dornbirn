package lukas.week08.Geometry;

public class CompassStar extends Geometry {

    private Square baseSquare;
    private Triangle apex;

    private double baseLength;
    private double apexHeight;

    public CompassStar(double baseLength, double apexHeight){
        this.baseLength = baseLength;
        this.apexHeight = apexHeight;
        baseSquare = new Square(baseLength);
        apex = new Triangle(baseLength,calcApexSideLength(),calcApexSideLength());
    }

    private Double calcApexSideLength() {
        return Math.sqrt(baseLength*0.5*baseLength*0.5 + apexHeight*apexHeight);
    }

    @Override
    public double getCircumference() {
        return 4*apex.getCircumference() - baseSquare.getCircumference();
    }

    @Override
    public double getArea() {
        return 4*apex.getArea() + baseSquare.getArea();
    }

    @Override
    public String getDimensionString() {
        return String.format("a x h = %.1f x %.1f", baseLength,apexHeight);
    }

    @Override
    public void doubleSize() {
        baseLength *= 2;
        apexHeight *= 2;
    }
}
