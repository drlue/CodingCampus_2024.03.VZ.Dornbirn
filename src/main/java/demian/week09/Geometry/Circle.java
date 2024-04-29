package demian.week09.Geometry;

import java.util.Map;
import java.util.Vector;

public class Circle extends Geometry{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }


    @Override
    public double getCircumference() {
        return 2*radius*Math.PI;
    }

    @Override
    public double getArea() {
        return (Math.pow(radius,2))*Math.PI;
    }


}
