package christian.week07.geometrics;

public class Rectangle extends GeometryAbstractClass {
    private double width;
    private double length;

    public Rectangle(double width,double length){
        this.width = width;
        this.length = length;
    }

    @Override
    public double getCircumference() {
        return width*2+length*2;
    }

    @Override
    public double getArea() {
        return width*length;
    }
}
