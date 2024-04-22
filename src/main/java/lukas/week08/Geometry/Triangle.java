package lukas.week08.Geometry;

public class Triangle extends Geometry {

    private double a;
    private double b;
    private double c;


    public Triangle(double a, double b, double c) {
        if (a + b >= c && a + c >= b && b + c >= a) {
            this.a = a;
            this.b = b;
            this.c = c;
        } else {
            System.out.println("Not possible to form triangle with choosen parameters!");
        }

    }

    public Triangle(double a) {
        this.a = a;
        this.b = a;
        this.c = a;
    }

    @Override
    public double getCircumference() {
        return a + b + c;
    }

    @Override
    public double getArea() {
        //Gleichseitiges Dreieck
        //double a1 = length*Math.sqrt(3)*0.5*length*0.5; //Variante mit Pythagoras
        //double a2 = length * Math.sin(Math.PI / 3) * length * 0.5;
        //Allgemeines Dreieck
        double s = getCircumference() * 0.5;
        return Math.sqrt((s * (s - a) * (s - b) * (s - c)));
    }

    @Override
    public String toString() {
        return String.format("Triangle (axbxc = %.1fx%.1fx%.1f)", a, b, c);
    }
}
