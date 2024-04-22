package lukas.week08.Geometry;

public class Triangle extends Geometry {

    private double length;

    public Triangle(double length) {
        this.length = length;
    }

    @Override
    public double getCircumference() {
        return 3 * length;
    }

    @Override
    public double getArea() {
        //double b = length*Math.sqrt(3)*0.5*length*0.5; //Variante mit Pythagoras

        return length * Math.sin(Math.PI / 3) * length * 0.5;
    }

    @Override
    public String toString() {
        return "Triangle (a=" + length + ")";
    }
}
