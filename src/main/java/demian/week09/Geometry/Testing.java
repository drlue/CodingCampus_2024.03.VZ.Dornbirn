package demian.week09.Geometry;

import ardijanla.ConsoleColors;

import java.util.Vector;

public class Testing {

    public static void main(String[] args) {

        Circle circ1 = new Circle(5);
        Square sq1 = new Square(5,5);
        Triangle tr1 = new Triangle(5);

        Vector<Geometry> list1 = new Vector<>();
        list1.add(circ1);
        list1.add(sq1);
        list1.add(tr1);
        list1.add(new Rectangle(5));

        System.out.println();
        printSUMSofCircumf(list1);
        System.out.println();
        printSUMSofAreas(list1);


    }

    public static void printSUMSofCircumf(Vector<Geometry> geometrieliste){
        double sumCirc = 0;
        //SUMME DER UMFÄNGE BERECHNEN UND AUSGEBEN:
        for (int i = 0; i < geometrieliste.size(); i++) {
            if (i == 0){
                System.out.printf("%sDie Summe aller Umfänge im Vector:%s %.2f + ", ConsoleColors.BLUE_BOLD,ConsoleColors.RESET,geometrieliste.get(i).getCircumference());
                sumCirc += geometrieliste.get(i).getCircumference();
            } else if (i == (geometrieliste.size() - 1)) {
                System.out.printf("%.2f = ",geometrieliste.get(i).getCircumference());
                sumCirc += geometrieliste.get(i).getCircumference();
            } else {
                System.out.printf("%.2f + ",geometrieliste.get(i).getCircumference());
                sumCirc += geometrieliste.get(i).getCircumference();
            }
        }
        System.out.printf("%s%.2f%s%n", ConsoleColors.BLUE, sumCirc, ConsoleColors.RESET);

    }

    public static void printSUMSofAreas(Vector<Geometry> geometrieliste){
        double sumArea = 0;
        //SUMME DER UMFÄNGE BERECHNEN UND AUSGEBEN:
        for (int i = 0; i < geometrieliste.size(); i++) {
            if (i == 0){
                System.out.printf("%sDie Summe aller Flächen im Vector:%s %.2f + ", ConsoleColors.BLUE_BOLD,ConsoleColors.RESET,geometrieliste.get(i).getArea());
                sumArea += geometrieliste.get(i).getArea();
            } else if (i == (geometrieliste.size() - 1)) {
                System.out.printf("%.2f = ",geometrieliste.get(i).getArea());
                sumArea += geometrieliste.get(i).getArea();
            } else {
                System.out.printf("%.2f + ",geometrieliste.get(i).getArea());
                sumArea += geometrieliste.get(i).getArea();
            }
        }
        System.out.printf("%s%.2f%s%n", ConsoleColors.BLUE, sumArea, ConsoleColors.RESET);

    }

}

