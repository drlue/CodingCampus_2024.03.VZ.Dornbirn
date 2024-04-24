package aki.week09.geometryUE;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Circle kreis = new Circle("Kreis", 10);
        Square viereck = new Square("Kreis", 5.3);
        Rectangle rechteck = new Rectangle("Rechteck", 10,20);
        Triangle dreieck = new Triangle("Name", 10, 8, 4);

        List<Geometry> geometries = new ArrayList<>();
        geometries.add(kreis);
        geometries.add(viereck);
        geometries.add(rechteck);
        geometries.add(dreieck);

        printTotalMeasurements(geometries);

        System.out.println("==================================================================================");
        System.out.println(kreis.getName() + " Umfang = " + kreis.getCircumference() + "\nFläche = " + kreis.getArea());
        System.out.println("==================================================================================");
        System.out.println(viereck.getName() + " Umfang = " + viereck.getCircumference() + "\nFläche = " + viereck.getArea());
        System.out.println("==================================================================================");
        System.out.println(rechteck.getName() + " Umfang = " + rechteck.getCircumference() + "\nFläche = " + rechteck.getArea());
        System.out.println("==================================================================================");
        System.out.println(dreieck.getName() + " Umfang = " + dreieck.getCircumference() + "\nFläche = " + dreieck.getArea());
        System.out.println("==================================================================================");

    }
    public static void printTotalMeasurements(List<Geometry> geometries) {
        double totalCircumference = 0;
        double totalArea = 0;

        // Iteriere über alle Geometry-Objekte in der List
        for (Geometry geometry : geometries) {
            totalCircumference += geometry.getCircumference();
            totalArea += geometry.getArea();
        }


        // Ausgabe der Gesamtumfang und Gesamtfläche
        System.out.println("Gesamtumfang aller Geometry-Objekte: " + totalCircumference);
        System.out.println("Gesamtfläche aller Geometry-Objekte: " + totalArea);
    }
}
