package christian.week07.geometricsInferface;


import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<InterfaceGeometry> geometrie = new Vector<>();
        Circle circle = new Circle(4);
        Rectangle rect = new Rectangle(2, 4);
        Triangle tri = new Triangle(3);
        Square square = new Square(4);
        Star star = new Star(2,3);
        HouseOfNiko house = new HouseOfNiko(2,2);
        geometrie.add(house);
        geometrie.add(star);
        geometrie.add(circle);
        geometrie.add(rect);
        geometrie.add(tri);
        geometrie.add(square);
        printSumOfAreaAndCircum(geometrie);
    }

    public static void printSumOfAreaAndCircum(Vector<InterfaceGeometry> list) {
        double circum = 0;
        double area = 0;
        for (InterfaceGeometry geo : list) {
            circum += geo.getCircumference();
            area += geo.getArea();
        }
        System.out.printf("Umfang: %f%nFlaeche: %f%n", circum, area);
    }


}
