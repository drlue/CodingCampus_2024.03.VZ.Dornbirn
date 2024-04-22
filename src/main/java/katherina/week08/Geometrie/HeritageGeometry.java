package katherina.week08.Geometrie;

import java.util.Vector;

public class HeritageGeometry {
    public static void main(String[] args) {

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

        Vector<Geometry> liste = new Vector<>();
        liste.add(kreis1);
        liste.add(kreis2);
        liste.add(rechteck1);
        liste.add(quadrat1);
        liste.add(parallelogram);
        liste.add(dreieck);

        for (Geometry shape : liste) {
         //   additionsEskalation(shape);
        }
    }

//    private static void additionsEskalation(Geometry shape) {
//        Vector<Integer> areas = new Vector<>();
//        for (int index = 0;index<areas.size();index++){
//            areas.get(index) = 0;
//            for (int value:shape.getArea(index)) {
//                areas.get(index) +=value;
//            }
//            System.out.println(areas);
//
//        }
//    }

    //Erstelle eine Methode die den Gesamtumfang und die Gesamtfläche aller Geometry Objekte in der List ausgibt.
//
//Teste deine Implementierung ausgiebig
}
