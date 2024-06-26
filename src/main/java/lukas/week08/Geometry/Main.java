package lukas.week08.Geometry;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        Vector<Geometry> geometries = new Vector<>();
        geometries.add(new Triangle(10)); //gleichseitiges Dreieck, eigener constructor
        geometries.add(new Triangle(10, 7, 7));
        geometries.add(new Rectangle(10, 5));
        geometries.add(new Square(10));
        geometries.add(new Circle(10));
        geometries.add(new HouseOfNikolaus(10,10,10));
        geometries.add(new CompassStar(10,10));

        System.out.println("Liste der Geometrieformen");
        printGeometryData(geometries);


        //Vector<Geometry> vec2 = (Vector<Geometry>)geometries.clone();
        Vector<Geometry> vec3 = new Vector<Geometry>(geometries);

        vec3.getFirst().doubleSize();

        printGeometryData(vec3);
        System.out.println("============");
        printGeometryData(geometries);
    }

    public static double getSumOfCircumference(Vector<Geometry> geometries) {
        double sum = 0;
        for (Geometry geo : geometries) {
            sum += geo.getCircumference();
        }
        return sum;
    }

    public static double getSumOfAreas(Vector<Geometry> geometries) {
        double sum = 0;
        for (Geometry geo : geometries) {
            sum += geo.getArea();
        }
        return sum;
    }

    public static void printGeometryData(Vector<Geometry> geometries) {
        String stringFormat = "%-50s%15.2f%15.2f%n";
        System.out.printf("%-50s%15s%15s%n", "Geometry", "Circumference", "Area");
        for (Geometry geo : geometries) {
            System.out.printf(stringFormat, geo.toString(), geo.getCircumference(), geo.getArea());
        }
        System.out.println("-".repeat(80));
        System.out.printf(stringFormat, "Sum", getSumOfCircumference(geometries), getSumOfAreas(geometries));
    }

}
