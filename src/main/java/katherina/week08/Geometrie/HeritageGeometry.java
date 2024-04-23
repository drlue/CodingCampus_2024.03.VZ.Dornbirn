package katherina.week08.Geometrie;

import christian.week07.geometrics.GeometryAbstractClass;

import java.util.ArrayList;
import java.util.Vector;

public class HeritageGeometry {
    public static void main(String[] args) {
        ArrayList<Geometry> liste = new ArrayList<>();

        Geometry kreis1 = new Circle(5);
        System.out.println("Kreis:");
        System.out.println("Umfang: " + kreis1.getCircumference());
        System.out.println("Fläche: " + kreis1.getArea());
        System.out.println();

        System.out.println("Noch ein Kreis:");
        Geometry kreis2 = new Circle(7);
        System.out.println("Umfang: " + kreis2.getCircumference());
        System.out.println("Fläche: " + kreis2.getArea());
        System.out.println();

        Geometry rechteck1 = new Rectangle(2, 3);
        System.out.println("Rechteck: ");
        System.out.println("Umfang: " + rechteck1.getCircumference());
        System.out.println("Fläche: " + rechteck1.getArea());
        System.out.println();

        Geometry quadrat1 = new Square(2);
        System.out.println("Quadrat: ");
        System.out.println("Umfang: " + quadrat1.getCircumference());
        System.out.println("Fläche: " + quadrat1.getArea());
        System.out.println();

        Geometry parallelogram = new Rhomboid(3, 5, 3.5);
        System.out.println("Parallelogramm: ");
        System.out.println("Umfang: " + parallelogram.getCircumference());
        System.out.println("Fläche: " + parallelogram.getArea());
        System.out.println();

        Geometry dreieck = new Triangle(3, 5, 3.5, 4);
        System.out.println("Dreieck: ");
        System.out.println("Umfang: " + dreieck.getCircumference());
        System.out.println("Fläche: " + dreieck.getArea());
        System.out.println();

        Geometry gleichseitig = new RegularTriangle(5);
        System.out.println("Dreieck: ");
        System.out.println("Umfang: " + gleichseitig.getCircumference());
        System.out.println("Fläche: " + gleichseitig.getArea());
        System.out.println();

        Geometry nikolaushaus = new SantaHaus(5);
        System.out.println("Nikolaushäuschen: ");
        System.out.println("Umfang: " + nikolaushaus.getCircumference());
        System.out.println("Fläche: " + nikolaushaus.getArea());
        System.out.println();

        Geometry laurasStern = new NavigationStar(7);
        System.out.println("Stern: ");
        System.out.println("Umfang: " + laurasStern.getCircumference());
        System.out.println("Fläche: " + laurasStern.getArea());
        System.out.println();

        liste.add(kreis1);
        liste.add(kreis2);
        liste.add(rechteck1);
        liste.add(quadrat1);
        liste.add(parallelogram);
        liste.add(dreieck);
        liste.add(gleichseitig);
        liste.add(nikolaushaus);
        additionsEskalation(liste);
    }

    public static void additionsEskalation(ArrayList<Geometry> shape) {
        double circumference = 0;
        double area = 0;
        for (Geometry geometry : shape) {
            circumference += geometry.getCircumference();
            area += geometry.getArea();
        }
        System.out.printf("Der Gesamtumfang beträgt %f Einheiten, und die Gesamtfläche beträgt %f Einheiten! %n", circumference, area);

    }
}


