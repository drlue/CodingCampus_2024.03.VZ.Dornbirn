package christian.week07.geometrics;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<GeometryAbstractClass> list = new ArrayList<>();
        Circle circle = new Circle(4);
        Rectangle rect = new Rectangle(2, 4);
        Triangle tri = new Triangle(3);
        Square square = new Square(2);
        list.add(circle);
        list.add(rect);
        list.add(square);
        list.add(tri);
        printAllAreaAndCircum(list);
        System.out.println(square.getCircumference());
    }


    public static void printAllAreaAndCircum(ArrayList<GeometryAbstractClass> list) {
        double circum = 0;
        double area = 0;
        for (GeometryAbstractClass geo : list) {
            circum += geo.getCircumference();
            area += geo.getArea();
        }
        System.out.printf("Umfang: %f %nFläche: %f %n", circum, area);
    }
}
