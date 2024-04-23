package katherina.week08.Geometrie;

public class Triangle extends Geometry{
    protected double a;
    protected double b;
    protected double c;
    private double height;


    public Triangle(double a,double b, double c, double height){
        super();
        this.a = a;
        this.b = b;
        this.c = c;
        this.height= height;

    }

    public double getCircumference() {
        double circumference = a+b+c;
        return circumference;
    }

    public double getArea() {
        double area = (a*height)/2;
        return area;
    }

    public static class RegularTriangle extends christian.week07.geometrics.Triangle {

        public RegularTriangle(double length) {
            super(length);
        }
    }
}
