package lukas.week08.Geometry;

public class Circle extends Geometry {

    private double radius;

    public Circle(double radius) {
        super(); //nicht notwendig, da automatisch aufgerufen
        this.radius = radius;
    }

    @Override
    public double getCircumference() {
        return 2 * radius * Math.PI;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public String getDimensionString() {
        return "r = " + radius;
    }

    public void doubleSize(){
        radius *= 2;
    }
}
