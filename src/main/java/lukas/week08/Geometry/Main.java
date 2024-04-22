package lukas.week08.Geometry;

import java.sql.SQLOutput;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        Triangle tr1 = new Triangle(10);

        Vector<Geometry> geometries = new Vector<>();
        geometries.add(new Triangle(10));
        geometries.add(new Rectangle(10, 5));
        geometries.add(new Square(10));
        geometries.add(new Circle(10));


        System.out.println("Liste der Geometrieformen");
        printGeometryData(geometries);
        //stringTest();

    }

    public static double getSumOfCicumference(Vector<Geometry> geometries) {
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
        String stringFormat = "%-30s%20.2f%15.2f%n";
        System.out.printf("%-30s%20s%15s%n", "Geometry", "Circumference", "Aerea");
        for (Geometry geo : geometries) {
            System.out.printf(stringFormat, geo.toString(), geo.getCircumference(), geo.getArea());
        }
        System.out.println("-".repeat(65));
        System.out.printf(stringFormat, "Sum", getSumOfCicumference(geometries), getSumOfAreas(geometries));
    }

}
