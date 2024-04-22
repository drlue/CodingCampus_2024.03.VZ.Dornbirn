package christian.week07.geometrics;



public class Circle extends GeometryAbstractClass {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getCircumference() {
        double circumference;
        circumference = 2 * radius * Math.PI;
        return circumference;
    }
    public double getArea(){
        double area;
        area = Math.PI*Math.pow(radius,2);
        return area;
    }
}
