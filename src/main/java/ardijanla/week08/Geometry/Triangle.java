package ardijanla.week08.Geometry;

public class Triangle extends Geometry {

    double katheteA;
    double KatheteB;
    double hypothenuseC;

    public Triangle(double katheteA, double katheteB, double hypothenuseC) {
        this.katheteA = katheteA;
        this.KatheteB = katheteB;
        this.hypothenuseC = hypothenuseC;
    }

    public double getCircumference() {
        return hypothenuseC + katheteA + KatheteB;
    }

    public double getArea() {
        double s = (katheteA + KatheteB + hypothenuseC) / 2;
        return Math.sqrt((s * (s - katheteA) * (s - KatheteB) * (s - hypothenuseC)));
    }
}
