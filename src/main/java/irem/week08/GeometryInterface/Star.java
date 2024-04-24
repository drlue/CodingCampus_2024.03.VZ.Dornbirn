package irem.week08.GeometryInterface;

public class Star implements GeometryInterface{
    private int numberOfPoints;
    private double outerRadius;
    private double innerRadius;

    public Star(int numberOfPoints, double outerRadius, double innerRadius) {
        this.numberOfPoints = numberOfPoints;
        this.outerRadius = outerRadius;
        this.innerRadius = innerRadius;
    }

    public double getCircumference() {
        // Vereinfachte Annahme: Umfang basiert auf der Gesamtlänge der Spitzen
        return 2 * numberOfPoints * (outerRadius + innerRadius);
    }

    public double getArea() {
        // Vereinfachte Annahme: Flächenformel für einen regelmäßigen Stern
        double angle = Math.PI / numberOfPoints;
        return 0.5 * numberOfPoints * outerRadius * innerRadius * Math.sin(angle);
    }
}
